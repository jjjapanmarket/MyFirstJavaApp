import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("名前を入力してください!:");
        String name = scanner.nextLine();

        String[] results = {"大吉", "中吉", "小吉"};
        int index = new Random().nextInt(results.length);

        System.out.println("*************************:" );
        System.out.println(name + "さんの運勢は " + results[index] + " です！");
        System.out.println("*************************:" );
        scanner.close();
    }
}