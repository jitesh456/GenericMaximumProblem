package com.generic.maximum;

public class GenericMaximumProblem {
    public Integer findMaximum(Integer firstNumber, Integer secondNumber,Integer thirdNumber) {
        Integer maximumNumber=0;

        if(firstNumber.compareTo(secondNumber)>0)
            maximumNumber=firstNumber;

        if(secondNumber.compareTo(firstNumber)>0)
            maximumNumber=secondNumber;

        if(thirdNumber.compareTo(maximumNumber)>0)
            maximumNumber=thirdNumber;

        return  maximumNumber;
    }



}
