package com.distraction.b1t401.entity;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.distraction.b1t401.Context;
import com.distraction.b1t401.Utils;

public class Player extends Entity {

    private TextureRegion image;

    public Player(Context context) {
        image = context.getImage("player");
    }

    @Override
    public void render(SpriteBatch sb) {
        Utils.drawCentered(sb, image, x, y);
    }
}
