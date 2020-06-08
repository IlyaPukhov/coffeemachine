import java.awt.*;
import java.awt.image.BufferedImage;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws java.lang.Exception {

        System.out.println("Кофе-машина");

        //ввод данных
        int moneyAmount;
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите сумму: ");
            moneyAmount = scanner.nextInt();
        } catch (Exception e) {
            moneyAmount = 0;
        }

        //объявление массивов
        int[] drinkPrices = {150, 80, 20, 50};
        String[] drinkNames = {"капучино", "эспрессо", "воду", "молоко"};

        boolean canBuyAnything = false;

        //вывод данных
        for (int i = 0; i < drinkNames.length; i++) {
            if (moneyAmount >= drinkPrices[i]) {
                System.out.println("Вы можете купить " + drinkNames[i]);
                canBuyAnything = true;
            }
        }
        if (!canBuyAnything) {
            System.out.println("Недостаточно средств :(\nИзучайте Java и зарабатывайте много! :)");
        }

        //вывод даты и времени
        SimpleDateFormat formatDate = new SimpleDateFormat("yMMdd_HHmmss");
        Date date = new Date();
        System.out.println("\nДата и время: " + formatDate.format(date));

        //вывод разрешения экрана
        Robot robot = new Robot();
        Rectangle screenSize = new Rectangle(Toolkit.getDefaultToolkit ().getScreenSize ());
        BufferedImage screenshot = robot.createScreenCapture(screenSize);
        System.out.println("\nРазрешение скриншота: " + screenshot.getWidth() + "x" + screenshot.getHeight());
    }
}