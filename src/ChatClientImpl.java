
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ChatClientImpl extends UnicastRemoteObject implements IChatClient{
    private String alias;

    // Constructor necesario
    public ChatClientImpl(String alias) throws RemoteException{
        this.alias = alias;
    }
    
    @Override
    public void recv(String m) throws RemoteException{
        System.out.println();
        System.out.println(m);
        System.out.print("mychat> ");
    }

    public String getAlias() throws RemoteException{
        return alias;
    }
            
}
