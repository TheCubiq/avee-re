package com.daaw.avee.comp.Visualizer.Graphic;

import com.daaw.avee.Common.Action3;
import com.daaw.avee.Common.Utils;
import mdesl.graphics.ITexture;
/* loaded from: classes.dex */
public class RenderPassData {
    private IAtlasTexture atlasTex;
    public int currentBlendMode;
    public VShaderBinder currentShader;
    public Action3<RenderState, VShaderProgram, RenderPassData> currentShaderBindCb;
    private ITexture[] currentTexture;
    private int texWrapMode;
    private boolean[] textureIsFlipped;

    public RenderPassData(int i, IAtlasTexture iAtlasTexture, VShaderBinder vShaderBinder, Action3<RenderState, VShaderProgram, RenderPassData> action3) {
        this(i, iAtlasTexture, vShaderBinder, action3, 1);
    }

    public RenderPassData(int i, IAtlasTexture iAtlasTexture, VShaderBinder vShaderBinder, Action3<RenderState, VShaderProgram, RenderPassData> action3, int i2) {
        ITexture[] iTextureArr = {null, null};
        this.currentTexture = iTextureArr;
        this.textureIsFlipped = new boolean[]{false, false};
        this.currentBlendMode = i;
        iTextureArr[0] = iAtlasTexture != null ? iAtlasTexture.getTexture2D() : null;
        this.currentTexture[1] = null;
        this.currentShader = vShaderBinder;
        this.currentShaderBindCb = action3;
        this.texWrapMode = i2;
        this.textureIsFlipped[0] = iAtlasTexture != null && iAtlasTexture.isFlipped();
        boolean[] zArr = this.textureIsFlipped;
        zArr[1] = zArr[0];
        this.atlasTex = iAtlasTexture == null ? AtlasTexture.errorTexture : iAtlasTexture;
    }

    public RenderPassData(int i, IAtlasTexture[] iAtlasTextureArr, VShaderBinder vShaderBinder, Action3<RenderState, VShaderProgram, RenderPassData> action3) {
        this(i, iAtlasTextureArr, vShaderBinder, action3, 1);
    }

    public RenderPassData(int i, IAtlasTexture[] iAtlasTextureArr, VShaderBinder vShaderBinder, Action3<RenderState, VShaderProgram, RenderPassData> action3, int i2) {
        ITexture[] iTextureArr = {null, null};
        this.currentTexture = iTextureArr;
        this.textureIsFlipped = new boolean[]{false, false};
        this.currentBlendMode = i;
        iTextureArr[0] = iAtlasTextureArr[0] != null ? iAtlasTextureArr[0].getTexture2D() : null;
        this.currentTexture[1] = iAtlasTextureArr[1] != null ? iAtlasTextureArr[1].getTexture2D() : null;
        this.currentShader = vShaderBinder;
        this.currentShaderBindCb = action3;
        this.texWrapMode = i2;
        this.textureIsFlipped[0] = iAtlasTextureArr[0] != null && iAtlasTextureArr[0].isFlipped();
        this.textureIsFlipped[1] = iAtlasTextureArr[1] != null && iAtlasTextureArr[1].isFlipped();
        this.atlasTex = iAtlasTextureArr[0] != null ? iAtlasTextureArr[0] : AtlasTexture.errorTexture;
    }

    public RenderPassData() {
        this.currentTexture = new ITexture[]{null, null};
        this.textureIsFlipped = new boolean[]{false, false};
        setToEmpty();
    }

    public void assignFrom(RenderPassData renderPassData) {
        this.currentBlendMode = renderPassData.currentBlendMode;
        this.currentShader = renderPassData.currentShader;
        this.currentShaderBindCb = renderPassData.currentShaderBindCb;
        int i = 0;
        int i2 = 0;
        while (true) {
            ITexture[] iTextureArr = this.currentTexture;
            if (i2 >= iTextureArr.length) {
                break;
            }
            iTextureArr[i2] = renderPassData.currentTexture[i2];
            i2++;
        }
        this.texWrapMode = renderPassData.texWrapMode;
        while (true) {
            boolean[] zArr = this.textureIsFlipped;
            if (i < zArr.length) {
                zArr[i] = renderPassData.textureIsFlipped[i];
                i++;
            } else {
                this.atlasTex = renderPassData.atlasTex;
                return;
            }
        }
    }

    public boolean compare(RenderPassData renderPassData) {
        if (renderPassData.currentBlendMode != this.currentBlendMode || renderPassData.texWrapMode != this.texWrapMode || !Utils.compareNullEqual(renderPassData.currentShader, this.currentShader) || !Utils.compareNullEqual(renderPassData.currentShaderBindCb, this.currentShaderBindCb)) {
            return false;
        }
        int i = 0;
        while (true) {
            ITexture[] iTextureArr = this.currentTexture;
            if (i >= iTextureArr.length) {
                return true;
            }
            if (!Utils.compareNullEqual(iTextureArr[i], renderPassData.currentTexture[i])) {
                return false;
            }
            i++;
        }
    }

    public void setToEmpty() {
        this.currentShaderBindCb = null;
        this.currentShader = null;
        this.currentBlendMode = 0;
        int i = 0;
        while (true) {
            ITexture[] iTextureArr = this.currentTexture;
            if (i >= iTextureArr.length) {
                break;
            }
            iTextureArr[i] = null;
            i++;
        }
        int i2 = 0;
        while (true) {
            boolean[] zArr = this.textureIsFlipped;
            if (i2 >= zArr.length) {
                this.atlasTex = AtlasTexture.errorTexture;
                this.texWrapMode = 2;
                return;
            }
            zArr[i2] = false;
            i2++;
        }
    }

    public int getTextureCount() {
        return this.currentTexture.length;
    }

    public ITexture getTexture(int i) {
        return this.currentTexture[i];
    }

    public boolean getTextureIsFlipped(int i) {
        return this.textureIsFlipped[i];
    }

    public float translateU(float f) {
        return this.atlasTex.translateU(f);
    }

    public float translateV(float f) {
        return this.atlasTex.translateV(f);
    }

    public float translateW(float f) {
        return this.atlasTex.translateW(f);
    }

    public float translateW() {
        return this.atlasTex.translateW();
    }

    public IAtlasTexture getTexturePrimary() {
        return this.atlasTex;
    }

    public int getTextureWrapMode() {
        return this.texWrapMode;
    }
}
