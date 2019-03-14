package dev.drugowick.findpcparts.services;

import dev.drugowick.findpcparts.models.Product;

public interface SearchService<T> {

    Product[] searchEverywhere(String product);

    //T findById(ID id);

    //T save(T object);

    //void delete(T object);

    //void deleteById(ID id);
}
