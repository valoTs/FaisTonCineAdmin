package Bean;

import java.util.Date;

public class Idea {

	private int idIdea;
	private int idUser;
	
	private String libelle;
	private String text;
	private boolean diffusable ;
	private Date currentDate;
	
	
	
	public Idea(int idIdea, int idUser, String libelle, String text, boolean diffusable, Date currentDate) {
		super();
		this.idIdea = idIdea;
		this.idUser = idUser;
		this.libelle = libelle;
		this.text = text;
		this.diffusable = diffusable;
		this.currentDate = currentDate;
	}
	public Idea(int idUser, String libelle, String text, boolean diffusable,Date currentDate) {
		super();
		this.idUser = idUser;
		this.libelle = libelle;
		this.text = text;
		this.diffusable = diffusable;
		this.currentDate=currentDate;
	}
	public Idea( String libelle, String text) {
		super();
		
		this.libelle = libelle;
		this.text = text;
	}
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public int getIdIdea() {
		return idIdea;
	}
	public void setIdIdea(int idIdea) {
		this.idIdea = idIdea;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	
	
	public boolean isDiffusable() {
		return diffusable;
	}
	public void setDiffusable(boolean diffusable) {
		this.diffusable = diffusable;
	}
	
	
	public Date getCurrentDate() {
		return currentDate;
	}
	public void setCurrentDate(Date currentDate) {
		this.currentDate = currentDate;
	}
	@Override
	public String toString() {
		return "Idea [idUser=" + idUser + ", idIdea=" + idIdea + ", libelle=" + libelle + ", text=" + text
				+ ", diffusable=" + diffusable + "]";
	}
	
}
