package Builder.v2;

import Builder.CarType;
import Builder.Engine;
import Builder.Transmission;


public interface ICarBuilder {
    void setDoorsNumber(int doorsNumber);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setCarType(CarType type);
}
