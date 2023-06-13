/*
The total number of students in a class is 90 out of which 45 are boys. 
If 50% of the total students secured grade 'A' out of which 20 are boys, then 
write a program to calculate the total number of girls getting grade 'A'.
*/


class Q_9{
    private static int student=90;
	static int boys=45,girls,grade=50;
	static int grade_boys=20,grade_girls;
    public static void main(String[] args) {
        int grade_students=student*grade/100;
		grade_girls=grade_students-grade_boys;
		System.out.print(grade_girls);
    }
}