import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author Muhammad AHsan
 */
public interface calc extends Remote{
    public int calculate(int num1,int num2, char op) throws RemoteException;
}
