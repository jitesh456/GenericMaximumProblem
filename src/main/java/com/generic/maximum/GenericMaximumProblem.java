package com.generic.maximum;

public class GenericMaximumProblem {
    public Integer findMaximum(Integer firstValue, Integer secondValue,Integer thirdValue) {
        Integer maximumValue=firstValue;

        if(firstValue.compareTo(secondValue)>0)
            maximumValue=firstValue;

        if(secondValue.compareTo(firstValue)>0)
            maximumValue=secondValue;

        if(thirdValue.compareTo(maximumValue)>0)
            maximumValue=thirdValue;

        return  maximumValue;
    }


    public Float findMaximum(Float firstValue, Float secondValue, Float thirdValue) {
       Float maximumValue=firstValue;

        if(firstValue.compareTo(secondValue)>0)
            maximumValue=firstValue;

        if(secondValue.compareTo(firstValue)>0)
            maximumValue=secondValue;

        if(thirdValue.compareTo(maximumValue)>0)
            maximumValue=thirdValue;

        return  maximumValue;
    }

    public String findMaximum(String firstValue, String secondValue, String thirdValue) {
        String maximumValue=firstValue;

        if(firstValue.compareTo(secondValue)>0)
            maximumValue=firstValue;

        if(secondValue.compareTo(firstValue)>0)
            maximumValue=secondValue;

        if(thirdValue.compareTo(maximumValue)>0)
            maximumValue=thirdValue;

        return  maximumValue;
    }
}
