package com.tuna3.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Graphics;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.tuna3.game.TunaGameClass;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		//config.setForegroundFPS(TunaGameClass.targerFPS);
		config.useVsync(false);
		config.setTitle("Tuna III");
		config.setWindowIcon("icon.png");
		config.setWindowedMode(800,400);
		new Lwjgl3Application(new TunaGameClass(), config);
	}
}
