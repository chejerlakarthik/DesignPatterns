/**
 * 
 */
package org.practice;

/**
 * @author Yashoda
 *
 */
public class TestSingletonPattern 
{
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Application application = Application.getInstance();
		application.display();
		
		application = Application.getInstance();
		application.display();
		
	}
}
