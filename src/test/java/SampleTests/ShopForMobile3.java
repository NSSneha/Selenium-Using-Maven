package SampleTests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

//to follow ascending order use the below method

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ShopForMobile3 {

    @Test
    public void searchMobile() {
        System.out.println("Search for the required mobile");
    }

    @Test
    public void selectMobile() {
        System.out.println("Select the required mobile");
    }

    @Test
    public void checkOut() {
        System.out.println("Make payment & checkout");
    }

    @Test
    public void test_A() {
        System.out.println("Test A");
    }

    @Test
    public void test_B() {
        System.out.println("Test B");
    }

    @Test
    public void test_C() {
        System.out.println("Test C");
    }
}
//@test annotation is used to run pgm
//annotations are used because there is no main method & it informs compiler that we are using testng or jumit annotations do perform unit testing