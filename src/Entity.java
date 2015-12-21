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
}