package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> out = new HashSet<>(getBothElements(firstSet, secondSet));
        out.removeAll(getBothElements(out,thirdSet));
        thirdSet.removeAll(getBothElements(thirdSet,firstSet));
        thirdSet.removeAll(getBothElements(thirdSet,secondSet));
        out.addAll(thirdSet);
        return out;

    }
    public Set<String> getBothElements(Set<String> firstSet, Set<String> secondSet){
        Set<String> out = new HashSet<>();
        for (String item:
             firstSet) {
            if(secondSet.contains(item)){
                out.add(item);
            }

        }
        return out;
    }
}
