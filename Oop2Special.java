package classExam001;

import java.util.Scanner;

public abstract class Oop2Special {

        public void breakfastSpecials() {
            System.out.println("welcome to Indian Kitchen!! table for how many guest?");
            Scanner scanner = new Scanner(System.in);
            int count = scanner.nextInt();
            if (count <= 2) {
                System.out.println("we have couple special, which comes with one curry, and four naan");
            } else if (count <= 4) {
                System.out.println("we have family deal, which comes with two biryani and two curry");
            } else {
                System.out.println("10% for guest more then 4");
            }

        }
    public void lunchSpecials(){
        System.out.println("welcome to Indian Kitchen!! table for how many guest?");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        if (count<=2){
            System.out.println("we have couple special, which comes with one curry, and four naan");
        }if(count<=4){
            System.out.println("we have family deal, which comes with two biryani and two curry");
        }else{
            System.out.println("10% for guest more then 4");
        }
    }
    public void dinnerSpecials(){
        System.out.println("welcome to Indian Kitchen!! table for how many guest?");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        if (count<=2){
            System.out.println("we have couple special, which comes with one curry, and four naan");
        }if(count<=4){
            System.out.println("we have family deal, which comes with two biryani and two curry");
        }else{
            System.out.println("10% for guest more then 4");
        }
    }

    public abstract void dailySpecials();



}
