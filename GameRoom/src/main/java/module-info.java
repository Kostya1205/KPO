module com.gameroom {
    requires org.apache.logging.log4j;
    requires WriteTF;
    requires javafx.controls;
    requires javafx.fxml;
    requires com.dlsc.formsfx;

    opens com.gameroom to javafx.fxml;
    exports com.gameroom;
}