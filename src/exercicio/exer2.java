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
        int[][] matrizAux = new int[3][3];
        int maioSoma = 0;

        for (int i = 0; i < matrizAux.length -1; i++) {

            for (int j = 0; j < matrizPrinc.length -1 ; j++) {

                if(matrizAux[i][j] +1 == 3){
                    break;

                }else {
                    matrizAux[i][j] = matrizPrinc[i][j];
                }

            }
        }

    }
}
