package my.shapsug.eventProject.place;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import my.shapsug.eventProject.user.UserType;

@Table(name = "place")
public class Place {
    @Id
    @GeneratedValue
    private long id;

    @Column(name = "eventId")
    private long eventId;

    @Column(name = "placeType")
    private PlaceType placeType;

    @Column(name = "placeNumber")
    private int placeNumber;

    @Column(name = "status")
    private String status;
}
