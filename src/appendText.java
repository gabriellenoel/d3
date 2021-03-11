import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class appendText {

    public static void main(String[] args) {
        try {
            File file = new File("/Users/gabriellenoel/filename.txt");
            FileWriter myWriter = new FileWriter(file, true);
            myWriter.write(" " + "I am writing to this file!");
            System.out.println("Append complete.");
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


}
