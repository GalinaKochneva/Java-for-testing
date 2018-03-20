package ru.stqa.pft.addressbook;

public class MyFirstProgram {

    public static void main(String[] args) {

        hello("world");
        hello("user");
        hello("Galina");

        double l = 5;
        System.out.println("Площадь кравдрата со стороной " + l + " = " + area(l));

        double a = 4;
        double b = 6;
        System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + area(a, b));

        Point p1 = new Point(3, 7);
        Point p2 = new Point(2, 5);
        System.out.println("Расстояние между двумя точками = "+p1.distance(p2));
    }

    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }

    public static double area(double len) {
        return len * len;
    }

    public static double area(double a, double b) {
        return a * b;
    }

}