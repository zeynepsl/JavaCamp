package nLayeredDemo.dataAccess.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductDao 
//product için veri eriþim interface i
//repository ismide kullanýlýr
{
	void add(Product product);
	void update(Product product);
	void delete(Product product);
	Product get(int id);	//verilen id ye göre Product getirir
	List<Product> getAll();	//Tüm ürünleri getir

	
}
