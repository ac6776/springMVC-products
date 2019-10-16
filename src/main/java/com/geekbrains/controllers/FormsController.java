package com.geekbrains.controllers;

import com.geekbrains.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormsController {
    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/showSimpleForm")
    public String showSimpleForm() {
        return "myform";
    }
    @RequestMapping(path="/advProcessForm", method=RequestMethod.GET) 
    public String advProcessForm(@RequestParam("productId") String productId, Model model) {
        model.addAttribute("product", productService.getProductById(Long.parseLong(productId)));
        return "product-info";
    }
}
