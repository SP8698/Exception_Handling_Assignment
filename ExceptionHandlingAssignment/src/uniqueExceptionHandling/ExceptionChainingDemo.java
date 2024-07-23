package uniqueExceptionHandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Custom exception class
class FileProcessingException extends Exception {
    public FileProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
}

public class ExceptionChainingDemo {

    public static void main(String[] args) {
        try {
            processFile("nonexistentfile.txt");
        } catch (FileProcessingException e) {
            System.out.println("Custom exception caught: " + e.getMessage());
            System.out.println("Original cause: " + e.getCause());
        }
    }

    public static void processFile(String fileName) throws FileProcessingException {
        try {
            Scanner scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            throw new FileProcessingException("Error processing file: " + fileName, e);
        }
    }
}
