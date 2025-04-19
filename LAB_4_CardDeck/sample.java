import java.io.FileReader;
import java.io.IOException;

public class sample {
    public class ExceptionHandlingEx2 {
        public static void main(String[] args) {
            try {
                //Pass the file path and file name to the FileReader constructor
                FileReader fr = new FileReader("c:\\test\\a.txt");
                char [] a = new char[50];
                fr.read(a); // reads the content to the array
                for(char c : a)
                    System.out.print(c); //prints the characters one by one
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        //creates the first exception and the control directly flows to the try
        try {
            //Pass the file path and file name to the FileReader constructor
            FileReader fr = new FileReader("c:\\Users\\c1510_01\\Desktop\\a.txt");
            //Create a BufferedReader from the FileReader object.
        } catch (IOException e) {
            e.printStackTrace();
        }
 
    }

    class ExceptionHandlingEx2
    {
        ic static void main(String[] args) {
            try {
                //Pass the file path and file name to the FileReader constructor
                FileReader fr = new FileReader("c:\\test\\a.txt");
                char [] a = new char[50];
                fr.read(a); // reads the content to the array
                for(char c : a)
                    System.out.print(c); //prints the characters one by one
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}