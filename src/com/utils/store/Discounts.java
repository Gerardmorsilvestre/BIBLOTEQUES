package com.utils.store;

import java.util.Scanner;
public class Discounts {
    public static double calculateDiscount(double quota){
        double discount = 0.0;
        quota *= 100;
        if (quota >= 25.0 && quota < 75.0){
            discount = 0.05;
        } else if (quota >= 75.0){
            discount = 0.10;
        }
        return discount;

    }
}
