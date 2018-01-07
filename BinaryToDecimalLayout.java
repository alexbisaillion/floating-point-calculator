import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

public class BinaryToDecimalLayout extends GridPane {
    public Label bitLabel, expLabel, excessLabel, manLabel;
    public TextField bitField, expField, excessField, manField, resultField;
    public Menu operationMenu;
    public MenuBar menuBar;
    public MenuItem decToBin, binToDec;
    public Button compute;

    public BinaryToDecimalLayout() {
        setHgap(10);
        setVgap(10);

        operationMenu = new Menu("Select Operation");
        menuBar = new MenuBar();
        menuBar.getMenus().add(operationMenu);

        decToBin = new MenuItem("Decimal to Binary");
        operationMenu.getItems().add(decToBin);

        binToDec = new MenuItem("Binary to Decimal");
        operationMenu.getItems().add(binToDec);

        add(menuBar,0,0,4,1);

        bitLabel = new Label("Sign Bit:");
        bitLabel.setPrefSize(100,30);
        add(bitLabel,1,1);

        bitField = new TextField();
        bitField.setPrefSize(150, 30);
        add(bitField,2,1);

        expLabel = new Label("Exponent:");
        expLabel.setPrefSize(100,30);
        add(expLabel,1,2);

        expField = new TextField();
        expField.setPrefSize(150, 30);
        add(expField,2,2);

        excessLabel = new Label("Excess:");
        excessLabel.setPrefSize(100,30);
        add(excessLabel,1,3);

        excessField = new TextField();
        excessField.setPrefSize(150, 30);
        add(excessField,2,3);

        manLabel = new Label("Mantissa:");
        manLabel.setPrefSize(100,30);
        add(manLabel,1,4);

        manField = new TextField();
        manField.setPrefSize(150, 30);
        add(manField,2,4);

        compute = new Button("COMPUTE");
        compute.setPrefSize(260,30);
        add(compute,1,5,2,1);

        resultField = new TextField();
        resultField.setPrefSize(260,30);
        resultField.setDisable(true);
        add(resultField,1,6,2,1);
    }
}
