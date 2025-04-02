package com.distraction.b1t401.screens;

import com.distraction.b1t401.Constants;
import com.distraction.b1t401.Context;
import com.distraction.b1t401.entity.Player;

public class PlayScreen extends Screen {

    private final Player player;

    public PlayScreen(Context context) {
        super(context);

        player = new Player(context);
        player.x = 100;
        player.y = 100;
    }

    @Override
    public void input() {

    }

    @Override
    public void update(float dt) {

    }

    @Override
    public void render() {
        sb.begin();

        sb.setProjectionMatrix(uiCam.combined);
        sb.setColor(Constants.DARK);
        sb.draw(pixel, 0, 0, Constants.WIDTH, Constants.HEIGHT);

        sb.setColor(1, 1, 1, 1);
        player.render(sb);

        sb.end();
    }

}
