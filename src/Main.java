import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) { // ← ここからプログラム開始
        Scanner scanner = new Scanner(System.in);

        // 1. 名前と年齢の入力
        System.out.println("名前を入力してください!:");
        String name = scanner.nextLine();

        System.out.println("年齢を教えてください:");
        int age = scanner.nextInt();
        System.out.println(name + "さんは" + age + "歳なんですね！");

        // 2. 年齢によるリアクション
        if (age >= 20) {
            System.out.println("おっ、成人ですね！今度飲みましょう！");
        } else {
            System.out.println("残念、まだ僕とは飲めません（ ;  ; ）");
        }

        // 3. おみくじの結果
        String[] results = {"大吉", "中吉", "小吉"};
        int index = new Random().nextInt(results.length);

        // 4. ラッキーカラーの計算（ここをmainの中に移動）
        String[] colors = {"情熱の赤", "冷静な青", "金運のゴールド", "癒しの緑"};
        int colorIndex = new Random().nextInt(colors.length);
        String luckyColor = colors[colorIndex];

        // 5. 結果表示
        System.out.println("*************************:");
        System.out.println(name + "さんの運勢は " + results[index] + " です！");
        System.out.println("今日のラッキーカラーは...「" + luckyColor + "」です！");
        System.out.println("*************************:");

        scanner.close();
    } // ← mainの終わり
} // ← クラスの終わり