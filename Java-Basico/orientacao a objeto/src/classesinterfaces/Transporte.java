package classesinterfaces;

// Classe de Interface: Transporte
public interface Transporte {

    // Aqui eu defini um contrato para qualquer coisa que possa ser transportada.
    // Os métodos serão implicitamente public abstract.

    void carregar(int peso); // algo que pode carregar peso
    void descarregar(int peso); // algo que pode descarregar peso
    void definirRota(String destino); // algo que pode ter uma rota definida
}