
import java.rmi.Remote;
import java.rmi.RemoteException;


public interface IChatSala extends Remote{
    void send(String m) throws RemoteException;
    void login(String alias, IChatClient c) throws RemoteException;
    void logout(String alias) throws RemoteException;
}
