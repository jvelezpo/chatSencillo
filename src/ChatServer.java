import java.rmi.Naming;

public class ChatServer {
    public static void main(String arg[]) {
	try {
            ChatSalaImpl chat = new ChatSalaImpl();
            Naming.rebind("chat", chat);
            System.out.println("Esperando clientes");
	} catch (Exception e) {
            System.out.println("hubo un error creando o registrando el objeto chatServer");
	}
	System.out.println("Servidor listo...");
    }
}
