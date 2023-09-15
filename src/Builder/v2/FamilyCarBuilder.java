package Builder.v2;


import Builder.CarType;
import Builder.Engine;
import Builder.Transmission;

public class FamilyCarBuilder implements ICarBuilder{
    private int doorsNumber;
    private CarType carType;
    private Transmission transmission;
    private Engine engine;

    @Override
    public void setDoorsNumber(int doorsNumber) {
        this.doorsNumber = doorsNumber;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setCarType(CarType type) {
        this.carType = type;
    }

    public FamilyCar build(){
        return new FamilyCar(this.doorsNumber, this.carType, this.transmission, this.engine);
    }
}
