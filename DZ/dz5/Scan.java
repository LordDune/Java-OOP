package DZ.dz5;
import java.util.Scanner;

public class Scan {
    Scanner in = new Scanner(System.in);

    public Double getValue (String title) {
        System.out.printf("%s", title);
        return in.nextDouble();
    }

    public String getStr(String title) {
        System.out.printf("%s", title);
        return in.next();
    }

    public String getOp() {
        System.out.printf("Введите операцию: ");
        return in.next();
    }


}
