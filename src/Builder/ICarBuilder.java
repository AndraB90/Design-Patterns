package Builder;


public interface ICarBuilder {
    void setDoorsNumber(int doorsNumber);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setCarType(CarType type);
}
