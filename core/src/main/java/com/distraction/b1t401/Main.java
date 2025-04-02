package com.distraction.b1t401;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;

public class Main extends ApplicationAdapter {

    private Context context;

    @Override
    public void create() {
        Gdx.input.setCatchKey(Input.Keys.UP, true);
        Gdx.input.setCatchKey(Input.Keys.DOWN, true);
        Gdx.input.setCatchKey(Input.Keys.SPACE, true);

        context = new Context();
    }

    @Override
    public void render() {
        context.sm.input();
        context.sm.update(Gdx.graphics.getDeltaTime());
        context.sm.render();
    }

    @Override
    public void dispose() {
        context.dispose();
    }
}
