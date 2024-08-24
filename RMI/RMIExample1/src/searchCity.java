import java.rmi.*;
import java.rmi.RemoteException;

/**
 *
 * @author Muhammad Ahsan
 */
public interface searchCity extends Remote{
    public String findCity(String cityName)  throws RemoteException;
}
