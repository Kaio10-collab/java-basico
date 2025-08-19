package abstractfactory.luxo;

import abstractfactory.interfaces.Carroceria;

public class CarroceriaDeLuxo implements Carroceria {

    @Override
    public String getTipo() {
        return "Carroceria de Luxo";
    }
}
