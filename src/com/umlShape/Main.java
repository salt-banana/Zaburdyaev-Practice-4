package com.umlShape;

public class Main {

    public static void main(String[] args) {


        // Circle
        System.out.println("\n" + "=".repeat(50) + " CIRCLE BEGIN " + "=".repeat(50));


        Circle circle = new Circle(6);

        System.out.println(circle);

        circle.setColor("violet");
        circle.setFilled(true);

        System.out.println("\n" + circle);


        System.out.println("\n" + "=".repeat(50) + " CIRCLES END " + "=".repeat(50));



        // Rectangle
        System.out.println("\n" + "=".repeat(50) + " RECTANGLE BEGIN " + "=".repeat(50));


        Rectangle rect = new Rectangle(2,5,"yellow",false);

        System.out.println("\n" + rect);


        System.out.println("\n" + "=".repeat(50) + " RECTANGLE END " + "=".repeat(50));


        // Square
        System.out.println("\n" + "=".repeat(50) + " SQUARE BEGIN " + "=".repeat(50));


        Square square = new Square(4,"blue",true);

        System.out.println("\n" + square);


        System.out.println("\n" + "=".repeat(50) + " SQUARE END " + "=".repeat(50));



        // Creating square using Rectangle class
        System.out.println("\n" + "=".repeat(50) + " SQUARE THROUGH RECT BEGIN " + "=".repeat(50));


        Rectangle evenRect = new Square(6,"green",false);

        System.out.println("\n" + evenRect);


        System.out.println("\n" + "=".repeat(50) + " SQUARE THROUGH RECT END " + "=".repeat(50));



        // Creating shapes using Shape class
        System.out.println("\n" + "=".repeat(50) + " SHAPES BEGIN " + "=".repeat(50));


        Shape shapeCircle = new Circle(2,"black",false);
        Shape shapeRectangle = new Rectangle(1,1,"aqua", true);
        Shape shapeSquare = new Square(5,"pink",true);

        System.out.println("\n" +shapeCircle);
        System.out.println("\n" + shapeRectangle);
        System.out.println("\n" + shapeSquare);


        System.out.println("\n" + "=".repeat(50) + " SHAPES END " + "=".repeat(50));

    }

}
