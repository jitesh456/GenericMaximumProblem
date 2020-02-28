package com.generic.maximum;

public class GenericMaximumProblem {
    public <E extends  Comparable<E>> E findMaximum(E firstValue, E secondValue,E thirdValue) {
        E maximumValue=firstValue;

        if(firstValue.compareTo( secondValue)>0)
            maximumValue=firstValue;

        if(secondValue.compareTo(firstValue)>0)
            maximumValue=secondValue;

        if(thirdValue.compareTo(maximumValue)>0)
            maximumValue=thirdValue;

        return  maximumValue;
    }

}
