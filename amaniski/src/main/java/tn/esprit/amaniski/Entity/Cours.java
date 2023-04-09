package tn.esprit.amaniski.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    int id;
    Long numCours;
    int niveau;
    Float prix;
    int creneau;
    @Enumerated(EnumType.STRING)
    TypeCours typeCours;
    @Enumerated(EnumType.STRING)
    Support support;
}
