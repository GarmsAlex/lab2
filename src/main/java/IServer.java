import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IServer extends Remote {
    public String letGoodOut() throws RemoteException;
    public String letBadOut() throws RemoteException;
}