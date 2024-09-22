import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) throws Exception {
      
    try (Scanner sc = new Scanner(System.in);) {
        
      System.out.println("Introduce una cadena:");
      String input = sc.nextLine();
      
      //Creamos un TreeMap para almacenar las letras y sus frecuencias. Se mostrará alfabéticamente con el print.
      Map <Character, Integer> contarLetra = new TreeMap<>();

      //Recorremos el String
      for (char letra : input.toCharArray()) {

        if (Character.isLetter(letra)){ //Solo contaremos letras en la cadena
            contarLetra.put(letra, contarLetra.getOrDefault(letra, 0) + 1); //aumentamos contador de cada letra encontrada
        }
      }

      System.out.println("Total de cada letra introducida:\n" + contarLetra);
     
    }
    }
}
