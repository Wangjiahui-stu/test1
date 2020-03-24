package com.aistar.pojo;

import java.util.Date;

public class ProductOrder {
    private int orderId;
    private String productName;
    private String tradeNo;
    private float price;
    private Date createTime;
    private int userId;
    private String userName;

    public ProductOrder() {
    }

    public ProductOrder(int orderId, String productName, String tradeNo, float price, Date createTime, int userId, String userName) {
        this.orderId = orderId;
        this.productName = productName;
        this.tradeNo = tradeNo;
        this.price = price;
        this.createTime = createTime;
        this.userId = userId;
        this.userName = userName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "ProductOrder{" +
                "orderId=" + orderId +
                ", productName='" + productName + '\'' +
                ", tradeNo='" + tradeNo + '\'' +
                ", price=" + price +
                ", createTime=" + createTime +
                ", userId=" + userId +
                ", userName='" + userName + '\'' +
                '}';
    }
}
