import java.util.*;

public class PriorityQueueTask {
    public static void main(String[] args) {
        System.out.println("1 . Write a Java program to create a new priority queue, add some colors (string) and print out the elements of the priority queue.");
        PriorityQueue<String> priorityQueue=new PriorityQueue<>();
        priorityQueue.add("Red");
        priorityQueue.add("White");
        priorityQueue.add("Yellow");
        priorityQueue.add("Green");
        priorityQueue.add("Blue");
        System.out.print("Ans: "+priorityQueue);
        System.out.println("\n");
        System.out.println("2. Write a Java program to iterate through all elements in priority queue. ");
        System.out.print("Ans: ");
        for (String element : priorityQueue) {
            System.out.print(element+" ");
        }
        System.out.println("\n");
        System.out.println("3 . Write a Java program to add all the elements of a priority queue to another priority queue.");
        PriorityQueue<String> priorityQueue1=new PriorityQueue<>(priorityQueue);
        System.out.println("Ans: "+priorityQueue1);

        System.out.println();
        System.out.println("4 . Write a Java program to insert a given element into a priority queue.");
        priorityQueue1.offer("purple");
        System.out.println(priorityQueue1);

        System.out.println();
        System.out.println("5 . Write a Java program to remove all the elements from a priority queue.");
        priorityQueue.clear();
        System.out.println("Ans: "+priorityQueue);

        System.out.println();
        System.out.println("6 . Write a Java program to count the number of elements in a priority queue.");
        System.out.println("Ans: "+priorityQueue1.size());

        System.out.println();
        System.out.println("7 . Write a Java program to compare two priority queues.");
        PriorityQueue<String> priorityQueue2=new PriorityQueue<>(priorityQueue1);
        System.out.print("Ans: ");
        for (String element : priorityQueue1){
            System.out.print(priorityQueue2.contains(element) ? "Yes " : "No ");
        }

        System.out.println();
        System.out.println("8 . Write a Java program to retrieve the first element of the priority queue.");
        System.out.println("Ans: "+priorityQueue1.peek());

        System.out.println();
        System.out.println("9 . Write a Java program to retrieve and remove the first element.");
        System.out.println("Ans: "+priorityQueue1.poll());
        System.out.println(priorityQueue1);

        System.out.println();
        System.out.println("10 . Write a Java program to convert a priority queue to an array containing all of the elements of the queue.");
        ArrayList<String> arrayList=new ArrayList<>(priorityQueue1);
        System.out.println("Ans: "+arrayList);

        System.out.println();
        System.out.println("11 . Write a Java program to convert a Priority Queue elements to a string representation.");
        String str=priorityQueue1.toString();
        System.out.println("Ans: "+str);

        System.out.println();
        System.out.println("12 . Write a Java program to change priorityQueue to maximum priorityqueue.");
	    PriorityQueue<Integer> PriorityQueue4 = new PriorityQueue<>(10, Collections.reverseOrder());
   		PriorityQueue4.add(10);
   		PriorityQueue4.add(22);
   		PriorityQueue4.add(36);
   		PriorityQueue4.add(25);
   		PriorityQueue4.add(16);
   		PriorityQueue4.add(70);
   		PriorityQueue4.add(82);
   		PriorityQueue4.add(89);
   		PriorityQueue4.add(14);
   		System.out.println("\nOriginal Priority Queue: "+PriorityQueue4);

		System.out.print("\nMaximum Priority Queue: ");
		Integer val = null;
		while( (val = PriorityQueue4.poll()) != null) {
    		System.out.print(val+"  ");
      	}
	  	System.out.print("\n");

    }
}

