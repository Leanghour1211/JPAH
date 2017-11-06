///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.jpah.data.model;
//
//import java.io.Serializable;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
///**
// *
// * @author Leanghour
// */
//@Entity
//@Table(name = "jpah_products")
//public class Products implements Serializable{
//    
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private int productId;
//    private String productName;
//    private String productDescription;
//    private double productPrice;
//    @ManyToOne
//    private Categories category;
//    public Products() {
//    }
//
//    
//    
//    public Products(int productId, String productName, String productDescription, double productPrice) {
//        this.productId = productId;
//        this.productName = productName;
//        this.productDescription = productDescription;
//        this.productPrice = productPrice;
//    }
//
//    public Categories getCategory() {
//        return category;
//    }
//
//    public void setCategory(Categories category) {
//        this.category = category;
//    }
//
//    
//    
//    public int getProductId() {
//        return productId;
//    }
//
//    public void setProductId(int productId) {
//        this.productId = productId;
//    }
//
//    public String getProductName() {
//        return productName;
//    }
//
//    public void setProductName(String productName) {
//        this.productName = productName;
//    }
//
//    public String getProductDescription() {
//        return productDescription;
//    }
//
//    public void setProductDescription(String productDescription) {
//        this.productDescription = productDescription;
//    }
//
//    public double getProductPrice() {
//        return productPrice;
//    }
//
//    public void setProductPrice(double productPrice) {
//        this.productPrice = productPrice;
//    }
//
//    @Override
//    public String toString() {
//        return "Products{" + "productId=" + productId + ", productName=" + productName + ", productDescription=" + productDescription + ", productPrice=" + productPrice + ", category=" + category + '}';
//    }
//
//    
//    
//}
