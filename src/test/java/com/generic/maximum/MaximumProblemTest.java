package com.generic.maximum;

import org.junit.Assert;
import org.junit.Test;

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





}
