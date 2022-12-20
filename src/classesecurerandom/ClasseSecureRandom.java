/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classesecurerandom;

import java.security.SecureRandom;

/**
 *
 * @author ph757
 */
public class ClasseSecureRandom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();

        int frequenciaLado1 = 0;//atribui quantas vezes sai o lado 1
        int frequenciaLado2 = 0;//atribui quantas vezes sai o lado 2
        int frequenciaLado3 = 0;//atribui quantas vezes sai o lado 3
        int frequenciaLado4 = 0;//atribui quantas vezes sai o lado 4
        int frequenciaLado5 = 0;//atribui quantas vezes sai o lado 5
        int frequenciaLado6 = 0;//atribui quantas vezes sai o lado 6

        //Soma 6.000.000 vezes o lançamento do dado
        for (int i = 1; i < 6000000; i++) {

            int face = 1 + random.nextInt(6); //Numero entre 1 e 6

            switch (face) {

                case 1:
                    ++frequenciaLado1;
                    break;
                case 2:
                    ++frequenciaLado2;
                    break;
                case 3:
                    ++frequenciaLado3;
                    break;
                case 4:
                    ++frequenciaLado4;
                    break;
                case 5:
                    ++frequenciaLado5;
                    break;
                case 6:
                    ++frequenciaLado6;
                    break;
            }
        }
        System.out.println("Lado   -   Frequencia");
        System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n ", frequenciaLado1, frequenciaLado2, frequenciaLado3, frequenciaLado4, frequenciaLado5, frequenciaLado6);
    }
}
