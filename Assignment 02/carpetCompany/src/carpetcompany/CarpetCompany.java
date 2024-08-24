/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carpetcompany;

/**
 *
 * @author Muhammad Ahsan
 */

class room{
    private double length;
    private double width;
    private double cost;
    
     room(){
        this.length = 0;
        this.width = 0;
        this.cost = 0;
    }
    
    room( double length, double width, double cost){
        this.length = length;
        this.width = width;
        this.cost = cost;
    }
    
    
    
    void setLength(double length){
        this.length = length;
    }
    
    double getLength(){
        return this.length;
    }
    
    void setWidth(int width){
        this.width = width;
    }
    
    double getWidth(){
        return this.width;
    }
    
    void setCost(double cost){
        this.cost = cost;
    }
    
    double getCost(){
        return this.cost;
    }
    
    double calculateArea(double length, double width){
        return this.length*this.width;
    }
    double totalCost(){
        return this.calculateArea(this.length, this.width)* this.cost;
    } 
    
    void print(){
        System.out.println("Total area = " + this.calculateArea(this.length, this.width));
        System.out.println("Total price = " + this.totalCost());
    }   
}
public class CarpetCompany {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-ARID-737");
        // TODO code application logic here
        
        room roomOne = new room(1,2,3);
        roomOne.print();
    }
}
