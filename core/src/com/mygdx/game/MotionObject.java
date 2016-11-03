package com.mygdx.game;

import com.badlogic.gdx.math.Vector2;

public class MotionObject extends Object {
	public final Vector2 velocity;
	public final Vector2 accel;

	public MotionObject (float x, float y, float width, float height) {
		super(x, y, width, height);
		velocity = new Vector2();
		accel = new Vector2();
	}
}
