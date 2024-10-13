public class Main {
    public static void main(String[] args) {
        //Задача 1
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //Задача 2
        int clientDeviceYear = 2014;
        clientOS = 0;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
                System.out.println("Установите облегчённую версию приложения для iOS по ссылке");
        } else if (clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегчённую версию приложения для Android по ссылке");
        }
        //Задача 3
        int year = 1588;
        if (year % 4 == 0 && year % 400 == 0 && year >= 1584) {
            System.out.println(year + " год является високосным");
        } else if (year % 4 == 0 && year % 100 != 0 && year >= 1584) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        //Задача 4
        int deliveryDistance = 55;
        if (deliveryDistance >= 100) {
            System.out.println("Доставка не осуществляется");
        } else  if (deliveryDistance >=60){
            System.out.println("Доставка займёт 3 дня");
        } else if (deliveryDistance >= 20) {
            System.out.println("Доставка займёт 2 дня");
        } else {
            System.out.println("Доставка займёт 1 день");
        }
        //Задача 5
        int monthNumber = 2;
        switch (monthNumber) {
            case 1, 2, 12:
                System.out.println("Зимний сезон");
                break;
            case 3, 4, 5:
                System.out.println("Весенний сезон");
                break;
            case 6, 7, 8:
                System.out.println("Летний сезон");
                break;
            case 9, 10, 11:
                System.out.println("Осенний сезон");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}