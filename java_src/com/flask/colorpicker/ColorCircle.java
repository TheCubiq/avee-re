package com.flask.colorpicker;

import android.graphics.Color;
/* loaded from: classes.dex */
public class ColorCircle {
    private int color;
    private float[] hsv = new float[3];
    private float[] hsvClone;
    private float x;
    private float y;

    public ColorCircle(float f, float f2, float[] fArr) {
        set(f, f2, fArr);
    }

    public double sqDist(float f, float f2) {
        double d = this.x - f;
        double d2 = this.y - f2;
        Double.isNaN(d);
        Double.isNaN(d);
        Double.isNaN(d2);
        Double.isNaN(d2);
        return (d * d) + (d2 * d2);
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public float[] getHsv() {
        return this.hsv;
    }

    public float[] getHsvWithLightness(float f) {
        if (this.hsvClone == null) {
            this.hsvClone = (float[]) this.hsv.clone();
        }
        float[] fArr = this.hsvClone;
        float[] fArr2 = this.hsv;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        fArr[2] = f;
        return fArr;
    }

    public void set(float f, float f2, float[] fArr) {
        this.x = f;
        this.y = f2;
        float[] fArr2 = this.hsv;
        fArr2[0] = fArr[0];
        fArr2[1] = fArr[1];
        fArr2[2] = fArr[2];
        this.color = Color.HSVToColor(fArr2);
    }

    public int getColor() {
        return this.color;
    }
}
