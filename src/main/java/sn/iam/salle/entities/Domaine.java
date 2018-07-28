package sn.iam.salle.entities;


import java.io.Serializable;
import java.util.List;

public class Domaine implements Serializable{
	private int code;
	private String nom;
	private List<Filiere> filieres;
	public Domaine() {
	
	}
	
	public Domaine(int code, String nom, List<Filiere> filieres) {
		this.code = code;
		this.nom = nom;
		this.filieres = filieres;
	}

	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public List<Filiere> getFilieres() {
		return filieres;
	}
	public void setFilieres(List<Filiere> filieres) {
		this.filieres = filieres;
	}
	
}
