package mini_test;

public class test14_014 {
    public static void main(String[] args) {
        // 親クラスのインスタンス
        test14_011 vehicle = new test14_011();
        vehicle.start();
        vehicle.stop();

        // 子クラス1のインスタンス
        test14_012 car = new test14_012();
        car.start();
        car.accelerate();
        car.stop();

        // 子クラス2のインスタンス
        test14_013 bicycle = new test14_013();
        bicycle.start();
        bicycle.ringBell();
        bicycle.stop();
    }
}

