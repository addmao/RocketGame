package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameScreen extends ScreenAdapter{
	private BabyRocketGame babyRocket;
	private BabyRocketGame backgroundMoon; 
	private Texture backgroundMoonImg;
	private Texture tinyRocketImg;
	
	private int x;
	private int y;
	
	public GameScreen(BabyRocketGame babyRocket) {
		this.babyRocket = babyRocket; 
		tinyRocketImg = new Texture("TinyRocket.png");
		
		this.backgroundMoon = backgroundMoon;
		backgroundMoonImg = new Texture("moon_background.png");
	
		x = 100;
		y = 100;
	}

	@Override
	public void render(float delta) {
		update(delta);
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		SpriteBatch batch = babyRocket.batch;
		batch.begin();
		batch.draw(backgroundMoonImg, 0, 0);
		batch.draw(tinyRocketImg, x, y);
		batch.end();
	}
	
	public void update(float delta) {
		if(Gdx.input.isKeyPressed(Keys.LEFT)) {
			x -= 10;
		}
		
		if(Gdx.input.isKeyPressed(Keys.RIGHT)) {
			x += 10;
		}
		
		if(Gdx.input.isKeyPressed(Keys.UP)) {
			y += 10;
		}
		
		if(Gdx.input.isKeyPressed(Keys.DOWN)) {
			y -= 10;
		}
	}
}
