
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IChatClient extends Remote{
    void recv(String m) throws RemoteException;
    String getAlias() throws RemoteException;
}
