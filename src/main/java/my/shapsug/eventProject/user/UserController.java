package my.shapsug.eventProject.user;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

//    @PutMapping
//    public ResponseEntity<UserResponseDto> deleteUserById(@PathVariable long id) {
//        UserResponseDto response = userService.deleteById(id);
//        return Response
//    }

    @PostMapping
    public ResponseEntity<UserResponseDto> createUser(UserRequestDto userRequestDto) {
        UserResponseDto response = userService.createUser(userRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PutMapping
    public ResponseEntity<UserResponseDto> updateUser(@PathVariable("id") long id, @RequestBody UserRequestDto userRequestDto) {
        UserResponseDto response = userService.updateUser(id, userRequestDto);
//        return ResponseEntity.status(HttpStatus.OK).body(response);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping
    public ResponseEntity<UserResponseDto> deleteUser(@PathVariable("id") long id) {
        UserResponseDto response = userService.deleteUserById(id);
        return ResponseEntity.noContent().build();
    }

}
