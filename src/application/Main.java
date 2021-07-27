package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;
import javafx.scene.image.Image;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        //Stage stage = new Stage(); but we already have a stage so don't need this

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        // ^this line is important for linking to SceneBuilder

        primaryStage.setTitle("Stage Demo Program yayy!");

        // added customized MLH image
        Image icon = new Image("img.png");
        primaryStage.getIcons().add(icon);

//        primaryStage.setWidth(420);
//        primaryStage.setHeight(420);
        primaryStage.setResizable(false);

        primaryStage.setFullScreen(true);
        primaryStage.setFullScreenExitHint("YOU CAN'T ESCAPE unless you press q");
        primaryStage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));

        primaryStage.setScene(new Scene(root));  // add a scene to stage
        primaryStage.show(); // shows the stage, will customize later
    }


    public static void main(String[] args) {
        launch(args);
    }
}
