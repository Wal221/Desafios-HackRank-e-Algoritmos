package exercicio;

import java.util.ArrayList;
import java.util.List;

public class AvaliandoAlunos {
    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();

        a.add(73);
        a.add(67);
          a.add(38);
        a.add(33);

        System.out.println(  gradingStudents(a));
    }


    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> notaFinal = new ArrayList<>();
        Integer num ;
        for(int i =0; i< grades.size(); i++){
//            if(grades.get(i) < 40){
//                notaFinal.add(grades.get(i));
//                continue;
//            }
             if(grades.get(i) % 5 == 0){
               notaFinal.add(grades.get(i));

            }else {
                num = grades.get(i);

                if(num >= 38){

                while (num % 5 != 0){
                   num++;
                    if(num % 5 == 0){
                        if(num - grades.get(i) < 3)
                            notaFinal.add(num);
                        else{
                            notaFinal.add(grades.get(i));
                        }

                   }

               }
            }
                else{
                    notaFinal.add(grades.get(i));
                }
            }

        }
          return notaFinal;
    }
}
