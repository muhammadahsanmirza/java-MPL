
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Muhammad Ahsan
 */
public class Client {
    public static void main(String[] Args) {
        Client c = new Client();
        c.connectRemote();

    }
    private void connectRemote() {
        try {
            Registry r = LocateRegistry.getRegistry("localhost", 8000);
            calc  s = (calc) r.lookup("Calculator");
            System.out.println(s.calculate(5,6,'+'));
        }catch(Exception ee){
//            ee.printStackTrace();
            System.out.println("Exception: " + ee);
        }

    }
}
