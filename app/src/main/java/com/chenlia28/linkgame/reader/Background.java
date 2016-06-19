package com.chenlia28.linkgame.reader;

import android.graphics.Bitmap;

public class Background {

	public Background(Bitmap bitmap) {
		this.bitmap=bitmap;
	}
	
	public Bitmap getBitmap() {
		return bitmap;
	}

	private Bitmap bitmap=null;
}
