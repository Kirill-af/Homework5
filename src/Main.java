import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        //Задание 1
        System.out.println("Task 1");

        int clientOs = 0;
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        else if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else System.out.println("Неверное значение");

        //Задание 2
        System.out.println("Task 2");

        int clientOS = 0;
        int clientDeviceYear = 2015;

        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }   if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        }   if (clientOS == 1 && clientDeviceYear <2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        }

        // Задание 3
        System.out.println("Task 3");

        int year = 2021;
        if (year > 1584 && ((year % 4 == 0 && year % 100 > 0) || year % 400 == 0 )){
            System.out.println(year + "год является високосным");
        } else  {
            System.out.println(year + "год не является високосным");
        }

        //Задание 4
        System.out.println("Task 4");

        int deliveryDistance = 95;
        if (deliveryDistance <= 20){
            System.out.println("Потребуется дней: " + 1);
        }   if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + 2);
        }   if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + 3);
        } else System.out.println("Доставки нет");

        //Задание 5
        System.out.println("Task 5");

        int monthNumber = 12;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Неверный номер месяца");
        }
    }
}