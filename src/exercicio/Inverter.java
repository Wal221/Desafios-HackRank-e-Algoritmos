package exercicio;

import java.util.Scanner;

public class Inverter {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] num = {1,2,4,5};
        int valo =0;

        for (int i = 0; i < num.length; i++) {
          //  num[i] = ler.nextInt();
            valo = num[i] + 1;

            if (i+1 == num.length){
                break;
            }
            else if (valo == num[i+1]) {
                System.out.println("Esta na sequencia");
            }
            else {
                System.out.println("O numero que falta e " + valo);
            }

        }

    }
}