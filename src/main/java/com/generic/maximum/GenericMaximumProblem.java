package com.generic.maximum;

import javax.lang.model.element.Element;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class GenericMaximumProblem<E extends  Comparable<E>>{
    ArrayList<E> values =new ArrayList<>();

    public GenericMaximumProblem(E ...Element) {
        for(E element:Element) {
            values.add(element);
        }
    }

    public  E findMaximum()
    {
        Collections.sort(values,Collections.reverseOrder());
        E maximum=values.get(0);
        return maximum;
    }

}
