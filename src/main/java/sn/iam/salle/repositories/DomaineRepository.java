package sn.iam.salle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.iam.salle.entities.Domaine;

public interface DomaineRepository extends JpaRepository<Domaine, Integer> {

}
