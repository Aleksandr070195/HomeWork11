import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        year();
        getClientOS();
        task3();
    }
    public static void year() {

        int leapYear = 2021;

        if (leapYear % 100 == 0 && leapYear % 400 == 0)
            System.out.println(leapYear + " год, весокосный год");
        else if (leapYear % 4 == 0 && leapYear % 100 > 0)
            System.out.println(leapYear + " год, не весокосный год");
        else if (leapYear % 100 == 0)
            System.out.println(leapYear + " год, весокосный год");
        else
            System.out.println(leapYear + " год, не весокосный год");
    }
    public static void getClientOS() {
        int currentYear = LocalDate.now().getYear();
        if (2015 > currentYear) {
            int clientOS = 1;
            switch (clientOS) {
                case 0:
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    break;
            }
        }
        if (2015 <= currentYear) {
            System.out.println("установите обычное приложение");
        }
    }
    public static int task3() {
        int deliveryDistance = 95;
        int deliveryDay = 1;
        if (deliveryDistance > 20) {
            deliveryDay++;
            System.out.println("Потребуется дней: " + deliveryDay);
        }
        if (deliveryDistance > 60) {
            deliveryDay++;
            System.out.println("Потребуется дней: " + deliveryDay);
        }

        if (deliveryDistance > 100) {
        } else {
            System.out.println(100 + " км доставки нет");
        }
        if (deliveryDistance > 20) {
        deliveryDay++;
        }
        if (deliveryDistance > 60) {
        deliveryDay++;
        }
        return deliveryDay;
        }}



