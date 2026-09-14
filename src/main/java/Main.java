import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/** A GUI for Duke using FXML. */
public class Main extends Application {
    private final Duke duke = new Duke();

    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("/view/MainWindow.fxml"));
            AnchorPane mainWindow = loader.load();
            loader.<MainWindow>getController().setDuke(duke);

            stage.setTitle("Duke");
            stage.setMinHeight(220);
            stage.setMinWidth(417);
            stage.setScene(new Scene(mainWindow));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
