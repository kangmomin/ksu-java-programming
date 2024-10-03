import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedOutputStreamEx {
    public static void main(String[] args) {
        try {
            BufferedOutputStream bufferOut = new java.io.BufferedOutputStream(System.out, 20);
            FileReader fileReader = new FileReader("C:\\files\\ksu-java-programming\\stream\\src\\test.txt");

            int c;
            while ((c = fileReader.read()) != -1) {
                bufferOut.write(c);
            }

            bufferOut.flush();

            bufferOut.close();
            fileReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
