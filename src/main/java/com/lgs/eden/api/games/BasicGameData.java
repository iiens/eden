package com.lgs.eden.api.games;

import com.lgs.eden.utils.Utility;
import javafx.scene.image.Image;

/**
 * Basic Game information. Mainly
 * used when we don't want to fetch to much
 * data from the API unless the client wants
 * more.
 */
public class BasicGameData {

    public final int id;
    public final String name;
    public final Image icon;

    public BasicGameData(int id, String name, String icon) {
        this.id = id;
        this.name = name;
        this.icon = icon != null ? Utility.loadImage(icon) : null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BasicGameData)) return false;

        BasicGameData that = (BasicGameData) o;

        if (this.id != that.id) return false;
        return this.name.equals(that.name);
    }

    @Override
    public int hashCode() {
        int result = this.id;
        result = 31 * result + this.name.hashCode();
        return result;
    }
}