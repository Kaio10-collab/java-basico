package chainofresponsability;


public class SuportePrincipal {

    /*
    O padrão Chain of Responsibility (Cadeia de Responsabilidade) é um padrão de design comportamental que permite que você passe requisições ao longo de uma cadeia de "handlers" (manipuladores).
    Cada handler na cadeia decide se processa a requisição ou a passa para o próximo handler na cadeia.
    Vou utilizar como exemplo um exemplo o sistema de level de um problema para o TI resolver. Basicamente vamos avaliar se um ticket aberto se encaixa em qual level de emergência.
    */

    public static void main(String[] args) {

        // Objetos
        LevelUmSuporte levelUm = new LevelUmSuporte();
        LevelDoisSuporte levelDois = new LevelDoisSuporte();
        LevelTresSuporte levelTres = new LevelTresSuporte();

        // devo definir a cadeia de responsabilidade
        levelUm.setNext(levelDois);
        levelDois.setNext(levelTres);

        // tickets criados para verificar a cadeia de responsabilidade
        Ticket ticket1 = new Ticket("Problema de login", 1);
        Ticket ticket2 = new Ticket("Erro no sistema", 2);
        Ticket ticket3 = new Ticket("Falha no servidor", 3);

        levelUm.handleRequest(ticket1); // aqui ele só vai procurar o level 1
        levelDois.handleRequest(ticket2); // aqui ele só vai procurar o level 2,
        levelTres.handleRequest(ticket3); // aqui ele só vai procurar o level 3
        levelUm.handleRequest(ticket2); // mas caso queria fazer um teste, coloca o levelUm e veja se ele acha a severidade 2, não vai achar, pois a cadeia passar até encontra o level igual a severidade.
    }
}