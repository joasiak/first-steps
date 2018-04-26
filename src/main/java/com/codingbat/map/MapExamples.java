package com.codingbat.map;

import java.util.HashMap;
import java.util.Map;

public class MapExamples {

    public Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            String tmp = map.get("a");
            map.put("a", "");
            map.put("b", tmp);
        }
        return map;
    }


    public Map<String, String> mapAB2(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b") && map.get("a").equals(map.get("b"))) {
            map.remove("a");
            map.remove("b");
        }
        return map;
    }

    public Map<String, String> mapShare(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
        }
        map.remove("c");
        return map;
    }

    public Map<String, String> topping1(Map<String, String> map) {
        if (map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
        }
        map.put("bread", "butter");

        return map;
    }

    public Map<String, String> topping2(Map<String, String> map) {
        if (map.containsKey("ice cream")) {
            map.put("yogurt", map.get("ice cream"));
        }
        if (map.containsKey("spinach")) map.put("spinach", "nuts");

        return map;
    }

    public Map<String, String> mapAB4(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            if (map.get("a").length() < map.get("b").length()) {
                map.put("c", map.get("b"));
            } else if (map.get("a").length() > map.get("b").length()) {
                map.put("c", map.get("a"));
            } else {
                map.put("a", "");
                map.put("b", "");
            }
        }
        return map;
    }

    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap();
        for (String s : strings) {
            map.put(s, 0);
        }
        return map;
    }

    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1 );
            }
            else map.put(s, 1);
        }

        return map;
    }

    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Integer> temporaryMap = wordCount(strings);
        Map<String, Boolean> map = new HashMap<>();

        for (Map.Entry<String,Integer> s : temporaryMap.entrySet()) {
            if (s.getValue()>1) {
                map.put(s.getKey(),true);
            }
            else
                map.put(s.getKey(),false);
        }
        return map;
    }

    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            if (!map.containsKey(s))
                map.put(s, s.length() );
        }

        return map;
    }


    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();

        for (String s : strings) {
            if (!map.containsKey(s.substring(0,1))) {
                map.put(s.substring(0,1), s);
            } else

                map.put(s.substring(0,1), map.get(s.substring(0,1)) + s);
        }
        return map;
    }

    public String wordAppend(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        String result = "" ;
        for (String s : strings) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s)+1);
                if (map.get(s)%2==0) {
                    result+=s;
                    map.remove(s);}
            } else
                map.put(s, 1);
        }
        return result;
    }

/*
We'll say that 2 strings "match" if they are non-empty and their first chars are the same.
Loop over and then return the given array of non-empty strings as follows: if a string matches an earlier string in the array,
swap the 2 strings in the array. When a position in the array has been swapped, it no longer matches anything. Using a map,
this can be solved making just one pass over the array. More difficult than it looks.

allSwap(["ab", "ac"]) → ["ac", "ab"]
allSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"]
allSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay", "by", "ax", "bx", "aj", "ai", "by", "bx"]
*/

    public String[] allSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i<strings.length; i++) {
            String key = strings[i].substring(0,1);
            if (map.containsKey(key)) {
                int pos = map.get(key);
                String tmp = strings[pos];
                strings[pos] = strings[i];
                strings[i] = tmp;

                map.remove(key);
            }
            else map.put(key,i);
        }


        return strings;
    }

    public String[] firstSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i<strings.length; i++) {
            String key = strings[i].substring(0,1);
            if (map.containsKey(key)) {
                if (map.get(key)==-1) continue;
                int pos = map.get(key);
                String tmp = strings[pos];
                strings[pos] = strings[i];
                strings[i] = tmp;

                map.put(key,-1);
            }
            else map.put(key,i);
        }


        return strings;
    }

}
