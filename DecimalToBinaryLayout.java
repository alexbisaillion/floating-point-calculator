import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
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
        setPadding(new Insets(0,0,10,0));

        operationMenu = new Menu("Select Operation");
        menuBar = new MenuBar();
        menuBar.getMenus().add(operationMenu);

        decToBin = new MenuItem("Decimal to Binary");
        operationMenu.getItems().add(decToBin);

        binToDec = new MenuItem("Binary to Decimal");
        operationMenu.getItems().add(binToDec);

        add(menuBar,0,0,4,1);

        expLabel = new Label("Exponent Length:");
        expLabel.setMinSize(100,30);
        expLabel.setPrefSize(Integer.MAX_VALUE,Integer.MAX_VALUE);
        add(expLabel,1,1);

        expField = new TextField();
        expField.setMinSize(150, 30);
        expField.setPrefSize(Integer.MAX_VALUE,Integer.MAX_VALUE);
        add(expField,2,1);

        excessLabel = new Label("Excess:");
        excessLabel.setMinSize(100,30);
        excessLabel.setPrefSize(Integer.MAX_VALUE,Integer.MAX_VALUE);
        add(excessLabel,1,2);

        excessField = new TextField();
        excessField.setMinSize(150, 30);
        excessField.setPrefSize(Integer.MAX_VALUE,Integer.MAX_VALUE);
        add(excessField,2,2);

        manLabel = new Label("Mantissa Length:");
        manLabel.setMinSize(100,30);
        manLabel.setPrefSize(Integer.MAX_VALUE,Integer.MAX_VALUE);
        add(manLabel,1,3);

        manField = new TextField();
        manField.setMinSize(150, 30);
        manField.setPrefSize(Integer.MAX_VALUE,Integer.MAX_VALUE);
        add(manField,2,3);

        decLabel = new Label("Decimal:");
        decLabel.setMinSize(100,30);
        decLabel.setPrefSize(Integer.MAX_VALUE,Integer.MAX_VALUE);
        add(decLabel,1,4);

        decField = new TextField();
        decField.setMinSize(150, 30);
        decField.setPrefSize(Integer.MAX_VALUE,Integer.MAX_VALUE);
        add(decField,2,4);

        compute = new Button("COMPUTE");
        compute.setMinSize(260,30);
        compute.setPrefSize(Integer.MAX_VALUE,Integer.MAX_VALUE);
        add(compute,1,5,2,1);

        resultField = new TextField();
        resultField.setMinSize(260,30);
        resultField.setPrefSize(Integer.MAX_VALUE,Integer.MAX_VALUE);
        resultField.setEditable(false);
        add(resultField,1,6,2,1);

        compute.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                if (expField.getText().length() > 0 && excessField.getText().length() > 0 && manField.getText().length() > 0 && decField.getText().length() > 0) {
                    int intExp = Integer.parseInt(expField.getText());
                    int intExc = Integer.parseInt(excessField.getText());
                    int intMan = Integer.parseInt(manField.getText());
                    float floatDec = Float.parseFloat(decField.getText());
                    FloatRepresentation input = new FloatRepresentation(intExp, intExc, intMan, floatDec);
                    resultField.setText(input.convertToBinaryRep());
                }
            }
        });
    }
}
