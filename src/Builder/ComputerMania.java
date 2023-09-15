package Builder;

public class ComputerMania {
    public static void main(String[] args) {
        Computer computer1=new Computer.ComputerBuilder()
                .processor(5)
                .ram(8)
                .storage(512)
                .graphicsCard(10)
                .build();

        computer1.print();

        System.out.println("=============================");

        Computer computer2=new Computer.ComputerBuilder()
                .processor(4)
                .ram(16)
                .storage(250)
                .graphicsCard(5)
                .build();

        computer2.print();


    }
}
