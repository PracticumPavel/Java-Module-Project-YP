import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number = Product.numberOfVisitors();

        HashMap<String, Double> map = Product.addAProduct();

        Calculator.calculate(number, map);

    }
}