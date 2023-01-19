package icici.loans.homeloans;

public class Calculations 
{
	int a,b,result;
	
	public Calculations(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public void add()
	{
		result = a+b;
		System.out.println("Add of A & B is : " +  result);
	}
	
	public void sub()
	{
		result = a-b;
		System.out.println("Sub of A & B is : " +  result);
	}
	
	public static void main(String[] args) 
	{
		Calculations obj1 = new Calculations(100, 200);
		obj1.add();
		obj1.sub();
		
		Calculations obj2 = new Calculations(10, 20);
		obj2.add();
		obj2.sub();
	}

}
