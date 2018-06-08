/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pacote1;

import java.util.Scanner;

/**
 *
 * @author 00261613
 */
public class Jogador {
    String nomeJogador ;
    int pontuaçaoJogador;
    
    public String getNomeJogador(){
        return nomeJogador;
    }
    
    private void setNomeJogador(){
        Scanner scanner = new Scanner(System.in);
        nomeJogador = scanner.nextLine();
    }
    
}


