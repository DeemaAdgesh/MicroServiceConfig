package user.config.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceMethod implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUserById(int userId) {
        User user = userRepository.findById(userId).get();
        return user ;
    }
    @Override
    public List<User> AllUsers() {
        return userRepository.findAll();
    }


}
