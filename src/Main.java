import java.util.*;

import static java.util.Arrays.sort;

public class Main {
    public static void main(String[] args) {
            int[] number1 = new int[10];
            for (int i = 0; i < number1.length; i++) {
                number1[i] = new Random().nextInt(0, 2);
            }
            ArrayList<Integer> number2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            number2.add(new Random().nextInt(0,2));
        }

            LinkedList<Integer> number3 = new LinkedList<>();
            for (int i = 0; i < 10; i++) {
                number3.add(new Random().nextInt(0, 2));

            }

            sort(number1);
            sort(number2);
            sort(number3);
       }
         public static void sort(int [] array ){
            sort(array);
             System.out.println(Arrays.toString(array));
         }
         public static void sort(List<Integer> array){
        Collections.sort(array);
             System.out.println(array);
         }
         public static void sort(LinkedList<Integer>array){
         Collections.sort(array);
             System.out.println(array);
         }

}