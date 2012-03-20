

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;




public class ChatSalaImpl extends UnicastRemoteObject implements IChatSala{

    public ChatSalaImpl() throws RemoteException{
        
    }
    ArrayList<IChatClient> clientes = new ArrayList<IChatClient>();
    //IChatClient[] clientes = new IChatClient[100];

    @Override
    public void send(String m) throws RemoteException {
        System.out.println("enviaron el mensaje " + m);
        for(int i = 0; i < clientes.size(); i++){
            clientes.get(i).recv(m);
        }
        
    }

    @Override
    public void login(String alias, IChatClient c) throws RemoteException {
        if(clientes.size() < 100){
            clientes.add(c);
            System.out.println("total clientes: " + clientes.size());
            System.out.println("Se conecto el usuario " + alias);
        }
        
    }

    @Override
    public void logout(String alias) throws RemoteException {
        //hm.remove(alias);
    }    
}
