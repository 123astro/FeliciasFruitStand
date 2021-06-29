package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static List<Product> feliciasProducts = new ArrayList<>();  // Product is the parent. If you did Fruit only fruit would be used.
    //In Java, a static member is a member of a class that isn't associated with an instance of a class.
    // Instead, the member belongs to the class itself. As a result, you can access the static member without
    // first creating a class instance.

    public static void main(String[] args) {
        feliciasProducts.add((new Fruit("Apples", "red", 1.59, 238, 23, 400, "no", 3)));
        feliciasProducts.add((new Meat("Chicken", "yes", 4.99, 230, 20, 300, "yes", 4)));
        feliciasProducts.add((new Meat("Beef", "yes", 2.39, 7, 21, 200, "yes", 6)));

        // displayProducts(feliciasProducts);
        //displayProducts(feliciasProducts, "Fruit");
        displayProducts(feliciasProducts, 1);
        displayProducts(feliciasProducts, "Meat");


    }

    public static void displayProducts(List<Product> productList) {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

//
//    public static void displayProducts(List<Product> productList, String referenceType) {
//
//        for (Product product : productList) {
//            //System.out.println(product.getClass().getSimpleName());
//            switch (referenceType) {
//                case "Fruit":
//                    if (product instanceof Fruit) {
//                        System.out.println("Fruit");
//                        System.out.println((Fruit) product);
//                    }
//                    break;
//                case "Meat":
//                    if (product instanceof Meat) {
//                        System.out.println("Meat");
//                        System.out.println((Meat) product);
//                    }
//                    break;
//            }
//        }
//    }


    public static void displayProducts(List<Product> list, int i) {
        System.out.println(list.get(i).toString());
    }

    static void displayProducts(List<Product> productList, String productType) {
        for(Product product : productList) {
            if(product.getClass().getSimpleName().equals(productType)) {
                System.out.println(product);
            }
        }
    }
//    public static void displayProducts(List<Product> productList, String referenceType) {
//
//        // for (Products product : productList) {
//        for (Product product : productList) {
//
//            // System.out.println(product.getClass().getSimpleName());
//            if (referenceType == "Fruit" && product instanceof Fruit) {
//                System.out.println(product);
//            }
//            if (referenceType == "Meat" && product instanceof Meat) {
//                System.out.println(product);
//            }
//        }
//    }
}







//Objects
//        1. Create a Product class this should contain data that any item she sells will have
//        2. Create a Fruit class that inherits from the Product class that contain fruit specific data.
//        3. Create a Meat class that inherits from the product class that contains Meat specific data.
////        Be creative with your classes.
//Code
//        1. In the main class create a Product list
//        2. add to the list three different Meats and 3 different Fruits.
//        3. in the main class create a method called displayProducts1 it should accept a Product list and display
//        all the items in the list.
//        4. Create a second displayProducts2 class that accepts a Product list AND a string 'type' if the type is meat
//        only print the meat products and if fruit only display the fruit products
//        a. extra challenge try using a switch statement for this instead of if else
//        5. create a displayProduct method that accepts a product list and an int i. print out the product at index i.


//be aware that except for the switch statement you should have all the code you need in Thursday's walk through.
//        You'll need to adjust some items and use them in different ways to fit this exercise however there are
//        new new concepts in this challenge. Try this by yourself first and see how far you get, You may work
//        with a classmate starting on Tuesday. Of course if you get completely stuck you can ask for help in slack.