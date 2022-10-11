package priorityAndinvocation;

import org.testng.annotations.Test;

public class priorityclass
{
	
@Test(priority=0)
public void TestA() 
{
System.out.println("Test A");	
}
//-----------------------------------
@Test(priority=0)
public void TsetB()
{
	System.out.println("Test b");
}
//------------------------------------
@Test(priority=0)
public void TestC()
{
	System.out.println("Test C");
}
//------------------------------------ 
@Test(priority=-4)

public void TestD()
{
	System.out.println("Test D");
}
//--------------------------------------
@Test(priority=1)
public void TestE()
{
	System.out.println("Test E");
}
//--------------------------------------
@Test(priority=-3)
public void TestF()
{
	System.out.println("test f");
}
//---------------------------------------
}
