package com.ucx.training.sessions.app1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapsAndLists {
    public void TestMaps(){
                List<String> names = new ArrayList<>();
        names.add("Agron");
        names.add("Flaka");
        names.add("Kushtrim");

        for (String name : names){
            System.out.println(name);
        }
        System.out.println(names.size());

        //names1 eshte immutable ocject edhe ktu nuk mundemi me e perdore add() method
        List<String> names1 = List.of("Nita","Tina","Vjollca");

        for (String name : names1){
            System.out.println(name);
        }

        System.out.println(names1.get(0));

        //Ne Map nuk mundemi me perdore primitive data types
        Map<Integer,String> namesMap = new HashMap<>();
        namesMap.put(1,"Agron");
        namesMap.put(2,"Flaka");
        namesMap.put(3,"Kushtrim");

        System.out.println(namesMap);
        //Immutable Map same as List, can't add more elements on it
        //Map is random access, elements are not inserted as they're written
        Map<Integer,String> namesMap1 = Map.of(1,"Nita",2,"Tina",3,"Vjollca");

        System.out.println(namesMap1);
        System.out.println(namesMap1.get(3));

    }
}
