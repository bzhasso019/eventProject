package my.shapsug.eventProject.place;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import my.shapsug.eventProject.user.UserType;

@Table(name = "place")
@Entity
@Setter
@Getter
public class Place {
    @Id
    @GeneratedValue
    private long id;

    @Column(name = "placeType")
    private PlaceType placeType;

    @Column(name = "placeNumber")
    private int placeNumber;

    @Column(name = "status")
    private String status;
}
