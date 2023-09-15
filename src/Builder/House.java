package Builder;

public class House {
    private int numberOfFloors;
    private int numberOfBedrooms;
    private int numberOfBathRooms;
    private int squareFootage;

    public House(int numberOfFloors, int numberOfBedrooms, int numberOfBathRooms, int squareFootage) {
        this.numberOfFloors = numberOfFloors;
        this.numberOfBedrooms = numberOfBedrooms;
        this.numberOfBathRooms=numberOfBathRooms;
        this.squareFootage = squareFootage;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public int getNumberOfBathRooms() {
        return numberOfBathRooms;
    }

    public int getSquareFootage() {
        return squareFootage;
    }

    public void print(){
        System.out.println("Number of Floors: "+numberOfFloors);
        System.out.println("Number of Bedrooms: "+numberOfBedrooms);
        System.out.println("Number of Bathrooms: "+numberOfBathRooms);
        System.out.println("Square Footage: "+squareFootage);
    }

    public static class HouseBuilder{
        private int numberOfFloors;
        private int numberOfBedrooms;
        private int numberOfBathRooms;
        private int squareFootage;

        public House build(){
            return new House(this.numberOfFloors, this.numberOfBedrooms, this.numberOfBathRooms, this.squareFootage);
        }

        public HouseBuilder numberOfFloors(int numberOfFloors){
            this.numberOfFloors=numberOfFloors;
            return this;
        }

        public HouseBuilder numberOfBedrooms(int numberOfBedrooms){
            this.numberOfBedrooms=numberOfBedrooms;
            return this;
        }

        public HouseBuilder numberOfBathrooms(int numberOfBathRooms){
            this.numberOfBathRooms=numberOfBathRooms;
            return this;
        }

        public HouseBuilder squareFootage(int squareFootage){
            this.squareFootage=squareFootage;
            return this;
        }

    }
}
