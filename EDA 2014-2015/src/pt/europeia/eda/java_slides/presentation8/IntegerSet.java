package pt.europeia.eda.java_slides.presentation8;

import java.util.Arrays;

public class IntegerSet {
    private int[] items;
    private int cardinality;

    // …

    public int[] getItems() {
        return Arrays.copyOf(items, cardinality);
    }
    
    // …
    
}