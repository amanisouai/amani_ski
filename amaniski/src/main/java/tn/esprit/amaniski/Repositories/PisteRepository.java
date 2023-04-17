package tn.esprit.amaniski.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.amaniski.Entity.Piste;

public interface PisteRepository extends JpaRepository<Piste,Integer> {
    Piste findByNumPiste(long numPiste);

}
