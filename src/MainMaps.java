import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MainMaps {
    public static void main(String[] args) {
        Map<String, String> codeToNames = new HashMap<>();
        codeToNames.put("000101011","Kawa");
        codeToNames.put("000111111","Kawa z mlekiem");
        codeToNames.put("000111111","Kawa z mlekiem2");

        Map<String , Double> codeToPrices = new HashMap<>();
        codeToPrices.put("000101011", 9.99);
        codeToPrices.put("000111111", 11.99);

        //zwrocenie wartosci wystapienia w mapie
        System.out.println(codeToNames.values());
        //zrwocenoie kluczy wystepujacych w mapie
        System.out.println(codeToNames.keySet());
        //czy kod wystepuje w zbiorze kluczy
        Set<String> myKes = codeToNames.keySet();
        System.out.println(codeToNames.keySet().contains("000101011"));
    }
}
