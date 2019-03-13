package dev.drugowick.findpcparts.services;

import dev.drugowick.findpcparts.models.Product;
import org.springframework.stereotype.Service;
import java.util.HashSet;
import java.util.Set;

@Service
public class ProductService implements SearchService<Product> {

    @Override
    public Set<Product> searchEverywhere() {

        //TODO THIS IS A MOCK! Implement actual business logic here.
        Product p1 = new Product("Produto 1", "http://", "R$ 2.000,00", "R$ 2.500,00");
        Product p2 = new Product("Produto 2", "http://", "R$ 2.064,00", "R$ 2.900,00");
        Set<Product> pl1 = new HashSet<>();
        pl1.add(p1);
        pl1.add(p2);
        return pl1;
    }
}
