package facadeFactory;

public class AmericanTire extends TireInterface {
	@Override
	public void changePosition(String direction, int degrees) {
		if (direction.compareTo("right") == 0) {
			this.position -= degrees;
		} else {
			this.position += degrees;
		}
	}
}
