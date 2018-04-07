package unit.testing;

import org.testng.Assert;

public class ApplyCalculator {

    public static void main(String[] args) {

        Calculator cal=new Calculator();
        int expectedResult=cal.addition(10,15);
        Assert.assertEquals(expectedResult,25);
        cal.setName("Boby");
        Assert.assertEquals("Bob",cal.getName(),"we could not find "+ cal.getName()+"bec he miss java class");



    }
}
