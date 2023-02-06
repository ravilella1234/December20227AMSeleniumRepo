package icici.loans.homeloans;

public class StringOperations 
{

	public static void main(String[] args) 
	{
		String s1 = "ravikanth";
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.isEmpty());
		System.out.println(s1.startsWith("ravi"));
		System.out.println(s1.endsWith("nth"));
		System.out.println(s1.indexOf('v'));
		System.out.println(s1.charAt(3));
		
		
		String s2 = new String("lella");
		System.out.println(s2);
		
		System.out.println(s1.equals(s2));
		
		String s3 = "ravikanth";
		System.out.println(s1.equals(s3));
		
		String s4 = "ravikan";
		System.out.println(s1.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s4));
		
		System.out.println(s1.contains(s4));
		
		System.out.println(s1);
		System.out.println(s1.substring(2, 7));
		
		System.out.println(s1);
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		System.out.println(s1);
		System.out.println(s1.replace('r', 'k'));
		
		String s5 = " ravikanth";
		System.out.println(s1);
		System.out.println(s5);
		System.out.println(s1.equals(s5));
		System.out.println(s1.equals(s5.trim()));
		
		String s6 = " Ravikant";
		System.out.println(s1);
		System.out.println(s6);
		System.out.println(s1.contains(s6.trim().toLowerCase()));
		
		String s7 = "ravi kanth lella";
		System.out.println(s7);
		String[] str = s7.split(" ");
		for(String s:str)
		{
			System.out.println(s);
		}
		
	}
}
