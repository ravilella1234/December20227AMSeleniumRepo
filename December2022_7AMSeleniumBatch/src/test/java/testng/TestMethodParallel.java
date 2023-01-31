package testng;

import org.testng.annotations.Test;

public class TestMethodParallel 
{
	
  @Test
  public void test1() 
  {
	  System.out.println("iam test1 : " + Thread.currentThread().getId());
  }
  
  @Test
  public void test2() 
  {
	  System.out.println("iam test2 : " + Thread.currentThread().getId());
  }
  
  @Test
  public void test3() 
  {
	  System.out.println("iam test3 : " + Thread.currentThread().getId());
  }
  
  @Test
  public void test4() 
  {
	  System.out.println("iam test4 : " + Thread.currentThread().getId());
  }
  
  @Test
  public void test5() 
  {
	  System.out.println("iam test5 : " + Thread.currentThread().getId());
  }
  
  @Test
  public void test6() 
  {
	  System.out.println("iam test6 : " + Thread.currentThread().getId());
  }
  
  @Test
  public void test7() 
  {
	  System.out.println("iam test7 : " + Thread.currentThread().getId());
  }
}
