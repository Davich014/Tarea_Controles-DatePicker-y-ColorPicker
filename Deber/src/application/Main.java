package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

        @Override
        public void start(Stage primaryStage) {
            // Crear los controles
            DatePicker datePicker = new DatePicker();
            datePicker.setPromptText("Selecciona una fecha:");

            ColorPicker colorPicker = new ColorPicker();
            colorPicker.setPromptText("Selecciona un color:");
            colorPicker.getCustomColors().addAll(
                javafx.scene.paint.Color.VIOLET,
                javafx.scene.paint.Color.BLUE,
                javafx.scene.paint.Color.CYAN,
                javafx.scene.paint.Color.GREEN,
                javafx.scene.paint.Color.YELLOW,
                javafx.scene.paint.Color.ORANGE,
                javafx.scene.paint.Color.BLACK,
                javafx.scene.paint.Color.WHITE,
                javafx.scene.paint.Color.BROWN,
                javafx.scene.paint.Color.RED
            );

            Button confirmButton = new Button("Confirmar");
            confirmButton.setOnAction(event -> {
                java.time.LocalDate selectedDate = datePicker.getValue();
                javafx.scene.paint.Color selectedColor = colorPicker.getValue();
                String colorName = getColorName(selectedColor);
                System.out.println("Fecha seleccionada: " + selectedDate);
                System.out.println("Color seleccionado: " + colorName);
            });

            // Crear el diseño VBox
            VBox layout = new VBox(
                new Label("Selecciona una fecha:"),
                datePicker,
                new Label("Selecciona un color:"),
                colorPicker,
                confirmButton
            );
            layout.setSpacing(10);
            layout.setPadding(new Insets(20));

            // Crear la escena y establecer el escenario
            Scene scene = new Scene(layout, 400, 300);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Selector de Fecha y Color");
            primaryStage.show();
        }

        private String getColorName(javafx.scene.paint.Color color) {
            if (color.equals(javafx.scene.paint.Color.VIOLET)) {
                return "Violeta";
            } else if (color.equals(javafx.scene.paint.Color.BLUE)) {
                return "Azul";
            } else if (color.equals(javafx.scene.paint.Color.CYAN)) {
                return "Cian";
            } else if (color.equals(javafx.scene.paint.Color.GREEN)) {
                return "Verde";
            } else if (color.equals(javafx.scene.paint.Color.YELLOW)) {
                return "Amarillo";
            } else if (color.equals(javafx.scene.paint.Color.ORANGE)) {
                return "Naranja";
            } else if (color.equals(javafx.scene.paint.Color.BLACK)) {
                return "Negro";
            } else if (color.equals(javafx.scene.paint.Color.WHITE)) {
                return "Blanco";
            } else if (color.equals(javafx.scene.paint.Color.BROWN)) {
                return "Cafe";
            } else if (color.equals(javafx.scene.paint.Color.RED)) {
                return "Rojo";
            } else {
                return "Color desconocido";
            }
        }

        public static void main1(String[] args) {
            launch(args);
        }
    }