package classesinterfaces;

// Classe de Interface: Ligavel
public interface Ligavel {

    // Define um contrato para qualquer coisa que possa ser ligada e desligada.
    void ligar();
    void desligar();

    // Vamos fornecer uma implementação default que pode ser usada ou sobrescrita.
    default void statusLigado() {
        System.out.println("Status: Aparelho ligado. Pronto para uso.");
    }
}
