package dev.drugowick.findpcparts.controllers;

import dev.drugowick.findpcparts.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SearchController {

    private ProductService productService;

    public SearchController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String search(
            @RequestParam String product,
            Model model) {
        System.out.println("Starting search for " + product);

        model.addAttribute("products", productService.searchEverywhere());
        model.addAttribute("searchQuery", product);

        return "index";
    }
}
