package dev.drugowick.findpcparts.services;

import java.util.Set;

public interface SearchService<T> {

    Set<T> searchEverywhere();

    //T findById(ID id);

    //T save(T object);

    //void delete(T object);

    //void deleteById(ID id);
}
