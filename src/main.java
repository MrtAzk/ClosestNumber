import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class main {
    public static void main(String[] args) {
        ArrayList<Integer> numbs =new ArrayList<>(Arrays.asList(1,20,30,55,15,5,80,45,56,85));
        Collections.sort(numbs);

        int minDiff = Integer.MAX_VALUE;
        int num1 = 0;
        int num2 = 0; // En yakın iki sayıyı saklamak için değişkenler

        for (int i = 0; i < numbs.size()-1; i++) {
            int diff = numbs.get(i+1)-numbs.get(i);

            if (diff<minDiff){
                minDiff=diff;
                num1=numbs.get(i);
                num2=numbs.get(i+1);
            }
        }
        System.out.println("En yakın iki eleman: " + num1 + " ve " + num2);
        System.out.println("Aralarındaki fark: " + minDiff);
    }
}
