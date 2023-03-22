package DZ.dz5;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class View<E> {
    Scanner in = new Scanner(System.in);

    public Double getValue(String title) {
        System.out.printf("%s", title);
        return in.nextDouble();
    }

    public String getOperation(String op) {
        System.out.printf("%s", op);
        return in.next();
    }

    // print(f'{title} = {data}')
    public void print(String data, String title) {
        // NumberFormat nf = new DecimalFormat("#.############");
        // System.out.printf("%s %s\n", title, nf.format(data));
        System.out.printf("%s %s\n", title, data);
    }
}
