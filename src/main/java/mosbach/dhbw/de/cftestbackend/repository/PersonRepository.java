package mosbach.dhbw.de.cftestbackend.repository;

import mosbach.dhbw.de.cftestbackend.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long>{

}
