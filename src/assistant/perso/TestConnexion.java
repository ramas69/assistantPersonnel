package assistant.perso;

public class TestConnexion {

	public TestConnexion() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Connexion connect = new Connexion();
		
		if (connect.connecter()){
			System.out.println("test");
		}else{
			System.out.println("deconnexion");
		}
		

	}

}
