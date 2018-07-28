package sn.iam.salle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import sn.iam.salle.entities.Utilisateur;
import sn.iam.salle.repositories.UtilisateurRepository;

@SpringBootApplication
public class GesSaleV3Application implements CommandLineRunner {
@Autowired
private UtilisateurRepository utilisateurRepository;
	public static void main(String[] args) {
		SpringApplication.run(GesSaleV3Application.class, args);
	}
	@Override
	public void run(String... arg0) throws Exception {

		//inserer des utilisateurs
		utilisateurRepository.save(new Utilisateur(1, "ibra ndiaye", "ibra8580", "passer"));
		utilisateurRepository.save(new Utilisateur(2, "modou ndiaye", "modou8580", "passer"));
		
	}
}
