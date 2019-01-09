package facadeFactory;

public class KoreanTire extends TireInterface {
	@Override
	public void changePosition(String direction, int degrees) {
		if (direction.compareTo("left") == 0) {
			this.position -= degrees;
		} else {
			this.position += degrees;
		}
	}
}
