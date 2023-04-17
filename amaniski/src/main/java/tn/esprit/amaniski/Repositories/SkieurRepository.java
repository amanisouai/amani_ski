package tn.esprit.amaniski.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.amaniski.Entity.Skieur;
import tn.esprit.amaniski.Entity.TypeAbonnement;

import java.util.List;

public interface SkieurRepository extends JpaRepository<Skieur,Integer> {
    Skieur findByNumSkieur(Long numSkieur);
    List<Skieur> findByAbonnementTypeAbon(TypeAbonnement typeAbonnement);
}