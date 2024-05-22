module com.example.comissaoexcel {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.apache.poi.poi;
    requires org.apache.poi.ooxml;


    opens com.example.comissaoexcel to javafx.fxml;
    exports com.example.comissaoexcel;
}