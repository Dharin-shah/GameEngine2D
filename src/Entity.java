/**
 * 
 */
import java.awt.Graphics2D;

/**
 * @author Dharin
 *
 */
public interface Entity {
	
	
	//public void onDraw(Graphics2D g2d);
	public boolean isMovable();
	public int getPosX();
	public int getPosY();
	public void setPosX(int posX);
	public void setPosY(int posY);
	public void draw(Graphics2D g2d);
	public int getWidth();
	public int getHeight();
	public void setWidth(int height);
	public void setHeight(int width);
}