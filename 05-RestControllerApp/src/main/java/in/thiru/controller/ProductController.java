package in.thiru.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.thiru.entity.Product;
import in.thiru.service.ProductServiceImpl;

@RestController
public class ProductController {

	private ProductServiceImpl pService;

	public ProductController(ProductServiceImpl pService) {

		this.pService = pService;
	}

	@GetMapping(value = "/getProduct", produces = { "application/json" })
	public Product getProductById(@RequestParam("pId") String pId) {

		return pService.getProductsById(Integer.parseInt(pId));
	}

}
