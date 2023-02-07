/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplointerface;

/**
 *
 * @author nando
 */
public class Square implements Shape {
    double side;
    
    public Square(double side){
        this.side = side;
    }
    
    @Override
    public double getArea(){
        return(side*side);
    }
}
