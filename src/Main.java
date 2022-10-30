import javax.sql.rowset.serial.SQLOutputImpl;
import java.time.Year;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1 ");
        //Задание 1
        int clientIOS = 0;// Если равно 0 выполняется для IOS, если равно 1 выполняется для Android.
        if (clientIOS == 0)
            System.out.println("Установите версию приложения для iOS по ссылке");
        else if (clientIOS == 1)
            System.out.println("Установите версию приложения для Android по ссылке");

        System.out.println("Задание 2");
        //Задание 2
        int client = 1; // Если равно 0 IOS, если 1 равно Android
        int clientDeviceYear = 2016;
        if ((clientDeviceYear >= 2015)&&(client ==0))
            System.out.println("Установите обычную версию приложения для IOS");
        if ((clientDeviceYear >=2015)&&(client == 1))
            System.out.println("Установите обычную версию приложения для Android");
        else
            if ((clientDeviceYear < 2015) && (client == 0))
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            if ((clientDeviceYear < 2015) && (client == 1))
                System.out.println("Установите облегченную версию приложения для Android по ссылке");

            System.out.println("Задание 3");
            //Задание 3
        int year = 2021;
        if (((year % 4 ==0) && (year % 100!=0))||((year % 400 == 0)))
            System.out.println(year + " год является високосный");
        else
            System.out.println(year +" год не является високосный");

        System.out.println("Задание 4");
        //Задание 4
        int deliveryDistance = 95;
        if ((deliveryDistance <=20)&&(deliveryDistance >=60))
            System.out.println("Доставка будет занимать один день ");







        }




    }
