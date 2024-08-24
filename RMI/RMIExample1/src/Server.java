
import java.rmi.*;
import java.rmi.registry.Registry;
import java.rmi.server.*;

/**
 *
 * @author Muhammad Ahsan
 */
public class Server extends UnicastRemoteObject implements searchCity {

    String cityName;

    Server() throws RemoteException {
        cityName = "";
    }

    @Override
    public String findCity(String cityName) throws RemoteException {
        int j = 0;
        String A[][] = {{"lahore", "021"}, {"karachi", "022"}, {"islamabad", "023"}, {"peshawar", "024"}};
        for (int i = 0; i <= 3; i++) {
            if (cityName.equals(A[i][j])) {
                j++;
                this.cityName = A[i][j];
                j = 0;
                break;
            } else {
//                j++;
//                j=0;
            }
        }
        return this.cityName;
    }

    public static void main(String[] Args) throws RemoteException {

        try {
            Registry r = java.rmi.registry.LocateRegistry.createRegistry(1092);
            Server s = new Server();

            r.rebind("Search_City", s);
            System.out.println("Server is running");
        } catch (Exception e) {
            System.out.println("Server is not Connected: " + e);

        }

    }
}
