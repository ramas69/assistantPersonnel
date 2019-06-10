package assistant.perso;

import java.util.*;

public class Calendrier {
	
	public String getCalendrierMois(int mm, int aa) {
		
		String strCal = "";
		
		/* 
		******************************
				Test evenement 
		******************************
		
		Date date1;
		date1 = new Date();
		
		
		listeEventMonth = Evenement.getListeEventMonth(mm);
		
		ArrayList<Evenement> listeEventMonth = new ArrayList<Evenement>();
		
		
		Evenement ev1 = new Evenement();
		ev1.setDateEvent(date1);
		Evenement ev2 = new Evenement();
		ev2.setDateEvent(date2);
		
		listeEventMonth.add(ev1);
		listeEventMonth.add(ev2);
		
		ArrayList<Integer> listeDayEvent  = new ArrayList<Integer>();;
		Date date; // your date
		// Choose time zone in which you want to interpret your Date
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Europe/Paris"));
		
        //creation of listeDayEvent
		for (Evenement element: listeEventMonth) {
	    	date = element.getDateEvent();
	    	cal.setTime(date);
	    	listeDayEvent.add( cal.get(Calendar.DAY_OF_MONTH) );
    	}
		*/
		int leadGap = 0;
		int nbJourMois = jours[mm];
		
        strCal += mois[mm] +" "+ aa + "\n";   
        
        if (mm < 0 || mm > 11) { 
            throw new IllegalArgumentException("Month " + mm + " bad, must be 0-11");
        }
        
        GregorianCalendar calendar = new GregorianCalendar(aa, mm, 1);
        strCal += " D  L  M  M  J  V  S\n";
        //System.out.printf("%2s%3s%3.5s%3.65s%3.75s%3.9s%3.95sn","D", "L", "M", "M", "J", "V", "S");
        //System.out.println();
 
        leadGap = calendar.get(Calendar.DAY_OF_WEEK)-1;
        
        if (calendar.isLeapYear(calendar.get(Calendar.YEAR)) && mm == 1){
            ++nbJourMois;
        }
 
        for (int i = 0; i < leadGap; i++) {
            strCal += "   ";
        }
  
        for (int i = 1; i <= nbJourMois; i++) {
            if (i<=9){
                strCal += " ";
                /*
	            for (int element: listeDayEvent) {
	            	if(i==element){
	            		strCal += i;
	                 }
	            	 else {
	            		 strCal += i;
	            	 }
	            }
	            */
            }
            strCal += i;
            if ((leadGap + i) % 7 == 0){
            	strCal += "\n";
            } 
            else {
            	strCal += " ";
            }
        }
        strCal += "\n";
        return strCal;
    }
  
	public final String[] mois = {
        "Janvier", "Février", "Mars", "Avril",
        "Mai", "Juin", "Juillet", "Août",
        "Septembre", "Octobre", "Novembre", "Decembre"
    };
 
    public final int[] jours = {
            31, 28, 31, 30,    
            31, 30, 31, 31, 
            30, 31, 30, 31   
    };
}
