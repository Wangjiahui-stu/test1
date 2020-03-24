package com.aistar.controller;


import com.aistar.pojo.Product;
import com.aistar.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Value("${server.port}")
    private int port;

    @Autowired
    private ProductService productService;

    /**
     * 获得所有商品列表
     * @return
     */
    @RequestMapping("/list")
    public List<Product> list(){
        return  productService.listProduct();
    }


    /**
     * 根据id查找商品
     * @param id    指定商品id
     * @return  返回查找的对应商品对象
     */
    @GetMapping("/{id}")
    @ResponseBody
    public Product findById(@PathVariable("id") Integer id){
        System.out.println("当前商品服务product service 的端口port:" + port);
        return  productService.findById(id);
    }

}
