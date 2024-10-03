import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            String filePath = "C:\\files\\ksu-java-programming\\stream\\src\\test.txt";
            FileReader fin = new FileReader(filePath);
            FileInputStream fileInputStream = new FileInputStream(filePath);
            InputStreamReader in = new InputStreamReader(fileInputStream);
            
            int c = 0;
            StringBuilder result = new StringBuilder();

            System.out.println("in.getEncoding() = " + in.getEncoding());
            while ((c = in.read()) != -1) {
                result.append((char) c);
            }
            in.close();
            fin.close();

            System.out.println("result = " + result);
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}