import Product.Product;
import Product.Products;
import Worker.Worker;
import Worker.Workers;

import java.text.ParseException;
import java.util.Scanner;


public class Until {
    public static Products generateProducts(Scanner scanner) throws Exception {
        System.out.print("Enter the number of product types: ");
        final int N = scanner.nextInt();
        scanner.nextLine();

        Products Product = new Products();

        for (int i = 0; i < N; i++) {
            Product simpleProduct = new Product();
            System.out.println("\n=== Product №" + (i + 1) + "===");

            //seller
            System.out.print("Enter the Seller: ");
            simpleProduct.setSeller(scanner.nextLine());

            //Name
            System.out.print("Enter the Name of product: ");
            simpleProduct.setName(scanner.nextLine());

            //Amount
            int amountOfProduct;
            do {
                System.out.print("Enter the Amount of product: ");

                amountOfProduct = scanner.nextInt();
                simpleProduct.setAmount(amountOfProduct);
            } while (amountOfProduct <= 0);

            //Price
            double amountOfPrice;
            do {
                System.out.print("Enter the Price of product: ");

                amountOfPrice = scanner.nextDouble();
                simpleProduct.setPrice(amountOfPrice);
            } while (amountOfPrice <= 0);

            //Date of sale
            while (true) {
                System.out.print("Enter the date (dd/MM/yyyy format): ");
                String date = scanner.next();

                if (checkDate(date)) {
                    simpleProduct.setDateOfSale(date);
                    break;
                }
            }

            scanner.nextLine();

            Product.addProduct(simpleProduct);
        }

        return Product;
    }

    public static Workers generateWorkers(Scanner scanner) throws ParseException {
        System.out.print("Pass the amount of workers: ");
        final int N = scanner.nextInt();
        scanner.nextLine();

        Workers workers = new Workers();

        for(int i = 0; i < N; i ++) {
            Worker simpleWorker = new Worker();

            System.out.println("\n=== Worker №" + (i + 1) + "===");

            //Surname
            System.out.print("Enter the Surname: ");
            simpleWorker.setSurname(scanner.nextLine());

            //Name
            System.out.print("Enter the Name: ");
            simpleWorker.setName(scanner.nextLine());

            //Middle_Name
            System.out.print("Enter the Middle_Name: ");
            simpleWorker.setMiddle_name(scanner.nextLine());

            //Position
            System.out.print("Enter the Position");
            simpleWorker.setPosition(scanner.nextLine());

            //Salary
            int amountOfSalary;
            do {
                System.out.print("Enter the Salary: ");

                amountOfSalary = scanner.nextInt();
                simpleWorker.setSalary(amountOfSalary);
            } while (amountOfSalary <= 0);

            //Date of Birthday
            while (true) {
                System.out.print("Enter the date (dd/MM/yyyy format): ");
                String date = scanner.next();

                if (checkDate(date)) {
                    simpleWorker.setDateOfBirthday(date);
                    break;
                }
            }


            scanner.nextLine();

            workers.addWorker(simpleWorker);
        }
        return workers;
    }




    public static boolean checkDate(String date) {
        String RegExp = "^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])?[0-9][0-9]$";

        return date.matches(RegExp);
    }
}
