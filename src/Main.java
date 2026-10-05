import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome: João Campos Ferreira");
        System.out.println("Professor: Brenno Pimenta da Costa");
        System.out.println("Faculdade: UNIFAN - Centro Universitário Alfredo Nasser");

        List<Questao> questoes = new ArrayList<>();

        int acertos = 0;


        questoes.add(new Questao("1) Qual destes jogadores conquistou mais títulos da Champions League?",
                "Cristiano Ronaldo",
                "Lionel Messi",
                "Nacho Fernández",
                "Neymar",
                'C'));

        questoes.add(new Questao("2) Qual seleção venceu a Copa do Mundo de 2002?",
                "Alemanha",
                "Brasil",
                "Argentina",
                "França",
                'B'));

        questoes.add(new Questao("3) Qual jogador é conhecido pelo apelido O Rei do Futebol?",
                "Zico",
                "Ronaldo",
                "Pelé",
                "Romário",
                'C'));

        questoes.add(new Questao("4) Quantos jogadores de cada equipe começam uma partida de futebol em campo?",
                "9",
                "10",
                "11",
                "12",
                'C'));

        questoes.add(new Questao("5) Em qual país foi realizada a Copa do Mundo de 2014?",
                "Brasil",
                "Alemanha",
                "Rússia",
                "África do Sul",
                'A'));

        questoes.add(new Questao("6) Qual competição reúne seleções de futebol da América do Sul?",
                "Eurocopa",
                "Copa América",
                "Liga dos Campeões",
                "Copa Africana",
                'B'));

        questoes.add(new Questao("7) Qual seleção venceu a Copa do Mundo de 2018?",
                "Croácia",
                "Brasil",
                "França",
                "Bélgica",
                'C'));

        questoes.add(new Questao("8) Qual jogador brasileiro ficou conhecido como O Fenômeno?",
                "Ronaldinho Gaúcho",
                "Ronaldo Nazário",
                "Kaká",
                "Rivaldo",
                'B'));

        questoes.add(new Questao("9) Qual clube brasileiro manda seus jogos no estádio Vila Belmiro?",
                "Santos",
                "Palmeiras",
                "Corinthians",
                "São Paulo",
                'A'));

        questoes.add(new Questao("10) Qual cartão representa a expulsão de um jogador?",
                "Azul",
                "Verde",
                "Amarelo",
                "Vermelho",
                'D'));

        questoes.add(new Questao("11) Qual clube possui mais títulos da Copa Libertadores da América?",
                "Independiente",
                "Boca Juniors",
                "River Plate",
                "Peñarol",
                'A'));

        questoes.add(new Questao("12) Qual jogador foi capitão da Argentina na conquista da Copa do Mundo de 2022?",
                "Ángel Di María",
                "Sergio Agüero",
                "Lionel Messi",
                "Javier Mascherano",
                'C'));

        questoes.add(new Questao("13) Qual clube brasileiro é conhecido pelo apelido Timão?",
                "Corinthians",
                "Cruzeiro",
                "Grêmio",
                "Internacional",
                'A'));

        questoes.add(new Questao("14) Em uma cobrança de pênalti, de onde a bola é chutada?",
                "Da linha do meio-campo",
                "Da área de escanteio",
                "Da marca do pênalti",
                "Da linha lateral",
                'C'));

        questoes.add(new Questao("15) Qual seleção é conhecida pelo apelido Canarinho?",
                "Portugal",
                "Espanha",
                "Argentina",
                "Brasil",
                'D'));

        for (Questao questao : questoes) {
            questao.exibirQuestao();
            System.out.println("Qual a sua resposta: ");
            char resposta = scanner.next().toUpperCase().charAt(0);


            if (questao.verificarRespostaCorreta(resposta))  {
                System.out.println("Resposta Correta!");
                acertos++;
            } else {
                System.out.println("Resposta errada");
            }
        }

        System.out.println("Foram " + acertos + " acertos");
        double porcentagem = ((acertos * 100.0) / questoes.size());
        System.out.printf("Porcentagem de acertos: %.2f%% %n", porcentagem);
        scanner.close();
        System.out.println("Obrigado por participar do quiz");

    }
}