    // 任意のクラスを作成
    class OverLoadClass {
        // 引数を持たないsameNameメソッド
        void sameName() {
            System.out.println("引数を持たないsameNameメソッドです");
        }
    
        // int型の引数を1つもつsameNameメソッド
        void sameName(int arg1) {
            System.out.println("int型の引数を1つもつsameNameメソッドです。引数:" + arg1);
        }
    
        // int型の引数を2つもつsameNameメソッド
        void sameName(int arg1, int arg2) {
            System.out.println("int型の引数を2つもつsameNameメソッドです。引数:" + arg1 + ", " + arg2);
        }
    
        // String型の引数を1つもつsameNameメソッド
        void sameName(String arg1) {
            System.out.println("String型の引数を1つもつsameNameメソッドです。引数: " + arg1);
        }
    
        // String型の引数を2つもつsameNameメソッド
        void sameName(String arg1, String arg2) {
            System.out.println("String型の引数を2つもつsameNameメソッドです。引数: " + arg1 + ", " + arg2);
        }
    }
    
    public class Practice9 {
        public static void main(String[] args) {
            OverLoadClass myObj = new OverLoadClass();
            myObj.sameName();
            myObj.sameName(10);
            myObj.sameName(20, 30);
            myObj.sameName("Hello");
            myObj.sameName("Hello", "World");
  
        }

    }
