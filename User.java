//  フィールド→コンストラクタ→メソッドの順で書くことが多い（エラーにはならない）
public class User {
    String name;

    User(String name) {
        this.name = name;
    }

    void hello() {
        System.out.println("こんにちは" + name);
    }

    static void staticMethod() {
        System.out.println("static修飾子");
    }
}