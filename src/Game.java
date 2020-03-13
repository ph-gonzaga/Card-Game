import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Game {
	

    public static String X = "ARQUEIRO";  // VARIAVEL CONSTANTE. APLICADA SOBRE A ESCOLHA DO AVATAR!

    public static String Y = "DRAGAO"; // ---------------------------------------------------------


	public static void main(String[] args) { 
		String NomeJ1 = null, NomeJ2 = null;
        String jogador1 = null, jogador2 = null, ganhador = null;
		String[] banner = {"SIM", "NÃO"}; 
		String[] opcoes = {"X", "Y"}; // VARIAVEL DE ESCOLHA DOS AVATARES
		String QuemJoga; // VARIAVEL QUE RECEBE O VALOR DE QUAL JOGADOR VAI JOGAR
		int sortearJogador;
		int retornoDadoJ1, retornoDadoJ2;
		boolean menu = true;

		Random rand = new Random(); 

		
		 while (menu == true) {
             menu = false;
             String painel = (String) JOptionPane.showInputDialog(null, "BEM VINDO AO CARD GAME BATALHA!\n ACEITA ESSE DESAFIO?", " CARD GAME! ", JOptionPane.QUESTION_MESSAGE, null, banner, banner);

             if (painel.equals("SIM")) { //ATRIBUI SE VOCE IRÃO OU NAO COMÃ‡AR O JOGO
             
                 NomeJ1 = JOptionPane.showInputDialog("JOGADOR 1 \n DIGITE SEU NOME: ");
                 NomeJ1 = NomeJ1.toUpperCase();

                 while (NomeJ1.equals("") || NomeJ1.equals(" ") || NomeJ1.equals("   ")) {
                     JOptionPane.showMessageDialog(null, "NOME INVALIDO!");
                     NomeJ1 = JOptionPane.showInputDialog("JOGADOR 1 \n DIGITE SEU NOME: ", " ");
                     NomeJ1 = NomeJ1.toUpperCase();
                 }

                 NomeJ2 = JOptionPane.showInputDialog("JOGADOR 2 \n DIGITE SEU NOME: ", " ");
                 NomeJ2 = NomeJ2.toUpperCase();

                 while (NomeJ2.equals("") || NomeJ2.equals(" ") || NomeJ2.equals("   ")) {
                     JOptionPane.showMessageDialog(null, "NOME INVALIDO!");
                     NomeJ2 = JOptionPane.showInputDialog("JOGADOR 2 \n DIGITE SEU NOME: ", " ");
                     NomeJ2 = NomeJ2.toUpperCase();
                 }

                 String jogador = (String) JOptionPane.showInputDialog(null, NomeJ1 + " JOGADOR 1 \n ESCOLHA SEU AVATAR \n E DESCUBRA QUEM SERA!", " ", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes);

                 if (jogador.equals("X")) {  // ATRIBUI O AVATAR QUE FOI ESCOLHIDO PELO JOGADOR
                     jogador1 = X;
                     jogador2 = Y;
                 } else {
                     jogador1 = Y;
                     jogador2 = X;
                 }
                 
                 JOptionPane.showMessageDialog(null, NomeJ1 + " JOGADOR 1 \n SEU AVATAR É O " + jogador1);
                 JOptionPane.showMessageDialog(null, NomeJ2 + " JOGADOR 2 \n SEU AVATAR É O " + jogador2);
             }

             if (painel.equals("NÃO")) {
                 JOptionPane.showMessageDialog(null, "VOCE NÃO DEMONSTROU BRAVURA PARA SEGUIR SUA JORNADA! \n TENTE OUTRA VEZ!");
                 menu = true;
             }

             sortearJogador = rand.nextInt(2)+1;
             
             if (sortearJogador == 1) {
            	 QuemJoga = jogador1; 
             }else {
            	 QuemJoga = jogador2; 
             }
             
             if (QuemJoga.equals(jogador1)) {
             JOptionPane.showMessageDialog(null, jogador1 + " FOI SORTEADO PARA INICIAR A PARTIDA \n " +  NomeJ1 + " SUA VEZ DE JOGAR O DADO. ");
             retornoDadoJ1 = rand.nextInt(10)+1;
             JOptionPane.showMessageDialog(null, jogador1 + " ATACOU COM " + retornoDadoJ1);
             JOptionPane.showMessageDialog(null, jogador2 + "\n SUA VEZ DE JOGAR O DADO. ");
             retornoDadoJ2 = rand.nextInt(10)+1;
             JOptionPane.showMessageDialog(null, jogador2 + " DEFENDEU COM " + retornoDadoJ2);
             
             }else {
            	 JOptionPane.showMessageDialog(null, NomeJ2 + " FOI SORTEADO PARA INICIAR A PARTIDA \n " + jogador2 + " SUA VEZ DE JOGAR O DADO. ");
                 retornoDadoJ2 = rand.nextInt(10)+1;
                 JOptionPane.showMessageDialog(null, jogador2 +  "ATACOU COM " + retornoDadoJ2);
                 JOptionPane.showMessageDialog(null, jogador1 + "\n SUA VEZ DE JOGAR O DADO. ");
                 retornoDadoJ1 = rand.nextInt(10)+1;
                 JOptionPane.showMessageDialog(null, jogador1 + " DEFENDEU COM " + retornoDadoJ1);
             }
             
             if (retornoDadoJ1 > retornoDadoJ2) {
            	 ganhador = jogador1;
             }else {
            	 ganhador = jogador2;
             }
             
             if (ganhador.equals(jogador1)) {
            	 JOptionPane.showMessageDialog(null, NomeJ1 + " SEU AVATAR " + jogador1 + " GANHOU A PARTIDA ");
             }else {
            	 JOptionPane.showMessageDialog(null, NomeJ2 + " SEU AVATAR " + jogador2 + " GANHOU A PARTIDA ");
             }
             
		 }
             
	}
}
