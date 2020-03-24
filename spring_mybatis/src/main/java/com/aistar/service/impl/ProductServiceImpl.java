package com.aistar.service.impl;

import com.aistar.mapper.ProductMapper;
import com.aistar.pojo.Product;
import com.aistar.service.ProductService;
import com.aistar.util.MessageUtil;
import com.aistar.util.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;


    @Override
    public ServerResponse add(Product product) {
        return null;
    }

    @Override
    public ServerResponse update(Product product) {
        return null;
    }

    @Override
    public ServerResponse delete(String proId) {
        return null;
    }

    @Override
    public ServerResponse getById(String proId) {
        Product product =  productMapper.selectByPrimaryKey(proId);
        if(product !=null)
            return  ServerResponse.getDataSuccess(product);
        return ServerResponse.getDataFailed(MessageUtil.NO_DATA);
    }

    @Override
    public ServerResponse getAll() {
        return null;
    }

    @Override
    public ServerResponse getAllByPage(Integer pageNum) {
        return null;
    }
}
