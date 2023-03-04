import java.util.Scanner;
//JOKENPÔ
public class Main {
  //Placar
  private static int placarJogador = 0;
  private static int placarComputador = 0;
 
  //Escolha
  // 1 Pedra - 2 Papel - 3 Tesoura
  private static int escolhaJogador;
  private static int escolhaComputador;
  //Metodo principal
  public static void main(String[] args) {
  
	//Definir a quantidade de rodadas
    int rodadas = 0;
    
    //inserir dados
    Scanner input = new Scanner(System.in);
    
    // Conversar com o jogador
    System.out.println("::: Seja bem-vindo ao Jokenpô :::");
    System.out.println("Insira a quantidade de rodadas: ");
    rodadas = input.nextInt();  //Colocando informação dentro da variavel
    for(int i = 1; i <= rodadas; ++i) {
      escolhaComputador = (int)(Math.random()*3)+1; //Escolhas do computador
      rotuloEscolhaJogador();
      escolhaJogador = input.nextInt();
      verificaResultado();
      exibePlacar();
    }
  }
  //Exibe o placar de cada rodada
  private static void exibePlacar() {
	  System.out.println("::: Placar :::");
	  System.out.println("Jogador: " + placarJogador);
	  System.out.println("Computador: " + placarComputador);
	  if(placarJogador > placarComputador) {
		  System.out.println("Usuario venceu o jogo!");
	  }else if(placarJogador < placarComputador) {
		  System.out.println("Computador venceu o jogo!");
	  }else {
		  System.out.println("Empate!");
	  }
  }
   //verifica o resultado de cada rodada
  private static void verificaResultado() {
    //Escolha do Computador diferente da escolha do jogador
    System.out.println(escolhaComputador);

    if(escolhaComputador != escolhaJogador) { 
    	
      //Caso 1 = Pedra perde do Papel
      if(escolhaComputador == 1 && escolhaJogador == 2) {
        System.out.println("Vitoria");
        placarJogador++;
      }else if(escolhaComputador == 2 && escolhaJogador == 1){
        System.out.println("Derrota");
        placarComputador++;
      }
      
      //Caso 2 = Papel perde da tesoura
      if(escolhaComputador == 2 && escolhaJogador == 3) {
        System.out.println("Vitoria");
        placarJogador++;
      }else if (escolhaComputador == 3 && escolhaJogador == 2){
        System.out.println("Derrota");
        placarComputador++;
      }
      
      //Case 3 = Tesoura perde da pedra
      if(escolhaComputador == 3 && escolhaJogador == 1) {
        System.out.println("Vitoria");
        placarJogador++;
      }else if(escolhaComputador == 1 && escolhaJogador == 3) {
        System.out.println("Derrota");
        placarComputador++;
      }
      
      //Case 4 = Empate
    } else {
        System.out.println("Empate");
        placarJogador++;
        placarComputador++;
    }
  }
  //Organiza as rodadas
  private static void rotuloEscolhaJogador() {
    System.out.println("Olá jogador, agora é sua vez");
    System.out.println("Digite");
    System.out.println("1 - Pedra");
    System.out.println("2 - Papel");
    System.out.println("3 - Tesoura");
    System.out.println("Escolha sua opção");
  }
  
}