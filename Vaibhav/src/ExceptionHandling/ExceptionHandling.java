package ExceptionHandling;
import java.util.Scanner;
import java.io.*;


public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner (System.in);
		
		int a=sc.nextInt();
		int b= sc.nextInt();
		
		ExceptionHandling e1=new ExceptionHandling();
		try {
			e1.add(a, b);
		} catch (CustomException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File MyFile=new File("C:\\Users\\Beggars\\Desktop\\Communication Training\\vaibhavatnure12.txt");
		
		try {
			MyFile.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String data="my name is vaibhav and im doing chutiyaapa here ";
		
		
		try {
			FileWriter output=new FileWriter("vaibhavatnure12.txt");
			output.write(data);
			System.out.println("data is written");
			output.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		char [] ac=new char[100];
		String gb="this data should be appenden";
		
		
		try {
			FileReader data1=new FileReader ("vaibhavatnure12.txt");
			data1.read(ac);
			
			System.out.println(ac);
			data1.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileWriter output=new FileWriter("vaibhavatnure12.txt",true);
			output.write(gb);
			System.out.println("data is appended");
			System.out.println(output);
			output.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			FileReader data1=new FileReader ("vaibhavatnure12.txt");
			data1.read(ac);
			
			System.out.println(ac);
			data1.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
	public void add(int a,int b) throws CustomException {
		if (a==0) {
			throw new CustomException("we dont want a as 0");
			
		}else {
			System.out.println(a+b);
			
		}
	}

}
