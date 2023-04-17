package tn.esprit.amaniski.Services;

import tn.esprit.amaniski.Entity.Skieur;
import tn.esprit.amaniski.Entity.TypeAbonnement;

import java.util.List;

public interface IskieurService {

    List<Skieur> retrieveAllSkieurs();
    Skieur addSkieur(Skieur skieur);

    void removeSkieur (int numSkieur);
    Skieur retrieveSkieur (long numSkieur);
    Skieur updateSkieur (Skieur skieur);

    Skieur assignSkieurToPiste(long numSkieur, long numPiste);
    List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement);

    Skieur assignSkierToPiste(int numSkieur, int numPiste);
}
