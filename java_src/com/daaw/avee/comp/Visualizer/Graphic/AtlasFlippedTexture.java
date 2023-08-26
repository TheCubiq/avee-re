package com.daaw.avee.comp.Visualizer.Graphic;

import mdesl.graphics.ITexture;
/* loaded from: classes.dex */
public class AtlasFlippedTexture extends AtlasTexture {
    @Override // com.daaw.avee.comp.Visualizer.Graphic.AtlasTexture, com.daaw.avee.comp.Visualizer.Graphic.IAtlasTexture
    public boolean isFlipped() {
        return true;
    }

    public AtlasFlippedTexture(ITexture iTexture, boolean z) {
        super(iTexture, z);
    }

    public AtlasFlippedTexture(ITexture iTexture, int i, int i2, int i3, int i4, boolean z) {
        super(iTexture, i, i2, i3, i4, z);
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.AtlasTexture
    public IAtlasTexture createSubTexture(ITexture iTexture, int i, int i2, int i3, int i4, boolean z) {
        return new AtlasFlippedTexture(iTexture, i, i2, i3, i4, z);
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.AtlasTexture, com.daaw.avee.comp.Visualizer.Graphic.IAtlasTexture
    public float translateU(float f) {
        return super.translateU(f);
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.AtlasTexture, com.daaw.avee.comp.Visualizer.Graphic.IAtlasTexture
    public float translateV(float f) {
        return super.translateV(1.0f - f);
    }
}
