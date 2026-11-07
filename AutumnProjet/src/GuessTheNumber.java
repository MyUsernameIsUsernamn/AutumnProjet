import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int rightanswer = random.nextInt(100);
        int att = 0;
        int ans;
        do {
            System.out.print("Введите число от 1 до 100: ");
            ans = scanner.nextInt();
            att++;
            if (ans < rightanswer) {
                System.out.println("Больше загаданного!");
            } else if (ans > rightanswer) {
                System.out.println("Меньше загаданного!");
            } else {
                System.out.println("Угадал!");
            }
        } while (ans != rightanswer);
        System.out.println("Кол-во попыток: " + att);
    }
}