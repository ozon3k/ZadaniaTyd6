package com.pawelozga;

import java.util.Comparator;
import java.util.List;

public interface SearchAlgorithm<T extends Comparable<T>> {

    Integer search(Osoba value, List<Osoba> input);

    Integer search(Integer value, Osoba[] input);

    abstract Integer search(T value, List<T> input);

    Integer search(Integer value, List<T> input);
    Integer search(Integer value, T[] input);


}