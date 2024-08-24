
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;

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
            Registry r = LocateRegistry.getRegistry("localhost", 1092);
            searchCity  s = (searchCity) r.lookup("Search_City");
            System.out.println(s.findCity("islamabad"));
        }catch(Exception ee){
//            ee.printStackTrace();
            System.out.println("Exception: " + ee);
        }

    }
}
