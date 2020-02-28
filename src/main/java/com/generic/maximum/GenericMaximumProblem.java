package com.generic.maximum;

public class GenericMaximumProblem<E extends  Comparable<E>>{
    E firstValue;
    E secondValue;
    E thirdValue;

    public GenericMaximumProblem(E firstValue, E secondValue, E thirdValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
    }

    public  E findMaximum()
    {
        E maximum=findMaximum(firstValue,secondValue,thirdValue);
        return maximum;
    }


    public  static <E extends  Comparable<E>> E findMaximum( E firstValue,E secondValue,E thirdValue) {
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
