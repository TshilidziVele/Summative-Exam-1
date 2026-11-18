/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.localcompanysalesreport;

/**
 *
 * @author Tshilidzi
 */

public class Product implements IProduct {
    private final String[] productNames;   
    private final int[][] sales;        
    public Product(String[] productNames, int[][] sales) {
        this.productNames = productNames;
        this.sales = sales;
    }
    
    
    @Override
    public int GetTotalProductsSold() {
        int total = 0;
        for (int[] product : sales)
            for (int monthSales : product)
                total += monthSales;
        return total;
    }

    @Override
    public double GetAverageProductSold() {
        int count = 0;
        for (int[] product : sales) count += product.length;
        return count == 0 ? 0 : (double) GetTotalProductsSold() / count;
    }


    @Override
    public String GetMostPopularProduct() {
        int bestIndex = 0;
        int bestTotal = -1;
        for (int i = 0; i < sales.length; i++) {
            int productTotal = 0;
            for (int monthSales : sales[i]) productTotal += monthSales;
            if (productTotal > bestTotal) {  
                bestTotal = productTotal;
                bestIndex = i;
            }
        }
        return productNames[bestIndex] + " (" + bestTotal + ")";
    }
}