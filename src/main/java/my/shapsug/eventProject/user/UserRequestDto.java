package my.shapsug.eventProject.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserRequestDto {

    private String username;
    private String phoneNumber;
    private UserType userType = UserType.STANDART;

}

