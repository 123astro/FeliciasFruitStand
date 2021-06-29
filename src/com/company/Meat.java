package com.company;

class Meat extends Product{
    public String meatType;
    public String organic;

    public Meat (String meatType, String organic , double pricePerPound, int lbsSold, int numDaysInStock, int qtyInStock, String prepared, int aisle) {
        super(pricePerPound, lbsSold, numDaysInStock, qtyInStock, prepared, aisle);
        this.meatType = meatType;
        this.organic = organic;
    }

    public String toString() {
        return meatType + " is our meat type. Is it organic? " + organic + ". The price per pound is $" + pricePerPound +
                ". We have sold " + lbsSold + " pounds. It has been in stock for " + numDaysInStock + " days. We have "
                + qtyInStock + " in stock.\n" + "Is the meat prepared? " + prepared + ". Located in aisle number: " + aisleNum + ".";
    }
}
