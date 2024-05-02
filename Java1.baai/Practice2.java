public class Practice2 {
    
    // 値を入力するメソッド
    public static void main(String[] args) {

        // コマンドライン引数を取得
        int value = Integer.parseInt(args[0]);
        
        // 入力値に応じたメッセージを出力
        switch (value) {
            case 1:
                System.out.println("もっとがんばりましょう");
                break;
            case 2:
                System.out.println("もうすこしがんばりましょう");
                break;
            case 3:
                System.out.println("さらにうえを目指しましょう");
                break;
            case 4:
                System.out.println("大変よくできました");
                break;
            case 5:
                System.out.println("大変優秀です");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("諦めたらそこで試合終了ですよ");
                break;
        }
    }
}
