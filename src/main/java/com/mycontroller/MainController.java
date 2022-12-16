package com.mycontroller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.dao.ProductDao;
import com.model.Product;

@Controller
public class MainController {
	
	@Autowired
	private ProductDao productDao;

	@RequestMapping("/")
	public String home(Model m) {
		List<Product> product = productDao.getProducts();
		m.addAttribute("product",product);

		return "index";
	}

	// show add product form
	@RequestMapping("/add-product")
	public String addProduct(Model m) {
		m.addAttribute("title", "Add Product");
		return "add_product_form";
	}

	// handle add product form
	@RequestMapping(path = "/handle-product", method = RequestMethod.POST)
	public RedirectView handleProduct(@ModelAttribute Product product, HttpServletRequest request) {

		System.out.println(product);
		productDao.createProduct(product);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		return redirectView;
	}
	
	/* delete product form value */
	@RequestMapping("/delete/{productId}")
	public RedirectView deleteProduct(@PathVariable("productId") int productId, HttpServletRequest request) {
		productDao.deleteProduct(productId);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		return redirectView;
		
	}
	//update product
	@RequestMapping("/update/{productId}")
	public String  updateProduct(@PathVariable ("productId") int productId,Model m) {
		
		Product product = this.productDao.getProduct(productId);
		m.addAttribute("update", product);
		return "update";
		
		
		
		
	}
	
	
}
