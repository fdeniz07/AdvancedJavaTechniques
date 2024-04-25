package com.materna.tmt.caruso33.ihkdd.custom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ImmutableClass {

    private final long id;
    private final String[] arrayOfStrings;
    private final Collection<String> collectionOfStrings;


    public ImmutableClass(long id, String[] arrayOfStrings, Collection<String> collectionOfStrings) {
        this.id = id;
        this.arrayOfStrings = Arrays.copyOf(arrayOfStrings, arrayOfStrings.length);
        this.collectionOfStrings = new ArrayList<>(collectionOfStrings);
    }


    public long getId() {
        return id;
    }

    public String[] getArrayOfStrings() {
        return arrayOfStrings;
    }

    public Collection<String> getCollectionOfStrings() {
        return collectionOfStrings;
    }
}
