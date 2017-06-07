
public class DataTypes {
	
	static int  a=20;
	public static String name;
	public static double salary;
	
	public DataTypes(String empName){
		name = empName;
	}
	public void setSalary(double empSal){
		salary = empSal;
	}
	
    public void Printables(){
    	 System.out.println(name);
    	 System.out.println(salary);
    	
}


	public static void main(String[] args) {
		DataTypes emp = new DataTypes("Madhu");
		emp.setSalary(1000);
		emp.Printables();
		 System.out.println(name);
		 System.out.println(salary); 
			
	}
		

}