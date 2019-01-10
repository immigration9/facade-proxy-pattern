package proxy.protectionProxy;

public class Client {
    public static void main (String[] args) {
        Internet internet = new ProxyInternet();
        try {
            internet.connectTo("immigration9.whatap.io");
            internet.connectTo("www.google.com");
            internet.connectTo("aaa.com");
            internet.connectTo("bbb.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
