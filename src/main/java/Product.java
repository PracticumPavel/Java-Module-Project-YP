import java.util.HashMap;
import java.util.Scanner;

public class Product {
    /*
    String name;
    Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }
    */

    //Добавляет гостей, возвращает количество если больше одного
    static int numberOfVisitors() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество гостей");

        int number = 0;
        while(true) {
            if(scanner.hasNextInt()) {
                number = scanner.nextInt();
                if(number <= 1) {
                    System.out.println("Неверный ввод");
                }else break;
            }else {
                scanner.next();
                System.out.println("неверный ввод");
            }
        }

        return number;
    }

    //Добавляет товар и цену в Мапу, возвращает Мапу
    static HashMap<String, Double> addAProduct() {
        HashMap<String, Double> productMap = new HashMap<>();
        System.out.println("Введите наименование товара, для завершения введите команду \"Завершить\"");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        while(true) {

            if(name.equalsIgnoreCase("завершить")){
                break;
            }else {
                System.out.println("Введите цену в формате: рубли, копейки");
                while(!scanner.hasNextDouble()) {
                    System.out.println("Неверный ввод");
                    scanner.next();
                }
                double price = scanner.nextDouble();
                productMap.put(name, price);
                System.out.println(name + " успешно добавлен");
                System.out.println("Введите товар");
                name = scanner.next();
            }
        }
        return productMap;

    }

    
}
