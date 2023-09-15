package Adapter;

public class SquareAdapter extends Cylinder{
    private Square square;

    private SquareAdapter(){}

    public SquareAdapter(Square square){
        this.square=square;
    }

    public Square getSquare() {
        return square;
    }

    public void setSquare(Square square) {
        this.square = square;
    }

    @Override
    public double getDiameter(){
        return square.getLength() * Math.sqrt(2);
    }
}
