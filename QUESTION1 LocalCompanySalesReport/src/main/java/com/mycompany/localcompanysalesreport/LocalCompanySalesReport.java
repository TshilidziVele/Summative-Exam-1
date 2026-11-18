/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.localcompanysalesreport;

/**
 *
 * @author Tshilidzi
 */
import java.util.Scanner;
public class LocalCompanySalesReport {
    private static final int MONTHS = 3;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};

        int[][] sales = new int[names.length][MONTHS];

        for (int p = 0; p < names.length; p++) {
            for (int m = 0; m < MONTHS; m++) {
                sales[p][m] = ReadInt(input,
                    "Enter number of sales for month " + (m + 1)
                    + " for " + names[p] + " mattress: ");
            }
            System.out.println();
        }
        IProduct product = new Product(names, sales);
        PrintProduct printer = new PrintProduct(product);

        printer.PrintHeading();
        printer.PrintTotalProductSales();
        printer.PrintAverageProductSales();
        printer.PrintMostPopularProduct();
    }

    private static int ReadInt(Scanner input, String prompt) {
        System.out.print(prompt);
        while (!input.hasNextInt()) {
            System.out.print("Invalid number, try again: ");
            input.next();            
        }
        return input.nextInt();
    }
}