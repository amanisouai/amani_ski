package tn.esprit.amaniski.Services;

import org.springframework.beans.factory.annotation.Autowired;
import tn.esprit.amaniski.Entity.Piste;
import tn.esprit.amaniski.Entity.Skieur;
import tn.esprit.amaniski.Entity.TypeAbonnement;
import tn.esprit.amaniski.Repositories.PisteRepository;
import tn.esprit.amaniski.Repositories.SkieurRepository;

import java.util.List;

public class ISkieurServiceImp implements IskieurService {
    @Autowired
    SkieurRepository skieurRepository;
    @Autowired
    PisteRepository pisteRepository;

    @Override
    public List<Skieur> retrieveAllSkieurs() {
        return skieurRepository.findAll();
    }

    @Override
    public void removeSkieur(int numSkieur) {
        skieurRepository.deleteById(numSkieur);
    }

    @Override
    public Skieur retrieveSkieur(long numSkieur) {
        return skieurRepository.findByNumSkieur(numSkieur);
    }

    @Override
    public Skieur updateSkieur(Skieur skieur) {
        return skieurRepository.save(skieur);
    }

    @Override
    public Skieur assignSkieurToPiste(long numSkieur, long numPiste) {
        //récupération des objets
        Skieur skieur = skieurRepository.findByNumSkieur(numSkieur);
        Piste piste = pisteRepository.findByNumPiste(numPiste);
        if (skieur!=null && piste!=null) {
        /*
            Set<Piste> spiste = skieur.getPistes();
            spiste.add(piste);
            skieur.setPistes(spiste);
        */
            // ou bien (false)
            //skieur.getPistes().add(piste);
            piste.getSkieurs().add(skieur);

            //save
            pisteRepository.save(piste);
        }

        return skieur;
    }

    @Override
    public List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement) {
        return skieurRepository.findByAbonnementTypeAbon(typeAbonnement);
    }

    @Override
    public Skieur assignSkierToPiste(int numSkieur, int numPiste) {
        return null;
    }

    @Override
    public Skieur addSkieur(Skieur skieur) {
        return skieurRepository.save(skieur);
    }


}
