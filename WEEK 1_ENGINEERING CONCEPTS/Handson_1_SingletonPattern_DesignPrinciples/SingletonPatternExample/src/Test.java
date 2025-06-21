public class Test {
    public static void main(String[] args) {
        Logger A=Logger.getInstance();
        A.log("This is first logger");
        Logger B=Logger.getInstance();
        B.log("This is second logger");
        if(A==B){
            System.out.println("Only one instance can be created");
        }else{
            System.out.println("Multiple instances Created .. Singleton pattern broken");
        }

        //Printing the hash codes of the instances to verify that they are same
        System.out.println("Logger 1 hashcode " + A.hashCode());
        System.out.println("Logger 2 hashcode "+ B.hashCode());
    }
}
