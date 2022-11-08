package com.javeriana.aplicacionhostal.controlador;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class Hostel extends javafx.application.Application {
    // Attributes:
    private int noOfRooms;
    // Constructors:
    public Hostel() {
    }
    public Hostel(int noOfRooms) {
        this.noOfRooms = noOfRooms;
    }
    // Getters and setters:
    public int getNoOfRooms() {
        return noOfRooms;
    }
    public void setNoOfRooms(int noOfRooms) {
        this.noOfRooms = noOfRooms;
    }
    // Methods:
    @Override
    public void start(Stage stage) throws Exception {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/javeriana/aplicacionhostal/vista/hostel-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 1200, 600);
            stage.setTitle("Aplicación hostal");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            System.out.println("Exception : " + e);
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}
