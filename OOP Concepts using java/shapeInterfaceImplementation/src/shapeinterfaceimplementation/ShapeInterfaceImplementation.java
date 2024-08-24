/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shapeinterfaceimplementation;

/**
 *
 * @author Muhammad Ahsan
 */
interface iDrawable{
    void draw();
}

class rectangle implements iDrawable {

    @Override
    public void draw() {
        System.out.println("drawing rectangle");
    }
}

class circle implements iDrawable {

    @Override
    public void draw() {
        System.out.println("drawing circle");
    }
}
public class ShapeInterfaceImplementation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-arid-737");
        // TODO code application logic here
        iDrawable s=new circle();
        s.draw();
    }
}
