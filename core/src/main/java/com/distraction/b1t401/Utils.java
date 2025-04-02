package com.distraction.b1t401;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Utils {

    public static void drawCentered(SpriteBatch sb, TextureRegion image, float x, float y) {
        sb.draw(image, x - image.getRegionWidth() / 2f, y - image.getRegionHeight() / 2f);
    }

}
