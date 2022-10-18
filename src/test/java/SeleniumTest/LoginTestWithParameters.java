package SeleniumTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

//step 1: add the @RunWith(Parameterized.class) annotation
@RunWith(Parameterized.class) //tells the JVM that we are using parameters for execution
public class LoginTestWithParameters {
    //step 2: create variables
    String userName;
    String password;
    String browser;

    //step 3: create parameterized class constructor

    public LoginTestWithParameters(String userName, String password, String browser) {
        this.userName = userName;
        this.password = password;
        this.browser = browser;
    }
    @Test
    public void loginTest() {
        System.out.println(userName + "---" + "password" + "---" + browser);
    }
    /*
    * Sneha -- u1 p1 b1*/
    //to pass multiple parameters @

    @Parameters //change import class parameterized.parameters
    public static Collection<Object[]> getData() {
       Object [][] data = new Object[4][3];
       //1st row
        data[0][0] = "Sneha";
        data[0][1] = "pass1";
        data[0][2] = "chrome";
        //2nd row
        data[1][0] = "Swathi";
        data[1][1] = "pass2";
        data[1][2] = "firefox";
        //3rd row
        data[2][0] = "geetha";
        data[2][1] = "pass3";
        data[2][2] = "brave";
        //4th row
        data[3][0] = "Soumya";
        data[3][1] = "pass4";
        data[3][2] = "safari";
        return Arrays.asList(data);
    }
}
