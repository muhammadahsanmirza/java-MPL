/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coordinates;

/**
 *
 * @author Muhammad Ahsan
 */

class point{
    
    private double xAxis;
    private double yAxis;
    
    point(){
        this.xAxis=0;
        this.yAxis=0;
    }
    
    point(double xAxis,double yAxis){
        this.xAxis= xAxis;
        this.yAxis=yAxis;
    }
    
    void setXAxis(double xAxis){
        this.xAxis = xAxis;
    }
    
    double getXAxis(){
        return this.xAxis;
    }
    
    void setYAxis(double yAxis){
        this.yAxis = yAxis;
    }
    
    double getYAxis(){
        return this.yAxis;
    }
    
    double addAxis(){
        return this.xAxis+this.yAxis;
    }
    
    void print(){
        System.out.println("x Axis = " + this.xAxis);
        System.out.println("y Axis = " + this.yAxis);

        
        System.out.println("sum of x-axis and y-axis = " + this.addAxis());
    } 
    
}
public class Coordinates {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-ARID-737");
        // TODO code application logic here
        
        point coOrdinates= new point(1.5,2.5);
        
        coOrdinates.print();
        
    }
}
