module com.rimi.boo.springbootaws {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.rimi.boo.springbootaws to javafx.fxml;
    exports com.rimi.boo.springbootaws;
}