/**
 * 
 */
package org.practice;

/**
 * @author Yashoda
 *
 */
public class TestFactoryPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		if(args.length < 2)
		{
			System.err.println("Pass minimum 2 shapes as arguments");
			return;
		}
		
		System.out.println(args.length + " shapes passed as arguments");
		
		ShapeFactory shapeFactory = new ShapeFactory();
		IShape shape = null;
		int i=0;
		
		while (i < args.length)
		{
			System.out.print((i+1) + " ");
			shape = shapeFactory.getShape(args[i++]);
			shape.draw();
		}
	}

}
