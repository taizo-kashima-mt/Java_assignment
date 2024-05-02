public class Practice1 {
    
    public static void main(String[] args) {
        System.out.print("整数値を入力してください（1〜10）: ");

        int value = new java.util.Scanner(System.in).nextInt();
        if (value < 5) {
            System.out.println("《メッセージ》5未満の整数" + value + "が入力されました。");
        } else if (value == 5) {
            System.out.println("《メッセージ》5が入力されました。");
        } else {
            System.out.println("《メッセージ》6以上の整数" + value + "が入力されました。");
        }
    }
}
