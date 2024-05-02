// Employee2クラス
class Employee2 {
    private String name;
    private static int employeeCount = 0;

    //コンストラクタ（引数なし時）
    public Employee2() {
        this.name = "匿名希望";
        //社員数を一人追加（インクリメント）
        employeeCount++;
    }

    // コンストラクタ（文字列が引数）
    public Employee2(String name) {
        // 文字列が11文字以上の場合は10文字までに切り捨てる
        if (name.length() > 10) {
            this.name = new StringBuilder(name.substring(0, 10)).toString();
        } else {
            this.name = name;
        }
        ////社員数を一人追加（インクリメント）
        employeeCount++;
    }

    // 名前を取得するメソッド
    public String getName() {
        //変数nameに値を返す
        return name;
    }

    // 社員数を取得するクラスメソッド
    public static int getEmployeeCount() {
        //変数employeeCountに値を返す
        return employeeCount;
    }
        
    // 名前を出力するメソッド
    public void printName() {
        System.out.println("私はシアトルコンサルティングの社員です。名前は" + this.name + "です。");
    }
    // 社員番号を出力するメソッド（インスタンスに非依存のためstatic）
    public static void printEmployeeCount() {
        System.out.println("社員は全部で" + employeeCount +"人です");
    }
   
    
}

public class Practice11 {
    public static void main(String[] args) {
        
        //Employee2クラスのインスタンス化(値なし)
        Employee2 employee1 = new Employee2();
        employee1.printName();
        //Employee2クラスのインスタンス化(値あり)
        Employee2 employee2 = new Employee2("John Doe");
        employee2.printName();

        // 社員数を取得する前には必ずインスタンスを生成する必要があるが、staticにすれば生成しなくても可？
        Employee2.printEmployeeCount(); 
    }
}

