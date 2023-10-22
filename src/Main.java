// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Шоколад: ");
        String name = scanner.nextLine();
        System.out.print("десять тонн : ");
        int count = scanner.nextInt();
        scanner.nextLine();
        System.out.print("89674001169: ");
        String phone = scanner.nextLine();
        System.out.print("Сочи: ");
        String address = scanner.nextLine();
        System.out.printf("Ваш заказ принят. Товар %s десять тонн %d пребудет в ближайшее время.\n" +
                "Товар доставим на Ваш адрес: %s. Ваш контактный номер: %s.", name, count, address, phone);
        scanner.close();
    }
}

