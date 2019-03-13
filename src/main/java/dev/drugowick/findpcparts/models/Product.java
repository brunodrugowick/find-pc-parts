package dev.drugowick.findpcparts.models;

import lombok.Data;

@Data
public class Product {
    private final String name;
    private final String link;
    private final String promotional_price;
    private final String regular_price;
}
