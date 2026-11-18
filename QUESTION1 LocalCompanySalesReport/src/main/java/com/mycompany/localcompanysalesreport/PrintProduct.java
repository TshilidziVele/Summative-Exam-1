/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.localcompanysalesreport;

/**
 *
 * @author Tshilidzi
 */
public class PrintProduct {
    private final IProduct product;

    public PrintProduct(IProduct product) {
        this.product = product;
    }

    public void PrintHeading() {
        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println("*".repeat(40));
    }

    public void PrintTotalProductSales() {
        System.out.println("TOTAL PRODUCT SALES: " + product.GetTotalProductsSold());
    }

    public void PrintAverageProductSales() {
        System.out.printf("AVERAGE PRODUCT SALES: %.0f%n", product.GetAverageProductSold());
    }

    public void PrintMostPopularProduct() {
        System.out.println("MOST POPULAR PRODUCT: " + product.GetMostPopularProduct());
    }
}