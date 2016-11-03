package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.RockAl;
import com.mygdx.game.babyRocketGame;

public class DesktopLauncher {
	public static void main(String[] args) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Cute & Tiny Rocket :)";
		config.width = 500;
		config.height = 800;
		new LwjglApplication(new babyRocketGame(), config);
	}
}