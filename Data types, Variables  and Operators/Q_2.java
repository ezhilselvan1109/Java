/* 
Write a program to illustrate various types of operators.

Increment and decrement operators.

Bitwise Complement Operator.

Arithmetic operator.

Relational Operator.

Bitwise operator.

Conditional Operator.
*/

public class Q_2{
	public static void main(String args[]){
		int value=5;
		System.out.println("Increment and decrement operators.\n");
		System.out.println("PreIncrement: "+ ++value);
		System.out.println("Predecrement: "+ --value);
		System.out.println("PostIncrement: "+value++);
		System.out.println("Postdecrement: "+ value-- +"\n");
		value=7;
		System.out.println("Bitwise Complement Operator..\n");
		System.out.println("Ans: "+ ~value +"\n");
		int value1=5,value2=6;
		System.out.println("Increment and decrement operators.\n");
		
		System.out.print("Addition: ");
		System.out.println(value1+value2);
		System.out.print("Subtraction: ");
		System.out.println(value1-value2);
		System.out.println("Multiplication: "+value1*value2);
		System.out.println("Division: "+ value1/value2);
		System.out.println("Modulo: "+ value1%value2+"\n");
		
		System.out.println("Relational Operator.\n");
		System.out.println("Equal To Operator (==): ");
		if(value1==value2)
			System.out.println("Yes");
		else
			System.out.println("No");
		System.out.println("Not Equal To Operator (!=): ");
		if(value1!=value2)
			System.out.println("Yes");
		else
			System.out.println("No");
		System.out.println("Less than Operator (<): ");
		if(value1<value2)
			System.out.println("Small value: "+value1);
		else
			System.out.println("Large Value: "+value2);
		System.out.println("Greater than Operator (>): ");
		if(value1>value2)
			System.out.println("Small value: "+value1);
		else
			System.out.println("Large Value: "+value2);
		System.out.println("Less than Equal To Operator (<=): ");
		if(value1<=value2)
			System.out.println("Yes");
		else
			System.out.println("No");
		System.out.println("Greater than Equal To Operator (>=): ");
		if(value1>=value2)
			System.out.println("Yes");
		else
			System.out.println("No");
		
		System.out.println("Bitwise operator.\n");
		System.out.print("AND Operator &: ");
		System.out.println( value1&value2);
		System.out.print("OR Operator |: ");
		System.out.println(value1|value2);
		System.out.print(" XOR (exclusive OR): ");
		System.out.println(value1^value2);
		System.out.print("Right Shift Operator >>: ");
		System.out.println(value1>>value2);
		System.out.print("Right Shift Operator <<: ");
		System.out.println(value1<<value2);
		value1=5;
		value2=6;
		System.out.println("Conditional Operator.");
		String  value3=(value1==value2)?("Yes"):("No");
		System.out.println(value3);
		
	}
}