package my.shapsug.eventProject.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<UserResponseDto> createUser(UserRequestDto userRequestDto) {
            UserResponseDto response = userService.createUser(userRequestDto);
            return ResponseEntity.status(HttpStatus.CREATED).body(response);
        }

}
