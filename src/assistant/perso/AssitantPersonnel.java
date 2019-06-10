package assistant.perso;

public class AssitantPersonnel {

	public static void main(String[] args) {
		Calendrier cal = new Calendrier();
		Menu men = new Menu();
		
		System.out.println(cal.getCalendrierMois(5, 2019));
		men.getMainMenu();
	}

}
