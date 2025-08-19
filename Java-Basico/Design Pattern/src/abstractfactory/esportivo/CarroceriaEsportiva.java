package abstractfactory.esportivo;

import abstractfactory.interfaces.Carroceria;

public class CarroceriaEsportiva implements Carroceria {

    @Override
    public String getTipo() {
        return "Carroceria Esportiva";
    }
}
