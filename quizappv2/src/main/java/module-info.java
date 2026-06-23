module com.dvtl.quizappv2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.sql;
    opens com.dvtl.quizappv2 to javafx.fxml;
    exports com.dvtl.quizappv2;
}
