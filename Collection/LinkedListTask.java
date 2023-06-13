import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Iterator;

@SuppressWarnings("unchecked")

public class LinkedListTask {
    public static void main(String[] args) {
        System.out.println("1 . Write a Java program to append the specified element to the end of a linked list.");
        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        System.out.print("Ans: ");
        System.out.println(linkedList);
        System.out.println();
        System.out.println("2 . Write a Java program to iterate through all elements in a linked list.");
        Iterator iterator=linkedList.iterator();
        System.out.print("Ans: ");
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println("\n");
        System.out.println("3 . Write a Java program to iterate through all elements in a linked list starting at the specified position. ");
        Iterator iterator1=linkedList.listIterator(2);
        System.out.print("Ans: ");
        while (iterator1.hasNext()){
            System.out.print(iterator1.next()+" ");
        }
        System.out.println("\n");
        System.out.println("4 . Write a Java program to iterate a linked list in reverse order.");
        Collections.reverse(linkedList);
        System.out.print("Ans: ");
        System.out.println(linkedList);

        System.out.println();
        System.out.println("5 . Write a Java program to insert the specified element at the specified position in the linked list");
        linkedList.add(4,6);
        System.out.print("Ans: ");
        System.out.println(linkedList);

        System.out.println();
        System.out.println("6 . Write a Java program to insert elements into the linked list at the first and last position.");
        linkedList.addLast(7);
        linkedList.addFirst(0);
        System.out.print("Ans: ");
        System.out.println(linkedList);

        System.out.println();
        System.out.println("7 . Write a Java program to insert the specified element at the front of a linked list.");
        linkedList.offerFirst(8);
        System.out.print("Ans: ");
        System.out.println(linkedList);

        System.out.println();
        System.out.println("8 . Write a Java program to insert the specified element at the end of a linked list.");
        linkedList.offerLast(9);
        System.out.print("Ans: ");
        System.out.println(linkedList);

        System.out.println();
        System.out.println("9 . Write a Java program to insert some elements at the specified position into a linked list.");
        linkedList.set(1,10);
        System.out.print("Ans: ");
        System.out.println(linkedList);

        System.out.println();
        System.out.println("10 . Write a Java program to get the first and last occurrence of the specified elements in a linked list.");
        System.out.println("First Element: "+linkedList.getFirst());
        System.out.println("Last Element: "+linkedList.getLast());

        System.out.println();
        System.out.println("11 . Write a Java program to display the elements and their positions in a linked list.");
        System.out.print("Ans: ");
        for(int i=0;i<linkedList.size();i++){
            System.out.print(linkedList.get(i)+" ");
        }
        System.out.println();
        System.out.println("12 . Write a Java program to remove a specified element from a linked list.");
        System.out.print("Ans: ");
        linkedList.remove(0);
        System.out.println(linkedList);

        System.out.println();
        System.out.println("13 . Write a Java program to remove first and last element from a linked list. ");
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.print("Ans: ");
        System.out.println(linkedList);

        System.out.println();
        System.out.println("14 . Write a Java program to remove all the elements from a linked list.");
        linkedList.removeAll(linkedList);
        System.out.println(linkedList);

        System.out.println();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        System.out.println("15 . Write a Java program of swap two elements in a linked list.");
        Collections.swap(linkedList,0,4);
        System.out.println(linkedList);

        System.out.println();
        System.out.println("16 . Write a Java program to shuffle the elements in a linked list.");
        Collections.shuffle(linkedList);
        System.out.println(linkedList);

        System.out.println();
        System.out.println("17 . Write a Java program to join two linked lists. ");
        LinkedList<Integer> linkedList1=new LinkedList<>();
        linkedList1.add(0);
        linkedList1.add(1);
        linkedList1.add(2);
        linkedList1.add(3);
        LinkedList<Integer> linkedList2=new LinkedList<>();
        linkedList2.addAll(linkedList);
        linkedList2.addAll(linkedList1);
        System.out.println(linkedList2);

        System.out.println();
        System.out.println("18 .  Write a Java program to clone an linked list to another linked list.");
        LinkedList<Integer> linkedList3=(LinkedList<Integer>)linkedList2.clone();
        System.out.println(linkedList3);

        System.out.println();
        System.out.println("19 . Write a Java program to remove and return the first element of a linked list.");
        System.out.println("Ans :"+linkedList3.pop());

        System.out.println();
        System.out.println("20 . Write a Java program to retrieve but does not remove, the first element of a linked list.");
        System.out.println("Ans :" +linkedList3.peekFirst());

        System.out.println();
        System.out.println("21 . Write a Java program to retrieve but does not remove, the last element of a linked list.");
        System.out.println("Ans: "+linkedList3.peekLast());

        System.out.println();
        System.out.println("22 . Write a Java program to check if a particular element exists in a linked list.");
        System.out.println("Ans: "+linkedList.contains(5));

        System.out.println();
        System.out.println("23 . Write a Java program to convert a linked list to array list.");
        ArrayList<Integer> arrayList=new ArrayList<>(linkedList3);
        System.out.print("Ans: ");
        for(Integer itr:arrayList){
            System.out.print(itr+" ");
        }

        System.out.println();
        System.out.println("24 . Write a Java program to compare two linked lists.");
        System.out.print("Ans: ");
        System.out.println(linkedList.equals(linkedList1));

        System.out.println();
        System.out.println("25 . Write a Java program to test an linked list is empty or not.");
        System.out.print("Ans: ");
        System.out.println(linkedList3.isEmpty());

        System.out.println();
        System.out.println("26 . Write a Java program to replace an element in a linked list. ");
        linkedList.set(1,8);
        System.out.print("Ans: ");
        System.out.println(linkedList);





    }
}
