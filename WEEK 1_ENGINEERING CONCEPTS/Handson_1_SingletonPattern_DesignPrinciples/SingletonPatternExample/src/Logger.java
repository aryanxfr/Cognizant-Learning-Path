public class Logger {
    private static Logger instance;//private static instance of the logger class
    private Logger(){}//private constructor of the logger class

    //thread safe method to create instance
    public static  synchronized Logger getInstance(){
        if(instance==null){
            instance=new Logger();
        }
        return instance;
    }
    public void log(String message){
        System.out.println("LOG: "+ message);
    }
}
