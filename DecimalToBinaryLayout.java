import javafx.scene.control.*;
import javafx.scene.layout.Pane;

public class DecimalToBinaryLayout extends Pane {
    public Label bitLabel, expLabel, excessLabel, manLabel;
    public TextField bitField, expField, excessField, manField;
    public Menu operationMenu;
    public MenuBar menuBar;
    public MenuItem decToBin, binToDec;

    public DecimalToBinaryLayout() {
        operationMenu = new Menu("Select Operation");
        menuBar = new MenuBar();
        menuBar.getMenus().add(operationMenu);

        decToBin = new MenuItem("Decimal to Binary");
        operationMenu.getItems().add(decToBin);

        binToDec = new MenuItem("Binary to Decimal");
        operationMenu.getItems().add(binToDec);

        bitLabel = new Label("Sign Bit:");
        bitLabel.relocate(10,10);

        bitField = new TextField();
        bitField.relocate(175,10);
        bitField.setPrefSize(150, 30);

        expLabel = new Label("Exponent:");
        expLabel.relocate(10,50);

        expField = new TextField();
        expField.relocate(175,50);
        expField.setPrefSize(150, 30);

        excessLabel = new Label("Mantissa:");
        excessLabel.relocate(10,90);

        excessField = new TextField();
        excessField.relocate(175,90);
        excessField.setPrefSize(150, 30);

        manLabel = new Label("Excess:");
        manLabel.relocate(10,130);

        manField = new TextField();
        manField.relocate(175,130);
        manField.setPrefSize(150, 30);

        getChildren().addAll(menuBar, bitLabel, expLabel, excessLabel, manLabel, bitField, expField, excessField, manField);
    }
}
