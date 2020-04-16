package demo;

public class Student 
{
	int rollno;
	String name;
	static String  collegename="CBPGEC";
	
	
    Student(int r, String n)
    {
    	rollno=r;
    	name=n;
    }
    
    void display()
    {
    	System.out.println(rollno+" "+name+" "+collegename);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(rollno+" "+name+" "+collegename);
		Student s1 = new Student(021,"Prakhar");
	    Student s2 = new Student(021,"Omar");
	    s1.name="asddadad";
	    s1.rollno=11;
	    s1.display();
	    s2.display();
	}

}
