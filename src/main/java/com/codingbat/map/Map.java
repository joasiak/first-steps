package com.codingbat.map;

public class Map {

    public java.util.Map<String, String> mapBully(java.util.Map<String, String> map) {
        if (map.containsKey("a")) {
            String tmp = map.get("a");
            map.put("a", "");
            map.put("b", tmp);
        }
        return map;
    }
}
