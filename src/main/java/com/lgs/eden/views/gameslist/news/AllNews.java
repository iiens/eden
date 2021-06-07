package com.lgs.eden.views.gameslist.news;

import com.lgs.eden.utils.Utility;
import com.lgs.eden.utils.ViewsPath;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.VBox;

/**
 * Show all news of a game
 */
public class AllNews {
    // ------------------------------ STATIC ----------------------------- \\

    public static Parent getScreen(int gameID) {
        FXMLLoader loader = Utility.loadView(ViewsPath.GAMES_ALL_NEWS.path);
        Parent parent = Utility.loadViewPane(loader);
        AllNews controller = loader.getController();
        controller.init();
        return parent;
    }

    // ------------------------------ INSTANCE ----------------------------- \\

    @FXML
    private VBox newsPanel;

    private void init() {
        for (int i = 0; i < 7; i++) {
            newsPanel.getChildren().add(AllNewsCell.getScreen());
        };
    }

}
