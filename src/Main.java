public class Main {

    public static void main(String[] args) {

        int ticket = 13_676; // стоимость билета(ов) рублей
        System.out.println("Стоимость билета(ов) рублей: " + ticket);
        int mile = 20; // стоимость одной мили рублей
        int bonus = ticket / mile;
        System.out.println("Количество миль за покупку: " + bonus);
    }
}