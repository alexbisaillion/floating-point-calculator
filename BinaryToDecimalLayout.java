import javafx.geometry.Insets;
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
        setPadding(new Insets(0,0,10,0));

        operationMenu = new Menu("Select Operation");
        menuBar = new MenuBar();
        menuBar.getMenus().add(operationMenu);

        decToBin = new MenuItem("Decimal to Binary");
        operationMenu.getItems().add(decToBin);

        binToDec = new MenuItem("Binary to Decimal");
        operationMenu.getItems().add(binToDec);

        add(menuBar,0,0,4,1);

        bitLabel = new Label("Sign Bit:");
        bitLabel.setMinSize(100,30);
        bitLabel.setPrefSize(Integer.MAX_VALUE,Integer.MAX_VALUE);
        add(bitLabel,1,1);

        bitField = new TextField();
        bitField.setMinSize(150, 30);
        bitField.setPrefSize(Integer.MAX_VALUE,Integer.MAX_VALUE);
        add(bitField,2,1);

        expLabel = new Label("Exponent:");
        expLabel.setMinSize(100,30);
        expLabel.setPrefSize(Integer.MAX_VALUE,Integer.MAX_VALUE);
        add(expLabel,1,2);

        expField = new TextField();
        expField.setMinSize(150, 30);
        expField.setPrefSize(Integer.MAX_VALUE,Integer.MAX_VALUE);
        add(expField,2,2);

        excessLabel = new Label("Excess:");
        excessLabel.setMinSize(100,30);
        excessLabel.setPrefSize(Integer.MAX_VALUE,Integer.MAX_VALUE);
        add(excessLabel,1,3);

        excessField = new TextField();
        excessField.setMinSize(150, 30);
        excessField.setPrefSize(Integer.MAX_VALUE,Integer.MAX_VALUE);
        add(excessField,2,3);

        manLabel = new Label("Mantissa:");
        manLabel.setMinSize(100,30);
        manLabel.setPrefSize(Integer.MAX_VALUE,Integer.MAX_VALUE);
        add(manLabel,1,4);

        manField = new TextField();
        manField.setMinSize(150, 30);
        manField.setPrefSize(Integer.MAX_VALUE,Integer.MAX_VALUE);
        add(manField,2,4);

        compute = new Button("COMPUTE");
        compute.setMinSize(260,30);
        compute.setPrefSize(Integer.MAX_VALUE,Integer.MAX_VALUE);
        add(compute,1,5,2,1);

        resultField = new TextField();
        resultField.setMinSize(260,30);
        resultField.setPrefSize(Integer.MAX_VALUE,Integer.MAX_VALUE);
        resultField.setDisable(true);
        add(resultField,1,6,2,1);
    }
}
