package com.mygdx.game;

import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameScreen extends ScreenAdapter{
	private BabyRocketGame babyRocket;
	private Texture babyRocketImg;
	
	public GameScreen(BabyRocketGame babyRocket) {
		this.babyRocket = babyRocket;
		babyRocketImg = new Texture("moon_background.png");
	}

	@Override
	public void render(float delta) {
		SpriteBatch batch = babyRocket.batch;
		batch.begin();
		batch.draw(babyRocketImg, 0, 0);
		batch.end();
	}
}
