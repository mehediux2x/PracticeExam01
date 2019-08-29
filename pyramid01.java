package classExam001;

import java.io.IOException;

public class pyramid01 {
    public static void main(String[] args) {


        int num;

        for(int a=0; a<=10; a++) {
            num =0;
            // inner loop to handle number spaces
            for (int b = 10; b >= a ;b--) {
                System.out.print(" ");
            }
            //Inner loop to handle number of columns
            for (int c = 0; c <= a; c++) {
                num++;
                System.out.print(num+" ");
            }
            try {
                System.out.println(" ");
            } catch (Exception e) {
                System.out.println(" If try is wrong then print me catch");
                //System.out.println( " ");
            }
        }

    }
}
