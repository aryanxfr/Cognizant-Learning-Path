package org.example;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.*;
public class BankAccountAAAtest{
    private BankAccount account;
    @Before
    public void setup(){
        //Arrange
        account=new BankAccount("User",1000.0);
        System.out.println("Account created");
    }

    @After
    public void teardown(){
        System.out.println("Test completed for : " + account.getOwner());
    }
    @Test
    public void testDeposit(){
        //Act
        account.deposit(600.0);
        //Assert
        assertEquals(1600.0,account.getBalance(),0.001);
    }
    @Test
    public void testWithdraw(){
        //Act
        account.withdraw(300.0);
        //Assert
        assertEquals(700.0,account.getBalance(),0.001);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testNegativeDeposit(){
        account.deposit(-100.0);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testInsufficientWithdraw(){
        account.withdraw(9000.0);
    }
    @Test
    public void OwnerName(){
        assertEquals("User",account.getOwner());
    }

}
