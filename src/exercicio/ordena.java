package exercicio;

import java.util.Arrays;

public class ordena {
    public static void main(String[] args) {
        int vetor [] = {2,1,7,10,9,3,0};

        System.out.println(Arrays.toString( ordena(vetor)));

    }

    public static int[] ordena(int[] vetor){
        int maior =0;
        int menor=0;
        int aux= 0;
        for(int i =0 ; i < vetor.length; i++ ){

            for(int j = i+1; j < vetor.length; j++){

                if(vetor[i] > vetor[j]) {
                    menor = vetor[j];
                    maior = vetor[i];
                    aux = j;

                    vetor[i] = menor;
                    vetor[aux]= maior;
                }


            }


        }
        return vetor;
    }
}
