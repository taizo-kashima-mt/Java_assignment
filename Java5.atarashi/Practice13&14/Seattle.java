import seattle.SeattleEmployee;
import seattle.SeattleSSEmployee;

public class Seattle {
     public static void main(String[] args) {
        // SeattleSSEmployeeオブジェクトを作成
        SeattleSSEmployee sseEmployee1 = new SeattleSSEmployee();
        
        // 社員名を設定
        sseEmployee1.setEmpName("カシマ");
        
        // 社員名を取得して出力
        System.out.println("Employee Name: " + sseEmployee1.getEmpName());
        
        // 所属部署を取得して出力
        System.out.println("Department: " + sseEmployee1.getDept());

        SeattleEmployee Employee2 = new SeattleEmployee();
        
        // 社員名を設定
        Employee2.setEmpName("中城村");
        
        // 社員名を取得して出力
        System.out.println("Employee Name: " + Employee2.getEmpName());
        
        // 所属部署を取得して出力
        System.out.println("Department: " + Employee2.getDept());
    }
}

