/**
 * Created by Diego on 16/03/2016.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class AccesoFicheros {

    private File archivo;
    private FileReader fr;
    private BufferedReader br;
    private FileWriter fichero;

    public AccesoFicheros(String nombre) {

        archivo = null;
        fichero = null;
        fr = null;
        br = null;


        try {
            archivo = new File(nombre);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }


    public void guardarPro() {

        try {
            fichero = new FileWriter("TFGs.txt");
            PrintWriter pw = new PrintWriter(fichero);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
