package Ex1;

import java.util.List;

public class RegistrationService {

    private static List<User> userList;

    public static boolean register(User user) {
        System.out.println(user.getName() + " is registered.");
        return true;
    }
}
