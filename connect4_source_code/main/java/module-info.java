module com.shailesh.connect4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.shailesh.connect4 to javafx.fxml;
    exports com.shailesh.connect4;
}