//Write a Java program to create a new array list, add some colors (string) and print out the collection

import java.util.*;

@SuppressWarnings("unchecked")
public class ArrayListTask {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Red");
        arrayList.add("White");
        arrayList.add("Blue");
        arrayList.add("Green");
        arrayList.add("Yellow");
        System.out.println();
        System.out.println("1 . Write a Java program to create a new array list, add some colors (string) and print out the collection");
        System.out.println("Ans: "+arrayList);
        System.out.println("\n");
        System.out.println("2 . Write a Java program to iterate through all elements in a array list");
        Iterator iterator=arrayList.iterator();
        System.out.print("Ans: ");
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println("\n");
        System.out.println("3 . Write a Java program to insert an element into the array list at the first position");
        arrayList.add(0,"Color");
        System.out.print("Ans: ");
        for(String itr:arrayList){
            System.out.print(itr+" ");
        }
        System.out.println("\n");
        System.out.println("4 . Write a Java program to retrieve an element (at a specified index) from a given array list");
        System.out.print("Ans: ");
        int i=0;
        while (i<arrayList.size()){
            System.out.print(arrayList.get(i)+" ");
            i++;
        }

        System.out.println("\n");
        System.out.println("5 . Write a Java program to update specific array element by given element.");
        arrayList.set(0,"Color");
        System.out.print("Ans: ");
        for (String itr:arrayList){
            System.out.print(itr+" ");
        }
        System.out.println("\n");
        System.out.println("6 . Write a Java program to remove the third element from a array list.");
        arrayList.remove(2);
        System.out.print("Ans: ");
        for (String itr:arrayList){
            System.out.print(itr+" ");
        }

        System.out.println("\n");
        System.out.println("7 . Write a Java program to search an element in a array list.");
        /*Scanner scanner=new Scanner(System.in);
        System.out.print("Enter The String for Search: ");
        String search=scanner.next();
        System.out.print("Ans: ");
        System.out.println(arrayList.contains(search));*/


        System.out.println("\n");
        System.out.println("8 . Write a Java program to sort a given array list.");
        System.out.print("Ans: ");
        Collections.sort(arrayList);
        System.out.println(arrayList);

        System.out.println("\n");
        System.out.println("9 . Write a Java program to copy one array list into another");
        ArrayList<String> arrayList1=new ArrayList<>(arrayList);
        System.out.print("Ans: ");
        for (String itr:arrayList1){
            System.out.print(itr+" ");
        }

        System.out.println("\n");
        System.out.println("10 . Write a Java program to shuffle elements in a array list");
        System.out.print("Ans: ");
        Collections.shuffle(arrayList1);
        System.out.println(arrayList1);

        System.out.println("\n");
        System.out.println("11 . Write a Java program to reverse elements in a array list.");
        System.out.print("Ans: ");
        Collections.reverse(arrayList1);
        System.out.println(arrayList1);

        System.out.println("\n");
        System.out.println("12 . Write a Java program to extract a portion of a array list. ");
        System.out.print("Ans: ");
        System.out.println(arrayList1.subList(2,4));

        System.out.println("\n");
        System.out.println("13 . Write a Java program to compare two array lists.");
        System.out.print("Ans: ");
        System.out.println(arrayList.equals(arrayList));

        System.out.println("\n");
        System.out.println("14 . Write a Java program of swap two elements in an array list.");
        System.out.print("Ans: ");
        Collections.swap(arrayList,1,2);
        System.out.println(arrayList);

        System.out.println("\n");
        System.out.println("15 . Write a Java program to join two array lists.");
        System.out.print("Ans: ");
        ArrayList<String> arrayList2=new ArrayList<>();
        arrayList2.addAll(arrayList);
        arrayList2.addAll(arrayList1);
        System.out.println(arrayList2);

        System.out.println("\n");
        System.out.println("16 . Write a Java program to clone an array list to another array list.");
        System.out.print("Ans: ");
        ArrayList<String> arrayList3=(ArrayList<String>)arrayList2.clone();
		 //ArrayList<String> arrayList3=new ArrayList<>(arrayList2);
        System.out.println(arrayList3);

        System.out.println("\n");
        System.out.println("17 . Write a Java program to empty an array list.");
        System.out.print("Ans: ");
        arrayList3.removeAll(arrayList3);
        System.out.println(arrayList3);

        System.out.println("\n");
        System.out.println("18 . Write a Java program to test an array list is empty or not.");
        System.out.print("Ans: ");
        System.out.println(arrayList3.isEmpty());

        System.out.println("\n");
        System.out.println("19 . Write a Java program to trim the capacity of an array list the current list size.");
        System.out.print("Ans: ");
        arrayList2.trimToSize();
        System.out.println(arrayList2);

        System.out.println("\n");
        System.out.println("20 . Write a Java program to increase the size of an array list.");
        System.out.print("Ans: ");
        arrayList2.ensureCapacity(10);
        System.out.println(arrayList2);
	   
        System.out.println("\n");
        System.out.println("21 . Write a Java program to replace the second element of a ArrayList with the specified element");
        System.out.print("Ans: ");
        arrayList2.set(1,"White");
        System.out.println(arrayList2);

        System.out.println("\n");
        System.out.println("22 . Write a Java program to print all the elements of a ArrayList using the position of the elements");
        System.out.print("Ans: ");
        for(i=0;i<arrayList.size();i++){
            System.out.print(arrayList.get(i)+" ");
        }
    }
}
