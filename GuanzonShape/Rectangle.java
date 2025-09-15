/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GuanzonShape;

/**
 *
 * @author User
 */
public class Rectangle implements IShape {
    
    private double length;
    private double width;
    
    public Rectangle (double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
       return length + width;
    }
    public double getPerimeter(){
        return 2 * (length + width);
    } 
 

}
