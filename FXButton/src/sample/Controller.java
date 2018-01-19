package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {
    @FXML
    private Button ClickHereButton;

// the method with lambda here

    public void initialize(){
        ClickHereButton.setOnAction(event -> System.out.println("Button clicked"));
    }

//    public void initialize(){
//        ClickHereButton.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                System.out.println("Button clicked");
//            }
//        });
//    }
}
