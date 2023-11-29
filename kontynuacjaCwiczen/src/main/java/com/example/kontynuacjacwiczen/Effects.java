package com.example.kontynuacjacwiczen;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.effect.Glow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.nio.file.Path;
import java.util.Collection;


public class Effects extends Application {
    @Override
    public void start(Stage stage) {


    Image image = new Image("https://www.tutorialspoint.com/green/images/logo.png");
        ImageView imageView = new ImageView(image);
        imageView.setX(100);
        imageView.setY(70);
        imageView.setFitHeight(200);
        imageView.setFitWidth(400);
        imageView.setPreserveRatio(true);

        Glow glow = new Glow();
        glow.setLevel(0.9);
        imageView.setEffect(glow);

        Group root = new Group(imageView);
        Scene scene = new Scene(root, 600, 300);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String args[]){
        launch(args);
    }
}
