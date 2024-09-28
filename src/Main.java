import java.util.Scanner;

class ChocolateCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод данных
        System.out.print("Введите количество денег: ");
        int money = scanner.nextInt();

        System.out.print("Введите цену за шоколадку: ");
        int price = scanner.nextInt();

        System.out.print("Введите количество оберток для получения одной шоколадки: ");
        int wrap = scanner.nextInt();

        // Подсчет максимального количества шоколадок
        int totalChocolates = calculateMaxChocolates(money, price, wrap);

        // Вывод результата
        System.out.println("Максимальное количество шоколадок: " + totalChocolates);
    }

    private static int calculateMaxChocolates(int money, int price, int wrap) {
        // Сначала покупаем шоколадки на имеющиеся деньги
        int chocolates = money / price;
        int wrappers = chocolates;

        // Обмениваем обертки на дополнительные шоколадки
        while (wrappers >= wrap) {
            int additionalChocolates = wrappers / wrap;
            chocolates += additionalChocolates;
            wrappers = wrappers % wrap + additionalChocolates; // Остаток оберток + новые обертки
        }

        return chocolates;
    }
}