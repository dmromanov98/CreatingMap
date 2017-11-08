package ObjectsInJavaFXWindow;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public  class Window extends Application {
    private Stage primaryStage;
    private AnchorPane anchorPane;

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        //FilesPaths.readPathFile();
        initBorderPane();
    }

    private void initBorderPane(){
        try{
            FXMLLoader loader =new FXMLLoader();
            loader.setLocation(Window.class.getResource("Window.fxml"));
            anchorPane = loader.load();
            Scene scene = new Scene(anchorPane);
            primaryStage.setResizable(false);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Objects");
            primaryStage.show();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
