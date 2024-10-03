import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx {
    public static void main(String[] args) {
        byte b[] = new byte[6];

        try {
            FileInputStream input = new FileInputStream("C:\\files\\ksu-java-programming\\stream\\src\\test2.txt");

            int n = 0, c;
            while ((c = input.read()) != -1) {
                b[n] = (byte) c;
                n++;
            }

            input.close();
            for (Byte d : b) {
                System.out.print(c + " ");
            }
            System.out.println();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
