package com.mycompany.a2.objects;

import com.codename1.ui.Graphics;
import com.codename1.ui.geom.Point2D;

public interface IDrawable {
	public void draw(Graphics g, Point2D pointParent, Point2D pointScreen);
}
