package com.tuna3.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class TunaGameClass extends Game {
	public static int targerFPS = 240;
	public SpriteBatch batch;
	public BitmapFont font;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		font = new BitmapFont();

		this.setScreen(new MainMenuScreen(this));
	}

	@Override
	public void render () {
		//importante llamar a render() de Game para poder cambiar de pantallas
		super.render();
		/*
		ScreenUtils.clear(1, 0, 0, 1);

		batch.begin();
		batch.draw(img, 0, 0);
		font.draw(batch, "FPS: " + FPSClass.getFPS(), 0+5, 400-5);
		batch.end();
		*/
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		font.dispose();
	}

	public void drawFPS(){
		font.draw(batch, "FPS: " + FPSClass.getFPS(), 0+5, 400-5);
	}
}
