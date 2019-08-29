package classExam001;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class UseArrayList {

        public static void main(String[] args) {

            ArrayList<String> list = new ArrayList<String>();

            list.add("roni");
            list.add("Raw");
            list.add("shell");
            list.add("arikon");
            list.add("rool");
            list.add("rock");

            LinkedList linkedList = new LinkedList();

            linkedList.add("jarfer");
            linkedList.add("goh");
            linkedList.add("jukker");
            linkedList.add("dowrin");
            linkedList.add("purno");


            System.out.println(linkedList.peek());

            list.remove(4);

            Iterator fh = list.iterator();
            while (fh.hasNext()) {
                System.out.println(fh.next());

            }

        }
}
