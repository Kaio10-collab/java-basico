package abstractfactory.luxo;

import abstractfactory.interfaces.Carroceria;
import abstractfactory.interfaces.FabricaDeCarros;
import abstractfactory.interfaces.Motor;

public class FabricaCarrosDeLuxo implements FabricaDeCarros {
    @Override
    public Carroceria criarCarroceria() {
        return new CarroceriaDeLuxo();
    }

    @Override
    public Motor criarMotor() {
        return new MotorDeLuxo();
    }
}
