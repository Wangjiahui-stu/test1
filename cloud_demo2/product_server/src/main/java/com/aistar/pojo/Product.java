package com.aistar.pojo;

public class Product {
    /**
     * 商品编号
     */
    private int proId;
    /**
     * 商品名称
     */
    private String proName;
    /**
     * 商品价格，分为单位
     */
    private int proPrice;
    /**
     * 商品库存
     */
    private int proStore;

    public Product() {
    }

    public Product(int proId, String proName, int proPrice, int proStore) {
        this.proId = proId;
        this.proName = proName;
        this.proPrice = proPrice;
        this.proStore = proStore;
    }

    public int getProId() {
        return proId;
    }

    public void setProId(int proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public int getProPrice() {
        return proPrice;
    }

    public void setProPrice(int proPrice) {
        this.proPrice = proPrice;
    }

    public int getProStore() {
        return proStore;
    }

    public void setProStore(int proStore) {
        this.proStore = proStore;
    }

    @Override
    public String toString() {
        return "Product{" +
                "proId=" + proId +
                ", proName='" + proName + '\'' +
                ", proPrice=" + proPrice +
                ", proStore=" + proStore +
                '}';
    }
}
