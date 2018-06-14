package Pacote1;

//import java.util.Scanner;

import java.util.ArrayList;
import java.util.Random;


/**
 *
 * @author 00261613
 */
public class Jogo {
    
    int nivelJogo;
    String estadoJogo;
    int pontuaçaoJogador;
    Boolean perdeuJogo;
    ArrayList<String> sequenciaBotoesGerada;
    ArrayList<String> sequenciaBotoesClicados;
    int numeroDeBotoesGerados = 0;

    public Jogo() {
        this.sequenciaBotoesGerada = new ArrayList();
        this.sequenciaBotoesClicados = new ArrayList();
    }
    
    private void iniciarJogo(){
                                                // chama interface de jogo
    }
    private void continuarJogo(){
                                                // chama interface de jogo, com dados pré estabelecidos 
    }    
    public void configurarJogo(){
        
    }
    private void sairJogo(){
        
    }
    public String sorteiaProxBotao(){
        
        String proxBotaoÉ = null;
        
        Random gerarNumero = new Random();
        
        switch(gerarNumero.nextInt(4)){
            case 0:
                proxBotaoÉ = "Verde";
                break;
            case 1:
                proxBotaoÉ = "Azul";
                break;
            case 2:
                proxBotaoÉ = "Amarelo";
                break;
            case 3:
                proxBotaoÉ = "Vermelho";
                break;
        }
        return proxBotaoÉ;
   }
    
    public Boolean verificaAcertoBotao(String BotaoGerado, String BotaoClicado){
        Boolean acertou;
        acertou = BotaoGerado.equals(BotaoClicado);
        return acertou; 
    }
    
    private void setPontuaçaoJogador(){
        
    }
    private void pausaJogo(){
        
    }
    
}







/**
 * 
 * bool perdeuJogo; 
  
 iniciarJogo()
 continuarJogo()
 configurarJogo()
 sairJogo()
 
 sorteiaProxBotao ()
 verificaAcerto ()
 setpontuaçaoJogador()
 pausaJogo () 

 */