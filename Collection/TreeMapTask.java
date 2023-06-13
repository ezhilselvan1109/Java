import java.util.Set;
import java.util.TreeMap;

public class TreeMapTask {
    public static void main(String[] args) {
        System.out.println("1 .  Write a Java program to associate the specified value with the specified key in a Tree Map.");
        TreeMap<Integer,Integer> treeMap=new TreeMap<>();
        treeMap.put(1,9);
        treeMap.put(2,8);
        treeMap.put(3,7);
        treeMap.put(4,6);
        treeMap.put(5,4);
        System.out.println("Ans: "+treeMap);

        System.out.println();
        System.out.println("2 . Write a Java program to copy a Tree Map content to another Tree Map.");
        TreeMap<Integer,Integer> treeMap1=new TreeMap<>(treeMap);
        System.out.println("Ans: "+treeMap1);

        System.out.println();
        System.out.println("3 . Write a Java program to search a key in a Tree Map.");
        System.out.println("Ans: "+treeMap1.containsKey(3));

        System.out.println();
        System.out.println("4 . Write a Java program to search a value in a Tree Map.");
        System.out.println("Ans: "+treeMap1.containsValue(8));

        System.out.println();
        System.out.println("5 . Write a Java program to get all keys from the given a Tree Map");
        Set set=treeMap1.keySet();
        System.out.println("Ans: "+set);

        System.out.println();
        System.out.println("6 . Write a Java program to delete all elements from a given Tree Map.");
        treeMap.clear();
        System.out.println("Ans: "+treeMap);

        System.out.println();
        System.out.println("7 . Write a Java program to sort keys in Tree Map by using comparator.");
        //TreeMap<Integer,Integer> treeMap2=new TreeMap<>(treeMap1);

        System.out.println();
        System.out.println("8 . Write a Java program to get a key-value mapping associated with the greatest key and the least key in a map.");
        System.out.println("greatest key: "+treeMap1.firstEntry());
        System.out.println("least key: "+treeMap1.lastEntry());

        System.out.println();
        System.out.println("9 . Write a Java program to get the first (lowest) key and the last (highest) key currently in a map.");
        System.out.println("the first (lowest) key: "+treeMap1.firstKey());
        System.out.println("the last (highest) key: "+treeMap1.lastKey());

        System.out.println();
        System.out.println("10 . Write a Java program to get a reverse order view of the keys contained in a given map. ");
        System.out.println("Ans: "+treeMap1.descendingKeySet());
        System.out.println("Ans: "+treeMap1.descendingMap());

        System.out.println();
        System.out.println("11 . Write a Java program to get a key-value mapping associated with the greatest key less than or equal to the given key.");
        System.out.println("Ans: "+treeMap1.floorEntry(10));

        System.out.println();
        System.out.println("12 . find less than or equal keyset in the map");
        //System.out.println("Ans: "+);

        System.out.println();
        System.out.println("13 . Write a Java program to get the portion of a map whose keys are strictly less than a given key.");
        System.out.println("Ans: "+treeMap1.headMap(5));

        System.out.println();
        System.out.println("14 . Write a Java program to get the portion of this map whose keys are less than (or equal to, if inclusive is true) a given key");
        System.out.println("Ans: "+treeMap1.headMap(4,true));

        System.out.println();
        System.out.println("15 . Write a Java program to get the least key strictly greater than the given key. Return null if there is no such key");
        System.out.println("Ans: "+treeMap1.higherKey(4));

        System.out.println();
        System.out.println("16 . Write a Java program to get a key-value mapping associated with the greatest key strictly less than the given key. Return null if there is no such key.");
        System.out.println("Ans: "+treeMap1.higherEntry(4));

        System.out.println();
        System.out.println("17 . Write a Java program to get the greatest key strictly less than the given key. Return null if there is no such key.");
        System.out.println("Ans: "+treeMap1.lowerKey(3));

        System.out.println();
        System.out.println("18 . Write a Java program to get NavigableSet view of the keys contained in a map");
        System.out.println("Ans: "+treeMap1.navigableKeySet());

        System.out.println();
        System.out.println("19 . Write a Java program to remove and get a key-value mapping associated with the least key in a map.");
        System.out.println("Ans: "+treeMap1.pollFirstEntry());

        System.out.println();
        System.out.println("20 . Write a Java program to remove and get a key-value mapping associated with the greatest key in this map.");
        System.out.println("Ans: "+treeMap1.pollLastEntry());

        System.out.println();
        System.out.println("21 . Write a Java program to get the portion of a map whose keys range from a given key (inclusive), to another key (exclusive).");
        System.out.println("Ans: "+treeMap1.subMap(2,7));

        System.out.println();
        System.out.println("22 . Write a Java program to get the portion of a map whose keys range from a given key to another key.");
        System.out.println();

        System.out.println();
        System.out.println("23 .  Write a Java program to get a portion of a map whose keys are greater than or equal to a given key.");
        System.out.println("Ans: "+treeMap1.tailMap(3));

        System.out.println();
        System.out.println("24 . Write a Java program to get a portion of a map whose keys are greater than to a given key.");
        System.out.println("Ans: "+treeMap1.tailMap(3,false));

        System.out.println();
        System.out.println("25 . Write a Java program to get a key-value mapping associated with the least key greater than or equal to the given key. Return null if there is no such key.");
        System.out.println("Ans: "+treeMap1.ceilingEntry(8));


        System.out.println();
        System.out.println("26 . Write a Java program to get the least key greater than or equal to the given key. Returns null if there is no such key.");
		 System.out.println("Keys greater than or equal to 4: " + treeMap1.ceilingKey(4));
    }
}
