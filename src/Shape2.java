
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;


public class Shape2 extends Shape implements Drawable{
	static int w=20;
	static int l=40;
	public Shape2(){
	}
	public Shape2(Color c, int x, int y) {
		super(c, x, y);
		setWidthRedius(w);
		setHeightRedius(l);
	}
	@Override
	public void drawShape(Graphics g) {
		g.setColor(getColor());
		g.fillRect(this.getPostionX()-getWidthRadius(),this.getPostionY()-getHeightRadius() ,this.getWidthRadius()*2 ,this.getHeightRadius()*2);	
	}
}
