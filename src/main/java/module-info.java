module syderial.stickgladiators {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens syderial.stickgladiators to javafx.fxml;
    exports syderial.stickgladiators;
}