package Step2;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadTwo
{
    public static void main(String[] args)

            /**
             *  try {
             *             Scanner fileIn = new Scanner(new File("Step2/input.txt"));
             *
             *             while (fileIn.hasNext())
             *             {
             *                 // Reads the entire line as a string
             *                 String lineIn = fileIn.nextLine();
             *                 // Split the line into a String array
             *                 String[] input = lineIn.split(",");
             *                 int sum = 0;
             *                 for (int i = 0; i < input.length; i ++) {
             *                     sum += Integer.parseInt(input[i]);
             *                 }
             *                 System.out.println(sum);
             *             }
             *         }
             *         catch (IOException e) {
             *             System.out.println("File not found");
             *         }
             * */
    {

        try {
            Scanner scanner = new Scanner(new File("/Users/asan/Desktop/Projects/FileIOJava/Step2/input.txt"));
            String[] str = null;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                str = line.split(",");

            int result = 0;
            for (int i = 0; i < str.length; i++) {
                result += Integer.parseInt(str[i]);
            }
            System.out.println(result);
        }
        }
        catch (FileNotFoundException e){
            System.out.println("File not found "+e.getMessage());
        }

    }
}