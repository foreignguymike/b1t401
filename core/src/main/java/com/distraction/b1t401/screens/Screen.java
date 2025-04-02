package com.distraction.b1t401.screens;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.distraction.b1t401.Constants;
import com.distraction.b1t401.Context;

public abstract class Screen {

    protected Context context;

    protected final TextureRegion pixel;

    public boolean transparent = false;

    protected OrthographicCamera cam;
    protected OrthographicCamera uiCam;

    protected SpriteBatch sb;

    protected boolean ignoreInput;

    public Transition in = null;
    public Transition out = null;

    protected Screen(Context context) {
        this.context = context;
        this.sb = context.sb;

        pixel = context.getPixel();

        cam = new OrthographicCamera();
        cam.setToOrtho(false, Constants.WIDTH, Constants.HEIGHT);

        uiCam = new OrthographicCamera();
        uiCam.setToOrtho(false, Constants.WIDTH, Constants.HEIGHT);
    }

    public void resume() {}

    public abstract void input();

    public abstract void update(float dt);

    public abstract void render();

}
