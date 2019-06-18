import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.text.SimpleDateFormat;
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException, AWTException {
        System.out.println("Кофе-машина");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вводим кол-во денег:");
/**
 * сделать так чтобы машина сообщала о недостатке средсв
 * деньги читать с консоли
 */
        int moneyAmount = Integer.parseInt(scanner.nextLine());
        int[] drinkPrice = {120,30, 80, 20};
        String[] drinkNames = {"капучино", "молоко", "эспрессо", "воду"};

        for (int i = 0; drinkNames.length > i; i++) {
            if (moneyAmount >= drinkPrice[i]) {
                System.out.println("Вы можете купить " + drinkNames[i]);
            } else {
                System.out.println("К сожалению не хватает на " + drinkNames[i]);
            }
        }
        /**
         * напечатать дату в формате 20190617_214558
         */
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd_HHmmss");
        System.out.println(format.format(new Date()));
        //--------------------------------------------------------
//        BufferedImage image = new BufferedImage();//написать код, который создаст image, в котором будет  скрин моника
//        распечатать размеры экрана

        BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
        ImageIO.write(image, "png", new File("./screenshot.png"));
        System.out.println(image.getWidth());
        System.out.println(image.getHeight());
       // #уменяполучилось
    }
}