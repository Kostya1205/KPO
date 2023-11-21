package com.gameroom.view;


import com.gameroom.controller.GameMachine;
import com.gameroom.model.GameRoom;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ShowWindow {
    public ShowWindow(GameRoom gameRoom, Stage primaryStage){
        TextArea textArea = new TextArea();
        textArea.setPrefColumnCount(55);
        textArea.setPrefRowCount(27);


        Button btnAdd = new Button("Add subject in room");
        btnAdd.setFont(new Font(15));
        btnAdd.setOnAction(event -> textArea.setText(new GameMachine().buySubject(gameRoom)));

        Button btnAddHard = new Button("Add subject Hurd in room");
        btnAddHard.setFont(new Font(15));
        btnAddHard.setOnAction(event -> textArea.setText(new GameMachine().buySubjectHurd(gameRoom)));


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

        btnAllSubjects.setOnAction(event -> textArea.setText(gameRoom.allSubjects().toString()));


        Button btnAllSubjectsToFile = new Button("Print AllSubjects To File");
        btnAllSubjectsToFile.setFont(new Font(15));

        btnAllSubjectsToFile.setOnAction(event -> textArea.setText(gameRoom.allSubjectsToFile()));


        Button btnSortByPrice = new Button("Sort By Price");
        btnSortByPrice.setFont(new Font(15));

        btnSortByPrice.setOnAction(event -> gameRoom.sortByPrice());


        Button btnSortByWeight = new Button("Sort By Weight");
        btnSortByWeight.setFont(new Font(15));

        btnSortByWeight.setOnAction(event -> gameRoom.sortByWeight());


        TextField textField = new TextField();
        textField.setFont(new Font(15));


        Button btnSearchByPrice = new Button("Search by price");
        btnSearchByPrice.setFont(new Font(15));

        btnSearchByPrice.setOnAction(event -> textArea.setText(gameRoom.searchByPrice(textField.getText())));


        Button btnSearchByName = new Button("Search by name");
        btnSearchByName.setFont(new Font(15));

        btnSearchByName.setOnAction(event -> textArea.setText(gameRoom.searchByName(textField.getText())));

        Button btnAmountOfOperation = new Button("Amount Of Operation");
        btnAmountOfOperation.setFont(new Font(15));

        btnAmountOfOperation.setOnAction(event -> textArea.setText(gameRoom.getAmountOfOperation()));

        FlowPane root = new FlowPane(10,10, textArea,btnAdd,btnAddHard,btnClear,btnPriceOfAllSubjects,btnWeightOfAllSubjects
                ,btnSubjectWithMaxPrice,btnSubjectWithMaxWeight,btnAllSubjects,btnAllSubjectsToFile,btnSortByPrice,btnSortByWeight,textField
                ,btnSearchByPrice,btnSearchByName,btnAmountOfOperation);
        root.setAlignment(Pos.CENTER);


        primaryStage.setTitle("GameRoom");
        primaryStage.setScene(new Scene(root, 700, 700));
        primaryStage.show();
    }
}
