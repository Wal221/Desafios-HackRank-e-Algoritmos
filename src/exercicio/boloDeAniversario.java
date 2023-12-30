package exercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class boloDeAniversario {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();


        System.out.println(birthdayCakeCandles(lista));


    }


    public static int birthdayCakeCandles(List<Integer> candles) {


        Integer quantVela = 0;
        Integer maior = 0;
        //por estar ordenado sempre o maior esta na ultimia posição
        Collections.sort(candles);

        //metodo usado para encontra o maior
        maior = candles.get(candles.size() -1);

        //depois de armazena o maior acontence a interação no codigo para encontra algum elemento igual
        for(int i=0; i < candles.size(); i++){

            if(maior == candles.get(i)){
                quantVela++;
            }

        }

      return quantVela;

    }
}
