import java.io.*;

public class Main {
    public static void main(String[] args) {
        File src = new File("C:\\files\\ksu-java-programming\\BlockBinaryCopyEX\\src\\images.jpg");
        File dest = new File("C:\\files\\ksu-java-programming\\BlockBinaryCopyEX\\src\\images_copy.jpg");

        try {
            FileInputStream input = new FileInputStream(src);
            FileOutputStream output = new FileOutputStream(dest);
            byte[] buf = new byte[1024 * 10];

            while (true) {
                int n = input.read(buf);
                output.write(buf, 0, n);

                if (n < buf.length) break;
            }

            input.close();
            output.close();

            System.out.println(src.getPath()+"를 " + dest.getPath() + " 위치로 복사하였습니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}