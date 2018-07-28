package sn.iam.salle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.iam.salle.entities.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {

}
