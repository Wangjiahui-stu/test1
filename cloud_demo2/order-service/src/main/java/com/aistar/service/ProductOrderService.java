package com.aistar.service;

import com.aistar.pojo.ProductOrder;

public interface ProductOrderService {

    public ProductOrder save(int userId, int productId);
}
