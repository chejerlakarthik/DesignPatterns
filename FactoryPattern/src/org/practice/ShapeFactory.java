/**
 * 
 */
package org.practice;

/**
 * @author Yashoda
 *
 */
public class ShapeFactory 
{
	public IShape getShape(String shapeType)
	{
		IShape shape = null;
		
		if(null == shapeType)
		{
			System.out.println("Shape type found NULL");
		}
		else if (shapeType.equalsIgnoreCase("CIRCLE"))
		{
			System.out.println("Circle");
			shape = new Circle();
		}
		else if (shapeType.equalsIgnoreCase("SQUARE"))
		{
			System.out.println("Square");
			shape = new Square();
		}
		else
		{
			System.err.println("Shape type found NULL");
			System.out.println("Defaulting to DefaultShape");
			shape = new DefaultShape();
		}
		return shape;
	}
}
