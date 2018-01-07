import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FBCalculatorApp extends Application {
    public void start(Stage primaryStage) {
        BinaryToDecimalLayout binToDecPane = new BinaryToDecimalLayout();
        DecimalToBinaryLayout decToBinPane = new DecimalToBinaryLayout();

        Scene binToDecScene = new Scene(binToDecPane, 290, 280);
        Scene decToBinScene = new Scene(decToBinPane, 290, 280);

        decToBinPane.decToBin.setOnAction(e -> primaryStage.setScene(decToBinScene));
        decToBinPane.binToDec.setOnAction(e -> primaryStage.setScene(binToDecScene));

        binToDecPane.decToBin.setOnAction(e -> primaryStage.setScene(decToBinScene));
        binToDecPane.binToDec.setOnAction(e -> primaryStage.setScene(binToDecScene));

        primaryStage.setTitle("Floating Point Calculator");
        primaryStage.setScene(binToDecScene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
