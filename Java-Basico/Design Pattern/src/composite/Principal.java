package composite;

public class Principal {

    public static void main(String[] args) {
        // Vamos criar alguns desenvolvedores (as folhas)
        Desenvolvedor dev1 = new Desenvolvedor("João");
        Desenvolvedor dev2 = new Desenvolvedor("Maria");
        Desenvolvedor dev3 = new Desenvolvedor("Pedro");

        // Criando uma equipe de back-end (um composto)
        Equipe equipeBackEnd = new Equipe("Equipe Back-End");
        equipeBackEnd.adicionarMembro(dev1);
        equipeBackEnd.adicionarMembro(dev2);

        // Criando uma equipe de front-end (outro composto)
        Equipe equipeFrontEnd = new Equipe("Equipe Front-End");
        equipeFrontEnd.adicionarMembro(dev3);

        // Criando uma equipe geral de tecnologia (o composto principal)
        Equipe equipeTecnologia = new Equipe("Equipe de Tecnologia");
        equipeTecnologia.adicionarMembro(equipeBackEnd); // Adicionando uma equipe dentro de outra
        equipeTecnologia.adicionarMembro(equipeFrontEnd);

        // AQUI ESTÁ A MÁGICA: A gente exibe os detalhes de toda a hierarquia com uma única chamada
        System.out.println("Estrutura da empresa:");
        equipeTecnologia.exibirDetalhes(); // com uma única chamada, conseguimos percorrer toda a estrutura,
    }

}
