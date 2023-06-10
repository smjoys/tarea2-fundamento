import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Analizador {
    public static void main(String[] args) {

        Scanner tcld= new Scanner(System.in);
        System.out.println("Ingrese ruta de los subtitulos(C:/ruta/a/buscar):");
        String ruta = tcld.next();
        System.out.println("Ingrese nombre del archivo:");
        String arch = tcld.next();


        buscarArchivoSubRip(new File(ruta ), arch);

    }

    public static void buscarArchivoSubRip(File ruta, String arch) {
        File[] files = ruta.listFiles();

        if (files != null) {

            for (File file : files) {

                if (file.isDirectory()) {

                    buscarArchivoSubRip(file, arch); // Llamada recursiva para buscar en subdirectorios
                } else {

                    if (file.getName().endsWith(".srt")) {

                        buscarPalabraClaveEnArchivo(file, arch);
                    }
                }
            }
        }
    }

    public static void buscarPalabraClaveEnArchivo(File archivo, String palabraClave) {

        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {

            String linea;

            int numeroLinea = 0;

            while ((linea = reader.readLine()) != null) {

                numeroLinea++;

                if (linea.contains(palabraClave)) {

                    System.out.println("Archivo: " + archivo.getAbsolutePath());
                    System.out.println("Línea " + numeroLinea + ": " + linea);
                    System.out.println("-----------------------------");

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
