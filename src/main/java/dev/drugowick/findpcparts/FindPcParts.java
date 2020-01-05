package dev.drugowick.findpcparts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FindPcParts {

    public static void main(String[] args) {
        SpringApplication.run(FindPcParts.class, args);
    }

}
