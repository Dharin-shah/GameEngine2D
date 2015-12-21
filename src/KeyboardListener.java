import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/* Keyboard Controller Class */
public class KeyboardListener implements KeyListener {

	private boolean keys[] = new boolean[26];
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		keys[arg0.getKeyCode()]=true;
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		keys[arg0.getKeyCode()]=false;
	}

	@Override
	public void keyTyped(KeyEvent arg0) {

	}
	
	public boolean isKeyPressed(int key){
		return keys[key];
	}
	
	public boolean isKeyReleased(int key){
		return !keys[key];
	}

}
