package facadeFactory;

public class Main {

	public static void main(String[] args) {
		KoreanTire kt = new KoreanTire();
		KoreanAccelerator ka = new KoreanAccelerator(kt);
		KoreanWheel kw = new KoreanWheel(kt);
		
		CarFacade koreanCar = new CarFacade(ka, kw);
		
		AmericanTire at = new AmericanTire();
		AmericanAccelerator aa = new AmericanAccelerator(at);
		AmericanWheel aw = new AmericanWheel(at);
		
		CarFacade americanCar = new CarFacade(aa, aw);
		
		koreanCar.drive();
		koreanCar.park();
		
		americanCar.drive();
		americanCar.park();
	}

}
