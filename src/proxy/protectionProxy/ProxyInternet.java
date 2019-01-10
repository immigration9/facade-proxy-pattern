package proxy.protectionProxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {
    private Internet internet = new RealInternet();
    private static List<String> bannedSites;

    static {
        bannedSites = new ArrayList<String>();
        bannedSites.add("aaa.com");
        bannedSites.add("bbb.com");
        bannedSites.add("ccc.com");
        bannedSites.add("ddd.com");
        bannedSites.add("eee.com");
    }

    @Override
    public void connectTo(String hostname) throws Exception {
        if (bannedSites.contains(hostname.toLowerCase())) {
            throw new Exception("Access Denied");
        }
        internet.connectTo(hostname);
    }
}
