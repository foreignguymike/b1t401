package com.distraction.b1t401.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.distraction.b1t401.Constants;
import com.distraction.b1t401.Context;
import com.distraction.b1t401.entity.Player;

public class PlayScreen extends Screen {

    private final Player player;

    private TextureRegion bg;

    public PlayScreen(Context context) {
        super(context);

        player = new Player(context);
        player.x = 100;
        player.y = 100;

        bg = context.getImage("bg1");
    }

    @Override
    public void input() {
        if (ignoreInput) return;

        player.up = Gdx.input.isKeyPressed(Input.Keys.UP);
        player.down = Gdx.input.isKeyPressed(Input.Keys.DOWN);
        player.left = Gdx.input.isKeyPressed(Input.Keys.LEFT);
        player.right = Gdx.input.isKeyPressed(Input.Keys.RIGHT);

        if (Gdx.input.isKeyJustPressed(Input.Keys.Z)) {
            player.attack();
        }
    }

    @Override
    public void update(float dt) {
        player.update(dt);
    }

    @Override
    public void render() {
        sb.begin();

        sb.setProjectionMatrix(uiCam.combined);
        sb.setColor(Constants.DARK);
        sb.draw(pixel, 0, 0, Constants.WIDTH, Constants.HEIGHT);

        sb.setProjectionMatrix(cam.combined);
        sb.setColor(1, 1, 1, 1);
        sb.draw(bg, 0, 0);

        player.render(sb);

        sb.end();
    }

}
