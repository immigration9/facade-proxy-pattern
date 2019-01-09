package facadeFactory;

public class CarFacade {
	AcceleratorInterface accelerator;
	WheelInterface wheel;
	
	public CarFacade(AcceleratorInterface accelerator, WheelInterface wheel) {
		super();
		this.accelerator = accelerator;
		this.wheel = wheel;
	}

	public void drive() {
		this.accelerator.accelerate("forward", 10);
		this.wheel.handleLeft(90);
		this.wheel.handleRight(45);
		this.accelerator.accelerate("forward", 30);
	}
	
	public void park() {
		this.accelerator.accelerate("backward", 5);
		this.wheel.handleRight(25);
		this.wheel.handleLeft(150);
		this.accelerator.accelerate("backward", 15);
	}
}
