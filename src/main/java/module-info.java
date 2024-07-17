module com.example.calculator_exam_170724 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.calculator_exam_170724 to javafx.fxml;
    exports com.example.calculator_exam_170724;
}