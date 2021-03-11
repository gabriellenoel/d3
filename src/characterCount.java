import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class characterCount {

    public static int countOccurences(String data, char searched, int index) {
        if (index >= data.length()){
            return 0;
        }

        int count = data.charAt(index) == searched ? 1 : 0;
        return count + countOccurences(data, searched, index + 1);

    }

    public static void main(String[] args) {
        try {
            File myObj = new File("/Users/gabriellenoel/filename.txt");
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                Scanner getChar = new Scanner(System.in);
                System.out.println("Enter Character To Count: ");
                String character = getChar.nextLine();
                char c = character.charAt(0);

                int occur = countOccurences(data, c, 0);
                System.out.println(occur);
                }
                myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
