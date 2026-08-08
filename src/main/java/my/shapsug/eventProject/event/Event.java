package my.shapsug.eventProject.event;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

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

}
