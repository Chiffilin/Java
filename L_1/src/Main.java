import Product.Products;
import Worker.Workers;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        Products Product = Until.generateProducts(scanner);
        System.out.println(Product.toString());

        System.out.println("=======================================");

        Workers Worker = Until.generateWorkers(scanner);
        System.out.println(Worker.toString());

        scanner.close();
    }
}
