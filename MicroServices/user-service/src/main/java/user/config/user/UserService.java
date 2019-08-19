package user.config.user;

        import java.util.List;

public interface UserService {

        User getUserById(int userId);
        List<User> AllUsers();
}
