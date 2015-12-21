
public class MyGame {

	public MyGame(){
		Game game=new Game(600,600,"Game");
		game.getScreenController().showScreen(new MyScreen(game.getScreenController()));
	}
	
	public static void main(String abc[]){
		new MyGame();
	}
}
