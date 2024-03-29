package tn.esprit.amaniski.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.util.Set;

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
    @OneToMany(mappedBy = "cours", fetch = FetchType.EAGER)
    @JsonIgnore
    Set<Inscription> inscriptions;

}
