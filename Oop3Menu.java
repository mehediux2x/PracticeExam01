package classExam001;

    public class Oop3Menu extends Oop2Special implements Oop1 {


        @Override
        public void appetizers() {

            System.out.println("shojib");

        }

        @Override
        public void lunch() {

        }

        @Override
        public void dinner() {

        }

        @Override
        public void takeout() {

        }

        @Override
        public void dailySpecials() {

        }

        public void breakfastSpecials(){
            super.breakfastSpecials();
            System.out.println("Thank you");
        }
    }
