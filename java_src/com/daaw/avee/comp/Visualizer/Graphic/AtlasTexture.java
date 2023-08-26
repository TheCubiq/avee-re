package com.daaw.avee.comp.Visualizer.Graphic;

import com.daaw.avee.Common.Func.Func6;
import com.daaw.avee.Common.tlog;
import mdesl.graphics.ITexture;
/* loaded from: classes.dex */
public class AtlasTexture implements IAtlasTexture {
    private int atlasX;
    private int atlasY;
    private int framesCount;
    private int height;
    protected boolean ownTexture;
    private ITexture texture;
    private int width;
    public static final Func6<ITexture, Integer, Integer, Integer, Integer, Boolean, IAtlasTexture> factory = new Func6<ITexture, Integer, Integer, Integer, Integer, Boolean, IAtlasTexture>() { // from class: com.daaw.avee.comp.Visualizer.Graphic.AtlasTexture.1
        @Override // com.daaw.avee.Common.Func.Func6
        public IAtlasTexture Invoke(ITexture iTexture, Integer num, Integer num2, Integer num3, Integer num4, Boolean bool) {
            return null;
        }
    };
    public static final IAtlasTexture errorTexture = new ErrorTexture();

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IAtlasTexture
    public boolean isFlipped() {
        return false;
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IAtlasTexture
    public float translateW() {
        return 0.0f;
    }

    /* loaded from: classes.dex */
    static class ErrorTexture implements IAtlasTexture {
        @Override // com.daaw.avee.comp.Visualizer.Graphic.IAtlasTexture
        public void dispose() {
        }

        @Override // com.daaw.avee.comp.Visualizer.Graphic.IAtlasTexture
        public int getHeight() {
            return 1;
        }

        @Override // com.daaw.avee.comp.Visualizer.Graphic.IAtlasTexture
        public IAtlasTexture getSub(float f, float f2, float f3, float f4) {
            return this;
        }

        @Override // com.daaw.avee.comp.Visualizer.Graphic.IAtlasTexture
        public IAtlasTexture getSub(int i, int i2, int i3, int i4) {
            return this;
        }

        @Override // com.daaw.avee.comp.Visualizer.Graphic.IAtlasTexture
        public IAtlasTexture getSubZ(float f) {
            return this;
        }

        @Override // com.daaw.avee.comp.Visualizer.Graphic.IAtlasTexture
        public IAtlasTexture getSubZ(int i) {
            return this;
        }

        @Override // com.daaw.avee.comp.Visualizer.Graphic.IAtlasTexture
        public ITexture getTexture2D() {
            return null;
        }

        @Override // com.daaw.avee.comp.Visualizer.Graphic.IAtlasTexture
        public int getWidth() {
            return 1;
        }

        @Override // com.daaw.avee.comp.Visualizer.Graphic.IAtlasTexture
        public boolean isFlipped() {
            return false;
        }

        @Override // com.daaw.avee.comp.Visualizer.Graphic.IAtlasTexture
        public float translateU(float f) {
            return 1.0f;
        }

        @Override // com.daaw.avee.comp.Visualizer.Graphic.IAtlasTexture
        public float translateV(float f) {
            return 1.0f;
        }

        @Override // com.daaw.avee.comp.Visualizer.Graphic.IAtlasTexture
        public float translateW() {
            return 0.0f;
        }

        @Override // com.daaw.avee.comp.Visualizer.Graphic.IAtlasTexture
        public float translateW(float f) {
            return 0.0f;
        }

        ErrorTexture() {
        }
    }

    public AtlasTexture(ITexture iTexture, boolean z) {
        this.framesCount = 1;
        this.texture = iTexture;
        this.ownTexture = z;
        this.atlasX = 0;
        this.atlasY = 0;
        this.width = iTexture.getWidth();
        this.height = iTexture.getHeight();
        if (this.texture.getHeight() < 1 || this.texture.getWidth() < 1) {
            tlog.w("texture invalid dimensions");
        }
    }

    public AtlasTexture(ITexture iTexture, int i, int i2, int i3, int i4, boolean z) {
        this.framesCount = 1;
        this.texture = iTexture;
        this.ownTexture = z;
        if (iTexture.getHeight() < 1 || iTexture.getWidth() < 1) {
            tlog.w("texture invalid dimensions");
        }
        this.atlasX = i;
        this.atlasY = i2;
        this.width = i3;
        this.height = i4;
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IAtlasTexture
    public void dispose() {
        ITexture iTexture;
        if (!this.ownTexture || (iTexture = this.texture) == null) {
            return;
        }
        iTexture.dispose();
    }

    public IAtlasTexture nonDisposableClone() {
        return createSubTexture(this.texture, this.atlasX, this.atlasY, this.width, this.height, false);
    }

    public IAtlasTexture createSubTexture(ITexture iTexture, int i, int i2, int i3, int i4, boolean z) {
        return new AtlasTexture(iTexture, i, i2, i3, i4, z);
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IAtlasTexture
    public int getWidth() {
        return this.width;
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IAtlasTexture
    public int getHeight() {
        return this.height;
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IAtlasTexture
    public float translateU(float f) {
        return (this.atlasX / this.texture.getWidth()) + ((this.width / this.texture.getWidth()) * f);
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IAtlasTexture
    public float translateV(float f) {
        return (this.atlasY / this.texture.getHeight()) + ((this.height / this.texture.getHeight()) * f);
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IAtlasTexture
    public float translateW(float f) {
        return translateW();
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IAtlasTexture
    public ITexture getTexture2D() {
        return this.texture;
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IAtlasTexture
    public IAtlasTexture getSub(int i, int i2, int i3, int i4) {
        int min = Math.min(getWidth(), i3);
        int min2 = Math.min(getHeight(), i4);
        return createSubTexture(this.texture, this.atlasX + Math.min(getWidth() - min, this.atlasX), this.atlasY + Math.min(getHeight() - min2, this.atlasY), min, min2, false);
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IAtlasTexture
    public IAtlasTexture getSub(float f, float f2, float f3, float f4) {
        return createSubTexture(this.texture, (int) (this.atlasX + (getWidth() * f)), (int) (this.atlasY + (getHeight() * f2)), (int) (getWidth() * f3), (int) (getHeight() * f4), false);
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IAtlasTexture
    public IAtlasTexture getSubZ(int i) {
        return createSubTexture(this.texture, this.atlasX, this.atlasY, this.width, this.height, false);
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IAtlasTexture
    public IAtlasTexture getSubZ(float f) {
        return createSubTexture(this.texture, this.atlasX, this.atlasY, this.width, this.height, false);
    }

    public int getFramesCount() {
        return this.framesCount;
    }
}
