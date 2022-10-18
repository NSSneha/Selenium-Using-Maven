package SampleTests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

//to follow order use the below method, but default order method does not follow any particular orders

@FixMethodOrder(MethodSorters.DEFAULT)
public class ShopForMobile2 {

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
}
//@test annotation is used to run pgm
//annotations are used because there is no main method & it informs compiler that we are using testng or junit annotations to perform unit testing