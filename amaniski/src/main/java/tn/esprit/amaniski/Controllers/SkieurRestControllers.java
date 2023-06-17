package tn.esprit.amaniski.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import tn.esprit.amaniski.Entity.Skieur;
import tn.esprit.amaniski.Entity.TypeAbonnement;
import tn.esprit.amaniski.Services.IskieurService;

import java.util.List;

@AllArgsConstructor
@Component
@RestController
@RequestMapping("/skieur")
public class SkieurRestControllers {
    private final IskieurService iSkieurService;

    @PostMapping
    public Skieur addSkieur(@RequestBody Skieur skieur){
        return iSkieurService.addSkieur(skieur);
    }
    @PutMapping
    public Skieur updateSkieur(@RequestBody Skieur skieur) {
        return iSkieurService.updateSkieur(skieur);
    }

    @GetMapping("/{numSkieur}")
    public Skieur retrieveSkieur(@PathVariable Integer numSkieur) {
        return iSkieurService.retrieveSkieur(numSkieur);
    }
    @PutMapping("/{numSkieur}/{numPiste}")
    public Skieur assignSkierToPiste(@PathVariable int numSkieur, @PathVariable int numPiste){
        return iSkieurService.assignSkierToPiste(numSkieur,numPiste);}
    @GetMapping("/abonnement/{typeAbonnement}")
    public List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement) {
        return iSkieurService.retrieveSkiersBySubscriptionType(typeAbonnement);
    }
}
