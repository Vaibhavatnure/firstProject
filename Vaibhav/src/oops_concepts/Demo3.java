package oops_concepts;
import java.util.Scanner;


public class Demo3 extends CustomException {
	Scanner sc=new Scanner (System.in);
	int r=sc.nextInt();
	int s= sc.nextInt();
	
	
	public Demo3(String msg) {
		super(msg);
		// TODO Auto-generated constructor stub
	}
	
	public void add() {
		if(r==0) {
			throw new ArithmeticException("cannot do this");
			
		}else {
			System.out.println(r+s);
			
		}
	}

	public static void main(String []args) throws CustomException {
		Scanner sc=new Scanner (System.in);
		
		int h=sc.nextInt();
		int b=sc.nextInt();
		CustomException yz= new CustomException("divided by zero will give a runtime Exception");
		
		yz.divide(h,b);
		
		yz.add();
		
		
		
		
		
		
		
		/*Abstract_Class a;
		a=new Demo1();
		a.add(4, 6);
		a=new Multiply();
		a.add(4, 6);
		I1 i;
		i=new I1_Child();
		i.add(4, 5, 7);
		I2 m;
		m=new I1_Child();
		
		m.DoThis("vaibhav");
		
		Demo1 m1=new Demo1();
		m1.SetMobile(7887524248l);
		
		
		System.out.println(m1.Getmobile());
		*/
		
		I1_Child ac=new I1_Child();
		//I1.add(1,2,4);
		
		try{
			int [] a= {1,2,3};
		
		System.out.println(a[2]);
		}catch(ArrayIndexOutOfBoundsException ex) {
			ex.printStackTrace();
	}catch (Exception e) {
		e.printStackTrace();
	
	}
		int a= 27;
		System.out.println(String.valueOf(a));
		
		System.out.println(a+3);
		
		String name="101";
		System.out.println(Integer.parseInt(name));
		System.out.println(Integer.parseInt(name)/10);
		
		
		}
}
	
	
