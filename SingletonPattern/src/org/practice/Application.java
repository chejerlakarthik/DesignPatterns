/**
 * 
 */
package org.practice;

/**
 * @author Yashoda
 *
 */
public class Application
{
	// Lazy initialization using double-locking mechanism
	private static Application application = null;

	private Application() 
	{
		System.out.println("Singleton(): Initializing Instance");
	}

	public static Application getInstance() 
	{
		if (null == application) 
		{
			synchronized(Application.class)
			{
				application = new Application();
			}
		}
		return application;
	}
	
	public void display()
	{
		System.out.println("Singleton class");
		System.out.println(application.hashCode());
	}
}
