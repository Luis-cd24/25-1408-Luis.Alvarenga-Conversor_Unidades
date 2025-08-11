module com.programacion.conversor_unidades {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.programacion.conversor_unidades to javafx.fxml;
    exports com.programacion.conversor_unidades;
}