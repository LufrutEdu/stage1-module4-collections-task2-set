package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> out = new HashSet<>();
        for (int value : sourceList) {
            if (value % 2 == 0) {
                while (value % 2 == 0) {
                    out.add(value);
                    value /= 2;
                }
                out.add(value);
            } else {
                out.add(value);
                out.add(value * 2);
            }
        }
        return out;
    }
}
