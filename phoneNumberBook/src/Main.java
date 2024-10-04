import java.io.IOException;
import java.util.Scanner;

// 2024664001 강모민
public class Main {

    public static void main(String[] args) throws IOException {
        Phonebook phoneNumberBook = new Phonebook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== 전화번호부 메뉴 =====");
            System.out.println("1. 전화번호부 저장");
            System.out.println("2. 전화번호부 출력");
            System.out.println("3. 전화번호 검색");
            System.out.println("4. 종료");
            System.out.print("메뉴를 선택하세요: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    phoneNumberBook.save();
                    break;
                case 2:
                    phoneNumberBook.display();
                    break;
                case 3:
                    phoneNumberBook.searchByName();
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }
}