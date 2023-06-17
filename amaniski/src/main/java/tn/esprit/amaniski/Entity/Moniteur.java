package tn.esprit.amaniski.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;
import javax.persistence.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Moniteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    int id;
    Long numMoniteur;
    String nomM;
    String prenomM;
    LocalDate dateRecru;
    @OneToMany()
    Set<Cours> cours;

}
