package abstractfactory.popular;

import abstractfactory.interfaces.Carroceria;
import abstractfactory.interfaces.FabricaDeCarros;
import abstractfactory.interfaces.Motor;

public class FabricaDeCarrosPopulares implements FabricaDeCarros {

    @Override
    public Carroceria criarCarroceria() {
        return new CarroceriaPopular();
    }

    @Override
    public Motor criarMotor() {
        return new MotorPopular();
    }
}
