package com.aistar.service;



import com.aistar.pojo.Product;

import java.util.List;

public interface ProductService {
    List<Product> listProduct();
    Product findById(int id);

}
