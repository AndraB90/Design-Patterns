package Builder;

public class HouseMania {
    public static void main(String[] args) {
        House house1=new House.HouseBuilder()
                .numberOfFloors(1)
                .numberOfBedrooms(3)
                .numberOfBathrooms(2)
                .squareFootage(78)
                .build();

        house1.print();

        System.out.println("===========================");

        House house2=new House.HouseBuilder()
                .numberOfFloors(3)
                .numberOfBedrooms(5)
                .numberOfBathrooms(4)
                .squareFootage(150)
                .build();

        house2.print();
    }
}
