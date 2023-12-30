package exercicio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class escadaria {
    public static void main(String[] args) {

        int n =5;

        List<String> lista = new ArrayList<>();

        for(int i =1 ; i <= n ; i++){
            lista.add(" ".repeat(n-i) + "#".repeat(i));

        }

       for(String degra: lista){
           System.out.println(degra);
       }



    }


    public static void escada(int n){
        List<String> lista = new ArrayList<>();

        for(int i =0 ; i <= n ; i++){
        lista.add("#".repeat(i));
            System.out.print(lista);
        }

        System.out.println();
    }
}
