package com.generic.maximum;

import javax.lang.model.element.Element;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class GenericMaximumProblem<E extends  Comparable<E>>{
    ArrayList<E> values =new ArrayList<>();
    E maximum;

    public GenericMaximumProblem(E ...Element) {
        for(E element:Element) {
            values.add(element);
        }

    }

    public  E findMaximum()
    {
        Collections.sort(values,Collections.reverseOrder());
         maximum=values.get(0);
        return maximum;
    }
    public void printMaximum() {
        System.out.println("Maximum value="+maximum);
    }





}
