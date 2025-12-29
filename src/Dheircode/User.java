package Dheircode;

public class User {

    private int id;           
    public String firstName;
    public String lastName;
    public String email;
    public String phoneNo;
    private String userId;        
    public String role;
    public String kebele;
    public String status;
    private String password;    
    private boolean loggedIn;

    public User() {
        loggedIn = false;
        status = "INACTIVE";
    }

    public boolean login(String userId, String password) {
        if (this.userId != null && this.password != null &&
            this.userId.equals(userId) &&
            this.password.equals(password)) {

            loggedIn = true;
            status = "ACTIVE";
            return true;
        }
        return false;
    }

    public void logout() {
        loggedIn = false;
        status = "INACTIVE";
    }

    public String viewDashboard() {
        if (loggedIn) {
            return "Welcome " + firstName;
        }
        return "Access Denied";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }
}

