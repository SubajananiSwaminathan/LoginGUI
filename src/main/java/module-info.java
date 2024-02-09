module com.example.designlecture1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.designlecture1 to javafx.fxml;
    exports com.example.designlecture1;
}