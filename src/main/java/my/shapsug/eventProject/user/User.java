package my.shapsug.eventProject.user;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "user")
public class User {
    @Id
    @GeneratedValue
    private long id;

    @Column(name = "userType")
    private UserType userType;

    @Column(name = "username")
    private String username;

    @Column(name = "phoneNumber")
    private String phoneNumber;
}
