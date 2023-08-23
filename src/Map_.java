//package acc.equipe4.map;
 
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map_ {
    public static void main(String[] args) {
        // Comparando ordena��o LinkedHashMap, TreeMap, HashMap
        Map<String, String> test = new LinkedHashMap<>();
        test.put("USA", "Washington");
        test.put("Reino Unido", "Londres");
        test.put("India", "Nova Delhi");
        test.put("Brasil", "Bras�lia");
 
        System.out.println("LinkedHashMap : " + test);
        System.out.println("\n--------------> Ordem na qual as chaves foram inseridas;\n");
        test = new TreeMap<>(test);
        System.out.println("TreeMap : " + test);
        System.out.println("\n--------> De acordo com a ordena��o natural de suas chaves;\n");
        test = new HashMap<>(test);
        System.out.println("HashMap : " + test);
        System.out.println("\n--------> N�o garante ordena��o e a adi��o e remo��o de qualquer elemento pode alterar sua ordem.\n");

    }
}