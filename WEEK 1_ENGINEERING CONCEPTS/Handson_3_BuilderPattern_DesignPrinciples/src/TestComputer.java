public class TestComputer {
    public static void main(String[] args) {
        Computer basic=new Computer.Builder().setCpu("Intel i7")
                .setRam("8GB")
                .setStorage("512GB SSD")
                .build();
        System.out.println("Basic Computer: " + basic);

        Computer gaming = new Computer.Builder().setCpu("Ryzen 7")
                .setRam("32GB")
                .setStorage("2TB SSD")
                .setGraphicsCard("NVIDIA RTX 4090")
                .build();

        System.out.println("Gaming Computer: " + gaming);
    }
}
