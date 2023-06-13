import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@SuppressWarnings("unchecked")
public class HashMapTask {
    public static void main(String[] args) {
        System.out.println("1 . Write a Java program to associate the specified value with the specified key in a HashMap.");
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        hashMap.put(1,5);
        hashMap.put(2,4);
        hashMap.put(3,33);
        hashMap.put(4,2);
        hashMap.put(5,1);
        System.out.println("Key Value");
        for(Map.Entry m:hashMap.entrySet()){
            System.out.println(m.getKey()+"   "+m.getValue());
        }

        System.out.println();
        System.out.println("2 .  Write a Java program to count the number of key-value (size) mappings in a map.");
        System.out.println("Ans: "+hashMap.size());

        System.out.println();
        System.out.println("3 . Write a Java program to copy all of the mappings from the specified map to another map.");
        HashMap<Integer,Integer> hashMap1=new HashMap<>(hashMap);
        for(Map.Entry m:hashMap1.entrySet()){
            System.out.println(m.getKey()+"  "+m.getValue());
        }

        System.out.println();
        System.out.println("4 . Write a Java program to remove all of the mappings from a map.");
        hashMap.clear();
        System.out.println("Ans: "+hashMap);

        System.out.println();
        System.out.println("5 . Write a Java program to check whether a map contains key-value mappings (empty) or not.");
        System.out.println("Ans: "+hashMap.isEmpty());

        System.out.println();
        System.out.println("6 . Write a Java program to get a shallow copy of a HashMap instance.");
        HashMap<Integer,Integer> hashMap2=(HashMap)hashMap1.clone();
        System.out.println("Ans: "+hashMap2);

        System.out.println();
        System.out.println("7 . Write a Java program to test if a map contains a mapping for the specified key.");
        System.out.println("Ans: "+hashMap1.containsKey(8));

        System.out.println();
        System.out.println("8 . Write a Java program to test if a map contains a mapping for the specified value");
        System.out.println("Ans: "+hashMap1.containsValue(2));

        System.out.println();
        System.out.println("9 . Write a Java program to create a set view of the mappings contained in a map.");
        Set set=hashMap1.entrySet();
        System.out.println("Ans: "+set);

        System.out.println();
        System.out.println("10 . Write a Java program to get the value of a specified key in a map.");
        System.out.println("Ans: "+hashMap1.get(4));

        System.out.println();
        System.out.println("11 .  Write a Java program to get a set view of the keys contained in this map.");
        System.out.println("Ans: "+hashMap1.keySet());

        System.out.println();
        System.out.println("12 . Write a Java program to get a collection view of the values contained in this map.");
        System.out.println("Ans: "+hashMap1.values());
    }
}
