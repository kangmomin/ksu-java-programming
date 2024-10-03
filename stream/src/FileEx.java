import java.io.File;

public class FileEx {
    public static void main(String[] args) {
        File file = new File("C:\\files\\ksu-java-programming\\stream\\src\\test.txt");
        System.out.print("file.getPath() = " + file.getPath() + " " + file.getParent());
        System.out.println(" " + file.getName());

        if (file.isFile()) {
            System.out.println(file.getPath() + "은 파일입니다.");
        } else if (file.isDirectory()) {
            System.out.println(file.getPath() + "은 디렉토리입니다.");
        }

        listDirectory(new File("C:\\files\\ksu-java-programming\\stream\\src"));

        File file2 = new File("C:\\files\\ksu-java-programming\\stream\\src\\fileTest");
        if (!file2.exists()) file2.mkdir();

        file2.renameTo(
                new File(
                        file2.getAbsoluteFile().toString().replace("fileTest", "file_test")
                )
        );

        listDirectory(file2);
    }

    public static void listDirectory(File dir) {
        System.out.println("-----" + dir.getPath() + "의 서브 리스트----");
        File[] subFiles = dir.listFiles();

        if (subFiles == null) return;
        for (File f : subFiles) {
            long lastModified = f.lastModified();

            System.out.print("\t파일 이름 = " + f.getName());
            System.out.print("\t파일 크기 = " + f.length());
            System.out.printf("\t최종 수정 시간 = %tb %td %ta %tT\n", lastModified, lastModified, lastModified, lastModified);
        }
    }
}
