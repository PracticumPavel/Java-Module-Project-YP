import java.util.HashMap;
import java.util.Iterator;

public class Calculator {
    //Считает сумму в полученной Мапе и делит на количество в первом аргументе
    static void calculate (int number, HashMap<String, Double> productMap) {
        Iterator<String> iterator = productMap.keySet().iterator();
        double sum = 0;

        if(productMap.size() > 0) {
            System.out.println("Добавленные товары:");
            while(iterator.hasNext()) {
                String name = iterator.next();
                sum += productMap.get(name);
                System.out.println(name + ": " + productMap.get(name));
            }

            float rezult = (float)sum/number;
            String word = Formatter.declensionOfWords(rezult);

            System.out.println(String.format("Каждый гость заплатит: %.2f" + " " + word, rezult));
        }


    }
}
