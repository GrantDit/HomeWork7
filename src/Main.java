import javax.sql.rowset.serial.SQLOutputImpl;
import java.time.Year;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1 ");
        //Задание 1
        int clientIOS = 1;// Если равно 0 выполняется для IOS, если равно 1 выполняется для Android.
        if (clientIOS == 0)
            System.out.println("Установите версию приложения для iOS по ссылке");
        else if (clientIOS == 1)
            System.out.println("Установите версию приложения для Android по ссылке");

        System.out.println("Задание 2");
        //Задание 2
        int client = 0; // Если равно 0 IOS, если 1 равно Android
        int clientDeviceYear = 2014;
        if (clientDeviceYear >=2015){
            if (client == 0)
                System.out.println("Установите обычную версию приложения для IOS");
            if (client == 1)
                System.out.println("Установите обычную версию приложения для Android");
        }
        else {
            if (client == 0)
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            if (client == 1)
                System.out.println("Установите облегченную версию приложения для Android по ссылке");

        }
            System.out.println("Задание 3");
            //Задание 3
        int year = 2021;
        if (((year % 4 ==0) && (year % 100!=0))||((year % 400 == 0)))
            System.out.println(year + " год является високосный");
        else
            System.out.println(year +" год не является високосный");

        System.out.println("Задание 4");
        //Задание 4
        int Day = 1;
        int Distance = 100;
        if (Distance <=20){
            Day = 1;
        }
        else {
        Day = 1 +((Distance - 20)/40+1);// отнял расстояние первого дня( за который пройдено 20 км,
            // поделил на растояние каждого следующего дня на цело и компенсировал единицу.
        }
        System.out.println("доставка займет " + Day );

        System.out.println("Заданиче 5");
        // Задача 5
        int month = 7;
        switch (month) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Такого месяца не существует");








        }




    }
}
