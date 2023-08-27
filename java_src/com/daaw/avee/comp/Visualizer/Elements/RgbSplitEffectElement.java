package com.daaw.avee.comp.Visualizer.Elements;

import android.graphics.RectF;
import android.opengl.GLES20;
import androidx.core.internal.view.SupportMenu;
import com.daaw.avee.Common.Action2;
import com.daaw.avee.Common.Action3;
import com.daaw.avee.Common.Func.Func1;
import com.daaw.avee.Common.Vec2f;
import com.daaw.avee.comp.AlbumArt.AlbumArtRequest;
import com.daaw.avee.comp.Common.MeasureDefs;
import com.daaw.avee.comp.Visualizer.CustomPropertiesList;
import com.daaw.avee.comp.Visualizer.Elements.Base.Element;
import com.daaw.avee.comp.Visualizer.Elements.Base.ElementImageLoader;
import com.daaw.avee.comp.Visualizer.Elements.Base.MVariableFloat;
import com.daaw.avee.comp.Visualizer.Elements.Base.MeasuredVar;
import com.daaw.avee.comp.Visualizer.Graphic.BlendMode;
import com.daaw.avee.comp.Visualizer.Graphic.GraphicsUtils;
import com.daaw.avee.comp.Visualizer.Graphic.IAtlasTexture;
import com.daaw.avee.comp.Visualizer.Graphic.IRenderState;
import com.daaw.avee.comp.Visualizer.Graphic.RenderPassData;
import com.daaw.avee.comp.Visualizer.Graphic.RenderState;
import com.daaw.avee.comp.Visualizer.Graphic.VMatrix;
import com.daaw.avee.comp.Visualizer.Graphic.VShaderBinder;
import com.daaw.avee.comp.Visualizer.Graphic.VShaderProgram;
import com.daaw.avee.comp.Visualizer.ICompositionDependencies;
import com.daaw.avee.comp.Visualizer.IDependencyResourceCounter;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import mdesl.graphics.glutils.FrameBuffer;
/* loaded from: classes.dex */
public class RgbSplitEffectElement extends Element {
    public static final String[] internalImages = {"composition:0"};
    public static final String typeName = "RgbSplitEffect";
    private int blendModeContent;
    private Vec2f[] blurLayerScales;
    private int color2;
    AlbumArtRequest currentAlbumArtPath;
    private Action3<RenderState, VShaderProgram, RenderPassData> effectShaderOnBindAction;
    boolean offscreenContentPreRender;
    private Action2<RenderState, VShaderProgram> renderBlurShaderOnBindAction;
    private boolean renderContent;
    private boolean renderContentUnder;
    private Action3<RenderState, VShaderProgram, RenderPassData> renderContentUnderShaderOnBindAction;
    private Action3<RenderState, VShaderProgram, RenderPassData> shaderOnBindAction;
    private float[] splitColor0;
    private float[] splitColor1;
    private float[] splitColor2;
    private MVariableFloat splitDirAmount;
    private MVariableFloat splitMultiplierVar;
    ElementImageLoader targetImageLoader;
    public final VMatrix vpMatTmp;

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public String getElementTypeName() {
        return typeName;
    }

    public RgbSplitEffectElement() {
        super(4, 1.0f, 1.0f);
        this.color2 = -1;
        this.blendModeContent = 2;
        this.renderContent = false;
        this.renderContentUnder = false;
        this.splitMultiplierVar = MVariableFloat.CreateConstantFloat(6.0f);
        this.splitDirAmount = new MVariableFloat(new MeasuredVar(MeasureDefs.beatRandomShake, 0.5f, 0.5f));
        this.splitColor0 = new float[]{1.0f, 0.0f, 0.0f, 1.0f};
        this.splitColor1 = new float[]{0.0f, 1.0f, 0.0f, 1.0f};
        this.splitColor2 = new float[]{0.0f, 0.0f, 1.0f, 1.0f};
        this.blurLayerScales = new Vec2f[3];
        this.currentAlbumArtPath = null;
        int i = 1;
        this.offscreenContentPreRender = true;
        this.vpMatTmp = new VMatrix();
        this.renderContentUnderShaderOnBindAction = new Action3<RenderState, VShaderProgram, RenderPassData>() { // from class: com.daaw.avee.comp.Visualizer.Elements.RgbSplitEffectElement.3
            @Override // com.daaw.avee.Common.Action3
            public void onInvoke(RenderState renderState, VShaderProgram vShaderProgram, RenderPassData renderPassData) {
            }
        };
        this.renderBlurShaderOnBindAction = new Action2<RenderState, VShaderProgram>() { // from class: com.daaw.avee.comp.Visualizer.Elements.RgbSplitEffectElement.4
            @Override // com.daaw.avee.Common.Action2
            public void onInvoke(RenderState renderState, VShaderProgram vShaderProgram) {
            }
        };
        this.shaderOnBindAction = new Action3<RenderState, VShaderProgram, RenderPassData>() { // from class: com.daaw.avee.comp.Visualizer.Elements.RgbSplitEffectElement.5
            @Override // com.daaw.avee.Common.Action3
            public void onInvoke(RenderState renderState, VShaderProgram vShaderProgram, RenderPassData renderPassData) {
                vShaderProgram.setUniformMatrix("u_projView", false, RgbSplitEffectElement.this.vpMatTmp.getObj());
            }
        };
        this.effectShaderOnBindAction = new Action3<RenderState, VShaderProgram, RenderPassData>() { // from class: com.daaw.avee.comp.Visualizer.Elements.RgbSplitEffectElement.6
            @Override // com.daaw.avee.Common.Action3
            public void onInvoke(RenderState renderState, VShaderProgram vShaderProgram, RenderPassData renderPassData) {
                vShaderProgram.setUniformMatrix("u_projView", false, RgbSplitEffectElement.this.vpMatTmp.getObj());
                float valueAsFloat = RgbSplitEffectElement.this.splitMultiplierVar.getValueAsFloat(renderState.getRes().getMeter());
                Vec2f vec2f = new Vec2f(0.0f, 0.0f);
                RgbSplitEffectElement.this.splitDirAmount.getValueAsVec2f(renderState.getRes().getMeter(), vec2f);
                vShaderProgram.setUniformf("dirAmount", vec2f.x * valueAsFloat, vec2f.y * valueAsFloat);
                vShaderProgram.setUniformf("splitColor0", RgbSplitEffectElement.this.splitColor0[0], RgbSplitEffectElement.this.splitColor0[1], RgbSplitEffectElement.this.splitColor0[2]);
                vShaderProgram.setUniformf("splitColor1", RgbSplitEffectElement.this.splitColor1[0], RgbSplitEffectElement.this.splitColor1[1], RgbSplitEffectElement.this.splitColor1[2]);
                vShaderProgram.setUniformf("splitColor2", RgbSplitEffectElement.this.splitColor2[0], RgbSplitEffectElement.this.splitColor2[1], RgbSplitEffectElement.this.splitColor2[2]);
            }
        };
        setScale(1.0f, 1.0f);
        setBlendMode(4);
        this.blurLayerScales[0] = new Vec2f(1.0f, 1.0f);
        while (true) {
            Vec2f[] vec2fArr = this.blurLayerScales;
            if (i < vec2fArr.length) {
                vec2fArr[i] = new Vec2f(0.0f, 0.0f);
                i++;
            } else {
                this.targetImageLoader = new ElementImageLoader(new ElementImageLoader.IOnNeedReCreateGLResources() { // from class: com.daaw.avee.comp.Visualizer.Elements.RgbSplitEffectElement.1
                    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.ElementImageLoader.IOnNeedReCreateGLResources
                    public void markNeedReCreateGLResources() {
                        RgbSplitEffectElement.this.markNeedReCreateGLResourcesDontOverride();
                    }
                }, new Func1<IRenderState, AlbumArtRequest>() { // from class: com.daaw.avee.comp.Visualizer.Elements.RgbSplitEffectElement.2
                    @Override // com.daaw.avee.Common.Func.Func1
                    public AlbumArtRequest onInvoke(IRenderState iRenderState) {
                        if (iRenderState != null) {
                            RgbSplitEffectElement.this.currentAlbumArtPath = iRenderState.getRes().getVisualizationData().onRequestsAlbumArtPath();
                        }
                        return RgbSplitEffectElement.this.currentAlbumArtPath;
                    }
                }, null, null);
                setTargetImage("composition:1");
                return;
            }
        }
    }

    public void setTargetImage(String str) {
        this.targetImageLoader.setCustomImage(str);
    }

    public String getTargetImage() {
        return this.targetImageLoader.getCustomImagePath();
    }

    public void setColor2(int i) {
        this.color2 = i;
    }

    public void setSplitMultiplier(MVariableFloat mVariableFloat) {
        this.splitMultiplierVar = mVariableFloat;
    }

    public void setSplitAmount(MVariableFloat mVariableFloat) {
        this.splitDirAmount = mVariableFloat;
    }

    public void setSplitColor0(int i) {
        GraphicsUtils.intColorToF4Color(this.splitColor0, i);
    }

    public void setSplitColor1(int i) {
        GraphicsUtils.intColorToF4Color(this.splitColor1, i);
    }

    public void setSplitColor2(int i) {
        GraphicsUtils.intColorToF4Color(this.splitColor2, i);
    }

    public int getSplitColor0() {
        return GraphicsUtils.f4ColorToIntColor(this.splitColor0);
    }

    public int getSplitColor1() {
        return GraphicsUtils.f4ColorToIntColor(this.splitColor1);
    }

    public int getSplitColor2() {
        return GraphicsUtils.f4ColorToIntColor(this.splitColor2);
    }

    public void setSplitColor0(float[] fArr) {
        float[] fArr2 = this.splitColor0;
        fArr2[0] = fArr[0];
        fArr2[1] = fArr[1];
        fArr2[2] = fArr[2];
        fArr2[3] = fArr[3];
    }

    public void setSplitColor1(float[] fArr) {
        float[] fArr2 = this.splitColor1;
        fArr2[0] = fArr[0];
        fArr2[1] = fArr[1];
        fArr2[2] = fArr[2];
        fArr2[3] = fArr[3];
    }

    public void setSplitColor2(float[] fArr) {
        float[] fArr2 = this.splitColor2;
        fArr2[0] = fArr[0];
        fArr2[1] = fArr[1];
        fArr2[2] = fArr[2];
        fArr2[3] = fArr[3];
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public void onApplyCustomization(CustomPropertiesList customPropertiesList) {
        super.onApplyCustomization(customPropertiesList);
        super.onApplyCustomizationAdditional(customPropertiesList);
        setBlendModeContent(BlendMode.create(customPropertiesList.getChild("blendModeContent").getTypeName(BlendMode.typeName2), this.blendModeContent));
        setColor2(customPropertiesList.getPropertyInt(TtmlNode.ATTR_TTS_COLOR, -1));
        setTargetImage(customPropertiesList.getPropertyString("targetImage", "composition:1"));
        setRenderContentOnTop(customPropertiesList.getPropertyBool("showUnblurredContent", false));
        setRenderContentUnder(customPropertiesList.getPropertyBool("showUnblurredContentUnder", false));
        setSplitMultiplier(customPropertiesList.getPropertyMVariableFloat("splitMultiplier", MVariableFloat.CreateConstantFloat(6.0f)));
        setSplitAmount(customPropertiesList.getPropertyMVariableFloat("splitAmount", new MVariableFloat(new MeasuredVar(MeasureDefs.beatRandomShake, 0.5f, 0.5f))));
        setSplitColor0(customPropertiesList.getPropertyInt("splitColor0", SupportMenu.CATEGORY_MASK));
        setSplitColor1(customPropertiesList.getPropertyInt("splitColor1", -16711936));
        setSplitColor2(customPropertiesList.getPropertyInt("splitColor2", -16776961));
        this.blurLayerScales[0] = new Vec2f(1.0f, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public void onReadCustomization(CustomPropertiesList customPropertiesList, IDependencyResourceCounter iDependencyResourceCounter) {
        super.onReadCustomization(customPropertiesList, iDependencyResourceCounter);
        super.onReadCustomizationAdditional(customPropertiesList);
        customPropertiesList.setCustomizationName("Rgb Split");
        customPropertiesList.putEmptyChild("blendModeContent", BlendMode.getTypeName(this.blendModeContent), "1_appearance", BlendMode.useableModes);
        customPropertiesList.putPropertyIntAsCRGB(TtmlNode.ATTR_TTS_COLOR, this.color2, "1_appearance");
        iDependencyResourceCounter.PutDependencyResourceName(getTargetImage());
        customPropertiesList.putPropertyStringAsImage("targetImage", getTargetImage(), "1_appearance", internalImages);
        customPropertiesList.putPropertyBool("showUnblurredContent", getRenderContent(), "1_appearance");
        customPropertiesList.putPropertyBool("showUnblurredContentUnder", getRenderContentUnder(), "1_appearance");
        customPropertiesList.putPropertyMVariableFloat("splitMultiplier", this.splitMultiplierVar, "2_splitEffect", 0.0f, 6.0f);
        customPropertiesList.putPropertyMVariableVec2f("splitAmount", this.splitDirAmount, "2_splitEffect", -0.5f, 0.5f);
        customPropertiesList.putPropertyIntAsCRGB("splitColor0", getSplitColor0(), "2_splitEffect");
        customPropertiesList.putPropertyIntAsCRGB("splitColor1", getSplitColor1(), "2_splitEffect");
        customPropertiesList.putPropertyIntAsCRGB("splitColor2", getSplitColor2(), "2_splitEffect");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public void markNeedReCreateGLResources() {
        super.markNeedReCreateGLResources();
        ElementImageLoader elementImageLoader = this.targetImageLoader;
        if (elementImageLoader != null) {
            elementImageLoader.markNeedReCreateGLResources();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public void onDestroyGLResources(RenderState renderState) {
        super.onDestroyGLResources(renderState);
        ElementImageLoader elementImageLoader = this.targetImageLoader;
        if (elementImageLoader != null) {
            elementImageLoader.onDestroyGLResources(renderState);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public boolean onCreateGLResources(RenderState renderState) {
        this.targetImageLoader.onCreateGLResources(renderState, measureDrawRectMaxScaleValues(renderState.res.meter), 0);
        return super.onCreateGLResources(renderState);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public void onCreateGradualGLResources(RenderState renderState, int i) {
        this.targetImageLoader.onCreateGradualGLResources(renderState, i);
        super.onCreateGradualGLResources(renderState, i);
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public void onEarlyUpdate(IRenderState iRenderState, FrameBuffer frameBuffer, ICompositionDependencies iCompositionDependencies) {
        super.onEarlyUpdate(iRenderState, frameBuffer, iCompositionDependencies);
        this.targetImageLoader.onEarlyUpdate(iRenderState, frameBuffer, iCompositionDependencies);
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public void onRenderOffscreenContent(RenderState renderState) {
        super.onRenderOffscreenContent(renderState);
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public void onRender(RenderState renderState, FrameBuffer frameBuffer) {
        RectF rectF;
        this.targetImageLoader.onRender(renderState, frameBuffer);
        IAtlasTexture texture = this.targetImageLoader.getTexture(renderState);
        if (texture == null) {
            super.onRender(renderState, frameBuffer);
            return;
        }
        onRenderCheckResources(renderState);
        RectF measureDrawRect = measureDrawRect(renderState.getRes().getMeter());
        createRotationAndVpMat(renderState, this.vpMatTmp, measureDrawRect.centerX(), measureDrawRect.centerY(), measureDrawRot(renderState.getRes().getMeter()));
        setupFrameBuffer(renderState);
        super.onRender(renderState, frameBuffer);
        if (this.renderContentUnder) {
            renderState.drawFullscreenQuad(measureDrawRect.left, measureDrawRect.top, -1, new RenderPassData(getBlendModeContent(), texture, renderState.res.getBufferRenderer_atlasBufferVPMat(), this.shaderOnBindAction));
        }
        int length = this.blurLayerScales.length - 1;
        while (length >= 0) {
            Vec2f vec2f = this.blurLayerScales[length];
            if (vec2f.x == 0.0f || vec2f.y == 0.0f) {
                rectF = measureDrawRect;
            } else {
                float f = (1.0f / vec2f.x) * 0.5f;
                float f2 = (1.0f / vec2f.y) * 0.5f;
                rectF = measureDrawRect;
                renderState.drawFullscreenQuad(measureDrawRect.left, measureDrawRect.top, this.color2, new Vec2f(0.5f - f, 0.5f - f2), new Vec2f(f + 0.5f, f2 + 0.5f), new RenderPassData(getBlendMode(), texture, renderState.res.getBufferRenderer_RgbSplitEffect(), this.effectShaderOnBindAction));
            }
            length--;
            measureDrawRect = rectF;
        }
        RectF rectF2 = measureDrawRect;
        if (this.renderContent) {
            renderState.drawFullscreenQuad(rectF2.left, rectF2.top, -1, new RenderPassData(getBlendModeContent(), texture, (VShaderBinder) null, (Action3<RenderState, VShaderProgram, RenderPassData>) null));
        }
    }

    private void setupFrameBuffer(RenderState renderState) {
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        renderState.setTextureWrapping(1);
    }

    private void horizontalBlur(RenderState renderState, FrameBuffer frameBuffer, IAtlasTexture iAtlasTexture, float f, float f2) {
        renderState.bindFrameBuffer(frameBuffer);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16384);
        renderState.drawFullscreenQuad(f, f2, -1, new RenderPassData(4, iAtlasTexture, renderState.res.getBufferRenderer_RgbSplitEffect(), this.effectShaderOnBindAction));
    }
}
