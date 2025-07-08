package proxy;
public class RealImage implements Image{
    private String fileName;
    public RealImage(String fileName){
        this.fileName=fileName;
        loadFromRemoteServer();
    }
    private void loadFromRemoteServer(){
        System.out.println("[Remote] Loading image: " +fileName+ " from server...");
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }
        System.out.println("[Remote] Image loaded: " +fileName);
    }
    @Override
    public void display() {
        System.out.println("Displaying: " + fileName);
    }
}
