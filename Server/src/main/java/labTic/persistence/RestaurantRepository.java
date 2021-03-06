package labTic.persistence;

import labTic.services.entities.Client;
import labTic.services.entities.Restaurant;
import org.springframework.data.repository.CrudRepository;

public interface RestaurantRepository extends CrudRepository<Restaurant, Long> {

    Client findOneByRut(long rut);


}
