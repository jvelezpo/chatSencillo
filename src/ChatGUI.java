
import java.io.*;
import java.rmi.*;

public class ChatGUI {
    public static void main(String[] args){
        
        IChatClient c = null;
        IChatSala cs = null;
        
        try{         
            c = new ChatClientImpl(args[1]);
            
            cs = (IChatSala) Naming.lookup("rmi://"+args[0]+"/chat");
            
            cs.login(args[1], c);
            
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("mychat> ");
            String linea = teclado.readLine();
            
            while(!linea.equals("salir")){
                cs.send(c.getAlias() + " dice: " + linea);
                //System.out.print("mychat> ");
                linea = teclado.readLine();
            }
            cs.logout(args[1]);
            
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        
        
        
      
    }
}
