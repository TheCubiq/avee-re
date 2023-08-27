package com.daaw.avee.Common;
/* loaded from: classes.dex */
public class Vec2i {
    public int x;
    public int y;
    public static Vec2i invalid = new Vec2i(-2147483647, -2147483647);
    public static Vec2i zero = new Vec2i(0, 0);
    public static Vec2i one = new Vec2i(1, 1);

    public Vec2i(int i, int i2) {
        this.x = i;
        this.y = i2;
    }
}
