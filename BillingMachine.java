package com.dmart.dmartapplication.billing;

import com.dmart.dmartapplication.products.Products;
import java.util.Arrays;

public class BillingMachine {
    private Products[] products;
    private int index = 0;
    private int pid = 1;

    public BillingMachine(int size) {
        products = new Products[size];
    }

    public boolean addProduct(Products product) {
        if (index < products.length) {
            product.setProductId(pid++);
            products[index++] = product;
            System.out.println("Product is Added");
            return true;
        } else {
            System.out.println("BillingMachine is full. Cannot add more products.");
            return false;
        }
    }
//    1
    public void getallProducts() {
        System.out.println("These are the list of products you have Added");
        for (int i = 0; i < products.length; i++) {
            System.out.println("Product Id :" + products[i].getProductId() + "\nProduct Name :" + products[i].getProductName() + "\nProduct Company Name" +
                    products[i].getCompany() + "\nProduct Manufacture Date :" + products[i].getManufactureDate() + "\nProdut Exp Date :" + products[i].getExpeDate() + "\nProduct Price :"
                    + products[i].getPrice() + "\nProduct Price :" + products[i].getPrice() + "\nProduct weight in Grams :" + products[i].getWeightInGrams());
        }
        System.out.println("-----------------------------------------------------------------------");
    }
//    2
    public void getProductDetailsByproductId(int pId) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getProductId() == pId) {
                System.out.println("Product Id :" + products[i].getProductId() + "\nProduct Name :" + products[i].getProductName() + "\nProduct Company Name" +
                        products[i].getCompany() + "\nProduct Manufacture Date :" + products[i].getManufactureDate() + "\nProdut Exp Date :" + products[i].getExpeDate()
                        + "\nProduct Price :" + products[i].getPrice() + "\nProduct Price :" + products[i].getPrice() + "\nProduct weight in Grams :" + products[i].getWeightInGrams());
            }
        }
    }
//    3
    public double getProductPriceByProductName(String pName) {
        double productPrice = 0.00;
        for (int i = 0; i < products.length; i++) {
            if (products[i].getProductName().equals(pName)) {
                productPrice = products[i].getPrice();
            }
        }
        return productPrice;
    }
//    4
    public String getproductNameByProductManufactorCompanyName(String cname) {
        String pname = null;
        for (int i = 0; i < products.length; i++) {
            if (products[i].getCompany().equals(cname)) {
                System.out.println(pname = products[i].getProductName());
            }
        }
        return pname;
    }
//    5
    public String getCompanyNameByProductName(String pName) {
        String cName = null;
        for (int i = 0; i < products.length; i++) {
            if (products[i].getProductName().equals(pName)) {
                cName = products[i].getCompany();
            }
        }
        return cName;
    }
//    6
    public void getExpdateandMnfDatebyProductName(String pName) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getProductName().equals(pName)) {
                System.out.println(products[i].getManufactureDate());
                System.out.println(products[i].getExpeDate());
            }
        }
    }
//    7
    public boolean updateMfDateExpDateByProductName(String pName, String mfDate, String expDate) {
        boolean updateMfdExpd = false;
        for (int i = 0; i < products.length; i++) {
            if (products[i].getProductName().equals(pName)) {
                products[i].setManufactureDate(mfDate);
                products[i].setExpeDate(expDate);
                System.out.println("The Updated Manufacture date :"+products[i].getManufactureDate()+"\nThe Updated Expiry date :"+products[i].getExpeDate());
                updateMfdExpd = true;
            }
        }
        return updateMfdExpd;
    }
//    8
    public boolean updateProductPriceByproductName(String pName, double price) {
        boolean updateprice = false;
        for (int i = 0; i < products.length; i++) {
            if (products[i].getProductName().equals(pName)) {
                products[i].setPrice(price);
                System.out.println("The Product name :"+products[i].getProductName()+"and Its Updated Price :"+products[i].getPrice());
                updateprice = true;
            }
        }
        return updateprice;
    }
//    9
    public void deleteProductByProductId(String pName){
        int i,j;
        for (i = 0,j=0; i < products.length; i++) {
            if(!products[i].getProductName().equals(pName)){
                products[j++]=products[i];
            }
        }
        products= Arrays.copyOf(products,j);
        getnewproductlist(products);
    }
    private void getnewproductlist(Products []products){
        System.out.println("New list of Product ");
        for (int i = 0; i < products.length; i++) {
            System.out.println("Product Id :" + products[i].getProductId() + "\nProduct Name :" + products[i].getProductName() + "\nProduct Company Name" +
                    products[i].getCompany() + "\nProduct Manufacture Date :" + products[i].getManufactureDate() + "\nProdut Exp Date :" + products[i].getExpeDate() + "\nProduct Price :"
                    + products[i].getPrice() + "\nProduct Price :" + products[i].getPrice() + "\nProduct weight in Grams :" + products[i].getWeightInGrams());
        }
    }

}
