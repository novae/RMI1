import java.rmi.*;
import java.rmi.Naming;
	public class ClienteHola{
		public static void main(String arg []){
			try{
				InterfazHola obj=(InterfazHola)Naming.lookup("/ServidorHola"); //Obtener Referencia del Objeto
				String mensaje=obj.diHola();
				System.out.println("Mensaje Obtenido del objeto remoto: "+mensaje);
			}
			catch(Exception e){
				System.out.println("excpcion del cliente "+e);
			}
		}
	}