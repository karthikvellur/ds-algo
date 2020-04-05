package ds;

import java.util.*;

/**
 * References:
 * 1. https://www.geeksforgeeks.org/traverse-through-a-hashmap-in-java/
 * 2. https://www.geeksforgeeks.org/traverse-through-a-hashset-in-java/?ref=rp
 * 3. https://www.geeksforgeeks.org/iterating-arraylists-java/
 */

public class traversals {

    public static void main(String[] args){

        System.out.println("linkedList");
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("one");
        linkedList.add("two");
        linkedList.add("three");

        linkedList.remove();

        linkedList.contains("three");

        Iterator<String> iterator = linkedList.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for(String str: linkedList){
            System.out.println(str);
        }

        /************************/
        System.out.println("\nhashSet");
        HashSet<Integer> hashSet = new HashSet<Integer>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);

        Iterator<Integer> setItr = hashSet.iterator();
        while(setItr.hasNext()){
            System.out.println(setItr.next());
        }
        for(Integer i: hashSet){
            System.out.println(i);
        }

        /************************/
        System.out.println("\nlinkedHashMap");
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        linkedHashMap.put(1, "one");
        linkedHashMap.put(2, "two");
        linkedHashMap.put(3, "three");

        Iterator lhmItr = linkedHashMap.keySet().iterator();
        while (lhmItr.hasNext()){
            String value = linkedHashMap.get(lhmItr.next());
            System.out.println(value);
        }
        for(Map.Entry element: linkedHashMap.entrySet()){
            System.out.println(element.getKey() + "-" + element.getValue());
        }


        // linkedHashMap.forEach((k, v) -> System.out.println(k));
    }
}
