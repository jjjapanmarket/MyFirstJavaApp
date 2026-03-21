import java.util.Random;

void main() {
    // 1. おみくじのリストを作る
    String[] results = {"超大吉","大吉", "中吉", "小吉", "吉", "凶"};

    // 2. ランダムな数字（0〜4）を選ぶ
    int randomIndex = new Random().nextInt(results.length);

    // 3. 結果を取り出す
    String result = results[randomIndex];

    // 4. 画面に表示する
    IO.println("----- おみくじを引くよ！ -----");
    IO.println("結果は... 【 " + result + " 】 です！");

    // 結果に合わせて一言コメント
    if (result.equals("大吉")) {
        IO.println("最高の一日になりますね！");
    }
}