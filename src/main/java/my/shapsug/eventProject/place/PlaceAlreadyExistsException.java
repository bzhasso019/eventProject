package my.shapsug.eventProject.place;

public class PlaceAlreadyExistsException extends RuntimeException {
    public PlaceAlreadyExistsException(String message) {
        super(message);
    }
}
