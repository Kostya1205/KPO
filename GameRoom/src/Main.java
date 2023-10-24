import controller.GameMachine;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import model.GameRoom;

public class Main extends Application {
    public GameRoom gameRoom;

    public void start(Stage primaryStage) {
        gameRoom = new GameRoom();
        TextArea textArea = new TextArea();
        textArea.setPrefColumnCount(55);
        textArea.setPrefRowCount(27);


        Button btnAdd = new Button("Add subject in room");
        btnAdd.setFont(new Font(15));
        btnAdd.setOnAction(event -> textArea.setText(new GameMachine().buySubject(gameRoom)));

        Button btnClear = new Button("Clear textArea");
        btnClear.setFont(new Font(15));
        btnClear.setOnAction(event ->textArea.clear());

        Button btnPriceOfAllSubjects = new Button("PriceOfAllSubjects");
        btnPriceOfAllSubjects.setFont(new Font(15));

        btnPriceOfAllSubjects.setOnAction(event -> textArea.setText(gameRoom.priceOfAllSubjects()));

        Button btnWeightOfAllSubjects = new Button("WeightOfAllSubjects");
        btnWeightOfAllSubjects.setFont(new Font(15));

        btnWeightOfAllSubjects.setOnAction(event -> textArea.setText(gameRoom.weightOfAllSubjects()));

        Button btnSubjectWithMaxPrice = new Button("SubjectWithMaxPrice");
        btnSubjectWithMaxPrice.setFont(new Font(15));

        btnSubjectWithMaxPrice.setOnAction(event -> textArea.setText(gameRoom.subjectWithMaxPrice()));

        Button btnSubjectWithMaxWeight = new Button("SubjectWithMaxWeight");
        btnSubjectWithMaxWeight.setFont(new Font(15));

        btnSubjectWithMaxWeight.setOnAction(event -> textArea.setText(gameRoom.subjectWithMaxWeight()));

        Button btnAllSubjects = new Button("Print AllSubjects");
        btnAllSubjects.setFont(new Font(15));

        btnAllSubjects.setOnAction(event -> textArea.setText(gameRoom.allSubjects()));

        FlowPane root = new FlowPane(10,10, textArea,btnAdd,btnClear,btnPriceOfAllSubjects,btnWeightOfAllSubjects
                ,btnSubjectWithMaxPrice,btnSubjectWithMaxWeight,btnAllSubjects);
        root.setAlignment(Pos.CENTER);


        primaryStage.setTitle("GameRoom");
        primaryStage.setScene(new Scene(root, 700, 600));
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}