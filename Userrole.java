import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.ChoiceDialog;
import java.util.Optional;
import java.util.ArrayList;
import java.util.*;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Userrole extends Application {
    @Override
    public void start (Stage Primarystage){
        List<String> choices = new ArrayList<>();
        choices.add("1. Administrator");
        choices.add("2. Faculty");
        choices.add("3. Staff");
        choices.add("4. Student");
        choices.add("5. Guest");

        ChoiceDialog<String> dialog = new ChoiceDialog<>("1. Administrator", choices);
        dialog.setTitle("Your role");
        dialog.setHeaderText("Choose your role");
        dialog.setContentText("Please choose your role:");

        Optional<String> result = dialog.showAndWait();
        String choice=result.get();

	Alert alert= new Alert(AlertType.INFORMATION);
	alert.setTitle("Greeting");
	alert.setHeaderText("Hi");
        switch(choice){
            case "1. Administrator":
               alert.setContentText("Welcome Administrator");
                break;
            case "2. Faculty":
                alert.setContentText("Welcome Faculty");
                break;
            case "3. Staff":
                alert.setContentText("Welcome Staff");
                break;
            case "4. Student":
                alert.setContentText("Welcome Student");
                break;
            case "5. Guest":
                alert.setContentText("Welcome Guest");
                break;
            default:
                alert.setContentText("Welcome Administrator");
        }
	alert.showAndWait();
        
    }

}



