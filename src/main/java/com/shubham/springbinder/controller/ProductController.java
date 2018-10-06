package com.shubham.springbinder.controller;

import com.shubham.springbinder.model.ProductCriteria;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/products")
    List<ProductCriteria> searchProducts(@Valid ProductCriteria productCriteria) {
        System.out.println(productCriteria);
        return null;
    }
}
