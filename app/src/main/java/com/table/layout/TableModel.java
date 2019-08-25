package com.table.layout;

public class TableModel {

    private String productBaseCategory;
    private String productSubCategory;
    private String productId;
    private String productName;
    private String productMRP;
    private String productQuantity;

    public TableModel(String productBaseCategory, String productSubCategory, String productId, String productName, String productMRP, String productQuantity) {
        this.productBaseCategory = productBaseCategory;
        this.productSubCategory = productSubCategory;
        this.productId = productId;
        this.productName = productName;
        this.productMRP = productMRP;
        this.productQuantity = productQuantity;
    }

    public String getProductBaseCategory() {
        return productBaseCategory;
    }

    public void setProductBaseCategory(String productBaseCategory) {
        this.productBaseCategory = productBaseCategory;
    }

    public String getProductSubCategory() {
        return productSubCategory;
    }

    public void setProductSubCategory(String productSubCategory) {
        this.productSubCategory = productSubCategory;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductMRP() {
        return productMRP;
    }

    public void setProductMRP(String productMRP) {
        this.productMRP = productMRP;
    }

    public String getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(String productQuantity) {
        this.productQuantity = productQuantity;
    }
}
