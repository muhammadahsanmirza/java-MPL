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
            Registry r = LocateRegistry.getRegistry("localhost", 1096);
            HelloInterface  s = (HelloInterface) r.lookup("Hello");
            System.out.println(s.say());
        }catch(Exception ee){
//            ee.printStackTrace();
            System.out.println("Exception: " + ee);
        }

    }
    
}
