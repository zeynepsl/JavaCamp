package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.entities.concretes.Product;

//BU controller'ı; angular react vs.. hepsi kullanabilir; restfull calisiyoruz

//anatasyon ekliyoruz:
@RestController
@RequestMapping("/api/products")
public class ProductsController {
	
	//hiç constructor yazmadan Autowired yazarsan da çalisir bu
	//ama birden fazla service kullanman gerektiginde hepsinin ustune yazman gerekir
	
	private ProductService productService;
	
	@Autowired
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}

	//bizim servisimiz nasıl destek verecek:
	@GetMapping("/getall")
	public List<Product> getAll(){
		return this.productService.getAll();
	}
	//boyle bir metot destegini bu controller vasitasiyla veriyoruz
	// kodlamaio/api/products/getall diye bir istekte bulunulursa 
	//bu metot çalışır
	
	//hb, trendyol bizim bu istekleri yapabilmemizi saglayan araclardan başka bir şey degil
}
