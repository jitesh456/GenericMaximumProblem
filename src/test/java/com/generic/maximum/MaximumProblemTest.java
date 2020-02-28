package com.generic.maximum;

import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLOutput;

public class MaximumProblemTest {
    GenericMaximumProblem genericMaximumProblem;
    @Test
    public void givenThreeNumberInInteger_WhenFirstNumberMaximum_ReturnMaximum() {
        genericMaximumProblem=new GenericMaximumProblem(30,10,20,40);
        Comparable maximumNumber=genericMaximumProblem.findMaximum();
        Assert.assertEquals(40,(int)maximumNumber);
    }

    @Test
    public void givenThreeNumberInInteger_WhenSecondNumberMaximum_ReturnMaximum() {
        genericMaximumProblem=new GenericMaximumProblem(30,50,40);
        Comparable maximumNumber=genericMaximumProblem.findMaximum();
        Assert.assertEquals(50,(int)maximumNumber);
    }

    @Test
    public void givenThreeNumberInInteger_WhenThirdNumber_ReturnMaximum() {
        genericMaximumProblem= new GenericMaximumProblem(30,10,40);
        Comparable maximumNumber=genericMaximumProblem.findMaximum();
        Assert.assertEquals(40,(int)maximumNumber);
    }

    @Test
    public void givenThreeFloatValue_WhenFirstValueMaximum_ReturnMaximum() {
        genericMaximumProblem=new GenericMaximumProblem(10.5f,10.2f,10.3f);
        Comparable maximumValue=genericMaximumProblem.findMaximum();
        Assert.assertEquals(10.5f,(float)maximumValue,0.0);
    }

    @Test
    public void givenThreeFloatValue_WhenSecondValueMaximum_ReturnMaximum() {
        genericMaximumProblem=new GenericMaximumProblem(12.5f,13.5f,10.5f);
        Comparable maximumValue=genericMaximumProblem.findMaximum();
        System.out.println(maximumValue);
        Assert.assertEquals(13.5f,(float)maximumValue,0.0);
    }

    @Test
    public void givenThreeFloatValue_WhenThirdValueMaximum_ReturnMaximum() {
        genericMaximumProblem= new GenericMaximumProblem(10.5f,12.5f,15.5f);
        Comparable maximumValue=genericMaximumProblem.findMaximum();

        Assert.assertEquals(15.5f,(float)maximumValue,0.0);
    }

    @Test
    public void givenThreeStringValue_WhenFirstValueMaximum_ReturnMaximum() {
        genericMaximumProblem= new GenericMaximumProblem("Peach","Apple","Banana","Pineapple");
        Comparable maximumValue=genericMaximumProblem.findMaximum();
        Assert.assertEquals("Pineapple",maximumValue);
    }
    @Test
    public void givenThreeStringValue_WhenSecondValueMaximum_ReturnMaximum() {
        genericMaximumProblem= new GenericMaximumProblem("Apple","Peach","Banana");
        Comparable maximumValue = genericMaximumProblem.findMaximum();
        Assert.assertEquals("Peach",maximumValue);
    }
    @Test
    public void givenThreeStringValue_WhenThirdValueMaximum_ReturnMaximum() {
        genericMaximumProblem=new GenericMaximumProblem("Apple","Banana","Peach");
        Comparable maximumValue=genericMaximumProblem.findMaximum();
        Assert.assertEquals("Peach",maximumValue);
    }
}
