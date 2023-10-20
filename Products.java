package com.dmart.dmartapplication.products;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Products {

    private int productId;
    private String productName;
    private String company;
    private String manufactureDate;
    private String expeDate;
    private double price;
    private double weightInGrams;

}
