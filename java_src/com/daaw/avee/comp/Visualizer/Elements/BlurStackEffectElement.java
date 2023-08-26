package com.daaw.avee.comp.Visualizer.Elements;

import android.graphics.RectF;
import android.opengl.GLES20;
import androidx.core.view.ViewCompat;
import com.daaw.avee.Common.Action3;
import com.daaw.avee.Common.Vec2f;
import com.daaw.avee.Common.Vec2i;
import com.daaw.avee.Common.tlog;
import com.daaw.avee.comp.Visualizer.CustomPropertiesList;
import com.daaw.avee.comp.Visualizer.Elements.Base.Element;
import com.daaw.avee.comp.Visualizer.Elements.Base.ElementImageLoader;
import com.daaw.avee.comp.Visualizer.Graphic.AtlasTexture;
import com.daaw.avee.comp.Visualizer.Graphic.BlendMode;
import com.daaw.avee.comp.Visualizer.Graphic.GraphicsUtils;
import com.daaw.avee.comp.Visualizer.Graphic.IAtlasTexture;
import com.daaw.avee.comp.Visualizer.Graphic.IRenderState;
import com.daaw.avee.comp.Visualizer.Graphic.RenderPassData;
import com.daaw.avee.comp.Visualizer.Graphic.RenderState;
import com.daaw.avee.comp.Visualizer.Graphic.VFrameBuffer;
import com.daaw.avee.comp.Visualizer.Graphic.VMatrix;
import com.daaw.avee.comp.Visualizer.Graphic.VShaderBinder;
import com.daaw.avee.comp.Visualizer.Graphic.VShaderProgram;
import com.daaw.avee.comp.Visualizer.ICompositionDependencies;
import com.daaw.avee.comp.Visualizer.IDependencyResourceCounter;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import mdesl.graphics.Texture;
import mdesl.graphics.glutils.FrameBuffer;
/* loaded from: classes.dex */
public class BlurStackEffectElement extends Element {
    public static final String typeName = "BlurEffect";
    private int blendModeContent;
    Texture blurContentPreRendered;
    private int[] blurLayerColors;
    private Vec2f[] blurLayerScales;
    private float blurMultiplier;
    private VFrameBuffer[] blurTargets;
    private int color2;
    int currentVerticalBlurV2ResultHeight;
    int currentVerticalBlurV2ResultWidth;
    ElementImageLoader maskImageLoader;
    boolean offscreenContentPreRender;
    private float radius;
    private int referenceComposition;
    private Action3<RenderState, VShaderProgram, RenderPassData> renderBlurStackShaderOnBindAction;
    private Action3<RenderState, VShaderProgram, RenderPassData> renderBluredContentShaderOnBindAction;
    private boolean renderContent;
    private Action3<RenderState, VShaderProgram, RenderPassData> renderContentOverShaderOnBindAction;
    private boolean renderContentUnder;
    private Action3<RenderState, VShaderProgram, RenderPassData> renderContentUnderShaderOnBindAction;
    private boolean useMipmaps;
    private final VMatrix vpMatTmp;

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public String getElementTypeName() {
        return "BlurEffect";
    }

    public BlurStackEffectElement() {
        super(2, 1.0f, 1.0f);
        this.useMipmaps = false;
        this.radius = 1.0f;
        this.blurMultiplier = 4.1f;
        this.blurTargets = new VFrameBuffer[0];
        this.color2 = ViewCompat.MEASURED_STATE_MASK;
        this.blurLayerScales = new Vec2f[3];
        this.blurLayerColors = new int[3];
        this.renderContent = false;
        this.renderContentUnder = false;
        this.blendModeContent = 2;
        int i = 1;
        this.referenceComposition = 1;
        this.vpMatTmp = new VMatrix();
        this.currentVerticalBlurV2ResultHeight = 100;
        this.currentVerticalBlurV2ResultWidth = 100;
        this.offscreenContentPreRender = true;
        this.renderContentUnderShaderOnBindAction = new Action3<RenderState, VShaderProgram, RenderPassData>() { // from class: com.daaw.avee.comp.Visualizer.Elements.BlurStackEffectElement.2
            @Override // com.daaw.avee.Common.Action3
            public void onInvoke(RenderState renderState, VShaderProgram vShaderProgram, RenderPassData renderPassData) {
                vShaderProgram.setUniformMatrix("u_projView", false, BlurStackEffectElement.this.vpMatTmp.getObj());
                vShaderProgram.setUniformf("Color2", 0.0f, 0.0f, 0.0f, 1.0f);
                vShaderProgram.setUniformf("saturation", 1.0f);
                vShaderProgram.setUniformf("maskadd", 1.0f);
                vShaderProgram.setUniformf("maskmul", -1.0f);
                vShaderProgram.setUniformf("mask_l_add", 1.0f);
                vShaderProgram.setUniformf("mask_l_mul", 0.0f);
                if (renderPassData.getTextureIsFlipped(0) == renderPassData.getTextureIsFlipped(1)) {
                    vShaderProgram.setUniformf("tex2_y_add", 0.0f);
                    vShaderProgram.setUniformf("tex2_y_mul", 1.0f);
                    return;
                }
                vShaderProgram.setUniformf("tex2_y_add", 1.0f);
                vShaderProgram.setUniformf("tex2_y_mul", -1.0f);
            }
        };
        this.renderContentOverShaderOnBindAction = new Action3<RenderState, VShaderProgram, RenderPassData>() { // from class: com.daaw.avee.comp.Visualizer.Elements.BlurStackEffectElement.3
            @Override // com.daaw.avee.Common.Action3
            public void onInvoke(RenderState renderState, VShaderProgram vShaderProgram, RenderPassData renderPassData) {
                vShaderProgram.setUniformMatrix("u_projView", false, BlurStackEffectElement.this.vpMatTmp.getObj());
                vShaderProgram.setUniformf("Color2", 0.0f, 0.0f, 0.0f, 1.0f);
                vShaderProgram.setUniformf("saturation", 1.0f);
                vShaderProgram.setUniformf("maskadd", 0.0f);
                vShaderProgram.setUniformf("maskmul", 1.0f);
                vShaderProgram.setUniformf("mask_l_add", 1.0f);
                vShaderProgram.setUniformf("mask_l_mul", 0.0f);
                if (renderPassData.getTextureIsFlipped(0) == renderPassData.getTextureIsFlipped(1)) {
                    vShaderProgram.setUniformf("tex2_y_add", 0.0f);
                    vShaderProgram.setUniformf("tex2_y_mul", 1.0f);
                    return;
                }
                vShaderProgram.setUniformf("tex2_y_add", 1.0f);
                vShaderProgram.setUniformf("tex2_y_mul", -1.0f);
            }
        };
        this.renderBluredContentShaderOnBindAction = new Action3<RenderState, VShaderProgram, RenderPassData>() { // from class: com.daaw.avee.comp.Visualizer.Elements.BlurStackEffectElement.4
            @Override // com.daaw.avee.Common.Action3
            public void onInvoke(RenderState renderState, VShaderProgram vShaderProgram, RenderPassData renderPassData) {
                vShaderProgram.setUniformMatrix("u_projView", false, BlurStackEffectElement.this.vpMatTmp.getObj());
                float[] fArr = new float[4];
                GraphicsUtils.intColorToF4Color(fArr, BlurStackEffectElement.this.color2);
                vShaderProgram.setUniformf("Color2", fArr[0], fArr[1], fArr[2], fArr[3]);
                vShaderProgram.setUniformf("saturation", 1.0f);
                vShaderProgram.setUniformf("maskadd", 0.0f);
                vShaderProgram.setUniformf("maskmul", 1.0f);
                vShaderProgram.setUniformf("mask_l_add", 1.0f);
                vShaderProgram.setUniformf("mask_l_mul", 0.0f);
                if (renderPassData.getTextureIsFlipped(0) == renderPassData.getTextureIsFlipped(1)) {
                    vShaderProgram.setUniformf("tex2_y_add", 0.0f);
                    vShaderProgram.setUniformf("tex2_y_mul", 1.0f);
                    return;
                }
                vShaderProgram.setUniformf("tex2_y_add", 1.0f);
                vShaderProgram.setUniformf("tex2_y_mul", -1.0f);
            }
        };
        this.renderBlurStackShaderOnBindAction = new Action3<RenderState, VShaderProgram, RenderPassData>() { // from class: com.daaw.avee.comp.Visualizer.Elements.BlurStackEffectElement.5
            @Override // com.daaw.avee.Common.Action3
            public void onInvoke(RenderState renderState, VShaderProgram vShaderProgram, RenderPassData renderPassData) {
                vShaderProgram.setUniformMatrix("u_projView", false, renderState.getVPMatrix());
                IAtlasTexture texturePrimary = renderPassData.getTexturePrimary();
                vShaderProgram.setUniformf("resolution", 1.0f / texturePrimary.getWidth(), 1.0f / texturePrimary.getHeight());
                vShaderProgram.setUniformf("blurWH", BlurStackEffectElement.this.radius * 2.0f);
            }
        };
        setScale(1.0f, 1.0f);
        this.blurLayerScales[0] = new Vec2f(1.0f, 1.0f);
        while (true) {
            Vec2f[] vec2fArr = this.blurLayerScales;
            if (i >= vec2fArr.length) {
                break;
            }
            vec2fArr[i] = new Vec2f(0.0f, 0.0f);
            i++;
        }
        int i2 = 0;
        while (true) {
            int[] iArr = this.blurLayerColors;
            if (i2 < iArr.length) {
                iArr[i2] = -1;
                i2++;
            } else {
                this.maskImageLoader = new ElementImageLoader(new ElementImageLoader.IOnNeedReCreateGLResources() { // from class: com.daaw.avee.comp.Visualizer.Elements.BlurStackEffectElement.1
                    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.ElementImageLoader.IOnNeedReCreateGLResources
                    public void markNeedReCreateGLResources() {
                        BlurStackEffectElement.this.markNeedReCreateGLResourcesDontOverride();
                    }
                }, null, null, null);
                setMaskCustomImage(ElementImageLoader.internalMaskImages[0]);
                return;
            }
        }
    }

    public void setReferenceComposition(int i) {
        this.referenceComposition = i;
    }

    public void setMaskCustomImage(String str) {
        this.maskImageLoader.setCustomImage(str);
    }

    public void setBlurRadius(float f) {
        this.radius = f;
    }

    public void setBlurMultiplier(float f) {
        if (this.blurMultiplier == f) {
            return;
        }
        this.blurMultiplier = f;
        markNeedReCreateGLResources();
    }

    public void setColor2(int i) {
        this.color2 = i;
    }

    public void setBlurLayerScale(int i, float f, float f2) {
        this.blurLayerScales[i] = new Vec2f(f, f2);
    }

    public void setBlurLayerScale(int i, Vec2f vec2f) {
        this.blurLayerScales[i] = vec2f;
    }

    public void setRenderContentOnTop(boolean z) {
        this.renderContent = z;
    }

    public boolean getRenderContent() {
        return this.renderContent;
    }

    public void setRenderContentUnder(boolean z) {
        this.renderContentUnder = z;
    }

    public boolean getRenderContentUnder() {
        return this.renderContentUnder;
    }

    public void setBlendModeContent(int i) {
        this.blendModeContent = i;
    }

    protected int getBlendModeContent() {
        return this.blendModeContent;
    }

    public void setUseMipmaps(boolean z) {
        if (this.useMipmaps == z) {
            return;
        }
        this.useMipmaps = z;
        markNeedReCreateGLResources();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public void onApplyCustomization(CustomPropertiesList customPropertiesList) {
        super.onApplyCustomization(customPropertiesList);
        super.onApplyCustomizationAdditional(customPropertiesList);
        setScale(1.0f, 1.0f);
        setBlendModeContent(BlendMode.create(customPropertiesList.getChild("blendModeContent").getTypeName(), 2));
        setColor2(customPropertiesList.getPropertyInt(TtmlNode.ATTR_TTS_COLOR, ViewCompat.MEASURED_STATE_MASK));
        setReferenceComposition(customPropertiesList.getPropertyInt("sourceCompositionIndex", 1));
        this.maskImageLoader.setCustomImage(customPropertiesList.getPropertyString("MaskImage", ElementImageLoader.internalMaskImages[0]));
        setBlurRadius(customPropertiesList.getPropertyFloat("blurRadius", 2.0f));
        setBlurMultiplier(customPropertiesList.getPropertyFloat("blurMultiplier", 4.1f));
        setRenderContentOnTop(customPropertiesList.getPropertyBool("showUnblurredContent", false));
        setRenderContentUnder(customPropertiesList.getPropertyBool("showUnblurredContentUnder", false));
        this.blurLayerScales[0] = customPropertiesList.getPropertyVec2f("1layerScale", new Vec2f(1.0f, 1.0f));
        this.blurLayerScales[1] = customPropertiesList.getPropertyVec2f("2layerScale", new Vec2f(0.0f, 0.0f));
        this.blurLayerScales[2] = customPropertiesList.getPropertyVec2f("3layerScale", new Vec2f(0.0f, 0.0f));
        this.blurLayerColors[0] = customPropertiesList.getPropertyInt("1layerColor", -1);
        this.blurLayerColors[1] = customPropertiesList.getPropertyInt("2layerColor", -1);
        this.blurLayerColors[2] = customPropertiesList.getPropertyInt("3layerColor", -1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public void onReadCustomization(CustomPropertiesList customPropertiesList, IDependencyResourceCounter iDependencyResourceCounter) {
        super.onReadCustomization(customPropertiesList, iDependencyResourceCounter);
        super.onReadCustomizationAdditional(customPropertiesList);
        customPropertiesList.setCustomizationName("Blur Effect");
        customPropertiesList.putEmptyChild("blendModeContent", BlendMode.getTypeName(this.blendModeContent), "1_appearance", BlendMode.useableModes);
        customPropertiesList.putPropertyIntAsCRGBA(TtmlNode.ATTR_TTS_COLOR, this.color2, "1_appearance");
        customPropertiesList.putPropertyIntAsRange("sourceCompositionIndex", this.referenceComposition, "1_appearance", 1, 5);
        iDependencyResourceCounter.PutDependencyResourceName(this.maskImageLoader.getCustomImagePath());
        customPropertiesList.putPropertyStringAsImage("MaskImage", this.maskImageLoader.getCustomImagePath(), "1_appearance", ElementImageLoader.internalMaskImages);
        customPropertiesList.putPropertyFloatAsRange("blurRadius", this.radius, "2_blur", 0.0f, 3.0f);
        customPropertiesList.putPropertyFloatAsRange("blurMultiplier", this.blurMultiplier, "2_blur", 1.0f, 6.0f);
        customPropertiesList.putPropertyBool("showUnblurredContent", getRenderContent(), "1_appearance");
        customPropertiesList.putPropertyBool("showUnblurredContentUnder", getRenderContentUnder(), "1_appearance");
        customPropertiesList.putPropertyVec2fAsRange("1layerScale", this.blurLayerScales[0], "2_blur", 0.0f, 10.0f);
        customPropertiesList.putPropertyVec2fAsRange("2layerScale", this.blurLayerScales[1], "2_blur", 0.0f, 10.0f);
        customPropertiesList.putPropertyVec2fAsRange("3layerScale", this.blurLayerScales[2], "2_blur", 0.0f, 10.0f);
        customPropertiesList.putPropertyIntAsCRGBA("1layerColor", this.blurLayerColors[0], "2_blur");
        customPropertiesList.putPropertyIntAsCRGBA("2layerColor", this.blurLayerColors[1], "2_blur");
        customPropertiesList.putPropertyIntAsCRGBA("3layerColor", this.blurLayerColors[2], "2_blur");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public void markNeedReCreateGLResources() {
        super.markNeedReCreateGLResources();
        ElementImageLoader elementImageLoader = this.maskImageLoader;
        if (elementImageLoader != null) {
            elementImageLoader.markNeedReCreateGLResources();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public void onDestroyGLResources(RenderState renderState) {
        super.onDestroyGLResources(renderState);
        ElementImageLoader elementImageLoader = this.maskImageLoader;
        if (elementImageLoader != null) {
            elementImageLoader.onDestroyGLResources(renderState);
        }
        int i = 0;
        while (true) {
            VFrameBuffer[] vFrameBufferArr = this.blurTargets;
            if (i >= vFrameBufferArr.length) {
                return;
            }
            if (vFrameBufferArr[i] != null) {
                vFrameBufferArr[i].dispose();
            }
            this.blurTargets[i] = null;
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public boolean onCreateGLResources(RenderState renderState) {
        this.useMipmaps = renderState.res.visualizationData.onRequestUseHighQualityBlur();
        this.maskImageLoader.onCreateGLResources(renderState, measureDrawRectMaxScaleValues(renderState.res.meter), 0);
        int round = Math.round(this.blurMultiplier);
        try {
            Vec2i safeRenderBufferSizeTextureDim = renderState.getSafeRenderBufferSizeTextureDim();
            for (int i = 0; i < this.blurTargets.length; i++) {
                if (this.blurTargets[i] != null) {
                    this.blurTargets[i].dispose();
                }
            }
            if (this.blurTargets.length != round) {
                this.blurTargets = new VFrameBuffer[round];
            }
            int i2 = safeRenderBufferSizeTextureDim.x;
            int i3 = safeRenderBufferSizeTextureDim.y;
            for (int i4 = 0; i4 < this.blurTargets.length; i4++) {
                i2 = Math.max(2, i2 / 2);
                i3 = Math.max(2, i3 / 2);
                this.blurTargets[i4] = VFrameBuffer.createSafe(i2, i3, 9729, 10497, false);
                if (this.blurTargets[i4] != null) {
                    this.blurTargets[i4] = this.blurTargets[i4].checkIfValid();
                }
            }
        } catch (Exception e) {
            tlog.w(e.getMessage());
        }
        return super.onCreateGLResources(renderState);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public void onCreateGradualGLResources(RenderState renderState, int i) {
        super.onCreateGradualGLResources(renderState, i);
        this.maskImageLoader.onCreateGradualGLResources(renderState, i);
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public void onEarlyUpdate(IRenderState iRenderState, FrameBuffer frameBuffer, ICompositionDependencies iCompositionDependencies) {
        super.onEarlyUpdate(iRenderState, frameBuffer, iCompositionDependencies);
        iCompositionDependencies.addDependencyCompositionIndex(this.referenceComposition);
        this.maskImageLoader.onEarlyUpdate(iRenderState, frameBuffer, iCompositionDependencies);
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public void onRenderOffscreenContent(RenderState renderState) {
        Texture texture;
        VFrameBuffer[] vFrameBufferArr;
        super.onRenderOffscreenContent(renderState);
        this.blurContentPreRendered = null;
        if (this.offscreenContentPreRender) {
            VFrameBuffer compositionResult = renderState.getCompositionResult(this.referenceComposition);
            setUseMipmaps(renderState.res.visualizationData.onRequestUseHighQualityBlur());
            onRenderCheckResources(renderState);
            if (compositionResult == null) {
                return;
            }
            if (this.radius > 0.0f) {
                VFrameBuffer[] vFrameBufferArr2 = this.blurTargets;
                if (vFrameBufferArr2.length > 0) {
                    stackBlur(renderState, vFrameBufferArr2[0], compositionResult.getTexture());
                    int i = 1;
                    while (true) {
                        vFrameBufferArr = this.blurTargets;
                        if (i >= vFrameBufferArr.length) {
                            break;
                        }
                        stackBlur(renderState, vFrameBufferArr[i], vFrameBufferArr[i - 1].getTexture());
                        i++;
                    }
                    texture = vFrameBufferArr[vFrameBufferArr.length - 1].getTexture();
                    this.blurContentPreRendered = texture;
                }
            }
            texture = compositionResult.getTexture();
            this.blurContentPreRendered = texture;
        }
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public void onRender(RenderState renderState, FrameBuffer frameBuffer) {
        RectF rectF;
        this.maskImageLoader.onRender(renderState, frameBuffer);
        VFrameBuffer compositionResult = renderState.getCompositionResult(this.referenceComposition);
        setUseMipmaps(renderState.res.visualizationData.onRequestUseHighQualityBlur());
        onRenderCheckResources(renderState);
        if (compositionResult == null || this.blurContentPreRendered == null) {
            super.onRender(renderState, frameBuffer);
            return;
        }
        RectF measureDrawRect = measureDrawRect(renderState.getRes().getMeter());
        createRotationAndVpMat(renderState, this.vpMatTmp, measureDrawRect.centerX(), measureDrawRect.centerY(), measureDrawRot(renderState.getRes().getMeter()));
        setupFrameBuffer(renderState);
        Texture texture = this.blurContentPreRendered;
        this.blurContentPreRendered = null;
        super.onRender(renderState, frameBuffer);
        char c = 1;
        if (this.renderContentUnder) {
            renderState.drawFullscreenQuad(measureDrawRect.left, measureDrawRect.top, -1, new RenderPassData(getBlendModeContent(), new IAtlasTexture[]{new AtlasTexture(compositionResult, false), this.maskImageLoader.getTexture(renderState)}, renderState.res.getBufferRenderer_atlasBufferFxLight(), this.renderContentUnderShaderOnBindAction));
        }
        int length = this.blurLayerScales.length - 1;
        while (length >= 0) {
            Vec2f vec2f = this.blurLayerScales[length];
            if (vec2f.x == 0.0f || vec2f.y == 0.0f) {
                rectF = measureDrawRect;
            } else {
                float f = (1.0f / vec2f.x) * 0.5f;
                float f2 = (1.0f / vec2f.y) * 0.5f;
                Vec2f vec2f2 = new Vec2f(0.5f - f, 0.5f - f2);
                Vec2f vec2f3 = new Vec2f(f + 0.5f, f2 + 0.5f);
                VShaderBinder bufferRenderer_atlasBufferFxLight = renderState.res.getBufferRenderer_atlasBufferFxLight();
                int i = this.blurLayerColors[length];
                IAtlasTexture[] iAtlasTextureArr = new IAtlasTexture[2];
                iAtlasTextureArr[0] = new AtlasTexture(texture, false);
                iAtlasTextureArr[c] = this.maskImageLoader.getTexture(renderState);
                rectF = measureDrawRect;
                renderState.drawFullscreenQuad(measureDrawRect.left, measureDrawRect.top, i, vec2f2, vec2f3, new RenderPassData(getBlendMode(), iAtlasTextureArr, bufferRenderer_atlasBufferFxLight, this.renderBluredContentShaderOnBindAction));
            }
            length--;
            measureDrawRect = rectF;
            c = 1;
        }
        RectF rectF2 = measureDrawRect;
        if (this.renderContent) {
            renderState.drawFullscreenQuad(rectF2.left, rectF2.top, -1, new RenderPassData(getBlendModeContent(), new IAtlasTexture[]{new AtlasTexture(compositionResult.getTexture(), false), renderState.res.getAtlasTexWhite()}, renderState.res.getBufferRenderer_atlasBufferFxLight(), this.renderContentOverShaderOnBindAction));
        }
    }

    private void setupFrameBuffer0() {
        GLES20.glTexParameteri(3553, 10241, Texture.LINEAR_MIPMAP_LINEAR);
        GLES20.glTexParameteri(3553, 10240, Texture.LINEAR_MIPMAP_LINEAR);
        GLES20.glTexParameteri(3553, 10242, 33648);
        GLES20.glTexParameteri(3553, 10243, 33648);
    }

    private void setupFrameBuffer(RenderState renderState) {
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        renderState.setTextureWrapping(1);
    }

    private void stackBlur(RenderState renderState, FrameBuffer frameBuffer, Texture texture) {
        renderState.bindFrameBuffer(frameBuffer);
        renderState.drawFullscreenQuadM1P1(-1, Vec2f.zero(), Vec2f.one(), new RenderPassData(3, new AtlasTexture(texture, false), renderState.res.getBufferRenderer_blurStackShader(), this.renderBlurStackShaderOnBindAction, 2));
    }
}
