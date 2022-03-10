package com.example.javafx;
	
import java.util.ArrayList;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.StackPane;

/**
 *
 */
public class Main extends Application {
    /**
     *
     * @param primaryStage Inicia la parte grafica del programa
     *
     */
		
	@Override
    public void start(Stage primaryStage) {
		CategoryAxis yAxis = new CategoryAxis();
        yAxis.setLabel("Palabras seleccionadas"); // Nombre de parte y

        NumberAxis xAxis = new NumberAxis();
        xAxis.setLabel("Cantidad"); //Nombre de parte x

       
		BarChart<Number, String> chart = new BarChart<Number, String>(xAxis, yAxis);
        chart.setTitle("Aprobacion social en redes sociales "); // Titulo de la grafica

        chart.setData(obtenerDatos()); // Agregamos datos

        StackPane root = new StackPane(); // Paneles
        root.getChildren().add(chart);

        Scene scene = new Scene(root, 640, 427); // Tamaño del Frame

        primaryStage.setTitle("Informacion recopilada"); // Titulo de la ventana (frame)
        primaryStage.setScene(scene);
        primaryStage.show();
	}

    /**
     *
     * @return data
     */
	@SuppressWarnings("unchecked")
	public static ObservableList<XYChart.Series<Number, String>> obtenerDatos() {
        ArrayList<String> list = new ArrayList<String>();
        arrayList obj = new arrayList();
        list=obj.regresaArrayList();
        ArrayList<String> list2 = new ArrayList<String>();
        arrayList obj2 = new arrayList();
        list2=obj2.leerArrayList();
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        arrayList obj3 = new arrayList();
        list3=obj3.contarArrayList(list2);
	
        XYChart.Series<Number, String> frecuenciasPalabras = new XYChart.Series<>();
        frecuenciasPalabras.setName("Cantidad Total"); //Descripcion de la leyeda
        frecuenciasPalabras.getData().addAll( //Obtencion de valores (cantidad, palabra)
                new XYChart.Data<>(list3.get(0), list.get(0)),
                new XYChart.Data<>(list3.get(1), list.get(1)),
                new XYChart.Data<>(list3.get(2), list.get(2)),
                new XYChart.Data<>(list3.get(3), list.get(3)));

        ObservableList<XYChart.Series<Number, String>> data = FXCollections.observableArrayList();
        data.addAll(frecuenciasPalabras);

        return data;
    }

    /**
     *
     * @param args Ejecuta el programa
     */
	public static void main(String[] args) {
		launch(args);
	}
}
