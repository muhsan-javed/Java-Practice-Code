package all.in.one;

class MethodDemo
{
	/*static void sum(){  // non-parameterized without return
		int x =10;
		int y = 20;
		int z =x+y;
		System.out.println("Sum = "+ z);
		//add(20,55);
	}
	static void morningwalk(){ // non-parameterized without return
		System.out.println("Well come Good morning walk");
	}
	
	static void add(int x, int y){// Parameterized without return
		int z= x+y;
		System.out.println("add Sum = "+ z);
	}
	
	static boolean withdraw(String name,int pin){ // Parameterized with return
		
		if(name=="muhsan" && pin==123){
			return true;
		
		}
		else {
			return false;
		}
		
	}
	
	static int add(){ // non-parameterized with return
		int z=10+29;
		return z;
	} 
	
	//final synchtonized static public void main(String [] tech){
	public static void main(String [] tech){
		//int x = 10 ;
		//System.out.printf("%d",x );
		
		//MethodDemo t=new MethodDemo();
		
	//	System.out.print(" Hello Muhsan javed ");
		//Println("Class 31"); 
		System.out.println("Hello Muhsan javed Class 32 ");
		//System.out.println(tech[0]);
		
		
		//sum();
		//add(15,10);
		//System.out.println(withdraw("muhasn",123));
		//boolean p=withdraw("kaka",123);
		//System.out.println(p);
		
		//t.morningwalk();
		//add(23,56);
		//morningwalk();
		//int q=add();
		//System.out.println(q+1);
		
		sum();
		morningwalk();
		add(20,30);
		System.out.println(withdraw("muhasn",123));
		int q=add();
		System.out.println(q+1);
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first number");
		double d=s.nextDouble();
		System.out.println("Enter second number");
		double d1=s.nextDouble();
		double g=addition(d,d1);
		System.out.println("addition = "+ g);
		
	}
	static double addition(double d, double d1){
			return(d+d1);
		}*/
		
	static void show(byte b) {
		System.out.println("byte = "+ b);
	}
	
	static void show(short b) {
		System.out.println("short = "+ b);
	}
	
	static void show(int b) {
		System.out.println("int = " + b);
	}
	
	static void show(long b) {
		System.out.println("long = "+ b);
	}
	
	static int add(byte x, byte y  ) {
		byte z= (byte) ((int)x+y);
		return z;
	}
	
	public static void main(String[] args) {
		show(23);

	}
	
}


















