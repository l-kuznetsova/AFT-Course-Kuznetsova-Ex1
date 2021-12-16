import java.util.Scanner;
public class Application {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
// 1. Написать программу, которая выводит в консоль Hello World!
        System.out.println("Задание 1:");
        System.out.println("Hello, World!");
// 2. Написать программу, которая записывает в переменную с результат деления переменной а на b. а и b вводятся с клавиатуры
        System.out.println("Задание 2:");
        System.out.println("Введите число a: ");
        int a = scr.nextInt();
        System.out.println("Введите число b: ");
        int b = scr.nextInt();
        int c = a/b;
        System.out.println("Результат деления: " + c);
// 3. Написать функцию, которая принимает на вход целое число и выводит на экран является ли оно четным
        System.out.println("Задание 3:");
        System.out.println("Введите число: ");
        int num = scr.nextInt();
        if (num % 2 == 0){
            System.out.println("Введенное число чётное");}
        else {
            System.out.println("Введенное число нечётное");}
// 4. Написать функцию, внутрь которой передается 3 переменных текущего времени (часы, минуты, секунды) и имя пользователя. В результате вызова этой функции на экран выводится:
//        Если время от 5 до 12 -> "Доброе утро, {username}"
//        Если время от 12 до 16 -> "Добрый день, {username}"
//        Если время от 16 до 23 -> "Добрый вечер, {username}"
//        Если время от 23 до 5 -> "Доброй ночи, {username}"
        System.out.println("Задание 4:");
        System.out.print("Ваше имя: ");
        String name = scr.nextLine();


    }
}
