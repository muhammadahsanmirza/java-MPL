
import java.rmi.*;
import java.rmi.registry.Registry;
import java.rmi.server.*;

/**
 *
 * @author Muhammad Ahsan
 */
public class Server extends UnicastRemoteObject implements calc {

    Server(String message) throws RemoteException {

    }

    @Override
    public int calculate(int num1, int num2, char op) throws RemoteException {
        int result = 0;
        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Denominator Can't br Zero");
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid Operatorbr:");
        }
        return result;
    }

    public static void main(String[] Args) throws RemoteException {

        try {
            Registry r = java.rmi.registry.LocateRegistry.createRegistry(8000);
            Server s = new Server("Welcome to Remote Calculator RMI");

            r.rebind("Calculator", s);
            System.out.println("Server is running");
        } catch (Exception e) {
            System.out.println("Server is not Connected: " + e);

        }
    }
}
