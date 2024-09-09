package edu.vanier.template;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainApp extends Application{

    public static void main(String[] args) {
        System.out.println("Hello there!");
        //To launch the JFX component of the application, we use LAUNCH
        launch(args);
    }

    @Override
    public void init(){
        System.out.println("Initialization in progress...");
    }

    public void stop(){
        System.out.println("Shutting down application...");
    }


    @Override
    public void start(Stage primaryStage) {
        //At first, we must create a scene graph and pass it to the scene
        System.out.println("Starting application...");
        // 1. create the scene graph
        Group root = new Group();
        // -- 1.a. Add UI controls to the scene graph
        Button btnSave = new Button("Options");
        root.getChildren().add(btnSave);
        btnSave.setOnAction((event) -> {
            System.out.println("Opening new stage");
            OptionStage stageOptions = new OptionStage(primaryStage, "Options Window");
            stageOptions.show();
        });

//         // -- 1.b. create rectangle
//         rect = new Rectangle(50, 100);
//         root.getChildren().add(rect);

        // 2. Create a FX scene
        Scene scene = new Scene(root, 300,300);
        // 3. Set the scene on the stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("JFX test");
        primaryStage.setAlwaysOnTop(true);
        primaryStage.show();
    }
}