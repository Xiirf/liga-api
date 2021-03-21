package xiirf.fr.ligaapi.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import xiirf.fr.ligaapi.models.Team;

@Repository
public interface TeamRepository extends CrudRepository<Team, Long> {
	Optional<Team> findByName(String name); // Utiliser le Optional pour prévoir un pententiel null dans la valeur retournée
}
