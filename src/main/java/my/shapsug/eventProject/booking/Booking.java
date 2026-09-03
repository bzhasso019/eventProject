package my.shapsug.eventProject.booking;

import jakarta.persistence.*;

@Table(name = "booking")
@Entity
public class Booking {
    @Id
    @GeneratedValue
    private long id;

    @Column(name = "userId")
    private long userId;

    @Column(name = "placeId")
    private long placeId;

    @Column(name = "bookingStatus")
    private String bookingStatus;
}
