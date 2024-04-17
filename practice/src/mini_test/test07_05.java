package mini_test;

public class test07_05 {

    // フィールド
    private int studentId;
    private String name;
    private int grade;
    
    // コンストラクタ
    public test07_05(int studentId, String name, int grade) {
        this.studentId = studentId;
        this.name = name;
        this.grade = grade;
    }
    
    // ゲッターとセッター
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) { 
        this.studentId = studentId;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    
    // 成績を表示するメソッド
    public void displayGrade() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
    }
    
    // 成績を更新するメソッド
    public void updateGrade(int newGrade) {
        this.grade = newGrade;
    }
}