


public class MyGame {

	public MyGame(){
		Game game=new Game(600,600,"Game");
		game.getScreenFactory().showScreen(new MyScreen(game.getScreenFactory()));
	}
	
	public static void main(String abc[]){
		new MyGame();
	}
}
