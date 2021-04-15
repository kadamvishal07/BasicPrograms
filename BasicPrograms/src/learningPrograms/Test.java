package learningPrograms;

public class Test {

	int a = 10;
	int b = 20;

	public void sum() {
		int sum = a+b;
		System.out.println("sum is: "+sum);
	}
	
	public static void main (String[] args)
	{
		Test t = new Test();
		t.sum();
		Student s = new Student();
		s.name = "Siddhank";
		s.grade = 4;
		s.printDetails();
	}

}// end of class Test which has main method

class Student
{
	String name;
	int grade;
	
	public void printDetails()
	{
		System.out.println("Details are: "+name+" Grade is: "+grade);
	}
}
