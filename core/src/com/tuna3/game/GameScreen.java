package com.tuna3.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.ScreenUtils;

public class GameScreen implements Screen {
    final TunaGameClass gameClass;
    private CompoundTexture img, colTest;
    private OrthographicCamera camera;

    public GameScreen(final TunaGameClass gameClassPass){
        gameClass = gameClassPass;

        camera = new OrthographicCamera();
        camera.setToOrtho(false, 800, 400);

        img = new CompoundTexture("icon.png");
        colTest = new CompoundTexture("colision.png");

    }

    @Override
    public void show() {
    }

    @Override
    public void render(float delta) {
        if(img.mouseHovering()){
            ScreenUtils.clear(0, 1, 0, 0.1f);
        }else{ScreenUtils.clear(1, 0, 0, 0.1f);}


        camera.update();
        gameClass.batch.setProjectionMatrix(camera.combined);

        gameClass.batch.begin();
        gameClass.batch.draw(img.texture, img.xPos, img.yPos);
        gameClass.batch.draw(colTest.texture, colTest.xPos, colTest.yPos);
        gameClass.drawFPS();

        gameClass.font.draw(gameClass.batch, "MXPos: " + Gdx.input.getX(),0,50);    //debug sida Asqueroso mugriento hijoputa
        gameClass.font.draw(gameClass.batch, "MYPos: " + (Gdx.graphics.getHeight()-Gdx.input.getY()),0,30);

        gameClass.batch.end();

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        img.dispose();
        colTest.dispose();
    }
}
