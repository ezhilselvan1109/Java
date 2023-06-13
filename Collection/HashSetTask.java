import java.util.*;

@SuppressWarnings("unchecked")
public class HashSetTask {
    public static void main(String[] args) {
        System.out.println("1 . Write a Java program to append the specified element to the end of a hash set.");
        HashSet<Integer> hashSet=new HashSet<>();
        hashSet.add(5);
        hashSet.add(4);
        hashSet.add(3);
        hashSet.add(1);
        hashSet.add(2);
        System.out.println("Ans: "+hashSet);

        System.out.println("2 . Write a Java program to iterate through all elements in a hash list.");
        Iterator itr=hashSet.iterator();
        System.out.print("Ans: ");
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }

        System.out.println();
        System.out.println("3 . Write a Java program to get the number of elements in a hash set.");
        System.out.println("Ans: "+hashSet.size());

        System.out.println();
        System.out.println("4 . Write a Java program to empty an hash set.");
        System.out.println("Ans: "+hashSet.removeAll(hashSet));
        System.out.println(hashSet);

        System.out.println();
        System.out.println("5 . Write a Java program to test a hash set is empty or not.");
        System.out.println("Ans: "+hashSet.isEmpty());

        System.out.println();
        System.out.println("6 . Write a Java program to clone a hash set to another hash set.");
        hashSet.add(5);
        hashSet.add(4);
        hashSet.add(3);
        hashSet.add(1);
        hashSet.add(2);
        HashSet<Integer> hashSet1=(HashSet)hashSet.clone();
        System.out.println("Ans: "+hashSet1);

        System.out.println("7 . Write a Java program to convert a hash set to a tree set.");
        TreeSet<Integer> treeSet=new TreeSet<>(hashSet1);
        System.out.println("Ans: "+treeSet);

        System.out.println();
        System.out.println("8 . Write a Java program to convert a hash set to a List/ArrayList.");
        List<Integer> list=new ArrayList<>(hashSet1);
        System.out.println("Ans: "+list);

        System.out.println("9 . Write a Java program to compare two hash set.");
        System.out.println("Ans: "+hashSet.equals(hashSet1));
        Iterator iterator=hashSet.iterator();
        while (iterator.hasNext()){
            System.out.print(hashSet1.contains(iterator.next())+" ");
        }

        System.out.println("10 . Write a Java program to compare two sets and retain elements which are same on both sets.");
        hashSet.add(8);
        hashSet.add(7);
        hashSet1.retainAll(hashSet);
        System.out.println("Ans: "+hashSet);

			
		System.out.println("11 . Write a Java program to remove all of the elements from a hash set.");
		hashSet.clear();
		System.out.println("Ans: "+hashSet);
        
    }
}
