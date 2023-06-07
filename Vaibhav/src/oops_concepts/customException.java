package oops_concepts;



class CustomException extends Exception{
	
	public CustomException(String msg) {
		super(msg);
		
	}
	


public void divide(int h,int b) throws CustomException {
	if(b==0) {
		
		throw new CustomException("its divided by zero");
		
	}else {
		System.out.println(h/b);
	}
	
	//System.out.println(3/0);
	
	
}



public void add() {
	// TODO Auto-generated method stub
	
}


}