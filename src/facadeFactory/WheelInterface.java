package facadeFactory;

public abstract class WheelInterface {
	public TireInterface tire;
	public WheelInterface(TireInterface tire) {
		this.tire = tire;
	}
	
	public TireInterface getTire() {
		return this.tire;
	}
	
	public abstract void handleLeft(int degrees);
	public abstract void handleRight(int degrees);
	public abstract void honkHorn();
}
