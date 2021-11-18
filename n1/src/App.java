/*
    Projeto N1 - MODULO DEV WEB III
    Algoritmo do jogo pedra, papel e tesoura:
    Nomes: Matheus Reinheimer e Lucas Lisboa.
*/
import java.util.Scanner; // Importando o Java Ultil Scanner para pegar a digitação do usuario;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in); // Criando um Scanner "ler";
        int v1,v2; // Criando duas váriais do tipo int;

        // Explicando o jogo pelo terminal;
        System.out.println(" ");
        System.out.println("!!! JOGO DE PEDRA PAPEL TESOURA !!!");
        System.out.println("===================================");
        System.out.println(" ");
        System.out.println("Tutorial:");
        System.out.println(" ");
        System.out.println("No seu teclado, jogue com as teclas 1,2 e 3. Sendo: ");
        System.out.println(" ");
		System.out.println("Para Pedra digite 1; ");
		System.out.println("Para Papel digite 2;  ");
		System.out.println("Para Tesoura digite 3; ");
        System.out.println(" ");
        System.out.println("===================================");
        System.out.println(" ");
		

        System.out.println("Escolha sua opção... "); // Escolha do jogador; 

        v1 = ler.nextInt(); // Utilizando o Scanner "ler" para a digitação do usuario ser amazenado na varial int "v1";

        // Utilizando Swich case para opções de escolha do jogador(Podeia ser feito no If/Else tbm);
        switch (v1){
			case 1: 
				System.out.println("Você selecionou PEDRA"); 
                break;
            case 2: 
				System.out.println("Você selecionou PAPEL");
                break;
            case 3: 
				System.out.println("Você selecionou TESOURA");
			    break;
            default:
                System.out.println("Esta opção não existe");
                break;

        }
        // Vez do computador jogar mostrando no terminal;
        System.out.println(" ");
        System.out.println("Computador... ");
        System.out.println(" ");
        
        // Sistema para aleatoriazar a escolha do computador utilizando o random
        v2 = (int)(Math.random()*3 + 1);
        ler.close();

        switch (v2){
			case 1: 
				System.out.println("Seleciou PEDRA");
                break;
            case 2: 
				System.out.println("Selecionou PAPEL");
                break;
            case 3: 
				System.out.println("Selecionou TESOURA");
			    break;

        }
        // Sistema com if/else para descobrir se o jogador venceu ou não;
        if (v1 == v2){
            System.out.println("EMPATE");
        } else {
            if (v1 == 1 && v2 == 3) {
                System.out.println("O jogador venceu");
            } else if (v1 == 2 && v2 == 1){
                System.out.println("O jogador venceu");
            } else if (v1 == 3 && v2 == 2){
                System.out.println("O jogador venceu");
            } else {
                System.out.println("O computador venceu");
            }
        }
    }
}
// FIM DO ALGARITMO.