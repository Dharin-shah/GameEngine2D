import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

/* Single Threaded Game Engine */
/* Game Thread Class contains the reference to the Game instance to be updated (accessible across functions) */
public class GameThread extends JPanel implements Runnable {
	
	private static final long serialVersionUID = 1L;
	private final Game game;
	
	public GameThread(Game game){
		this.game=game;
		this.setFocusable(true);
	}
		
	@Override
	public void run() {
		while(true){
			try{
				if(game.getScreenFactory().getCurrentScreen()!=null)
					game.getScreenFactory().getCurrentScreen().onUpdate();
				Thread.sleep(3);
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	
	public void paint(Graphics g){
		super.paint(g);
		Graphics2D g2d=(Graphics2D)g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		if(game.getScreenFactory().getCurrentScreen()!=null)
			game.getScreenFactory().getCurrentScreen().onDraw(g2d);
		repaint();
	}

}