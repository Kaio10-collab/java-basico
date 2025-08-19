package abstractfactory.luxo;

import abstractfactory.interfaces.Motor;

public class MotorDeLuxo implements Motor {
    @Override
    public String getPotencia() {
        return "Motor Silencioso de 300cv";
    }
}
