
import java.rmi.*;
import java.rmi.registry.Registry;
import java.rmi.server.*;

/**
 *
 * @author Muhammad Ahsan
 */
public class Server extends UnicastRemoteObject implements HelloInterface {

    private String message;

    Server(String message) throws RemoteException {
        this.message = message;
    }

    @Override
    public String say() throws RemoteException {
        return this.message;
    }

    public static void main(String[] Args) throws RemoteException {

        try {
            Registry r = java.rmi.registry.LocateRegistry.createRegistry(1096);
            Server s = new Server("Welcome to distributed application using RMI");

            r.rebind("Hello", s);
            System.out.println("Server is running");
        } catch (Exception e) {
            System.out.println("Server is not Connected: " + e);

        }
    }
}
