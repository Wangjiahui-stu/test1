package com.aistar.service.impl;


import com.aistar.pojo.Product;
import com.aistar.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private static List<Product> productList = new ArrayList<>();
    //模拟数据库中Product数据，存储在内存中
    static{
        productList.add(new Product(1001,"杯子",88,100));
        productList.add(new Product(1002,"书包",98,200));
        productList.add(new Product(1003,"钢笔",78,300));
        productList.add(new Product(1004,"橡皮",68,400));
        productList.add(new Product(1005,"铅笔",58,500));
        productList.add(new Product(1006,"直尺",48,600));
        productList.add(new Product(1007,"圆规",38,700));
        productList.add(new Product(1008,"胶带",28,800));
    }
    @Override
    public List<Product> listProduct() {
        return productList;
    }

    @Override
    public Product findById(int id) {
        for(Product product:productList){
            if(product.getProId() == id)
                return product;
        }
        return null;
    }
}
