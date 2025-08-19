package abstractfactory.popular;

import abstractfactory.interfaces.Motor;

public class MotorPopular implements Motor {

    @Override
    public String getPotencia() {
        return "Motor econômico de 100cv";
    }
}
