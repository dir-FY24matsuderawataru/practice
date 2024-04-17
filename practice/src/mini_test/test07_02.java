package mini_test;

public class test07_02 {
    // フィールド
    private String name;
    private int age;
    private String gender;

    // コンストラクタ
    public test07_02(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // ゲッターとセッター
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // 情報を表示するメソッド
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}

