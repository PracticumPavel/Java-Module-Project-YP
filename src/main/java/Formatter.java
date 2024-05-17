public class Formatter {

    //склоняет слово
    static String declensionOfWords(double number) {
        int x = (int)Math.floor(number);
        String word;

        if((x % 100 >= 11) && (x % 100 <= 19)) {
            word = "рублей";
        }else if(x % 10 == 1) {
            word = "рубль";
        }else if((x % 10 >= 2) && (x % 10 <=4)) {
            word = "рубля";
        }else word = "рублей";

        return word;
    }
}
