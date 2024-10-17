module org.example.test1shivam {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.test1shivam to javafx.fxml;
    exports org.example.test1shivam;
}