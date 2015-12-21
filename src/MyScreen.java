import java.awt.Color;
import java.awt.Graphics2D;

public class MyScreen extends Screen {
	int x=0,y=0;
	
	public MyScreen(ScreenController screenController) {
		super(screenController);
	}

	@Override
	public void onCreate() {
		System.out.print("Creating...");
	}

	@Override
	public void onUpdate() {
		if(x>=600+64)
			x=-64;
		x++;
		if(y>=600+64)
			y=-64;
		y++;
		//y++;
	}

	@Override
	public void onDraw(Graphics2D g2d) {
		g2d.setColor(Color.black);
		g2d.fillRect(x, y, 20, 64);

	}
}