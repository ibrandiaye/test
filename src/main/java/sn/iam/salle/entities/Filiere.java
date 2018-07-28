package sn.iam.salle.entities;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="filiere")
public class Filiere implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int code;
	private String nom;
	private Domaine domaine;
	
	public Filiere() {
	
	}
	public Filiere(int code, String nom, Domaine domaine) {
		super();
		this.code = code;
		this.nom = nom;
		this.domaine = domaine;
		
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
	public Domaine getDomaine() {
		return domaine;
	}
	public void setDomaine(Domaine domaine) {
		this.domaine = domaine;
	}
	
	
}
