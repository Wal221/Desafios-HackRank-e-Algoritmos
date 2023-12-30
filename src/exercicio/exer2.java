package exercicio;

public class exer2 {
    public static void main(String[] args) {
        int[][] matrizPrinc = {
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };

        int maioSoma = 0;

       for (int i=0; i< 4; i++){
           for (int j =0 ; j < 4 ; j++){
               int top = matrizPrinc[i][j] + matrizPrinc [i][j+1] + matrizPrinc[i][j+2];
               int center = matrizPrinc[i +1][j+1];
               int left = matrizPrinc[i +2][j] + matrizPrinc[i+2][j+1] + matrizPrinc[i+2][j+2];

               int sum = top + center + left;
           }
       }

    }
}
