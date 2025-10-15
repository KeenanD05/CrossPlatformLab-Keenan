import java.io.File;
import java.io.IOException;

public class FileManager {

    public boolean createFile(String filename) {
        File file = new File(filename);
        try {
            return file.createNewFile();
        } catch (IOException e) {
            System.out.println("Error creating file: " + e.getMessage());
            return false;
        }
    }

    public boolean deleteFile(String filename) {
        File file = new File(filename);
        return file.delete();
    }
}
