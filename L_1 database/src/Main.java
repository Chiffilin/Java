import Product.Datebase;
import Product.Products;
import Worker.Workers;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        final  int N = 3;
        Datebase db = new Datebase();
        db.add("Potato", "John", 10,20.5);
        db.add("Eggs", "Carl", 200, 0.5);
        System.out.println(db);

        long timeStart = System.currentTimeMillis(), t1, t2, t3;
        for (int i = 0; i < N; i++) {
            db.add("Potato","John", 20 ,10);
        }
        t1 = System.currentTimeMillis() - timeStart;
        timeStart = System.currentTimeMillis();
        db.save("db.txt");
        db.clear();
        db.load("db.txt");
        t2 = System.currentTimeMillis() - timeStart;

        timeStart = System.currentTimeMillis();
        db.serialize("db_s.txt");
        db.clear();
        db.deserialize("db_s.txt");
        t3 = System.currentTimeMillis() - timeStart;

        System.out.println("ArrayList of " + N + " objects");
        System.out.println("Initial Data Generation:	" + t1 + " ms");
        System.out.println("Text format Save/load:		" + t2 + " ms");
        System.out.println("Java serialization/des:		" + t3 + " ms");

    }
}
