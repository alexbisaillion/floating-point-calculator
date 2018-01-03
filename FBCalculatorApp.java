/**
 * Created by abisa on 12/29/2017.
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class FBCalculatorApp extends Application {
    public void start(Stage primaryStage) {
        Pane aPane = new Pane();
        Label bitLabel = new Label("Total Number of Bits:");
        bitLabel.relocate(10,10);
        aPane.getChildren().add(bitLabel);

        TextField bitField = new TextField();
        bitField.relocate(175,10);
        bitField.setPrefSize(150, 30);
        aPane.getChildren().add(bitField);

        Label expLabel = new Label("Number of Exponent Bits:");
        expLabel.relocate(10,50);
        aPane.getChildren().add(expLabel);

        TextField expField = new TextField();
        expField.relocate(175,50);
        expField.setPrefSize(150, 30);
        aPane.getChildren().add(expField);

        Label excessLabel = new Label("Excess:");
        excessLabel.relocate(10,90);
        aPane.getChildren().add(excessLabel);

        TextField excessField = new TextField();
        excessField.relocate(175,90);
        excessField.setPrefSize(150, 30);
        aPane.getChildren().add(excessField);

        Label manLabel = new Label("Number of Mantissa Bits:");
        manLabel.relocate(10,130);
        aPane.getChildren().add(manLabel);

        TextField manField = new TextField();
        manField.relocate(175,130);
        manField.setPrefSize(150, 30);
        aPane.getChildren().add(manField);

        Label fpLabel = new Label("Floating Point Number:");
        fpLabel.relocate(10,170);
        aPane.getChildren().add(fpLabel);

        TextField fpField = new TextField();
        fpField.relocate(175,170);
        fpField.setPrefSize(150, 30);
        aPane.getChildren().add(fpField);

        primaryStage.setTitle("Floating Point Calculator");
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(aPane, 400, 400));
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
