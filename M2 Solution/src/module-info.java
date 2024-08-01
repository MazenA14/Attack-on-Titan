module M2.Solution {
    requires javafx.swt;
    requires javafx.media;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.controls;
    requires javafx.graphics;
    requires java.desktop;
    requires junit4;
    requires java.xml.crypto;
    opens game.gui.Controller;
    opens game.gui.View;
}