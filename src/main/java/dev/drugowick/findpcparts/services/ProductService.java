package dev.drugowick.findpcparts.services;

import dev.drugowick.findpcparts.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductService implements SearchService<Product> {

    @Override
    public Product[] searchEverywhere(String product) {

        System.out.println("Starting search for " + product);
        RestTemplate restTemplate = new RestTemplate();
        Product[] products = restTemplate.getForObject(
                "http://localhost:3000/" + product,
                Product[].class
        );
        System.out.println("Result contains " + products.length + " items.");

        return products;
    }
}
