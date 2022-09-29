package com.lfsjesus.hero;

import com.googlecode.lanterna.graphics.TextGraphics;

public abstract class Element {
    protected Position position; // Protected so Hero and Wall have access to it
    public Element(int x, int y) {
        position = new Position(x, y);
    }

    public abstract void draw(TextGraphics graphics);
}
