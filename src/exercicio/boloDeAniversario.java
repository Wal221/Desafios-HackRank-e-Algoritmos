package exercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class boloDeAniversario {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();


        System.out.println(birthdayCakeCandles(lista,3));


    }


    public static int birthdayCakeCandles(List<Integer> candles   , Integer valor) {
        // Write your code here

        Integer quantVela = 0;
        Integer maior = 0;
        Collections.sort(candles);

        Scanner ler = new Scanner(System.in);


        for(int j = 0; j < valor; j++){
            candles.add(ler.nextInt());
        }

        maior = candles.get(candles.size() -1);
//        for(int j = 0; j < candles.size() ; j++){
//
//            if (candles.get(j) > maior) {
//                maior = candles.get(j);
//            }
//        }

        for(int i=0; i< candles.size(); i++){

            if(maior == candles.get(i)){
                quantVela++;
            }else{
                continue;
            }

        }

      return quantVela;

    }
}
