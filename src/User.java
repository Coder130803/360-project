import java.util.List ;
public class User {
    private String username;
    private String password;
    private String firstName;
    private String middleName;
    private String lastName;
    private String preferredFirstName;
    private String email;
    private List <Role> roles;

    // Getters and setters

    public boolean hasMultipleRoles() {
        return roles.size() > 1;
    }
}