package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      //Local de declaração de variáveis
        Scanner scanner = new Scanner(System.in);
        int menu = 0;



        //Seção do layout do menu
        System.out.println( "------------------------------------------------");
        System.out.println("|            programa de resolução              |");
        System.out.println("|                de cálculos                    |");
        System.out.println( "------------------------------------------------");
        System.out.println();
        System.out.println("Bem vindo ao programa de resolução de cálculos");
        System.out.println("Escolha a opção desejada");
        System.out.println("1 - Conversor de moedas");
        System.out.println("2 - Conversor de medidas");
        System.out.println("3 - Conversor de temperatura");
        //Lê a entrada do teclado do usuário
        System.out.print("Opção:");
        menu = scanner.nextInt();

        //Execução do menu no nível correto

        switch(menu){
            case 1:
                System.out.println("Entrou no conversão de moeda");
                break;
            case 2:
                System.out.println("Entrou no conversão de medida");
                break;
            case 3:
                System.out.println("Entrou no conversão de temperatura");
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }

        return;

        //Execução do menu no nível complicado
        //if(menu == 1){
            //System.out.println("Entrou no conversor de moeda");
        //}else{
          //if(menu == 2) {
              //System.out.println("Entrou no conversor de medidas");
          //}else{
              //if(menu == 3) {
                  //System.out.println("Entrou no conversor de temperatura");
              //}else{
               //System.out.println("Opção inválida");
              //}
              //}
          //}
        }
}

