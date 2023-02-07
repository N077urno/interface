/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exemplointerface;

/**
 *
 * @author nando
 */
public class ExemploInterface {

    public static void main(String[] args) {
        Shape circle = new Circle(2);
        Shape square = new Square(5);
        
        System.out.println("Square area: "+square.getArea());
        System.out.println("Circle area: "+circle.getArea());      
    }
}
