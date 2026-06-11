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
    }
}