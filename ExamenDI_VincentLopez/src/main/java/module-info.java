module org.example.examendi_vincentlopez {
    requires javafx.controls;
    requires javafx.fxml;
    requires junit;


    opens org.example.examendi_vincentlopez to javafx.fxml;
    exports org.example.examendi_vincentlopez;
}