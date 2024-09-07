/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject3
        
import static java.time.Clock.system;
import static java.time.InstantSource.system;
import java.util.Scanner;
import java.util.scanner;
/**
 *
 * @author Admin
 */
public class Mavenproject3 {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner (System.in);
       //enrada de dados// 
       int valor;
       int pdesconto;
       int vdesconto;
       int pjuros;
       int vjuros;
       
       //processamento//
       valor = 1000;
       vdesconto = (int) (valor * 0.9);
       vjuros = (int) (valor *1.1);
      
       //entrada de dados manual//
       System.out.println("Nomedaloja.com"); //nomee da loja// 
       System.out.println("Digite o valor da compra"); // mostrar na tela//
       valor = leia.nextlnt(); // fazer leitura do valor//
       System.out.println ("Digite a porcentagem de desconto");
       pdesconto = leia.nextlnt(); //Fazer leitura do desconto//
       System.out.println("Digite a porcentagem de Juros");
       pjuros = leia.nextInt(); //Fazer a leitura de desconto//
       
       vdesconto = valor * pdesconto; //Caluculo do de sconto//
       vjuros = valor * pjuros; //Calculo de juros//
    }
}
