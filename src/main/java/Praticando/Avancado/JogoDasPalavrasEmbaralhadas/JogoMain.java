package Praticando.Avancado.JogoDasPalavrasEmbaralhadas;

import Praticando.Avancado.JogoDasPalavrasEmbaralhadas.Embaralhadores.Embaralhador;
import Praticando.Avancado.JogoDasPalavrasEmbaralhadas.Embaralhadores.FabricaEmbaralhadores;
import Praticando.Avancado.JogoDasPalavrasEmbaralhadas.MecanicasDoJogo.*;

import java.util.Scanner;

public class JogoMain {
    public static void main(String[] args) {
        Scanner opcao = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        int escolha;

        System.out.println("-------------------------------------------------------------");
        System.out.println("Bem-vindo ao Jogo das Palavras Embaralhadas!\n" +
                "As regras são simples: Algumas palavras serão apresentadas\n" +
                "de forma embaralhada e você precisa adivinhar qual é a palavra certa.");
        System.out.println("-------------------------------------------------------------");

        System.out.println("Escolha a dificuldade:\n" +
                "1- Fácil\n" +
                "2- Médio\n" +
                "3- Difícil\n" +
                "4- Hardcore");
        System.out.print("> ");

        escolha = opcao.nextInt();

        switch(escolha) {
            case 1: {
                FabricaMecanicaDoJogo.setMecanica(new Facil());
                break;
            }
            case 2: {
                FabricaMecanicaDoJogo.setMecanica(new Medio());
                break;
            }
            case 3: {
                FabricaMecanicaDoJogo.setMecanica(new Dificil());
                break;
            }
            case 4: {
                FabricaMecanicaDoJogo.setMecanica(new Hardcore());
                break;
            }
            default: {
                System.out.println("Opção inválida. Desligando programa.");
                System.exit(0);
            }
        }

        MecanicaDoJogo mecanica = FabricaMecanicaDoJogo.getMecanica();

        System.out.println("-------------------------------------------------------------");
        System.out.println("---------------------------INICIAR---------------------------");

        System.out.println(mecanica.getNomeEDescricao() + "\n");

        while(!mecanica.terminou()) {
            String palavra = mecanica.getPalavra();
            Embaralhador embaralhador = FabricaEmbaralhadores.embaralhadorAleatorio();
            String pEmbaralhada = embaralhador.embaralhar(palavra);

            System.out.println("Adivinhe a palavra: " + pEmbaralhada);
            System.out.print("> ");

            String resposta = scanner.nextLine().toLowerCase();
            System.out.println(mecanica.tentativa(palavra, resposta));
        }

        System.out.println(mecanica.getPontuacaoFinal());
    }
}
