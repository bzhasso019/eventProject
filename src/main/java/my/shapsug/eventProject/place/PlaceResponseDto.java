package my.shapsug.eventProject.place;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlaceResponseDto {

    private long id;
    private long eventId;
    private PlaceType placeType;
    private int placeNumber;
    private String status;
    private double price;
}
