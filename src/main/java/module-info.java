module com.jasong.githubpet.githubpet {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.jasong.githubpet.githubpet to javafx.fxml;
    exports com.jasong.githubpet.githubpet;
}