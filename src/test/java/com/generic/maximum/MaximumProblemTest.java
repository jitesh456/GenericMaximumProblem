package com.generic.maximum;

import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLOutput;

public class MaximumProblemTest {
        GenericMaximumProblem genericMaximumProblem=new GenericMaximumProblem();
    @Test
    public void givenThreeNumberInInteger_WhenFirstNumberMaximum_ReturnMaximum() {
        Integer maximumNumber=genericMaximumProblem.findMaximum(30,10,20);
        Assert.assertEquals(30,(int)maximumNumber);
    }

    @Test
    public void givenThreeNumberInInteger_WhenSecondNumberMaximum_ReturnMaximum() {
        Integer maximumNumber=genericMaximumProblem.findMaximum(30,50,40);
        Assert.assertEquals(50,(int)maximumNumber);
    }

    @Test
    public void givenThreeNumberInInteger_WhenThirdNumber_ReturnMaximum() {
        Integer maximumNumber=genericMaximumProblem.findMaximum(30,10,40);
        Assert.assertEquals(40,(int)maximumNumber);
    }

    @Test
    public void givenThreeDoubleValue_WhenFirstValueMaximum_ReturnMaximum() {
       Float maximumValue=genericMaximumProblem.findMaximum(10.5f,10.2f,10.3f);
        System.out.println(maximumValue);
        Assert.assertEquals(10.5f,(float)maximumValue,0.0);
    }

    @Test
    public void givenThreeDoubleValue_WhenSecondValueMaximum_ReturnMaximum() {
        Float maximumValue=genericMaximumProblem.findMaximum(10.1f,10.6f,10.3f);
        System.out.println(maximumValue);
        Assert.assertEquals(10.6f,(float)maximumValue,0.0);
    }

    @Test
    public void givenThreeDoubleValue_WhenThirdValueMaximum_ReturnMaximum() {
        Float maximumValue=genericMaximumProblem.findMaximum(10.1f,10.2f,10.3f);
        System.out.println(maximumValue);
        Assert.assertEquals(10.3f,(float)maximumValue,0.0);
    }

    @Test
    public void givenThreeStringValue_WhenFirstValueMaximum_ReturnMaximum() {
        String maximumValue=genericMaximumProblem.findMaximum("Peach","Apple","Banana");
        Assert.assertEquals("Peach",maximumValue);
    }
    @Test
    public void givenThreeStringValue_WhenSecondValueMaximum_ReturnMaximum() {
        String maximumValue=genericMaximumProblem.findMaximum("Apple","Peach","Banana");
        Assert.assertEquals("Peach",maximumValue);
    }
    @Test
    public void givenThreeStringValue_WhenThirdValueMaximum_ReturnMaximum() {
        String maximumValue=genericMaximumProblem.findMaximum("Apple","Banana","Peach");
        Assert.assertEquals("Peach",maximumValue);
    }
}
