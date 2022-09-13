module TestPackage.MavenPorj {
    requires javafx.controls;
    requires javafx.fxml;
    
    requires transitive javafx.graphics;

    opens TestPackage.MavenPorj to javafx.fxml;
    exports TestPackage.MavenPorj;
}
