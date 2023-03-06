public class Main {
    public static void main(String[] args) {
        task1();
        task2();

    }
        public static void task1() {
            System.out.println("Задача 1");
        }
    public static void task2() {
        System.out.println("Задача 2");
        String osName = "iOS";
        int clientOS = getClientOS(osName);
    }
        public static int getClientOS(String name) {
            if (name.equals("iOS")) {
                return 0;
            } else {
                return 1;
            }
        }}