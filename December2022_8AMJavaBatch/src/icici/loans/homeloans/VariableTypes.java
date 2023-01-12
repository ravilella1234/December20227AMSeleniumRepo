package icici.loans.homeloans;

public  class VariableTypes 
{
	// primitive
	int x = 100; // instance (or) global (or) non-static
	int y=10;
	public final static String cname = "vmware"; // static (or) static-global
	static VariableTypes obj = new VariableTypes();
	
	public void m1()
	{
		y=100;
		int x = 200; // local
		//System.out.println(y);
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(VariableTypes.cname);
	}
	
	
	public static void m2()
	{
		int z = 300;
		//VariableTypes obj = new VariableTypes();
		System.out.println(obj.x);
		System.out.println(VariableTypes.cname);
		System.out.println(z);
	}
	
	public static void main(String[] args) 
	{
		//VariableTypes obj = new VariableTypes(); // non-primitive (or) reference
		System.out.println(obj.x);
		System.out.println(VariableTypes.cname);	
		obj.m1();
		m2();
	}

}
