package com.company;

import java.util.HashMap;

public class FirstNonRepeating {
    char findFirstNonRepeatingCharacter(String s){
        HashMap<Character,Boolean> duplicates = new HashMap<>();

        for (int i=0; i< s.length(); i++){
            if (!duplicates.containsKey(s.charAt(i)))
                duplicates.put(s.charAt(i),false);
            else
                duplicates.put(s.charAt(i),true);
        }
        for (int i=0; i< s.length(); i++){
            if (!duplicates.get(s.charAt(i)))
                return s.charAt(i);
        }
        return '_';
    }
}
