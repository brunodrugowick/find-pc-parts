package dev.drugowick.findpcparts.services;

import dev.drugowick.findpcparts.models.Product;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "crawler", url = "${crawler.endpoint}")
public interface CrawlerFeignClient {

    @RequestMapping(method = RequestMethod.GET, path = "/{product}")
    List<Product> searchProducts(@RequestParam("product") String product);
}
