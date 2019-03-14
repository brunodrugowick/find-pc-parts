package dev.drugowick.findpcparts.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Product {
    private String link;
    private String name;
    private Price price;
}
