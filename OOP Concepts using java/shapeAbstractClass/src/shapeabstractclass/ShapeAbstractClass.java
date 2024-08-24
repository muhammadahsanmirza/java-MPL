/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shapeabstractclass;

/**
 *
 * @author Muhammad Ahsan
 */
abstract class shape {

    abstract void draw();
}

class rectangle extends shape {

    @Override
    void draw() {
        System.out.println("drawing rectangle");
    }
}

class circle extends shape {

    @Override
    void draw() {
        System.out.println("drawing circle");
    }
}

public class ShapeAbstractClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-arid-737");
        // TODO code application logic here
        shape s=new circle();
        s.draw();
    }
}
