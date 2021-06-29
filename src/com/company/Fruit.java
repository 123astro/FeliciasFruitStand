package com.company;

 public class Fruit extends Product {
    public String fruitType;
    public String fruitColor;

    public Fruit (String fruitType, String fruitColor, double pricePerPound, int lbsSold, int numDaysInStock, int qtyInStock, String prepared, int aisle) {
        super(pricePerPound, lbsSold, numDaysInStock, qtyInStock, prepared, aisle );
        this.fruitType = fruitType;
        this.fruitColor = fruitColor;
    }


     public String toString() {
         return fruitType + " are " + fruitColor + " and we have " +  qtyInStock + " in stock. The price per pound $" +
                 pricePerPound + " and we have sold " + lbsSold + " pounds. They have been in stock for " + numDaysInStock +
                 " days. Are they prepared ? " + prepared + ". Located in aisle: " + aisleNum;
     }

}