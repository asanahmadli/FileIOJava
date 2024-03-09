package Step4;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadFour
{
    /**
     * Yes, you can look at the other 
     * examples in this lab to build your solution here.
     */
        public static void main(String[] args)
        {
            // Print out a running total of all the
            // values in the input file.
            try{
                File file = new File("/Users/asan/Desktop/Projects/FileIOJava/Step4/input.txt");
                Scanner scanner = new Scanner(file);
                int sum = 0;
                while (scanner.hasNextLine()){
                    sum+=Integer.parseInt(scanner.nextLine());
                    System.out.println("Running total = "+sum);
                }

            }catch (FileNotFoundException e){
                System.out.println("File not found "+e.getMessage());
            }
        }
}