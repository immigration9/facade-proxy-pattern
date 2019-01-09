package facadeFactory;

public class KoreanAccelerator extends AcceleratorInterface {

	public KoreanAccelerator(TireInterface tire) {
		super(tire);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accelerate(String direction, int seconds) {
		// TODO Auto-generated method stub
		if (direction.compareTo("forward") == 0) {
			this.tire.speed += seconds;
		} else {
			this.tire.speed -= seconds;
		}
		System.out.println("Current tire speed: " + this.tire.speed);
	}
	
}
