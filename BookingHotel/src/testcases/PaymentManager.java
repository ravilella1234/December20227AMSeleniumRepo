package testcases;

import org.testng.ITestContext;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PaymentManager 
{
  @Test
  public void applyDiscount() 
  {
	  System.out.println("---- applyDiscount ----");
  }
  
  @Test
  @Parameters({"action"})
  public void makePayment(String parameterType,ITestContext context) 
  {
	  if(parameterType.equals("pay@online"))
		  System.out.println("---- make a payment @online----");
	  else
		  System.out.println("---- make a payment @Hotel----");
	  
	  //Booking ID
	  String bookingID = "RRR12345";
	  System.out.println("BID : " + bookingID);
	  context.setAttribute("bID", bookingID);
  }
}
