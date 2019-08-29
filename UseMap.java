package classExam001;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class UseMap {
    public static void main(String[] args) {


        HashMap<String, Integer> studentDetails = new HashMap<String, Integer>();

        studentDetails.put("sakib", 16);
        studentDetails.put("rk", 23);
        studentDetails.put("iftekar", 22);
        studentDetails.put("jabed",13);

        for (String i : studentDetails.keySet()) {
            System.out.println("name of the person: " + i + " age: " + studentDetails.get(i));
        }
        HashMap<String, List<String>> list = new HashMap<String, List<String>>();

        Iterator tr = studentDetails.entrySet().iterator();
        while (tr.hasNext()){
            System.out.println(tr.next());
        }


    }

}
