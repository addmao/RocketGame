package com.mygdx.game;

import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameScreen extends ScreenAdapter{
	private BabyRocketGame babyRocket;
	private BabyRocketGame backgroundMoon; 
	
	private Texture backgroundMoonImg;
	private Texture tinyRocketImg;
	
	public GameScreen(BabyRocketGame babyRocket) {
		this.babyRocket = babyRocket; 
		tinyRocketImg = new Texture("TinyRocket.png");
		
		this.backgroundMoon = backgroundMoon;
		backgroundMoonImg = new Texture("moon_background.png");
	
	}

	@Override
	public void render(float delta) {
		SpriteBatch batch = babyRocket.batch;
		batch.begin();
		batch.draw(backgroundMoonImg, 0, 0);
		batch.draw(tinyRocketImg, 100, 50);
		batch.end();
	}
}
