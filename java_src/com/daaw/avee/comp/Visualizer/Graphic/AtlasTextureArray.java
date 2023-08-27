package com.daaw.avee.comp.Visualizer.Graphic;

import mdesl.graphics.ITexture;
/* loaded from: classes.dex */
public class AtlasTextureArray extends AtlasTexture {
    private IAtlasTexture[] atlasTextureFrames;
    private int maxFrame;
    private ITexture[] textureFrames;

    @Override // com.daaw.avee.comp.Visualizer.Graphic.AtlasTexture, com.daaw.avee.comp.Visualizer.Graphic.IAtlasTexture
    public boolean isFlipped() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class AtlasTextureFrame implements IAtlasTexture {
        final int frame;
        final AtlasTextureArray parent;

        @Override // com.daaw.avee.comp.Visualizer.Graphic.IAtlasTexture
        public void dispose() {
        }

        AtlasTextureFrame(AtlasTextureArray atlasTextureArray, int i) {
            this.parent = atlasTextureArray;
            this.frame = i;
        }

        @Override // com.daaw.avee.comp.Visualizer.Graphic.IAtlasTexture
        public int getWidth() {
            return this.parent.getWidth();
        }

        @Override // com.daaw.avee.comp.Visualizer.Graphic.IAtlasTexture
        public int getHeight() {
            return this.parent.getHeight();
        }

        @Override // com.daaw.avee.comp.Visualizer.Graphic.IAtlasTexture
        public float translateU(float f) {
            return this.parent.translateU(f);
        }

        @Override // com.daaw.avee.comp.Visualizer.Graphic.IAtlasTexture
        public float translateV(float f) {
            return this.parent.translateV(f);
        }

        @Override // com.daaw.avee.comp.Visualizer.Graphic.IAtlasTexture
        public float translateW(float f) {
            return this.parent.translateU(f);
        }

        @Override // com.daaw.avee.comp.Visualizer.Graphic.IAtlasTexture
        public float translateW() {
            return this.parent.translateW();
        }

        @Override // com.daaw.avee.comp.Visualizer.Graphic.IAtlasTexture
        public ITexture getTexture2D() {
            return this.parent.getTexture2D(this.frame);
        }

        @Override // com.daaw.avee.comp.Visualizer.Graphic.IAtlasTexture
        public IAtlasTexture getSub(int i, int i2, int i3, int i4) {
            return this.parent.getSub(i, i2, i3, i4);
        }

        @Override // com.daaw.avee.comp.Visualizer.Graphic.IAtlasTexture
        public IAtlasTexture getSub(float f, float f2, float f3, float f4) {
            return this.parent.getSub(f, f2, f3, f4);
        }

        @Override // com.daaw.avee.comp.Visualizer.Graphic.IAtlasTexture
        public IAtlasTexture getSubZ(int i) {
            return this.parent.getSubZ(i);
        }

        @Override // com.daaw.avee.comp.Visualizer.Graphic.IAtlasTexture
        public IAtlasTexture getSubZ(float f) {
            return this.parent.getSubZ(f);
        }

        @Override // com.daaw.avee.comp.Visualizer.Graphic.IAtlasTexture
        public boolean isFlipped() {
            return this.parent.isFlipped();
        }
    }

    public AtlasTextureArray(ITexture[] iTextureArr, boolean z) {
        super(iTextureArr.length > 0 ? iTextureArr[0] : null, z);
        init(iTextureArr);
    }

    public AtlasTextureArray(ITexture[] iTextureArr, int i, int i2, int i3, int i4, boolean z) {
        super(iTextureArr.length > 0 ? iTextureArr[0] : null, i, i2, i3, i4, z);
        init(iTextureArr);
    }

    private void init(ITexture[] iTextureArr) {
        this.maxFrame = -1;
        this.textureFrames = iTextureArr;
        this.atlasTextureFrames = new IAtlasTexture[iTextureArr.length];
        for (int i = 0; i < iTextureArr.length; i++) {
            if (this.textureFrames[i] != null) {
                this.maxFrame = i;
            }
            this.atlasTextureFrames[i] = new AtlasTextureFrame(this, i);
        }
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.AtlasTexture, com.daaw.avee.comp.Visualizer.Graphic.IAtlasTexture
    public void dispose() {
        int i = 0;
        if (this.ownTexture) {
            int i2 = 0;
            while (true) {
                ITexture[] iTextureArr = this.textureFrames;
                if (i2 >= iTextureArr.length) {
                    break;
                }
                if (iTextureArr[i2] != null) {
                    iTextureArr[i2].dispose();
                }
                this.textureFrames[i2] = null;
                i2++;
            }
        }
        while (true) {
            IAtlasTexture[] iAtlasTextureArr = this.atlasTextureFrames;
            if (i >= iAtlasTextureArr.length) {
                return;
            }
            if (iAtlasTextureArr[i] != null) {
                iAtlasTextureArr[i].dispose();
            }
            this.atlasTextureFrames[i] = null;
            i++;
        }
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.AtlasTexture
    public IAtlasTexture nonDisposableClone() {
        return new AtlasTextureArray(this.textureFrames, false);
    }

    public ITexture getTexture2D(int i) {
        return this.textureFrames[i];
    }

    public void setMaxLimitFrame(int i) {
        this.maxFrame = Math.min(i, this.textureFrames.length - 1);
    }

    public void gradualLoadTexture(int i, ITexture iTexture) {
        this.textureFrames[i] = iTexture;
        setMaxLimitFrame(i);
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.AtlasTexture, com.daaw.avee.comp.Visualizer.Graphic.IAtlasTexture
    public IAtlasTexture getSubZ(int i) {
        int min = Math.min(i % this.textureFrames.length, this.maxFrame);
        if (min < 0) {
            return null;
        }
        return this.atlasTextureFrames[min];
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.AtlasTexture, com.daaw.avee.comp.Visualizer.Graphic.IAtlasTexture
    public IAtlasTexture getSubZ(float f) {
        ITexture[] iTextureArr = this.textureFrames;
        int min = Math.min(((int) (iTextureArr.length * f)) % iTextureArr.length, this.maxFrame);
        if (min < 0) {
            return null;
        }
        return this.atlasTextureFrames[min];
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.AtlasTexture
    public int getFramesCount() {
        return this.textureFrames.length;
    }
}
