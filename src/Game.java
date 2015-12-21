import javax.swing.JFrame;
/* Game Class (has a Window) */
/* Inherit this Class to create a Game */
public class Game {

	private final JFrame window = new JFrame();
	private GameThread gameThread;
	private ScreenController screenController;

	/* Window Configuration */
	public Game(int windowX,int windowY,String title){
		setGameWindow(windowX,windowY,title);
		screenController=new ScreenController(this);
		gameThread=new GameThread(this);
		window.add(gameThread);
		new Thread(gameThread).start();
	}

	private void setGameWindow(int windowX,int windowY,String title) {
		window.setSize(windowX, windowY);
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setFocusable(true);
		window.setLocationRelativeTo(null);
		window.setTitle(title);
		window.setVisible(true);
	}

	/* return this game's Screen Controller */
	public ScreenController getScreenController(){
		return this.screenController;
	}

	/* return this game's Window Frame */
	public JFrame getJFrame(){
		return window;
	}

}
