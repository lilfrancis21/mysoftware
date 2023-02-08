module com.example.wgusoftware {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.wgusoftware to javafx.fxml;
    exports com.example.wgusoftware;
}