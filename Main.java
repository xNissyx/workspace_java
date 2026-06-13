import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ControlStatement cs = new ControlStatement();
        cs.checkResult();
        cs.checkMonth();
        cs.checkLoop();
        cs.checkLoop2();
        cs.checkWhile();
        cs.checkDoWhile();

        Array ar = new Array();
        ar.printArray();
        ar.printLength();
        ar.printArrayLoop();

        User us = new User("みさと");
        // us.name = "にしたくみ";
        us.hello();
        //  static修飾子は インスタンスではなくクラスに直接属する ようにできる
        User.staticMethod();
        us.staticMethod();

        Dog dog = new Dog();
        dog.speak();
        Animal Animal = new Dog(); // DogインスタンスをAnimal型に代入
        Animal.speak(); // "ワン"と鳴く、つまりオーバーライドされたメソッドは実体のものが実行される（ポリモーフィズム）
        // Animal.run(); これはコンパイルエラーになる。
        // Dogクラスにrunメソッドは存在するが、コンパイル時にはAnimal型（クラス）の方をチェックしに行くからである。

        //  length
        int[] arr = {1, 2,3};
        System.out.println(arr.length);
        String name = "Takumi";
        System.out.println(name.length());

        //  == VS equals
        //  まず == の仕様から
        String str1 = "abc";
        String str2 = "abc";
        System.out.println(str1 == str2); // これは true となる。参照先は同じリテラルとなるから。

        String str3 = new String("abc");
        String str4 = new String("abc");
        System.out.println(str3 == str4);       // これは false となる。参照先は異なるオブジェクト（インスタンス）になるから。
        System.out.println(str3.equals(str4));  // これは true となる。内容比較だから

        ArrayList<String> list = new ArrayList<>();
        String[] names = {"田中", "鈴木", "西"};
        for (String n: names) {
            list.add(n);
        }
        for (String l: list) {
            System.out.println(l);
        }
    }
}