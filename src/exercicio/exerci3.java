package exercicio;

import java.util.*;

public class exerci3 {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(256741038);
        arr.add(623958417);
        arr.add(467905213);
        arr.add(714532089);
        arr.add(938071625);
        miniMaxSum(arr);


    }

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        Long min =0L;
        Long max = 0L;

//        Integer menor = Integer.MAX_VALUE;
//        Integer maior = 0;
        Collections.sort(arr);
//        for(int j = 0; j< arr.size(); j++){
//
//
//            if(arr.get(j) < menor ){
//                menor = arr.get(j);
//
//            }else if (arr.get(j) > maior) {
//                maior = arr.get(j);
//            }
//        }
//
//        arr.set(0,menor);
//        arr.set(5,maior);

        for(int i =0; i< arr.size(); i++){
            if(i <= 3){
                min += arr.get(i);
            }
            if(i > 0){
                max += arr.get(i);
            }
        }
        System.out.print(min + " " + max);
}
}
