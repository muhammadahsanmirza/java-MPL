
import java.rmi.Remote;
import java.rmi.RemoteException;


/**
 *
 * @author Muhammad Ahsan
 */
public interface HelloInterface extends Remote{
    public String say()  throws RemoteException;
}
