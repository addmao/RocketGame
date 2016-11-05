package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class GameScreen extends ScreenAdapter{
	private BabyRocketGame babyRocket;
	private BabyRocketGame backgroundMoon; 
	private Texture backgroundMoonImg;
	private Texture tinyRocketImg;
	
	private int x;
	private int y;
	
	private TinyRocket tinyRocket;
	
	public GameScreen(BabyRocketGame babyRocket) {
		this.babyRocket = babyRocket; 
		tinyRocketImg = new Texture("TinyRocket.png");
		
		this.backgroundMoon = backgroundMoon;
		backgroundMoonImg = new Texture("moon_background.png");
	
		tinyRocket = new TinyRocket(100, 100);
	}

	@Override
	public void render(float delta) {
		update(delta);
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		SpriteBatch batch = babyRocket.batch;
		batch.begin();
		batch.draw(backgroundMoonImg, 0, 0);
		Vector2 pos = tinyRocket.getPosition();
		batch.draw(tinyRocketImg, pos.x, pos.y);
		batch.end();
	}
	
	public void update(float delta) {
		if(Gdx.input.isKeyPressed(Keys.UP)) {
			tinyRocket.move(TinyRocket.DIRECTION_UP);
		}
		
		if(Gdx.input.isKeyPressed(Keys.RIGHT)) {
			tinyRocket.move(TinyRocket.DIRECTION_RIGHT);
		}
		
		if(Gdx.input.isKeyPressed(Keys.DOWN)) {
			tinyRocket.move(TinyRocket.DIRECTION_DOWN);
		}
		
		if(Gdx.input.isKeyPressed(Keys.LEFT)) {
			tinyRocket.move(TinyRocket.DIRECTION_LEFT);
		}
	}
}
