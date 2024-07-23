package uniqueExceptionHandling;
import java.io.File;
import java.io.IOException;

public class MultiCatchBlockExample {
    public static void main(String[] args) {
        try {
            processFile("example.txt");
        } catch (IOException | IllegalArgumentException ex) {
            System.out.println("Exception encountered: " + ex.getMessage());
        }
    }

    public static void processFile(String fileName) throws IOException, IllegalArgumentException {
        File file = new File(fileName);
        if (!file.exists()) {
            throw new IOException("File not found: " + fileName);
        }
        if (fileName.isEmpty()) {
            throw new IllegalArgumentException("File name cannot be empty");
        }
        System.out.println("File processed successfully: " + fileName);
    }
}