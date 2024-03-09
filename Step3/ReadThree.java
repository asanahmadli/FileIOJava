package Step3;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class ReadThree
{
    public static void main(String[] args)
    //to avoid override content on the file
            // PrintWriter pw = new PrintWriter(new FileWriter(filename, true));
    {
        try {
            PrintWriter printWriter = new PrintWriter("/Users/asan/Desktop/Projects/FileIOJava/Step3/output2.txt");
            printWriter.println("Hello world");
            printWriter.close();
            Scanner scanner = new Scanner(new File("/Users/asan/Desktop/Projects/FileIOJava/Step3/output2.txt"));
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }


        }
        catch (FileNotFoundException e){
            System.out.println("File not found "+e.getMessage());
        }

    }
}
/**In Java, when you use FileWriter, by default, it overwrites the content of the file if it already exists.
 *  However, if you want to append content to the existing file instead of overwriting it, you can pass true as a second argument to the FileWriter constructor.
 *  This tells the FileWriter to append the new content to the end of the file rather than overwriting it.
 *  import java.io.FileWriter;
 * import java.io.IOException;
 *
 * public class AppendToFileExample {
 *     public static void main(String[] args) {
 *         String filename = "example.txt";
 *         String contentToAppend = "This is the new content to be appended.";
 *
 *         try {
 *             // Create a FileWriter with append mode set to true
 *             FileWriter fw = new FileWriter(filename, true);
 *             // Write the content to the file
 *             fw.write(contentToAppend);
 *             // Close the FileWriter
 *             fw.close();
 *             System.out.println("Content appended to the file successfully.");
 *         } catch (IOException e) {
 *             System.err.println("Error writing to the file: " + e.getMessage());
 *         }
 *     }
 * }*/

