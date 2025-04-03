package com.distraction.b1t401.entity;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import com.distraction.b1t401.Context;
import com.distraction.b1t401.Utils;

public class Player extends Entity {

    private static final int SPEED = 30;

    private TextureRegion image;
    private TextureRegion[] images;

    public boolean up, down, left, right;
    private boolean mirror;

    private float attackTime = 0;
    private float attackCDTime = 0;
    private int attackCombo = 0;

    public Rectangle bounds = new Rectangle();

    public Player(Context context) {
        images = new TextureRegion[] {
            context.getImage("playeridle"),
            context.getImage("playerpunch"),
            context.getImage("playerkick")
        };
        image = images[0];
    }

    public void attack() {
        System.out.println("attacking... time: " + attackTime + ", cd: " + attackCDTime + ", combo: " + attackCombo);
        if (attackCDTime > 0) return;
        if (attackCombo == 0) {
            attackCombo++;
            attackTime = 0.5f;
            attackCDTime = 0.1f;
            image = images[1];
        } else if (attackCombo == 1) {
            attackCombo++;
            attackTime = 0.5f;
            attackCDTime = 0.1f;
            image = images[1];
        } else if (attackCombo == 2) {
            attackTime = attackCDTime = 0.4f;
            image = images[2];
        }
    }

    @Override
    public void update(float dt) {
        if (up) dy = SPEED;
        else if (down) dy = -SPEED;
        else dy = 0;
        if (left) {
            dx = -SPEED;
            if (attackCDTime <= 0) mirror = true;
        }
        else if (right) {
            dx = SPEED;
            if (attackCDTime <= 0) mirror = false;
        }
        else dx = 0;

        if (attackCDTime <= 0) {
            x += dx * dt;
            y += dy * dt;
        }

        attackTime -= dt;
        attackCDTime -= dt;
        if (attackTime < 0) attackCombo = 0;
        if (attackCDTime < 0) image = images[0];
    }

    @Override
    public void render(SpriteBatch sb) {
        Utils.drawCentered(sb, image, x, y, mirror);
    }
}
