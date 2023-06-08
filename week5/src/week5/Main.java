package week5;

import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int id=Integer.parseInt(sc.nextLine());
		 String name=sc.nextLine();
		 int age=Integer.parseInt(sc.nextLine());
		 String course=sc.nextLine();
		 Student s1;
		 try{
		 s1=new Student(id,name,age,course);
		 if (age<15||age>21) {
				throw new Age("age is not between 15 and 21");
				
			}
		 if(!name.matches("[a-zA-Z]+")) {
			throw new Name("nameis not valid");
		 }
		 }catch (Age e){
		 System.out.println(e.getMessage());
		 }catch (Name e) {
			 System.out.println(e.getMessage());
		 }
		 System.out.println(id+" "+name+" "+age+" "+course);


	}

}
