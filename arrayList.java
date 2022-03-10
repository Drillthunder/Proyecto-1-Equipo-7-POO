package com.example.javafx;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 */
public class arrayList {

    /**
     *
     * @return lista1
     */
    public ArrayList<String> leerArrayList (){ //Realiza la lectura del documento
        ArrayList<String> lista1 = new ArrayList<>();
        try {
            Scanner csvData = new Scanner (new File("C:\\Users\\Rodrigo\\IdeaProjects\\POO\\JavaFx\\src\\main\\java\\com\\example\\javafx\\twitter_validation.csv")); //Ubicacion del archivo a leer
            while(csvData.hasNext()) {
                lista1.add(csvData.nextLine()); // Adicion del documento en la lista
            }
        }catch(FileNotFoundException ex){
            System.out.println(ex.toString()); // Manda mensaje de error en caso de no encontrar el archivp
        }
        return lista1;
    }

    /**
     *
     * @return arlTest
     */
    public ArrayList<String> regresaArrayList(){ //Lista de palabras para busqueda
        ArrayList arlTest = new ArrayList();
        arlTest.add("Love");
        arlTest.add("Like");
        arlTest.add("Ass");
        arlTest.add("Fuck");
        return arlTest;
    }

    /**
     *
     * @param linea Obtiene las lineas de la lista donde se encuentra los valores a contar
     * @return lista2
     */
    public ArrayList <Integer> contarArrayList (ArrayList<String> linea){  //Contador de palabras encontradas con similitudes
        ArrayList<Integer> lista2 = new ArrayList<>();
        int c1 = 0, c2 = 0, c3 = 0, c4 = 0;
        for(String texto: linea) { //Ciclo for para el analisis de cada linea en la lista
            if (texto.contains("love")) {
                c1++;
            }
            if (texto.contains("like")){
                c2++;
            }
            if(texto.contains("ass")){
                c3++;
            }
            if(texto.contains("fuck")){
                c4++;
            }

        }
        lista2.add(c1);
        lista2.add(c2);
        lista2.add(c3);
        lista2.add(c4);
        return lista2;
    }

}
