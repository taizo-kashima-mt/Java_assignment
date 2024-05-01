import java.util.Scanner;

public class Main {
    
    //値を入力するメソッド
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("整数値を入力してください（1〜10）: ");

        int value = scanner.nextInt();
        if (value < 5) {
            System.out.println("《メッセージ》5未満の整数" + value + "が入力されました。");
        } else if (value == 5) {
            System.out.println("《メッセージ》5が入力されました。");
        } else {
            System.out.println("《メッセージ》6以上の整数" + value + "が入力されました。");
        }
    }
}