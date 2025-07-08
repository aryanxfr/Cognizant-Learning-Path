import proxy.Image;
import proxy.ProxyImage;

public class ProxyTest {
    public static void main(String[] args) {
        System.out.println(" Creating proxy for 'design.png' ");
        Image image1 = new ProxyImage("design.png");

        System.out.println("\n First call to display()");
        image1.display();

        System.out.println("\n Second call to display()");
        image1.display();

        System.out.println("\n Creating proxy for 'logo.jpg' ");
        Image image2 = new ProxyImage("logo.jpg");

        System.out.println("\n First call to display() ");
        image2.display();

        System.out.println("\n Re-displaying 'design.png' ");
        image1.display();
    }
}
