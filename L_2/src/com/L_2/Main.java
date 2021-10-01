package com.L_2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;
/**
 * Создать класс квадрат, члены класса – длина стороны. Предусмотреть в классе методы
 * вычисления и вывода сведений о фигуре – диагональ, периметр, площадь. Создать производный класс
 * – правильная квадратная призма с высотой H, добавить в класс метод определения объема фигуры,
 * перегрузить методы расчета площади и вывода сведений о фигуре. Написать программу,
 * демонстрирующую работу с этими классами: дано N квадратов и M призм, найти квадрат с максимальной
 * площадью и призму с максимальной диагональю
 **/
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Square[] squares = generateSquares(scanner);
        String maxArea = getMaxArea(squares);

        Prism[] prisms = generatePrisms(scanner);
        String maxDiagonal = getMaxDiagonal(prisms);

        scanner.close();

        System.out.println("\n==== Result ====");
        System.out.printf("Max area - %s\n", maxArea);
        System.out.printf("Max prism diagonal - %s\n",maxDiagonal);
    }

    public static Square[] generateSquares(Scanner scanner) {

        final int N;

        System.err.print("Enter the number of squares: ");
        N = scanner.nextInt();
        scanner.nextLine();

        Square[] squares = new Square[N];

        for(int i = 0; i < N; i++) {
            Square square = new Square();

            System.out.print("Enter the side: ");
            square.setSide(scanner.nextDouble());
            scanner.nextLine();

            squares[i] = square;
        }
        return squares;
    }

    public static Prism[] generatePrisms(Scanner scanner) {
        final int N;

        System.err.print("\nEnter the number of prism: ");
        N = scanner.nextInt();
        scanner.nextLine();

        Prism[] prisms = new Prism[N];

        for(int i = 0; i < N; i++ ){
            Prism prism = new Prism();

            System.out.print("Enter the side: ");
            prism.setSide(scanner.nextDouble());

            System.out.print("Enter the height: ");
            prism.setHeight(scanner.nextDouble());

            prisms[i] = prism;
        }
        return prisms;
    }
    public static String getMaxArea(Square[] squares){
        Double[] areas = new Double[squares.length];

        for(int i = 0; i < squares.length; i++) {
            areas[i] = squares[i].getArea();
        }
        double max = Collections.max(Arrays.asList(areas));

        return String.format("%.1f", max);
    }
    public static String getMaxDiagonal(Prism[] prisms) {
        Double[] diagonal = new Double[prisms.length];

        for(int i = 0; i < prisms.length;i++) {
            diagonal[i] = prisms[i].getDiagonal();
        }
        double maxDiagonal = Collections.max(Arrays.asList(diagonal));
        return String.format("%.1f",maxDiagonal);
    }



}
