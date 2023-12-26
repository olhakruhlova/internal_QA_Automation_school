package homeWorkLesson8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {

        try {
            readFile();
        } catch (FileNotFoundException ex) {
            System.out.println("Catch FileNotFoundException: " + ex.getMessage());
            // ex.printStackTrace();

            throw new IllegalArgumentException("Invalide file name");
        }

        System.out.println("Finish execution");
    }

    static InputStream readFile() throws FileNotFoundException {
        return new FileInputStream("some.txt");
    }
}



