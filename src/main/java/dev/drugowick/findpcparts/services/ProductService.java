package dev.drugowick.findpcparts.services;

import dev.drugowick.findpcparts.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ProductService implements SearchService<Product> {

    private final CrawlerFeignClient crawlerFeignClient;

    public ProductService(CrawlerFeignClient crawlerFeignClient) {
        this.crawlerFeignClient = crawlerFeignClient;
    }

    @Override
    public List<Product> searchEverywhere(String product) {
        List<Product> products = crawlerFeignClient.searchProducts(product);
        System.out.println("Result contains " + products.size() + " items.");

        return products;
    }
}
