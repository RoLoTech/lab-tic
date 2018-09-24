package services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import persistence.RestaurantRepository;
import services.entities.Restaurant;

@Controller
@RequestMapping(path="/demo")
public class RestaurantService {
	@Autowired
	private RestaurantRepository restaurantRepository;
	

	public String addNewRestaurant (String name, Long rut) {
		
		Restaurant restaurant = new Restaurant();
		restaurant.setName(name);
		restaurant.setRut(rut);
		restaurantRepository.save(restaurant);
		return "Restaurante agregado";
	}
	
	public Iterable<Restaurant> getAllRestaurant() {
		return restaurantRepository.findAll();
	}
}