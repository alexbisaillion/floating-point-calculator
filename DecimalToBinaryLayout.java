import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

public class DecimalToBinaryLayout extends GridPane {
    public Label expLabel, excessLabel, manLabel, decLabel;
    public TextField expField, excessField, manField, decField, resultField;
    public Menu operationMenu;
    public MenuBar menuBar;
    public MenuItem decToBin, binToDec;
    public Button compute;

    public DecimalToBinaryLayout() {
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

        expLabel = new Label("Exponent Length:");
        expLabel.setPrefSize(100,30);
        add(expLabel,1,1);

        expField = new TextField();
        expField.setPrefSize(150, 30);
        add(expField,2,1);

        excessLabel = new Label("Excess:");
        excessLabel.setPrefSize(100,30);
        add(excessLabel,1,2);

        excessField = new TextField();
        excessField.setPrefSize(150, 30);
        add(excessField,2,2);

        manLabel = new Label("Mantissa Length:");
        manLabel.setPrefSize(100,30);
        add(manLabel,1,3);

        manField = new TextField();
        manField.setPrefSize(150, 30);
        add(manField,2,3);

        decLabel = new Label("Decimal:");
        decLabel.setPrefSize(100,30);
        add(decLabel,1,4);

        decField = new TextField();
        decField.setPrefSize(150, 30);
        add(decField,2,4);

        compute = new Button("COMPUTE");
        compute.setPrefSize(260,30);
        add(compute,1,5,2,1);

        resultField = new TextField();
        resultField.setPrefSize(260,30);
        resultField.setDisable(true);
        add(resultField,1,6,2,1);
    }
}
