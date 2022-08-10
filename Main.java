import java.util.Scanner;

class Main {
    public static int numberDay(int year){
        int number;
        if (year % 400 == 0){
            number = 366;
        } else if (year % 100 == 0){
            number = 365;
        } else if (year % 4 == 0){
            number = 366;
        } else 
            number = 365;
        return number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год в формате YYYY");
        int year = scanner.nextInt();
        int result = numberDay(year);
        System.out.println("Количество дней в году: " + result);
    }
}
