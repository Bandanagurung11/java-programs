import java.io.*;

public class FileCopy {

    public static void main(String[] args) {
        try {
            // Open input file for reading
            FileInputStream inputFile = new FileInputStream("file1.txt");
            
            // Open output file for writing
            FileOutputStream outputFile = new FileOutputStream("abc .txt");
            
            // Read data from input file and write it to output file
            int data;
            while ((data = inputFile.read()) != -1) {
                outputFile.write(data);
            }
            
            // Close files
            inputFile.close();
            outputFile.close();
            
            System.out.println("Data copied successfully.");
            
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

}