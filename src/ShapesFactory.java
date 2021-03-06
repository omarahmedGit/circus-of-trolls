
import java.awt.Color;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;


public class ShapesFactory {
	private static Color[] color = {Color.RED,Color.BLACK,Color.GREEN,Color.BLUE};
	private static ArrayList<Class> shapeType = new ArrayList<Class>();
	public ShapesFactory() {
//		shapeType.add(Shape2.class);
//		shapeType.add(Shape1.class);
//		shapeType.add(Shape1.class);
//		shapeType.add(Shape1.class);
		ShapesLoader.makeshapesLoader();
		ArrayList<Class> arr=ShapesLoader.loadClasses();
		for (int i = 0; i < arr.size(); i++) {
			shapeType.add(arr.get(i));
		}
		
	}
	
	public int getClassListLength() {return shapeType.size();}
	
	public static void addShapeType(Class shape)
	{
		shapeType.add(shape);
		System.out.println("tttttttttttttttttttttttttt"+shapeType.size());
	}
	
	public Shape getShape(){
		int x = (int)(Math.random()*(getClassListLength()));
		int y = (int)(Math.random()*(color.length-1));
		try {
			Shape o = (Shape)shapeType.get(x).getConstructor(Color.class, int.class, int.class).newInstance(color[y],0,0);
			return  o;
		} catch (InstantiationException | IllegalAccessException
				| IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException e) {
		}
		
		return new Shape(color[y], 0,0);
	}
	public static int getColorSize() {return color.length;}

}
