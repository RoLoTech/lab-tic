package labTic.services.exceptions;

public class RestaurantAlreadyRegistered extends Exception {
    public RestaurantAlreadyRegistered(String message) {
        super(message);
    }
}