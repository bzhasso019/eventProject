package my.shapsug.eventProject.event;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "event")
public class Event {
    @Id
    @GeneratedValue
    private long id;

    @Column(name = "eventName")
    private String eventName;

    @Column(name = "eventDate")
    private Date eventDate;

    @Column(name = "eventType")
    private String eventType;

    @Column(name = "seatsNumber")
    private int seatsNumber;

}
