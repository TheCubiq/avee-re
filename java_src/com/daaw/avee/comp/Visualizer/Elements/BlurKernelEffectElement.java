package com.daaw.avee.comp.Visualizer.Elements;

import android.opengl.GLES20;
import androidx.core.view.ViewCompat;
import com.daaw.avee.Common.Action3;
import com.daaw.avee.Common.Vec2f;
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
import com.daaw.avee.comp.Visualizer.Graphic.VShaderProgram;
import com.daaw.avee.comp.Visualizer.ICompositionDependencies;
import com.daaw.avee.comp.Visualizer.IDependencyResourceCounter;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import mdesl.graphics.Texture;
import mdesl.graphics.glutils.FrameBuffer;
/* loaded from: classes.dex */
public class BlurKernelEffectElement extends Element {
    public static final String typeName = "BlurEffect";
    private int blendModeContent;
    private Vec2f[] blurLayerScales;
    private float blurMultiplier;
    private int color2;
    int currentVerticalBlurV2ResultHeight;
    ElementImageLoader maskImageLoader;
    private float radius;
    private int referenceComposition;
    private Action3<RenderState, VShaderProgram, RenderPassData> renderBlurShaderOnBindAction;
    private boolean renderContent;
    private boolean renderContentUnder;
    private Action3<RenderState, VShaderProgram, RenderPassData> renderContentUnderShaderOnBindAction;
    private Action3<RenderState, VShaderProgram, RenderPassData> renderHorizanlBlurShaderOnBindAction;
    private Action3<RenderState, VShaderProgram, RenderPassData> renderVerticalBlurShaderOnBindAction;
    private boolean useMipmaps;

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public String getElementTypeName() {
        return "BlurEffect";
    }

    public BlurKernelEffectElement() {
        super(0, 1.0f, 1.0f);
        this.useMipmaps = false;
        this.radius = 1.0f;
        this.blurMultiplier = 4.1f;
        this.color2 = ViewCompat.MEASURED_STATE_MASK;
        this.blurLayerScales = new Vec2f[3];
        this.renderContent = false;
        this.renderContentUnder = false;
        this.blendModeContent = 2;
        int i = 1;
        this.referenceComposition = 1;
        this.currentVerticalBlurV2ResultHeight = 100;
        this.renderContentUnderShaderOnBindAction = new Action3<RenderState, VShaderProgram, RenderPassData>() { // from class: com.daaw.avee.comp.Visualizer.Elements.BlurKernelEffectElement.2
            @Override // com.daaw.avee.Common.Action3
            public void onInvoke(RenderState renderState, VShaderProgram vShaderProgram, RenderPassData renderPassData) {
                vShaderProgram.setUniformMatrix("u_projView", false, renderState.getVPMatrix());
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
        this.renderBlurShaderOnBindAction = new Action3<RenderState, VShaderProgram, RenderPassData>() { // from class: com.daaw.avee.comp.Visualizer.Elements.BlurKernelEffectElement.3
            @Override // com.daaw.avee.Common.Action3
            public void onInvoke(RenderState renderState, VShaderProgram vShaderProgram, RenderPassData renderPassData) {
                vShaderProgram.setUniformMatrix("u_projView", false, renderState.getVPMatrix());
                vShaderProgram.setUniformf("Color2", 0.0f, 0.0f, 0.0f, 0.0f);
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
        this.renderVerticalBlurShaderOnBindAction = new Action3<RenderState, VShaderProgram, RenderPassData>() { // from class: com.daaw.avee.comp.Visualizer.Elements.BlurKernelEffectElement.4
            @Override // com.daaw.avee.Common.Action3
            public void onInvoke(RenderState renderState, VShaderProgram vShaderProgram, RenderPassData renderPassData) {
                vShaderProgram.setUniformMatrix("u_projView", false, renderState.getVPMatrix());
                IAtlasTexture texturePrimary = renderPassData.getTexturePrimary();
                vShaderProgram.setUniformf("radius", BlurKernelEffectElement.this.radius);
                vShaderProgram.setUniformf("resolutionW", texturePrimary.getWidth());
                vShaderProgram.setUniformf("resolutionH", texturePrimary.getHeight());
                float[] fArr = new float[4];
                GraphicsUtils.intColorToF4Color(fArr, BlurKernelEffectElement.this.color2);
                vShaderProgram.setUniformf("Color2", fArr[0], fArr[1], fArr[2], fArr[3]);
            }
        };
        this.renderHorizanlBlurShaderOnBindAction = new Action3<RenderState, VShaderProgram, RenderPassData>() { // from class: com.daaw.avee.comp.Visualizer.Elements.BlurKernelEffectElement.5
            @Override // com.daaw.avee.Common.Action3
            public void onInvoke(RenderState renderState, VShaderProgram vShaderProgram, RenderPassData renderPassData) {
                IAtlasTexture texturePrimary = renderPassData.getTexturePrimary();
                vShaderProgram.setUniformf("blurW", (BlurKernelEffectElement.this.radius / texturePrimary.getWidth()) * 2.0f);
                vShaderProgram.setUniformf("resolutionH", texturePrimary.getWidth());
            }
        };
        setScale(1.0f, 1.0f);
        this.blurLayerScales[0] = new Vec2f(1.0f, 1.0f);
        while (true) {
            Vec2f[] vec2fArr = this.blurLayerScales;
            if (i < vec2fArr.length) {
                vec2fArr[i] = new Vec2f(0.0f, 0.0f);
                i++;
            } else {
                this.maskImageLoader = new ElementImageLoader(new ElementImageLoader.IOnNeedReCreateGLResources() { // from class: com.daaw.avee.comp.Visualizer.Elements.BlurKernelEffectElement.1
                    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.ElementImageLoader.IOnNeedReCreateGLResources
                    public void markNeedReCreateGLResources() {
                        BlurKernelEffectElement.this.markNeedReCreateGLResourcesDontOverride();
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
        setBlendModeContent(BlendMode.create(customPropertiesList.getChild("blendModeContent").getTypeName(), 2));
        setColor2(customPropertiesList.getPropertyInt(TtmlNode.ATTR_TTS_COLOR, ViewCompat.MEASURED_STATE_MASK));
        setReferenceComposition(customPropertiesList.getPropertyInt("sourceCompositionIndex", 1));
        this.maskImageLoader.setCustomImage(customPropertiesList.getPropertyString("MaskImage", ElementImageLoader.internalMaskImages[0]));
        setBlurRadius(customPropertiesList.getPropertyFloat("blurRadius", 1.0f));
        setBlurMultiplier(customPropertiesList.getPropertyFloat("blurMultiplier", 4.1f));
        setRenderContentOnTop(customPropertiesList.getPropertyBool("showUnblurredContent", false));
        setRenderContentUnder(customPropertiesList.getPropertyBool("showUnblurredContentUnder", false));
        this.blurLayerScales[0] = customPropertiesList.getPropertyVec2f("1layerScale", new Vec2f(1.0f, 1.0f));
        this.blurLayerScales[1] = customPropertiesList.getPropertyVec2f("2layerScale", new Vec2f(0.0f, 0.0f));
        this.blurLayerScales[2] = customPropertiesList.getPropertyVec2f("3layerScale", new Vec2f(0.0f, 0.0f));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public void onReadCustomization(CustomPropertiesList customPropertiesList, IDependencyResourceCounter iDependencyResourceCounter) {
        super.onReadCustomization(customPropertiesList, iDependencyResourceCounter);
        customPropertiesList.setCustomizationName("Blur Effect");
        customPropertiesList.putEmptyChild("blendModeContent", BlendMode.getTypeName(this.blendModeContent), "1_appearance", BlendMode.useableModes);
        customPropertiesList.putPropertyIntAsCRGBA(TtmlNode.ATTR_TTS_COLOR, this.color2, "1_appearance");
        customPropertiesList.putPropertyIntAsRange("sourceCompositionIndex", this.referenceComposition, "1_appearance", 1, 5);
        iDependencyResourceCounter.PutDependencyResourceName(this.maskImageLoader.getCustomImagePath());
        customPropertiesList.putPropertyStringAsImage("MaskImage", this.maskImageLoader.getCustomImagePath(), "1_appearance", ElementImageLoader.internalMaskImages);
        customPropertiesList.putPropertyFloatAsRange("blurRadius", this.radius, "2_blur", 0.0f, 2.0f);
        customPropertiesList.putPropertyFloatAsRange("blurMultiplier", this.blurMultiplier, "2_blur", 2.0f, 6.0f);
        customPropertiesList.putPropertyBool("showUnblurredContent", getRenderContent(), "1_appearance");
        customPropertiesList.putPropertyBool("showUnblurredContentUnder", getRenderContentUnder(), "1_appearance");
        customPropertiesList.putPropertyVec2fAsRange("1layerScale", this.blurLayerScales[0], "2_blur", 0.0f, 10.0f);
        customPropertiesList.putPropertyVec2fAsRange("2layerScale", this.blurLayerScales[1], "2_blur", 0.0f, 10.0f);
        customPropertiesList.putPropertyVec2fAsRange("3layerScale", this.blurLayerScales[2], "2_blur", 0.0f, 10.0f);
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
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public boolean onCreateGLResources(RenderState renderState) {
        this.useMipmaps = renderState.res.visualizationData.onRequestUseHighQualityBlur();
        this.maskImageLoader.onCreateGLResources(renderState, measureDrawRectMaxScaleValues(renderState.res.meter), 0);
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
        super.onRenderOffscreenContent(renderState);
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public void onRender(RenderState renderState, FrameBuffer frameBuffer) {
        this.maskImageLoader.onRender(renderState, frameBuffer);
        VFrameBuffer compositionResult = renderState.getCompositionResult(this.referenceComposition);
        setUseMipmaps(renderState.res.visualizationData.onRequestUseHighQualityBlur());
        onRenderCheckResources(renderState);
        if (compositionResult == null) {
            super.onRender(renderState, frameBuffer);
            return;
        }
        measureDrawRect(renderState.getRes().getMeter());
        measureDrawRot(renderState.getRes().getMeter());
        setupFrameBuffer(renderState);
        Texture texture = compositionResult.getTexture();
        super.onRender(renderState, frameBuffer);
        if (this.renderContentUnder) {
            renderState.drawFullscreenQuad(-1, new RenderPassData(getBlendModeContent(), new IAtlasTexture[]{new AtlasTexture(compositionResult, false), this.maskImageLoader.getTexture(renderState)}, renderState.res.getBufferRenderer_atlasBufferFxLight(), this.renderContentUnderShaderOnBindAction));
        }
        for (int length = this.blurLayerScales.length - 1; length >= 0; length--) {
            Vec2f vec2f = this.blurLayerScales[length];
            if (vec2f.x != 0.0f && vec2f.y != 0.0f) {
                float f = (1.0f / vec2f.x) * 0.5f;
                float f2 = (1.0f / vec2f.y) * 0.5f;
                Vec2f vec2f2 = new Vec2f(0.5f - f, 0.5f - f2);
                Vec2f vec2f3 = new Vec2f(f + 0.5f, f2 + 0.5f);
                if (this.radius > 0.0f) {
                    renderState.drawFullscreenQuad(0.0f, 0.0f, -1, vec2f2, vec2f3, new RenderPassData(getBlendMode(), new IAtlasTexture[]{new AtlasTexture(texture, false), this.maskImageLoader.getTexture(renderState)}, renderState.res.getBufferRenderer_blurShaderKernel(), this.renderVerticalBlurShaderOnBindAction, 2));
                } else {
                    renderState.drawFullscreenQuad(0.0f, 0.0f, -1, vec2f2, vec2f3, new RenderPassData(getBlendMode(), new IAtlasTexture[]{new AtlasTexture(texture, false), this.maskImageLoader.getTexture(renderState)}, renderState.res.getBufferRenderer_atlasBufferFxLight(), this.renderBlurShaderOnBindAction, 2));
                }
            }
        }
        if (this.renderContent) {
            renderState.drawFullscreenQuad(-1, new AtlasTexture(compositionResult.getTexture(), false), getBlendModeContent());
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
}
