import java.awt.Graphics2D;

public abstract class Screen {
	
	private final ScreenController screenController;
	
	public Screen(ScreenController screenController)
	{
		this.screenController=screenController;
	}
	
	public abstract void onCreate();
	
	public abstract void onUpdate();
	
	public abstract void onDraw(Graphics2D g2d);
	
	public ScreenController getScreenFactory(){
		return this.screenController;
	}
}
