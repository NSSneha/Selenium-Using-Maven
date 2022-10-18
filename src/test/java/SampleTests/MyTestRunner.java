package SampleTests;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;

//syntax to be followed
@RunWith(Suite.class)
@Suite.SuiteClasses( //<-- this suite has all the classes to be executed within () & {}
        {
                ShopForMobile.class,
                ShopForMobile2.class,
                ShopForMobile3.class,
                ShopForMobile4.class,
                ShopForMobile5.class
        }
)
public class MyTestRunner {
    //nothing written inside
    //this is used to run a particular class
    //we write everything outside the class
        // runwith to run multiple classes
}
