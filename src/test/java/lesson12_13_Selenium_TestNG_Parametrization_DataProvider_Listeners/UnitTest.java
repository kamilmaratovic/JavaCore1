package lesson12_13_Selenium_TestNG_Parametrization_DataProvider_Listeners;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium_lesson4.CalculateTicket;

public class UnitTest{
    //Unit tests testing only methods in the class (!!!)
    @Test //Every test is a void method
    public void ticketTest_infant_TicketPriceIsZero(){
        //Test consist:
        //Arrange (given)
        CalculateTicket infant = new CalculateTicket(1000, 1);
        //Act (when)
        double price = infant.getTicketPrice();
        //Assert (then)
        Assert.assertEquals(price, 0.0);
    }

    @Test

    public void ticketTest_adult_TicketPriceIsFull(){
        //Test consist:
        //Arrange (given)
        CalculateTicket adult = new CalculateTicket(1000, 20);
        //Act
        double price = adult.getTicketPrice();
        //Assert
        Assert.assertEquals(price, 1000.0);
    }

    @Test

    public void ticketTest_senior_TicketPriceIs80percent(){
        //Test consist:
        //Arrange (given)
        CalculateTicket senior = new CalculateTicket(1000, 67);
        //Act
        double price = senior.getTicketPrice();
        //Assert
        Assert.assertEquals(price, 800.0);
    }

    @Test

    public void ticketTest_child_TicketPriceIs50percent(){
        //Test consist:
        //Arrange (given)
        CalculateTicket child = new CalculateTicket(1000, 12);
        //Act
        double price = child.getTicketPrice();
        //Assert
        Assert.assertEquals(price, 500.0);
    }
}