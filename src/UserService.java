import java.util.List;

public class UserService {
    private Database database;

    public UserService() {
        database = new Database(); // Set up the connection to the DB
    }

    public User validateLogin(String username, String password) {
        return database.getUserByUsernameAndPassword(username, password);
    }

    public boolean isFirstLogin(User user) {
        return user.getEmail() == null;
    }

    public void finishSetup(User user, String email, String firstName, String middleName, String lastName, String preferredFirstName) {
        user.setEmail(email);
        user.setFirstName(firstName);
        user.setMiddleName(middleName);
        user.setLastName(lastName);
        user.setPreferredFirstName(preferredFirstName);

        database.updateUser(user);
    }
}