package lesson4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    TextArea area;
    @FXML
    TextField field;

    public void clickAction(ActionEvent actionEvent) {
        area.appendText(field.getText() + "\n");
        field.clear();
    }
    public void enterAction(ActionEvent actionEvent){
        area.appendText(field.getText() + "\n");
        field.clear();
    }
}
