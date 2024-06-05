package mosbach.dhbw.cftestbackend.repository;

import mosbach.dhbw.cftestbackend.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long>{

}
