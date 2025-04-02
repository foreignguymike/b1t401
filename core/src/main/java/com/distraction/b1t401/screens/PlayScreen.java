package com.distraction.b1t401.screens;

import com.distraction.b1t401.Context;

public class PlayScreen extends Screen {

    public PlayScreen(Context context) {
        super(context);
    }

    @Override
    public void input() {

    }

    @Override
    public void update(float dt) {
        System.out.println("update");
    }

    @Override
    public void render() {
        System.out.println("render");
    }

}
