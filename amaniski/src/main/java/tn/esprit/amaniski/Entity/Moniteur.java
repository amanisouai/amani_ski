package tn.esprit.amaniski.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

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
}
