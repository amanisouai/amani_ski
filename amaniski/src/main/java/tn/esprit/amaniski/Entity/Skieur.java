package tn.esprit.amaniski.Entity;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Skieur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    int id;
    Long numSkieur;
    String nomS;
    String prenomS;
    LocalDate dateNaissance;
    String ville;
    @ManyToMany(mappedBy = "skieurs")
    Set<Piste> pistes;
    @OneToOne
    Abonnement abonnement;
    @OneToMany(mappedBy = "skieur")
    Set<Inscription>Inscriptions;

}
