package com.daaw.avee.comp.Visualizer.Graphic;

import mdesl.graphics.ITexture;
/* loaded from: classes.dex */
public class LoadingAtlasTexture extends AtlasTexture {
    private float uOffset;

    @Override // com.daaw.avee.comp.Visualizer.Graphic.AtlasTexture
    public int getFramesCount() {
        return 100;
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.AtlasTexture, com.daaw.avee.comp.Visualizer.Graphic.IAtlasTexture
    public IAtlasTexture getSubZ(float f) {
        return this;
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.AtlasTexture, com.daaw.avee.comp.Visualizer.Graphic.IAtlasTexture
    public IAtlasTexture getSubZ(int i) {
        return this;
    }

    public LoadingAtlasTexture(ITexture iTexture, boolean z) {
        super(iTexture, z);
        this.uOffset = 0.0f;
    }

    public LoadingAtlasTexture(ITexture iTexture, int i, int i2, int i3, int i4, boolean z) {
        super(iTexture, i, i2, i3, i4, z);
        this.uOffset = 0.0f;
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.AtlasTexture, com.daaw.avee.comp.Visualizer.Graphic.IAtlasTexture
    public float translateU(float f) {
        return super.translateU(f);
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.AtlasTexture, com.daaw.avee.comp.Visualizer.Graphic.IAtlasTexture
    public float translateV(float f) {
        float f2 = this.uOffset;
        if (f2 > 0.5f) {
            f2 = 0.5f - (f2 - 0.5f);
        }
        float f3 = f2 * 0.8f;
        return super.translateV((f * 0.2f) + f3 + f3);
    }

    public void onFrameStart(float f) {
        this.uOffset = (this.uOffset + (f * 0.9f)) % 1.0f;
    }
}
