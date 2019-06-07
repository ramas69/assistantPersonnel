package assistant.perso;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class Connexion {

	public Connexion() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static boolean connecter(){
		try {
			// chargement de la calsse par son nom
			Class c = Class.forName("com.mysql.jdbc.Driver");
			Driver pilote = (Driver) c.newInstance();
			
			//enregistrement du pilote aupres du DriverManager
			DriverManager.registerDriver(pilote);
			System.out.println("test");
			//Protocole de connexion
			String protocole = "jdbc:mysql:";
			String ip = "localhost";
			String port = "3306";
			String nomBase = "assistant";
			String conString = protocole + "//" + ip + ":" + port + "/"
					+ nomBase + "?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";


			// Identifiants de connexion et mot de passe
			String nomConnexion = "root";
			String motDePasse = "";
			Connection con = DriverManager.getConnection(conString,
					nomConnexion, motDePasse);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();

		}
		return true;



	}
	
	
	
	
}
