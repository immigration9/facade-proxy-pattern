package facadeFactory;

public abstract class TireInterface {
	public int position = 0;
	public int speed = 0;
	
	public abstract void changePosition(String direction, int degrees);
}
