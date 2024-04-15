//Muhammed Safwaan Ally
//ST10352114
//PROG-Part-1

//LOOM VIDEO LINK ON VC LEARN!!!!

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
//I have chosen to use JOpition from now as the POE suggets that i use JOption later
import javax.swing.JOptionPane;

public class Registration_Login {
    public static void main(String[] args) {
        
//registration and logins have been completed below
        String username = JOptionPane.showInputDialog("Enter username:");
        
        String password = JOptionPane.showInputDialog("Enter password:");
        
        String firstName = JOptionPane.showInputDialog("Enter first name:");
        
        String lastName = JOptionPane.showInputDialog("Enter last name:");

        Login user = new Login(username, password, firstName, lastName);
        String registrationMessage = user.registerUser();
        JOptionPane.showMessageDialog(null, registrationMessage);

//this is the login class        
        String enteredUsername = JOptionPane.showInputDialog("Enter username for login:");
        
        String enteredPassword = JOptionPane.showInputDialog("Enter password for login:");

        boolean loggedIn = user.loginUser(enteredUsername, enteredPassword);
        String loginStatusMessage = user.returnLoginStatus(loggedIn, firstName, lastName);
        JOptionPane.showMessageDialog(null, loginStatusMessage);
        
        }
    
}
