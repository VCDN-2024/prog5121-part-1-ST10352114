/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

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


import static org.junit.Assert.*;
import org.junit.Test;

public class LoginTest {

    @Test
    public void testCheckUserNameCorrectFormat()
            
    {
        Login user = new Login("kyl_1", "password", "Muhammed", "Safwaan");
        assertTrue(user.checkUserName());
    }
    
    

    @Test
    public void testCheckUserNameIncorrectFormat()
    
    {
        Login user = new Login("kyle!!!!!!!", "password", "Muhammed", "Safwaan");
        assertFalse(user.checkUserName());
    }

    @Test
    public void testCheckPasswordComplexityValid() 
    
    {
        Login user = new Login("username", "Ch&&sec@ke99!", "Muhammed", "Safwaan");
        assertTrue(user.checkPasswordComplexity());
    }

    @Test
    public void testCheckPasswordComplexityInvalid() 
    
    {
        Login user = new Login("username", "password", "Muhammed", "Safwaan");
        assertFalse(user.checkPasswordComplexity());
    }

    @Test
    public void testLoginUserSuccessful() 
    
    {
        Login user = new Login("username", "password", "Muhammed", "Safwaan");
        assertTrue(user.loginUser("username", "password"));
    }

    @Test
    public void testLoginUserFailed() 
    
    {
        Login user = new Login("username", "password", "Muhammed", "Safwaan");
        assertFalse(user.loginUser("username", "wrongpassword"));
    }
    
    
    
    
}