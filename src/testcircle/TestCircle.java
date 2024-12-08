/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testcircle;

/**
 *
 * @author Ammar
 */
public class TestCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Circle C1=new Circle(20);
        
        Circle C2=new Circle(30);
        
        System.out.println("C1 Area is " + C1.getArea());
        System.out.println("C2 Area is " + C2.getArea());
        System.out.println("C1 Radius is " + C1.getradius());
        System.out.println("C2 Radius is "+ C2.getradius());
        
        
    }
    
}
