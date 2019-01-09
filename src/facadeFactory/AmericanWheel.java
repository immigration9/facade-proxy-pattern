package facadeFactory;

public class AmericanWheel extends WheelInterface {
	public AmericanWheel(TireInterface tire) {
		super(tire);
	}

	@Override
	public void handleLeft(int degrees) {
		this.tire.changePosition("right", degrees);
		System.out.println("Current tire position: " + this.tire.position);
	}

	@Override
	public void handleRight(int degrees) {
		this.tire.changePosition("left", degrees);
		System.out.println("Current tire position: " + this.tire.position);
	}

	@Override
	public void honkHorn() {
		System.out.println("Honk Honk!");
	}
	
}
