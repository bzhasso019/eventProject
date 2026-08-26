package my.shapsug.eventProject.user;

import org.springframework.beans.factory.annotation.Autowired;

public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    public UserResponseDto createUser(UserRequestDto request) {

        if (userRepository.existsByUsername(request.getUsername())) {
            throw new UserAlreadyExistsException("Пользователь с именем " + request.getUsername() + " уже существует!");
        }

        if (userRepository.existsByPhoneNumber(request.getPhoneNumber())) {
            throw new UserAlreadyExistsException("Пользователь с номером " + request.getPhoneNumber() + " уже существует!");
        }

        User user = userMapper.requestToEntity(request);
        User saved = userRepository.save(user);

        return userMapper.entityToResponse(saved);

    };

}
