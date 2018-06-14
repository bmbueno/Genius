/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pacote1;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 00261613
 */
public class HelloWorld {
    public static void main(String[] args){
        
        Jogo jogo = new Jogo();
        Scanner scanner = new Scanner(System.in); 
        int i = 0;
        int j;
       
        while(i < 10){
            jogo.sequenciaBotoesGerada.add(jogo.sorteiaProxBotao());
            System.out.println(jogo.sequenciaBotoesGerada);  
            
            jogo.numeroDeBotoesGerados++;

            
            for(j = 0; j < jogo.numeroDeBotoesGerados; j++){ 
                jogo.sequenciaBotoesClicados.add(scanner.nextLine());
            }
            i++;
        
        }
            
    }
}


