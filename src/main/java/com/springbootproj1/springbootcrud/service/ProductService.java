package com.springbootproj1.springbootcrud.service;

import com.springbootproj1.springbootcrud.entity.Product;
import com.springbootproj1.springbootcrud.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public Product saveProduct(Product product){

       return repository.save(product);

    }



    public Product saveProducts(List<Product>products){

        return (Product) repository.saveAll(products);

    }

    public  List<Product> getProducts(){

        return repository.findAll();
    }


    public  Product getProductById(int id){

        return repository.findById(id).orElse(null);
    }

    public  Product getProductByName(String name){

        return repository.findByName(name);
    }

    public String deleteProduct(int id){

        repository.deleteById(id);
        return "Pproduct removed"+ id;
    }

    public Product updateProduct(Product product) {

        Product existingProduct = repository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setPrice(product.getPrice());


        return repository.save(existingProduct);
    }

}
