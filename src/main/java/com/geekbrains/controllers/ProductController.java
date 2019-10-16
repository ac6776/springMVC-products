package com.geekbrains.controllers;

import com.geekbrains.entities.Product;
import com.geekbrains.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/all")
    public String showAllProducts(Model model) {
        model.addAttribute("products", productService.getProductList());
        return "products-list";
    }

    // http://localhost:8189/app/products/showProductById?id=3
    @RequestMapping(path="/showProductById", method= RequestMethod.GET)
    public String showProductById(Model model, @RequestParam Long id) {
        model.addAttribute("product", productService.getProductById(id));
        return "product-info";
    }

    // http://localhost:8189/app/students/getProductById/3
    @RequestMapping(path="/getProductById/{sid}", method=RequestMethod.GET)
    @ResponseBody
    public Product getProductByIdFromPath(@PathVariable("sid") Long id) {
        return productService.getProductById(id);
    }


}
