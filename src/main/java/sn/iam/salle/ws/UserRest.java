package sn.iam.salle.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sn.iam.salle.entities.Utilisateur;
import sn.iam.salle.repositories.UtilisateurRepository;

@RestController
@RequestMapping("/api")
public class UserRest {
	@Autowired
	private UtilisateurRepository utilisateurRepository;
	@GetMapping("/allusers")
 public List<Utilisateur> findAll(){
	 
	 return utilisateurRepository.findAll();
 }
	
	@PostMapping("/addUser")
	
public void adduser(@RequestBody Utilisateur u) {
	utilisateurRepository.save(u);
}
	@GetMapping("/findUserById/2")
	
	public Utilisateur findUserById(@RequestBody int u) {
	return	utilisateurRepository.findOne(u);
	}
}
