package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner digitar = new Scanner(System.in);

        int alunos,i=0,j=0,TAM;
        String nome;
        double[] notas = new double[2];
        double bUm=0.00,bDois=0.00,soma;

        System.out.println("Digite quantos Alunos vão ter suas medias:");
        TAM = digitar.nextInt();
        digitar.nextLine();

        String [] nomes = new String [TAM];

        if(TAM == 0){
            System.out.println("Nao existe aluno a ser calculado");
        }
        else {

            for(i=0; i<TAM; i++){

                System.out.println("Digites os nomes");
                nomes[i] = digitar.nextLine();
            }

            for(j=0; j<2.0; j++){

                System.out.println("Digite as notas dos dois bimestres do aluno "+ nomes[j]);
                System.out.println("Primeiro bimestre:");
                bUm = digitar.nextInt();
                System.out.println("Segundo bimestre:");
                bDois = digitar.nextInt();
                soma = (bUm+bDois)/2.00;
                notas[j] = soma;
                System.out.printf("A media = %.2f%n",notas[j]);

            }
        }
        digitar.close();
    }
}