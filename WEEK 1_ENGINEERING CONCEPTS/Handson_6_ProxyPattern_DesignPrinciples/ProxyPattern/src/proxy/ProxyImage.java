package proxy;
import java.util.HashMap;
import java.util.Map;
public class ProxyImage implements Image{
    private String fileName;
    private static final Map<String,RealImage> cache=new HashMap<>();

    public ProxyImage(String fileName) {
        this.fileName=fileName;
    }
    @Override
    public void display() {
        RealImage realImage=cache.get(fileName);
        if (realImage==null) {
            System.out.println("[Proxy] Image not found in cache. Creating new RealImage...");
            realImage=new RealImage(fileName);
            cache.put(fileName, realImage);
        } else {
            System.out.println("[Proxy] Image found in cache. Skipping remote load.");
        }
        realImage.display();
    }
}
