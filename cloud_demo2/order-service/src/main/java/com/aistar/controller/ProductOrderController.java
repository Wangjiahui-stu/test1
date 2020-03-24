package com.aistar.controller;


import com.aistar.pojo.ProductOrder;
import com.aistar.service.ProductOrderService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/order")
public class ProductOrderController {

    @Autowired
    private ProductOrderService productOrderService;

    @RequestMapping("/save/{userid}/{productid}")
    public Object save(@PathVariable("userid")int userId, @PathVariable("productid")int productId) {
        System.out.println("userid :" + userId + ",productId:" + productId);
        ProductOrder order = productOrderService.save(userId, productId);
        return order;

    }

}
