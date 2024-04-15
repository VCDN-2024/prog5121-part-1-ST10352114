//Muhammed Safwaan Ally
//ST10352114
//PROG-Part-1

//Reference:
//w3schools (2019). Java Encapsulation and Getters and Setters. [online] W3schools.com. Available at: 
//https://www.w3schools.com/java/java_encapsulation.asp.
//[Accessed 3 Apr. 2024]

//w3schools (2019). Java Constructors. [online] W3schools.com. Available at: 
//https://www.w3schools.com/java/java_constructors.asp.
//[Accessed 3 Apr. 2024]

//“PROG5121 POE Unit Testing Task 1.”, YouTube Video www.youtube.com, VC Lecture Series, 11 May 2022, https://www.youtube.com/watch?v=sFTbCVnUbLo
//Accessed 14 Apr. 2024

//The Independent Institute of Education. (2023). PROG5121. The Independent Institute of Education., pp.6 to 9.
//[Accessed 12 Apr. 2024]


package registration_login; 

public class Login {
    private String username;
    private String password;
    private String firstName;
    private String lastName;

    // Constructor
    public Login(String username, String password, String firstName, String lastName) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getters and setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Method to check if username is correctly formatted
    public boolean checkUserName() {
        return username.length() <= 5 && username.contains("_");
    }

    
    
//
    public boolean checkPasswordComplexity() 
    
    {
        boolean hasUpperCase = !password.equals(password.toLowerCase());
        boolean hasDigit = password.matches(".*\\d.*");
        boolean hasSpecialChar = password.matches(".*[!@#$%^&*()\\-+].*");
        return password.length() >= 8 && hasUpperCase && hasDigit && hasSpecialChar;
    }

    // Method to register user
    public String registerUser() {
        if (!checkUserName()) {
            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.";
        } else if (!checkPasswordComplexity()) {
            return "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.";
        } 
        
        else  
        {
            return "User registered successfully.";
        }
    }

    // Method to login user
    public boolean loginUser(String enteredUsername, String enteredPassword) {
        return enteredUsername.equals(username) && enteredPassword.equals(password);
    }

    // Method to return login status message
    public String returnLoginStatus(boolean loggedIn, String firstName, String lastName) {
    if (loggedIn) {
        return "Welcome, " + firstName + " " + lastName + ", it is great to see you again.";
    } 
    else
    {
        return "Username or password incorrect, please try again.";
    }
    
    
    }
    
}

