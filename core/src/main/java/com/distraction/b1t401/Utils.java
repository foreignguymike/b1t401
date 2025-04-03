package com.distraction.b1t401;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Utils {

    public static void drawCentered(SpriteBatch sb, TextureRegion image, float x, float y) {
        sb.draw(image, x - image.getRegionWidth() / 2f, y - image.getRegionHeight() / 2f);
    }

    public static void drawCentered(SpriteBatch sb, TextureRegion image, float x, float y, boolean flip) {
        if (flip) {
            sb.draw(image, x + image.getRegionWidth() / 2f, y - image.getRegionHeight() / 2f, -image.getRegionWidth(), image.getRegionHeight());
        } else {
            drawCentered(sb, image, x, y);
        }
    }

}
