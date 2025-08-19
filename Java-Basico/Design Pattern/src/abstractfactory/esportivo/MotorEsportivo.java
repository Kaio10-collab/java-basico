package abstractfactory.esportivo;

import abstractfactory.interfaces.Motor;

public class MotorEsportivo implements Motor {

    @Override
    public String getPotencia() {
        return "Motor Potente de 500cv";
    }
}
