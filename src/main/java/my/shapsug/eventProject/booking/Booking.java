package my.shapsug.eventProject.booking;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "booking")
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
