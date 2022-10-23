package com.tuna3.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.ScreenUtils;

public class MainMenuScreen implements Screen {
    final TunaGameClass gameClass;
    private OrthographicCamera camera;

    public MainMenuScreen(final TunaGameClass gameClassPass){
        gameClass = gameClassPass;

        camera = new OrthographicCamera();
        camera.setToOrtho(false, 800, 400);
    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(1,1,1,1);

        camera.update();
        gameClass.batch.setProjectionMatrix(camera.combined);

        gameClass.batch.begin();
        gameClass.font.draw(gameClass.batch, "xdxdxd", 100, 150);
        gameClass.font.draw(gameClass.batch, "Puto el que lo lea", 100, 100);
        gameClass.drawFPS();
        gameClass.batch.end();

        if(Gdx.input.isTouched()){
            gameClass.setScreen(new GameScreen(gameClass));
            dispose();
        }
    }

    @Override
    public void show() {

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

    }


}
