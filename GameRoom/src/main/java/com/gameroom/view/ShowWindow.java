package com.gameroom.view;


import com.gameroom.controller.GameMachine;
import com.gameroom.controller.LocalManager;
import com.gameroom.model.GameRoom;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ResourceBundle;

public class ShowWindow {
    public ShowWindow(GameRoom gameRoom, Stage primaryStage) {
        ResourceBundle messages = LocalManager.getMessage();
        TextArea textArea = new TextArea();
        textArea.setPrefColumnCount(55);
        textArea.setPrefRowCount(27);


        Button btnAdd = new Button(messages.getString("btnAdd"));
        btnAdd.setFont(new Font(15));
        btnAdd.setOnAction(event -> textArea.setText(new GameMachine().buySubject(gameRoom)));

        Button btnAddHard = new Button(messages.getString("btnAddHard"));
        btnAddHard.setFont(new Font(15));
        btnAddHard.setOnAction(event -> textArea.setText(new GameMachine().buySubjectHurd(gameRoom)));


        Button btnClear = new Button(messages.getString("btnClear"));
        btnClear.setFont(new Font(15));
        btnClear.setOnAction(event ->textArea.clear());

        Button btnPriceOfAllSubjects = new Button(messages.getString("btnPriceOfAllSubjects"));
        btnPriceOfAllSubjects.setFont(new Font(15));

        btnPriceOfAllSubjects.setOnAction(event -> textArea.setText(gameRoom.priceOfAllSubjects()));

        Button btnWeightOfAllSubjects = new Button(messages.getString("btnWeightOfAllSubjects"));
        btnWeightOfAllSubjects.setFont(new Font(15));

        btnWeightOfAllSubjects.setOnAction(event -> textArea.setText(gameRoom.weightOfAllSubjects()));

        Button btnSubjectWithMaxPrice = new Button(messages.getString("btnSubjectWithMaxPrice"));
        btnSubjectWithMaxPrice.setFont(new Font(15));

        btnSubjectWithMaxPrice.setOnAction(event -> textArea.setText(gameRoom.subjectWithMaxPrice()));

        Button btnSubjectWithMaxWeight = new Button(messages.getString("btnSubjectWithMaxWeight"));
        btnSubjectWithMaxWeight.setFont(new Font(15));

        btnSubjectWithMaxWeight.setOnAction(event -> textArea.setText(gameRoom.subjectWithMaxWeight()));

        Button btnAllSubjects = new Button(messages.getString("btnAllSubjects"));
        btnAllSubjects.setFont(new Font(15));

        btnAllSubjects.setOnAction(event -> textArea.setText(gameRoom.allSubjects().toString()));


        Button btnAllSubjectsToFile = new Button(messages.getString("btnAllSubjectsToFile"));
        btnAllSubjectsToFile.setFont(new Font(15));

        btnAllSubjectsToFile.setOnAction(event -> textArea.setText(gameRoom.allSubjectsToFile()));


        Button btnSortByPrice = new Button(messages.getString("btnSortByPrice"));
        btnSortByPrice.setFont(new Font(15));

        btnSortByPrice.setOnAction(event -> gameRoom.sortByPrice());


        Button btnSortByWeight = new Button(messages.getString("btnSortByWeight"));
        btnSortByWeight.setFont(new Font(15));

        btnSortByWeight.setOnAction(event -> gameRoom.sortByWeight());


        TextField textField = new TextField();
        textField.setFont(new Font(15));


        Button btnSearchByPrice = new Button(messages.getString("btnSearchByPrice"));
        btnSearchByPrice.setFont(new Font(15));

        btnSearchByPrice.setOnAction(event -> textArea.setText(gameRoom.searchByPrice(textField.getText())));


        Button btnSearchByName = new Button(messages.getString("btnSearchByName"));
        btnSearchByName.setFont(new Font(15));

        btnSearchByName.setOnAction(event -> textArea.setText(gameRoom.searchByName(textField.getText())));

        Button btnAmountOfOperation = new Button(messages.getString("btnAmountOfOperation"));
        btnAmountOfOperation.setFont(new Font(15));

        btnAmountOfOperation.setOnAction(event -> textArea.setText(gameRoom.getAmountOfOperation()));


        Button btnSave = new Button(messages.getString("btnSave"));
        btnSave.setFont(new Font(15));
        btnSave.setOnAction(event -> {
            try {
                WriteSavedGameRoom.setGameRoom(gameRoom);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });


        Button btnNew = new Button(messages.getString("btnNew"));
        btnNew.setFont(new Font(15));
        btnNew.setOnAction(event -> {
            gameRoom.clean();
        });
        FlowPane root = new FlowPane(10,10, textArea,btnAdd,btnAddHard,btnClear,btnPriceOfAllSubjects,btnWeightOfAllSubjects
                ,btnSubjectWithMaxPrice,btnSubjectWithMaxWeight,btnAllSubjects,btnAllSubjectsToFile,btnSortByPrice,btnSortByWeight,textField
                ,btnSearchByPrice,btnSearchByName,btnAmountOfOperation,btnSave,btnNew);
        root.setAlignment(Pos.CENTER);


        primaryStage.setTitle("GameRoom");
        primaryStage.setScene(new Scene(root, 700, 700));
        primaryStage.show();
    }
}
