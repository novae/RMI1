import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.Naming;

public class ServidorHola extends UnicastRemoteObject implements InterfazHola{
		
		public ServidorHola() throws RemoteException{
			super();
		}  //El objeto remoto existe y esta listo para aceptar invocaciones
		
		public String diHola()throws RemoteException{
			return "Hola este es un mensage desde el servidor";
		}
		
		public static void main(String [] args){
			try{
				ServidorHola obj=new ServidorHola();
				Naming.rebind("/ServidorHola",obj); //Registrar Objetos en el servidor
				System.out.println("Objeto registrado en el servidor de nombres");
			}
			catch(Exception e){
				System.err.println(e);
			}
		}
}