package exercicio;

public class exercicio {
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


        for (int i = 1; i < 4; i++) {

            for (int j = 1; j < 5; j++) {

            for (int k = 0; k < matrizAux.length; k++ ){
                for (int h = 0; h < matrizAux[0].length; h++){
                    matrizAux[k][h] = matrizPrinc[i][j];
                }
                System.out.println(matrizAux[i][j]);
            }

            }
            System.out.println();
        }
    }


}

