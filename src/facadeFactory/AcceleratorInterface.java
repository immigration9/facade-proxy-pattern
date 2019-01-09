package facadeFactory;

public abstract class AcceleratorInterface {
	public TireInterface tire;
	
	public AcceleratorInterface(TireInterface tire) {
		this.tire = tire;
	}
	
	public abstract void accelerate(String direction, int seconds);
}
