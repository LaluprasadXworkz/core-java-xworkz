package com.dmart.dmartapplication;

import com.dmart.dmartapplication.billing.BillingMachine;
import com.dmart.dmartapplication.products.Products;

import java.util.Scanner;

public class BillingMachineExe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many products do you want to add :");
        int size = sc.nextInt();
        BillingMachine billingMachine = new BillingMachine(size);

        for (int i = 0; i < size; i++) {
            Products product = new Products();

            System.out.print("Enter Product Name :");
            String pName = sc.next();
            product.setProductName(pName);

            System.out.print("Enter Company Name :");
            String cName = sc.next();
            product.setCompany(cName);

            System.out.print("Enter Manufacture Date :");
            String mFd = sc.next();
            product.setManufactureDate(mFd);

            System.out.print("Enter Expiry Date :");
            String eXp = sc.next();
            product.setExpeDate(eXp);

            System.out.print("Enter Price :");
            double cost = sc.nextDouble();
            product.setPrice(cost);

            System.out.print("Enter Weight :");
            double weight = sc.nextDouble();
            product.setWeightInGrams(weight);

            billingMachine.addProduct(product);
        }

        String input;
        do {
            System.out.println("\nEnter an option:");
            System.out.println("1: Display all products");
            System.out.println("2: Get product details by product ID");
            System.out.println("3: Get product price by product name");
            System.out.println("4: Get product name by company name");
            System.out.println("5: Get company name by product name");
            System.out.println("6: Get manufacturing and expiry date by product name");
            System.out.println("7: Update manufacturing and expiry date by product name");
            System.out.println("8: Update product price by product name");
            System.out.println("9: Delete product by product name");

            System.out.print("Enter the choice :");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    billingMachine.getallProducts();
                    break;
                case 2:
                    System.out.print("Enter Product ID :");
                    billingMachine.getProductDetailsByproductId(sc.nextInt());
                    break;
                case 3:
                    System.out.print("Enter Product Name :");
                    String pName = sc.next();
                    double price = billingMachine.getProductPriceByProductName(pName);
                    System.out.println("Price of " + pName + " is " + price);
                    break;
                case 4:
                    System.out.print("Enter Company Name :");
                    String cName = sc.next();
                    String productName = billingMachine.getproductNameByProductManufactorCompanyName(cName);
                    System.out.println("Product Name are : ");
                    break;
                case 5:
                    System.out.print("Enter Product Name :");
                    String pNameForCompany = sc.next();
                    String companyName = billingMachine.getCompanyNameByProductName(pNameForCompany);
                    System.out.println("Company Name: " + companyName);
                    break;
                case 6:
                    System.out.print("Enter Product Name :");
                    billingMachine.getExpdateandMnfDatebyProductName(sc.next());
                    break;
                case 7:
                    System.out.print("Enter Product Name :");
                    String prodName = sc.next();
                    System.out.print("Enter Manufacturing Date: ");
                    String mfDate = sc.next();
                    System.out.print("Enter Expiry Date :");
                    String expDate = sc.next();
                    billingMachine.updateMfDateExpDateByProductName(prodName, mfDate, expDate);
                    break;
                case 8:
                    System.out.print("Enter Product Name :");
                    String prodNameForPrice = sc.next();
                    System.out.print("Enter the new Product Price :");
                    double proPrice = sc.nextDouble();
                    billingMachine.updateProductPriceByproductName(prodNameForPrice, proPrice);
                    break;
                case 9:
                    System.out.print("Enter Product Name :");
                    String prodNameToDelete = sc.next();
                    billingMachine.deleteProductByProductId(prodNameToDelete);
                    break;
                default:
                    System.out.println("Invalid option. Please enter a valid option.");
            }

            System.out.print("Do you want to continue (Yes/No)?");
            input = sc.next().toLowerCase();
        } while (input.equals("yes"));
        System.out.println("Thank you ............!");
    }
}
