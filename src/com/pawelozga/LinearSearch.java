package com.pawelozga;

import java.util.List;

public class LinearSearch implements SearchAlgorithm {


    @Override
    public Integer search(Osoba value, List input) {
        return null;
    }

    @Override
    public Integer search(Integer value, Osoba[] input) {

        for (int i = 0; i <= input.length; i++) {
            if (input[i].age == value) {
                return i;
            }

        }
        System.out.println("nie ma!");
        return null;


    }

    @Override
    public Integer search(Comparable value, List input) {
        return null;
    }

    @Override
    public Integer search(Integer value, List input) {
        return null;
    }

    @Override
    public Integer search(Integer value, Comparable[] input) {
        return null;
    }
}