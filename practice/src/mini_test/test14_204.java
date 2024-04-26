package mini_test;

//メインクラス
public class test14_204 {
 public static void main(String[] args) {
     // Animalクラスのインスタンスを作成
     test14_201 genericAnimal = new test14_201();
     // AnimalクラスのmakeSoundメソッドを呼び出し
     genericAnimal.makeSound();

     // Dogクラスのインスタンスを作成
     test14_202 myDog = new test14_202();
     // DogクラスでオーバーライドされたmakeSoundメソッドを呼び出し
     myDog.makeSound();

     // Catクラスのインスタンスを作成
     test14_203 myCat = new test14_203();
     // CatクラスでオーバーライドされたmakeSoundメソッドを呼び出し
     myCat.makeSound();
 }
}
