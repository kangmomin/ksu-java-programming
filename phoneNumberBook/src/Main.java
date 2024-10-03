import java.io.*;
import java.util.*;

public class Main {

    private static final String FILE_NAME = "phonebook.txt";
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        while (true) {
            System.out.println("1. 전화번호부 저장");
            System.out.println("2. 전화번호부 출력");
            System.out.println("3. 전화번호 검색");
            System.out.println("4. 종료");
            System.out.print("메뉴를 선택하세요: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    savePhonebook();
                    break;
                case 2:
                    displayPhonebook();
                    break;
                case 3:
                    searchPhonebook();
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }

    // 전화번호부 저장 메소드
    private static void savePhonebook() throws IOException {
        System.out.println("이름과 전화번호를 입력하세요 (종료하려면 'exit' 입력)");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            while (true) {
                System.out.print("이름: ");
                String name = scanner.nextLine();
                if (name.equalsIgnoreCase("exit")) {
                    break;
                }
                System.out.print("전화번호: ");
                String phoneNumber = scanner.nextLine();
                writer.write(name + "," + phoneNumber);
                writer.newLine();
            }
        }
    }

    // 전화번호부 출력 메소드
    private static void displayPhonebook() throws IOException {
        System.out.println("전화번호부 전체 출력:");
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                System.out.println("이름: " + parts[0] + ", 전화번호: " + parts[1]);
            }
        }
    }

    // 전화번호부 검색 메소드
    private static void searchPhonebook() throws IOException {
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
