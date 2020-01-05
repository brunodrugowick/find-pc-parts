package dev.drugowick.findpcparts.services;

import dev.drugowick.findpcparts.models.Product;

import java.util.List;

public interface SearchService<T> {

    List<Product> searchEverywhere(String product);

    //T findById(ID id);

    //T save(T object);

    //void delete(T object);

    //void deleteById(ID id);
}
