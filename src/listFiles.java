import java.io.File;
import java.util.Scanner;

public class listFiles {

    public static String getPath() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Directory Path: ");
        String directory = myObj.nextLine();
        return directory;
    }

    public static void main(String[] args) {

        File myObj = new File(getPath());
        String[] files = myObj.list();
        System.out.println("Here are the files in that directory: ");

        for (String file : files) {
            System.out.println(file);
        }
    }

}
