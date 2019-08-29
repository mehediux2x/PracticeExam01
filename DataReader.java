package classExam001;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DataReader {
        public static String dataReaderHW(String filePath) {

            BufferedReader buffer = null;
            FileReader fuffer = null;
            String s="";


            try {
                fuffer = new FileReader(filePath);
                buffer = new BufferedReader(fuffer);
                while ((s=buffer.readLine())!=null){
                    System.out.println(s);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                System.out.println("IF you don't found any file Then print me this line");

            } catch (IOException e) {
                e.printStackTrace();
            }

            return s;


        }

        public static void main(String[] args) {

            String n = DataReader.dataReaderHW("C:\\Users\\mehedi\\IdeaProjects\\discussion\\src\\classExam001\\CustomerName.txt");

            System.out.println(n);

            ArrayList<String> StudentList = new ArrayList<String>();

            StudentList.add(n);

            for (String i : StudentList){
                System.out.println(i);
            }
        }

    }

