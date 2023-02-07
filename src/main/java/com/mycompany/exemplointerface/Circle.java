/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplointerface;

/**
 *
 * @author nando
 */
public class Circle implements Shape {
    double radius;
    
    Circle(double radius){
        this.radius = radius;
    }
    
    @Override
    public double getArea(){
        return(Math.PI*radius*radius);
    }
}
