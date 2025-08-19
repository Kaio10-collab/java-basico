package abstractfactory.interfaces;
// A nossa fábrica abstrata (o "contrato"da fábrica)
public interface FabricaDeCarros {
    Carroceria criarCarroceria();
    Motor criarMotor();
}
