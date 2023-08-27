package com.daaw.avee.comp.Visualizer.Graphic;

import mdesl.graphics.ITexture;
/* loaded from: classes.dex */
public interface IAtlasTexture {
    void dispose();

    int getHeight();

    IAtlasTexture getSub(float f, float f2, float f3, float f4);

    IAtlasTexture getSub(int i, int i2, int i3, int i4);

    IAtlasTexture getSubZ(float f);

    IAtlasTexture getSubZ(int i);

    ITexture getTexture2D();

    int getWidth();

    boolean isFlipped();

    float translateU(float f);

    float translateV(float f);

    float translateW();

    float translateW(float f);
}
