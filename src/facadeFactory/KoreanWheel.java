package facadeFactory;

public class KoreanWheel extends WheelInterface{
	public KoreanWheel(TireInterface tire) {
		super(tire);
	}

	@Override
	public void handleLeft(int degrees) {
		this.tire.changePosition("left", degrees);
		System.out.println("Current tire position: " + this.tire.position);
	}

	@Override
	public void handleRight(int degrees) {
		this.tire.changePosition("right", degrees);
		System.out.println("Current tire position: " + this.tire.position);
	}

	@Override
	public void honkHorn() {
		System.out.println("Bang Bang!");
	}
	
}
