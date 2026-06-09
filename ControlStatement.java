// クラスの中には、変数・メソッド・コンストラクタ、しか書けない。
//  if文は、メソッドの中に書く必要がある。
public class ControlStatement {
    public void checkResult() {
        int score = 75;

        if (score >= 60) {
            System.out.println("合格");
        } else {
            System.out.println("不合格");
        }
    }

    public void checkMonth() {
        int month = 2;

        switch (month) {
            case 1:
                System.out.println("1月");
                break;
            case 2:
                System.out.println("2月");
                break;
            case 3:
                System.out.println("3月");
                break;
            default:
                System.out.println("該当する月はありません");
        }
    }

    public void checkLoop() {
        //  for内のループ変数はforの中のみ
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        /*
        for (;;) {
            System.out.println("無限");
        } 
        */
    }

    public void checkLoop2() {
        // Pythonっぽいループ。すごく楽
        int[] scores = {20, 30, 60};

        for (int score : scores) {
            System.out.println(score);
        }
    }

    public void checkWhile() {
        int i = 0;

        while (i < 5) {
            System.out.println(i);
            i++;
        }

        System.out.println(i);
    }

    public void checkDoWhile() {
        int i = 5;

        do {
            System.out.println("B");
        } while (i > 5);
    }
}
