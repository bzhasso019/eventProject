package my.shapsug.eventProject.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseDto {

    private long id;
    private String username;
    private String phoneNumber;
    private UserType userType;
    private boolean isDeleted;

}
