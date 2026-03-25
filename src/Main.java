import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("--- おみくじアプリ起動 ---");
        System.out.print("名前を入力してください: ");
        String name = scanner.nextLine();
        System.out.print("年齢を教えてください: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // nextIntの後の改行対策（おまじない）

        // --- ここからループ開始 ---
        boolean keepRunning = true;

        while (keepRunning) {
            System.out.println("\n" + name + "さんの運勢を占います...");

            // 1. 年齢別おみくじ
            String[] results;
            if (age >= 20) {
                results = new String[]{"昇進の大吉", "副業の中吉", "飲み過ぎの凶"};
            } else {
                results = new String[]{"合格の大吉", "部活の中吉", "宿題忘れの凶"};
            }
            String result = results[random.nextInt(results.length)];

            // 2. ラッキーカラー（スタッフ getLuckyColor に任せる）
            String color = getLuckyColor(random);

            // 3. 結果発表（スタッフ showResult に任せる）
            showResult(name, result, color);

            // 4. 継続確認
            System.out.print("もう一度引きますか？ (y/n): ");
            String answer = scanner.nextLine();

            if (!answer.equals("y")) {
                keepRunning = false; // y以外ならループを抜ける
            }
        }
        // --- ループ終了 ---

        System.out.println("バイバイ！");
        scanner.close();
    }
    //省力文１：ラッキーカラーを決める
    public static String getLuckyColor(Random random) {
        String[] colors = {"赤", "青", "金", "緑"};
        return colors[random.nextInt(colors.length)];
    }

    //省力文2:結果を表示する人
    public static void showResult(String name, String result, String color){
        System.out.println("*********************");
        System.out.println(name+"さんの結果"+result);
        System.out.println("ラッキーカラー:"+color);
        System.out.println("*********************");
    }
}