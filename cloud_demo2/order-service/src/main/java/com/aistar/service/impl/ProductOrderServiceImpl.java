package com.aistar.service.impl;

import com.aistar.pojo.ProductOrder;
import com.aistar.service.ProductOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.Map;
import java.util.UUID;

@Service
public class ProductOrderServiceImpl implements ProductOrderService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public ProductOrder save(int userId, int productId) {
        String url = "http://productService/product/"+productId;
        Map productMap =  this.restTemplate.getForObject(url, Map.class);
        System.out.println(productMap);

        ProductOrder productOrder = new ProductOrder();
        productOrder.setCreateTime(new Date());
        productOrder.setProductName(productMap.get("proName").toString());
        productOrder.setPrice((Float)productMap.get("proPrice"));
        productOrder.setUserId(userId);
        productOrder.setTradeNo(UUID.randomUUID().toString());
        return productOrder;

    }
}
