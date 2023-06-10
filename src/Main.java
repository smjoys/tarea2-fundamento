import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {

        ArrayList<Subtitulo> Sub = new ArrayList<>();


        Scanner tcld= new Scanner(System.in);
        System.out.println("Ingrese nombre del archivo (Subtitulos):");
        String arch= tcld.next();


        FileReader archivo;
        BufferedReader lector;

        try {
            archivo=new FileReader("sub-ejemplo.srt");
            lector = new BufferedReader(archivo);
            String linea;
            LinkedList<String> list= new LinkedList<>();
            while ((linea = lector.readLine())!=null){
                list.add(linea);
            }
            if (list!=null){
                for (int i=0;i<list.size();i++){
                    String num = list.get(i);
                    StringTokenizer numer= new StringTokenizer(num, "-->");
                    String fl = new String(numer.nextToken());


                }
            }
            lector.close();
            archivo.close();
        } catch (IOException e) {
            System.out.println("trayectorias No encontradas");
        }
    }
}