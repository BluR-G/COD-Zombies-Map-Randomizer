module ca.robert {
    requires javafx.controls;
    requires javafx.fxml;

    opens ca.robert to javafx.fxml;
    exports ca.robert;
}
