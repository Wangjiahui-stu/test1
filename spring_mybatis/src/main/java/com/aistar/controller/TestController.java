package com.aistar.controller;

import com.aistar.pojo.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/f1")
    public String fun1(String id,String name,Float price){
        System.out.println("id:"+id+"name:"+name+"price:"+price);
        return "a";
    }

    @RequestMapping("/f2")
    public String fun2(@RequestParam("id")String proId,
                       @RequestParam("name")String proName,
                       @RequestParam("price")Float proPrice){
        System.out.println("id:"+proId+"name:"+proName+"price:"+proPrice);
        return "a";
    }

    @RequestMapping("/f3")
    public String fun3(Product product){
        System.out.println(product);
        return "a";
    }



}
