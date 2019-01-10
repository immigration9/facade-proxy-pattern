package proxy.imageProxy;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_test_big.png");

        image.display();
        System.out.println("==============================");

        image.display();
    }
}
