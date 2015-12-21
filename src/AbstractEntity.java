
public abstract class AbstractEntity implements Entity {
 private int posX,posY,width,height;
 private boolean movable;
 
 	public AbstractEntity(int posX,int posY,int width,int height,boolean movable){
	 this.posX = posX;
	 this.posY = posY;
	 this.width = width;
	 this.height = height;
	 this.movable = movable;
 	}
 	
	@Override
	public boolean isMovable() {
		// TODO Auto-generated method stub
		return movable;
	}

	@Override
	public int getPosX() {
		// TODO Auto-generated method stub
		return posX;
	}

	@Override
	public int getPosY() {
		// TODO Auto-generated method stub
		return posY;
	}

	@Override
	public void setPosX(int posX) {
		// TODO Auto-generated method stub
		this.posX = posX;
	}

	@Override
	public void setPosY(int posY) {
		// TODO Auto-generated method stub
		this.posY = posY;
	}
	
	@Override
	public int getWidth(){
		return this.width;
	}
	
	@Override
	public int getHeight(){
		return this.height;		
	}
	@Override
	public void setWidth(int width){
		this.width = width;
	}
	
	@Override
	public void setHeight(int height){
		this.height = height;
	}

}
