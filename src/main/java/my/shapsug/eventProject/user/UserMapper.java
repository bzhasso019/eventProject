package my.shapsug.eventProject.user;

import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User requestToEntity(UserRequestDto request) {

        User user = new User();
        user.setUsername(request.getUsername());
        user.setPhoneNumber(request.getPhoneNumber());
        user.setUserType(request.getUserType());
        user.setDeleted(request.isDeleted());

        return user;
    }

    public UserResponseDto entityToResponse(User user) {

        UserResponseDto response = new UserResponseDto();
        response.setId(user.getId());
        response.setUsername(user.getUsername());
        response.setPhoneNumber(user.getPhoneNumber());
        response.setUserType(user.getUserType());
        response.setDeleted(user.isDeleted());

        return response;
    }
}
