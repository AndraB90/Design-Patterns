package Builder;

public class Computer {
    private int processor;
    private int ram;
    private int storage;
    private int graphicsCard;

    public Computer(int processor, int ram, int storage, int graphicsCard) {
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.graphicsCard = graphicsCard;
    }

    public int getProcessor() {
        return processor;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public int getGraphicsCard() {
        return graphicsCard;
    }

    public void print(){
        System.out.println("Processor: "+processor);
        System.out.println("RAM: "+ram);
        System.out.println("Storage: "+storage);
        System.out.println("Graphics Card: "+graphicsCard);
    }

    public static class ComputerBuilder{
        private int processor;
        private int ram;
        private int storage;
        private int graphicsCard;

        public Computer build(){
            return new Computer(this.processor, this.ram, this.storage, this.graphicsCard);
        }

        public ComputerBuilder processor(int processor){
            this.processor=processor;
            return this;
        }

        public ComputerBuilder ram(int ram){
            this.ram=ram;
            return this;
        }

        public ComputerBuilder storage(int storage){
            this.storage=storage;
            return this;
        }

        public ComputerBuilder graphicsCard(int graphicsCard){
            this.graphicsCard=graphicsCard;
            return this;
        }

    }
}
