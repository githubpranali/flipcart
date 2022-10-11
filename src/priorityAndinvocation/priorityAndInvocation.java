package priorityAndinvocation;

import org.testng.annotations.Test;

public class priorityAndInvocation 
{
@Test(priority=0,invocationCount=1)	
public void testa()
{
	System.out.println("Test A");     //2
}
//---------------------------------------
@Test(priority=-1,invocationCount=1)	
public void testb()
{                                         //1
	System.out.println("Test b");
}
//----------------------------------------
//it wll not executed due to -ve ic
@Test(priority=0,invocationCount=-1)
public void testc()
{
	System.out.println("Test c");
}
//-------------------------------------------
@Test(priority=1,invocationCount=0)
//will b skip due to 0 ic
public void testd()
{                 
	System.out.println("Test d");
}
//----------------------------------------------
@Test
public void teste()
{                                        //3
	System.out.println("Test e");
}
}
