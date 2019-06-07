package assistant.perso;

import java.util.Date;

public class Evenement {
	private int id; 
	private String nomEvent;
	private Date dateEvent;
	
	public Evenement() {
		// TODO Auto-generated constructor stub
	}
	
	public Evenement(String nomEvent, Date dateEvent) {
		super();
		this.nomEvent = nomEvent;
		this.dateEvent = dateEvent;
	}

	public String getNomEvent() {
		return nomEvent;
	}

	public void setNomEvent(String nomEvent) {
		this.nomEvent = nomEvent;
	}

	public Date getDateEvent() {
		return dateEvent;
	}

	public void setDateEvent(Date dateEvent) {
		this.dateEvent = dateEvent;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	

}
