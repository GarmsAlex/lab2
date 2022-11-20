import java.io.*;
import java.net.*;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements IServer {
    public Server() throws RemoteException{};
    public String letGoodOut(){
        return ( "Ну лови - ты красавчик!");
    }
    public String letBadOut(){
        return ( "Твой день видимо не задался!");
    }
    public static void main(String args[])throws Exception{
        Server s = new Server();
        Registry re = LocateRegistry.createRegistry(1099);
        re.rebind("server", s);
    }
}