
public class ArrayDemo {
	public static void main(String[] args) {
		try{
		int[] x = new int[5];
		x[0]=10;
		x[1]=20;
		x[2]=30;
	
		x[4]=50;
		System.out.println(x[2]);
	// exception handling	
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("Exception");
		}
	}

}
