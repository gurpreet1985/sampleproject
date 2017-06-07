
public class Student {
	
	int id;
	String name;
	Student(int i, String n){
		id=i;
		name=n;
		
	}
	public void displayDetails(){
		System.out.println(id+""+name);
	}
	public static void main(String[] args) {
		Student s1= new Student(100,"Madhu");
		s1.displayDetails();
		Student s2= new Student(200,"Raj");
		s2.displayDetails();

	}
}
