package abstractfactory.popular;

import abstractfactory.interfaces.Carroceria;

public class CarroceriaPopular implements Carroceria {

    @Override
    public String getTipo() {
        return "Carroceria de uso diário";
    }
}
