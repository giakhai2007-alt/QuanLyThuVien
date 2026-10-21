import java.util.Scanner;

public class BTT2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập họ và tên của bạn: ");
        String hoTen = scanner.nextLine();
        
        System.out.println("Họ và tên đã nhập: " + hoTen);
        
        scanner.close();
    }
}