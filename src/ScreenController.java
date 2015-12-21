
public class ScreenController {

	public final Game game;
	public Screen screen;
	
	public ScreenController(Game game)
	{
		this.game=game;
	}
	
	public void showScreen(Screen screen)
	{
		this.screen=screen;
		this.screen.onCreate();
	}
	
	public Screen getCurrentScreen()
	{
		return screen;
	}
}
