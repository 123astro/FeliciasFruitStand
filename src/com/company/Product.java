package com.company;

public class Product {
    public double pricePerPound;
    public int lbsSold;
    public int numDaysInStock;
    public String prepared;
    public int qtyInStock;
    public int aisleNum;

    public Product(double pricePerPound, int lbsSold, int numDaysInStock, int qtyInStock, String prepared, int aisleNum){
        this.pricePerPound = pricePerPound;
        this.lbsSold = lbsSold;
        this.numDaysInStock = numDaysInStock;
        this.qtyInStock = qtyInStock;
        this.prepared = prepared;
        this.aisleNum = aisleNum;
    }
    public String toString(){
        return "{ price per pound: " + pricePerPound + " pounds sold: " + lbsSold  + " Number of days in stock: " + numDaysInStock + " Quantity of stock; " + qtyInStock + " Is the food prepared: " + prepared +
                " Location aisle number: " + aisleNum;
    }
}






