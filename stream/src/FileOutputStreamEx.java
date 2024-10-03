import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {
    public static void main(String[] args) {
        Byte[] b = {7, 51, 3, 4, -1, 24};
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\files\\ksu-java-programming\\stream\\src\\test2.txt");
            for (Byte aByte : b) {
                fileOutputStream.write(aByte);
            }

            fileOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println();
    }
}
