import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("¿Cual es tu nombre we?: ");
        try {
          /* InputStreamReader ir = new InputStreamReader(System.in);
            BufferedReader bf = new BufferedReader(ir);
            System.out.println("¿Cual es tu nombre we?: ");
            String nombre = bf.readLine();
            System.out.println("Te llamas: " + nombre);*/
            imprimir(bf);
        }catch (IOException e){
            e.printStackTrace(); }
            System.out.println("LOL"); 
    }
    public static void imprimir(BufferedReader bf) throws IOException{
        String nombre = bf.readLine();
        System.out.println("Te llamas: " + nombre);
    }
}

