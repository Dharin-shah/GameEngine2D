
public abstract class AbstractEntity implements Entity {
 int posX,posY;
 int width,height;
 
	@Override
	public boolean isMovable() {
		// TODO Auto-generated method stub
		return false;
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

}
