package seattle;

// SeattleEmployeeクラスを継承したSeattleSSEmployeeクラスの定義
public class SeattleSSEmployee extends SeattleEmployee {

    @Override
    public String getDept() {
        return "SI事業部";
    }

    /* 
     * 実行処理してみる
     */
    // SeattleSSEmployeeクラスの独自の属性やメソッドを定義する
    public static void main(String[] args) {
        // SeattleSSEmployeeオブジェクトを作成
        SeattleSSEmployee sseEmployee = new SeattleSSEmployee();
        
        // 社員名を設定
        sseEmployee.setEmpName("カシマ");
        
        // 社員名を取得して出力
        System.out.println("Employee Name: " + sseEmployee.getEmpName());
        
        // 所属部署を取得して出力
        System.out.println("Department: " + sseEmployee.getDept());
    }
}

