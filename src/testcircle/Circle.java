/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testcircle;

/**
 *
 * @author Ammar
 */
public class Circle {
   
     public double radius;
    
    public Circle (double r){
        this.radius=r;
    }
    
    public double getradius (){
        return radius;
        
    }
    public double getArea(){
        return (radius*radius)* Math.PI;
    }
    public double getCircumferenece(){
        return 2*Math.PI*radius;
    }
    public double getDiameter(){
        return radius*2;
    }
}
