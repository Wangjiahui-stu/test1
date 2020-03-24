package com.aistar.controller;

import com.aistar.pojo.Product;
import com.aistar.service.ProductService;
import com.aistar.util.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.UUID;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    private String getProductId(){
        return UUID.randomUUID().toString().replace("-","");
    }

    @RequestMapping("/add")
    public void add(Product product){
        product.setProId(getProductId());
        product.setProDate(new Date());
        ModelAndView mvc = new ModelAndView();
        ServerResponse serverResponse = productService.add(product);

        if (serverResponse.getStatus() ==1) {
            mvc.addObject(serverResponse.getData());
            mvc.setViewName("success");
        }else {
            mvc.addObject(serverResponse.getData());
            mvc.setViewName("product/add");
        }
    }

    public void update(Product product){

    }
    public void delete(String proId){

    }

    @RequestMapping("/getById")
    public ModelAndView getById(String proId){
        ModelAndView mav = new ModelAndView();
        ServerResponse serverResponse = productService.getById(proId);

        if (serverResponse.getStatus()==1)
            mav.addObject((Product)serverResponse.getData());
        else
            mav.addObject(serverResponse.getData()); //暂无数据
        mav.setViewName("product/detail");
        return mav;
    }


}
