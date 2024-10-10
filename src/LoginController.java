import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;

public class LoginController {
    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    private UserService userService = new UserService();

    @FXML
    public void handleLogin() {
        String username = usernameField.getText();
        String password = passwordField.getText();
        User user = userService.validateLogin(username, password);

        if (user != null) {
            if (userService.isFirstLogin(user)) {
                // Redirect to Finish Setup page
            } else {
                if (user.hasMultipleRoles()) {
                    // Redirect to role selection
                } else {
                    // Redirect to home page based on the user's role
                }
            }
        } else {
            // Display error message
        }
    }
}