/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package generalinheritance;

/**
 *
 * @author Muhammad Ahsan
 */
class employee{
    float salary = 40000;
}
class programmer extends employee{
    int bonus = 10000;
}
public class GeneralInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-arid-737");
        // TODO code application logic here
        programmer p = new programmer();
        System.out.println("Programmer Salary = " + p.salary);
        System.out.println("Programmer Salary = " + p.bonus);

    }
}
