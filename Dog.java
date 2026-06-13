public class Dog extends Animal {
    
    @Override   //  コンパイル時に本当にオーバーライドしてるかチェックしてくれる。アノテーションという
    void speak() {
        System.out.println("ワン");
    }

    void run() {
        
    }
}
