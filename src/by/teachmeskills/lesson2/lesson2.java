package by.teachmeskills.lesson2;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.time.LocalDate;
public class lesson2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Здравствуйте, уважаемый пользователь! Введите, пожалуйста, ваше ФИО!");
        String name = in.nextLine();
        System.out.println(name + ", введите пожалуйста ваш год рождения");
        int year = Integer.parseInt(in.nextLine());
        System.out.println(name + ", введите пожалуйста ваш месяц рождения");
        int month = Integer.parseInt(in.nextLine());
        System.out.println(name + ", введите пожалуйста ваш день рождения");
        int day = Integer.parseInt(in.nextLine());
        LocalDate current = LocalDate.now();
        LocalDate birth = LocalDate.of(year, month, day);
        System.out.println(name + ", Ваш возраст составляет " + ChronoUnit.YEARS.between(birth, current));
        }
    }




