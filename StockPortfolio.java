package com.bridglabz;
import java.util.Scanner;
public class StockPortfolio {
    private static final int stockSize = 0;
    private  StockAccount[] stocks;
    public void stockDetails() {
        stocks = new StockAccount[stockSize];
    }
    public static  void createStockReport(){
        for (int i=0; i<stockSize; i++){

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Stock name : ");
        String stockName = sc.next();
        System.out.println("Enter the no of Stocks : ");
        int noOfStocks = sc.nextInt();
        System.out.println("Enter Stock price : ");
        double stockPrice = sc.nextDouble();
        createStockReport();
    }
}
