import java.util.Iterator;
import java.util.TreeSet;

@SuppressWarnings("unchecked")
public class TreesetTask {
    public static void main(String[] args) {
        System.out.println("1 . Write a Java program to create a new tree set, add some colors (string) and print out the tree set.");
        TreeSet<String> treeSet=new TreeSet<>();
        treeSet.add("White");
        treeSet.add("Red");
        treeSet.add("Blue");
        treeSet.add("Green");
        System.out.println("Ans: "+treeSet);

        System.out.println();
        System.out.println("2 . Write a Java program to iterate through all elements in a tree set.");
        Iterator iterator=treeSet.iterator();
        System.out.print("Ans: ");
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }

        System.out.println();
        System.out.println("3 . Write a Java program to add all the elements of a specified tree set to another tree set.");
        TreeSet<String> treeSet1=new TreeSet<>(treeSet);
        System.out.println("Ans: "+treeSet1);

        System.out.println();
        System.out.println("4 . Write a Java program to create a reverse order view of the elements contained in a given tree set.");
        Iterator itr=treeSet1.descendingIterator();
        System.out.print("Ans: ");
        while (itr.hasNext()){
            System.out.print(itr.next()+" ");
        }

        System.out.println();
        System.out.println("5 . Write a Java program to get the first and last elements in a tree set.");
        System.out.println("first elements :"+treeSet1.first());
        System.out.println("last elements :"+treeSet1.last());

        System.out.println();
        System.out.println("6 . Write a Java program to clone a tree set list to another tree set.");
        TreeSet<String> treeSet2=(TreeSet)treeSet1.clone();
        System.out.println("Ans: "+treeSet2);

        System.out.println();
        System.out.println("7 . Write a Java program to get the number of elements in a tree set.");
        System.out.println("Ans: "+treeSet2.size());

        System.out.println();
        System.out.println("8 . Write a Java program to compare two tree sets.");
        System.out.println("Ans: "+treeSet2.equals(treeSet));
        for(String element:treeSet2){
            System.out.print(treeSet1.contains(element)+" ");
        }

        System.out.println();
        System.out.println("9 . Write a Java program to find the numbers less than 7 in a tree set.");
        TreeSet<Integer> treeSet3=new TreeSet<>();
        TreeSet<Integer> treeSet4;
        treeSet3.add(4);
        treeSet3.add(5);
        treeSet3.add(3);
        treeSet3.add(8);
        treeSet4= (TreeSet<Integer>) treeSet3.headSet(7);
        System.out.println("Ans: "+treeSet4);

        System.out.println();
        System.out.println("10 . Write a Java program to get the element in a tree set which is greater than or equal to the given element.");
        System.out.println("Ans: "+treeSet3.ceiling(2));

        System.out.println();
        System.out.println("11 .Write a Java program to get the element in a tree set which is less than or equal to the given element.");
        System.out.println("Ans: "+treeSet3.floor(6));

        System.out.println("12 . Write a Java program to get the element in a tree set which is strictly greater than or equal to the given element.");
        System.out.println("Ans: "+treeSet3.higher(9));

        System.out.println();
        System.out.println("13 .  Write a Java program to get an element in a tree set which is strictly less than the given element.");
        System.out.println("Ans: "+treeSet3.lower(5));

        System.out.println();
        System.out.println("14 . Write a Java program to retrieve and remove the first element of a tree set.");
        System.out.println("Ans :"+treeSet3.pollFirst());
        System.out.println(treeSet3);

        System.out.println();
        System.out.println("15 . Write a Java program to retrieve and remove the last element of a tree set.");
        System.out.println("Ans :"+treeSet3.pollLast());
        System.out.println(treeSet3);

        System.out.println();
        System.out.println("16 . Write a Java program to remove a given element from a tree set.");
        System.out.println("Ans :"+treeSet3.remove(4));
        System.out.println(treeSet3);
    }
}
