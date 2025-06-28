package org.example;
import org.junit.Test;
public class CalculatorTest {
    Calculator calculator=new Calculator();
    @Test
    public void AddTest(){
        int result=calculator.add(2,3);
        System.out.println("Result:" + result);
    }
    @Test
    public void SubtractTest(){
        int result=calculator.subtract(2,3);
        System.out.println("Result:" + result);
    }
    @Test
    public void MultiplyTest(){
        int result=calculator.multiply(2,3);
        System.out.println("Result:" + result);
    }
    @Test
    public void DivideTest(){
        int result=calculator.divide(2,3);
        System.out.println("Result:" + result);
    }
    @Test
    public void testDividebyZero(){
        try{
            calculator.divide(9,0);
        }catch (ArithmeticException e){
            System.out.println("Unexpected Error:"+ e.getMessage());
        }
    }
}
