public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Задача 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");

        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println();
        System.out.println("Задача 2");
        int yearOfIssue = 2016;
        int clientOS1 = 0;
        if (clientOS1 == 0 && yearOfIssue >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }if (clientOS1 == 0 && yearOfIssue < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }if (clientOS1 == 1 && yearOfIssue >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }if (clientOS1 == 1 && yearOfIssue < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        System.out.println();
        System.out.println("Задача 3");
        int year = 1200;
        boolean old = year >= 1584;
        boolean four = year % 4 == 0;
        boolean hundred = year % 100 != 0;
        boolean fourHundred = year % 400 == 0;
        if (old && four && hundred) {
            System.out.println(year + " год является високосным");
        }else if (old && four && fourHundred) {
            System.out.println(year + " год является високосным");
        }
        else {
                System.out.println(year + " год не является високосным");
        }
        System.out.println();
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        }else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2");
        }else if (deliveryDistance > 60 && deliveryDistance <= 100) {
                    System.out.println("Потребуется дней: 3");
        }else {
            System.out.println("Доставка не осуществляется");
        }
        System.out.println();
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
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
                break;
        }
    }
}
