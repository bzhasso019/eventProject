package my.shapsug.eventProject.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;


    @Transactional
    public UserResponseDto deleteUserById(long id) {

        User currentUser = userRepository.findById(id).orElseThrow(() -> new UserNotFoundException("Пользователь не найден!"));
        if (currentUser.isDeleted()) {
            throw new UserIsAlreadyDeleted(id);
        }

        User deletedUser = userRepository.save(currentUser);
        return userMapper.entityToResponse(deletedUser);
    }

    @Transactional
    public UserResponseDto updateUser(long id, UserRequestDto request) {

        if (!userRepository.existsById(id)) {
            throw new UserIsNotExistException("Такой пользователь не существует!");
        }

        User currentUser = userMapper.requestToEntity(request);
        currentUser.setDeleted(true);
        currentUser.setId(id);

        userRepository.save(currentUser);

        return userMapper.entityToResponse(currentUser);
    }

    @Transactional
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
