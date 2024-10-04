import java.io.*;
import java.util.Scanner;

class Phonebook {
    private static final String FILE_NAME = "G:\\files\\ksu-java-programming\\phoneNumberBook\\src\\phonebook.txt";
    private static final Scanner scanner = new Scanner(System.in);

    public void save() throws IOException {
        System.out.println("[이름 / 전화번호] 형식으로 입력하세요 (종료하려면 'exit' 입력)");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            while (true) {
                System.out.print("이름 / 전화번호:");

                String phoneInfo = scanner.nextLine();
                if (phoneInfo.equalsIgnoreCase("exit")) break;

                String[] raw = phoneInfo
                        .replaceAll(" ", "")
                        .split("/");

                writer.write(raw[0] + "," + raw[1]);
                writer.newLine();
            }
        }
    }

    public void display() throws IOException {
        System.out.println("전화번호부 전체 출력:");
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                System.out.println("이름: " + parts[0] + ", 전화번호: " + parts[1]);
            }
        }
    }

    public void searchByName() throws IOException {
        System.out.print("검색할 이름을 입력하세요: ");
        String searchName = scanner.nextLine();
        boolean found = false;
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts[0].equalsIgnoreCase(searchName)) {
                    System.out.println("이름: " + parts[0] + ", 전화번호: " + parts[1]);
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("해당 이름이 전화번호부에 없습니다.");
        }
    }
}