package my.shapsug.eventProject.place;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlaceRequestDto {

    private PlaceType placeType;
    private long eventId;
    private int placeNumber;
    private String status;
    private double price;
}
