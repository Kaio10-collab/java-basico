package abstractfactory.esportivo;

import abstractfactory.interfaces.Carroceria;
import abstractfactory.interfaces.FabricaDeCarros;
import abstractfactory.interfaces.Motor;

public class FabricaCarrosEsportivos implements FabricaDeCarros {

    @Override
    public Carroceria criarCarroceria() {
        return new CarroceriaEsportiva();
    }

    @Override
    public Motor criarMotor() {
        return new MotorEsportivo();
    }
}
