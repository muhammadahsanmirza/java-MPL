/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorymanagement;

import java.util.Scanner;
/**
 *
 * @author Muhammad Ahsan
 */

class inventory{
    private int itemNumber;
    private int quantity;
    private int cost;
    private int totalCost;
    
    inventory(){
        this.itemNumber = 0;
        this.quantity = 0;
        this.cost = 0;
        this.totalCost = 0;
    }
    
    inventory( int itemNumber, int quantity, int cost){
        this.itemNumber = itemNumber;
        this.quantity = quantity;
        this.cost = cost;
        
        this.setTotalCost(quantity, cost);
    }
    
    void setItemNumber(int itemNumber){
        this.itemNumber = itemNumber;
    }
    
    int geItemNumber(){
        return this.itemNumber;
    }
    
    void setQuantity(int quantity){
        this.quantity = quantity;
    }
    
    int getQuantity(){
        return this.quantity;
    }
    
    void setCost(int cost){
        this.cost = cost;
    }
    
    int getCost(){
        return this.cost;
    }
    
    void setTotalCost(int quantity,int cost){
        this.totalCost = quantity*cost;
    }
    
    int getTotalCost(){
        return this.totalCost;
    }
}
public class InventoryManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-ARID-737");
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int itemNumber;
        int quantity;
        int cost;
        System.out.println("/nEnter Item Number: ");
        itemNumber = input.nextInt();
        
        System.out.println("Enter Item Quantity: ");
        quantity = input.nextInt();
        
        System.out.println("Enter Item Cost: ");
        cost = input.nextInt();
        
        inventory receit= new inventory(itemNumber,quantity,cost);

        System.out.println("Item Number --> " + receit.geItemNumber());
        System.out.println("Item Quantity --> " + receit.getQuantity());
        System.out.println("Item Cost --> " + receit.getCost());
        System.out.println("\nTotal Cost --> " + receit.getTotalCost());        
    }
}
