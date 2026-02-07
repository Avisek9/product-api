package com.abhishek.product_api.service;

import com.abhishek.product_api.exception.ProductNotFoundException;
import com.abhishek.product_api.model.Product;
import com.abhishek.product_api.repo.ProductRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepo repo;

    public ProductService(ProductRepo repo){
        this.repo = repo;
    }

    public Product addProduct(Product product){
        return repo.save(product);
    }

    public List<Product> getAllProducts(){
        return repo.findAll();
    }

    public Product getProductById(Long id){
        return repo.findById(id).orElseThrow(() -> new ProductNotFoundException(id));
    }

    public Product updateProduct(Long id, Product updatedProduct){
        Product existingProduct = repo.findById(id).orElseThrow(() -> new ProductNotFoundException(id));

        existingProduct.setName(updatedProduct.getName());
        existingProduct.setDescription(updatedProduct.getDescription());
        existingProduct.setPrice(updatedProduct.getPrice());
        existingProduct.setQuantity(updatedProduct.getQuantity());

        return repo.save(existingProduct);
    }

    public void deleteProduct(Long id){
        Product product = repo.findById(id).orElseThrow(() -> new ProductNotFoundException(id));
        repo.delete(product);
    }
}
