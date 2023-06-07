package oops_concepts;
import java.util.*;

public class I1_Child2 implements I1{
	public static void main(String []args) {
	
		
		
		/*ArrayList<String> l=new ArrayList<String>();
		l.add("vaibhav");
		l.add("gunavant");

		l.add("omkar");

		l.add("pawan");
		
		l.add("vaibhav");
		l.add("vedika");
		l.add("ghadage");
		
		
		System.out.println(l.get(2));
		
		l.set(2,"prajwal");
		System.out.println(l.get(2));
		
		
		l.remove(2);
		System.out.println(l.get(2));
		System.out.println(l);
		
		System.out.println(l.lastIndexOf("vaibhav"));
		
		System.out.println(l.subList(2, 4));
		
		
		for(String i:l) {
			System.out.println(i);
		}*/
		
		LinkedList<String> l1=new LinkedList<String>();
		
		l1.add("vaibhav");
		l1.add("omkar");
		l1.add("gunavant");
		l1.add("vedika");
		
		System.out.println(l1);
		
		System.out.println(l1.get(2));
		
		l1.set(2,"vaibhav");
		System.out.println(l1.get(2));
		
		l1.add(2, "bumbya");
		System.out.println(l1);
		System.out.println(l1.contains("vedika"));
		
		ListIterator<String> itr=l1.listIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		HashSet<String> s1=new HashSet<String>();
		
		s1.add("vaibhav");
		s1.add("deepak");
		s1.add("omkar");

		s1.add("prajwal");

		
		
		System.out.println(s1);
		
		HashSet<String> s2=new HashSet<String>();
		
		s2.add("jyoti");
		s2.add("pooja");
		s2.add("kirti");
		s2.add("neha");
		
		System.out.println(s1.addAll(s2));
		System.out.println(s1);
		
		
		s1.retainAll(s2);
		System.out.println(s1);
		
		ArrayList<String> l3=new ArrayList<String>();
		
		l3.addAll(s1);
		System.out.println(l3);
		
		TreeSet<String> s4=new TreeSet<String>();
		s4.add("676");
		s4.add("48538");
		
		System.out.println(s4);
		
		Iterator<String> it5= s4.iterator();
		
		while (it5.hasNext()) {
			System.out.println(it5.next());
			
		}
		
		
		HashMap<Integer, String> m1=new HashMap<Integer,String>();
		
		m1.put(1,"vaibhav");
		m1.put(2,"vikas");
		m1.put(3,"omkar");
		
		System.out.println(m1);
		System.out.println(m1.get(2));
		
		
		System.out.println(l1.getFirst());
		
		//String a=()-> {sop("hello world");}
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		


		
		
		
		
		
		
		
		
		
		
		
		
		
	

}

	@Override
	public void add(int a, int b, int c) {
		// TODO Auto-generated method stub
		
	}
}
