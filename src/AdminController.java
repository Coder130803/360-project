import javafx.fxml.FXML;
import java.util.List;
public class AdminController {
    private UserService userService = new UserService();

    @FXML
    public void handleInviteUser() {
        // Logic for inviting a new user
    }

    @FXML
    public void handleResetUserAccount() {
        // Logic for resetting user account
    }

    @FXML
    public void handleDeleteUser() {
        // Logic for deleting a user
    }

    @FXML
    public void handleListUsers() {
        List<User> users = userService.getAllUsers();
        // Display users
    }
}