
import java.io.*;
import java.util.LinkedList;

import java.util.StringTokenizer;
public class Analizador {
    FileReader archivo;
    BufferedReader lector;

        try {
        archivo=new FileReader("trayectorias.tex");
        lector = new BufferedReader(archivo);
        String linea;
        LinkedList<String> list= new LinkedList<>();
        while ((linea = lector.readLine())!=null){
            list.add(linea);
        }
        if (list!=null){
            for (int i=0;i<list.size();i++){
                String num = list.get(i);
                StringTokenizer numer= new StringTokenizer(num, " ");
                int id = Integer.parseInt(numer.nextToken());
                int t1 = Integer.parseInt(numer.nextToken());
                int t2 = Integer.parseInt(numer.nextToken());
                int x = Integer.parseInt(numer.nextToken());
                int y = Integer.parseInt(numer.nextToken());


            }
        }
        lector.close();
        archivo.close();
    } catch (IOException e) {
        System.out.println("trayectorias No encontradas");
    }

}
