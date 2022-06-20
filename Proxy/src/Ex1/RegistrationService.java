package Ex1;

import Ex1.User;

import java.util.ArrayList;
import java.util.List;

public class RegistrationService {
    static private List<User> registeredUsers = new ArrayList<User>();

    static public void register(User user) {
        registeredUsers.add(user);
        System.out.println(user.getName() + " is registered \n");
    }

    static public boolean isRegistered(User user) {
        return registeredUsers.contains(user);
    }
}
