import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.ChoiceDialog;
import java.util.Optional;
import java.util.ArrayList;
import java.util.*;

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
        switch(choice){
            case "1. Administrator":
               System.out.println("Welcome Administrator");
                break;
            case "2. Faculty":
                System.out.println("Welcome Faculty");
                break;
            case "3. Staff":
                System.out.println("Welcome Staff");
                break;
            case "4. Student":
                System.out.println("Welcome Student");
                break;
            case "5. Guest":
                System.out.println("Welcome Guest");
                break;
            default:
                System.out.println("Welcome Administrator");
        }
        
    }

}


