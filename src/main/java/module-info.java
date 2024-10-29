module com.miu.mymavendemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.miu.mymavendemo to javafx.fxml;
    exports com.miu.mymavendemo;
}