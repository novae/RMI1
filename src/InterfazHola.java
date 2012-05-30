import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfazHola extends Remote{
	public String diHola()throws RemoteException;
}