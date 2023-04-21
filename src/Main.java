public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
    }
    public static void task2() {
        String firstName = "ivan";
        String middleName = "ivanovich";
        String lastName = "Ivanov";
        String fullName = firstUpTo(lastName) + " " + firstUpTo(firstName) + " " + firstUpTo(middleName);
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);

    }
    public static String firstUpTo(String s) {
        if (s.charAt(0) >= 97 && s.charAt(0) <= 122) {
            return (char)(s.charAt(0) - 32) + s.substring(1);
        }
        return s;
    }
    public static void task3() {
        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = firstUpTo(lastName) + " " + firstUpTo(firstName) + " " + firstUpTo(middleName);
        System.out.println("Данные ФИО сотрудника — " + fullName.replace("ё", "е"));

    }
}