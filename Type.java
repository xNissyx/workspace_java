// Javaは基本的にクラスが必要！
public class Type {
    public static void main(String[] args) {
        // プリミティブ型(boolean, char, byte, short, int, long, float, double)
        int a = 10;
        boolean c = true;
        char b = 'A';   //  Cと違い2バイトの文字型

        // 参照型=オブジェクト型
        String s = "Hello World";
        String str = null; //   Javaは'null'

        // 文字列の比較に == は使えない。equals()を使う。
        String s1 = "ABC";
        String s2 = "ABC";
        if (s1.equals(s2)) {
            System.out.println("Match!");
        }

        // 型変換(キャスト)
        int cast = (int) 3.14; // キャスト演算子で型変換

        System.out.println(a);
        System.out.println(c);
        System.out.println(b);
        System.out.println(s);
        System.out.println(cast);
        System.out.println(str);
    }
}