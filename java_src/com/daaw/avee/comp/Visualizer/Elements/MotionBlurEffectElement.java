package com.daaw.avee.comp.Visualizer.Elements;

import android.graphics.RectF;
import android.opengl.GLES20;
import com.daaw.avee.Common.Action2;
import com.daaw.avee.Common.Action3;
import com.daaw.avee.Common.Vec2f;
import com.daaw.avee.comp.Common.MeasureDefs;
import com.daaw.avee.comp.Visualizer.CustomPropertiesList;
import com.daaw.avee.comp.Visualizer.Elements.Base.Element;
import com.daaw.avee.comp.Visualizer.Elements.Base.ElementImageLoader;
import com.daaw.avee.comp.Visualizer.Elements.Base.MVariableFloat;
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
public class MotionBlurEffectElement extends Element {
    public static final String[] internalImages = {"composition:0"};
    public static final String[] motionSources = {"EffectTransform", "Manual"};
    public static final String typeName = "MotionBlurEffect";
    private int blendModeContent;
    private MVariableFloat blurAmountMultiplier;
    private int color2;
    private float deltaDrawCenterX;
    private float deltaDrawCenterY;
    private float deltaDrawHeight;
    private float deltaDrawWidth;
    private Action3<RenderState, VShaderProgram, RenderPassData> effectShaderOnBindAction;
    private float lastDrawCenterX;
    private float lastDrawCenterY;
    private float lastDrawHeight;
    private float lastDrawWidth;
    private String motionSourceId;
    private MVariableFloat posBlurAmount;
    private boolean relativeMotionMode;
    private Action2<RenderState, VShaderProgram> renderBlurShaderOnBindAction;
    private boolean renderContent;
    private boolean renderContentUnder;
    private Action3<RenderState, VShaderProgram, RenderPassData> renderContentUnderShaderOnBindAction;
    private MVariableFloat scaleBlurAmount;
    private Action3<RenderState, VShaderProgram, RenderPassData> shaderOnBindAction;
    ElementImageLoader targetImageLoader;
    public final VMatrix vpMatTmp;

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public String getElementTypeName() {
        return typeName;
    }

    public MotionBlurEffectElement() {
        super(4, 1.0f, 1.0f);
        this.motionSourceId = "";
        this.color2 = -1;
        this.blendModeContent = 2;
        this.renderContent = false;
        this.renderContentUnder = false;
        this.relativeMotionMode = true;
        this.blurAmountMultiplier = MVariableFloat.CreateConstantFloat(1.0f);
        this.posBlurAmount = MVariableFloat.CreateConstantVec2f(0.5f, 0.5f);
        this.scaleBlurAmount = MVariableFloat.CreateConstantVec2f(0.0f, 0.0f);
        this.lastDrawCenterX = 0.0f;
        this.lastDrawCenterY = 0.0f;
        this.deltaDrawCenterX = 0.0f;
        this.deltaDrawCenterY = 0.0f;
        this.lastDrawWidth = 0.0f;
        this.lastDrawHeight = 0.0f;
        this.deltaDrawWidth = 0.0f;
        this.deltaDrawHeight = 0.0f;
        this.vpMatTmp = new VMatrix();
        this.renderContentUnderShaderOnBindAction = new Action3<RenderState, VShaderProgram, RenderPassData>() { // from class: com.daaw.avee.comp.Visualizer.Elements.MotionBlurEffectElement.2
            @Override // com.daaw.avee.Common.Action3
            public void onInvoke(RenderState renderState, VShaderProgram vShaderProgram, RenderPassData renderPassData) {
            }
        };
        this.renderBlurShaderOnBindAction = new Action2<RenderState, VShaderProgram>() { // from class: com.daaw.avee.comp.Visualizer.Elements.MotionBlurEffectElement.3
            @Override // com.daaw.avee.Common.Action2
            public void onInvoke(RenderState renderState, VShaderProgram vShaderProgram) {
            }
        };
        this.shaderOnBindAction = new Action3<RenderState, VShaderProgram, RenderPassData>() { // from class: com.daaw.avee.comp.Visualizer.Elements.MotionBlurEffectElement.4
            @Override // com.daaw.avee.Common.Action3
            public void onInvoke(RenderState renderState, VShaderProgram vShaderProgram, RenderPassData renderPassData) {
                vShaderProgram.setUniformMatrix("u_projView", false, MotionBlurEffectElement.this.vpMatTmp.getObj());
            }
        };
        this.effectShaderOnBindAction = new Action3<RenderState, VShaderProgram, RenderPassData>() { // from class: com.daaw.avee.comp.Visualizer.Elements.MotionBlurEffectElement.5
            @Override // com.daaw.avee.Common.Action3
            public void onInvoke(RenderState renderState, VShaderProgram vShaderProgram, RenderPassData renderPassData) {
                IAtlasTexture texturePrimary = renderPassData.getTexturePrimary();
                float width = 1.0f / texturePrimary.getWidth();
                float height = 1.0f / texturePrimary.getHeight();
                vShaderProgram.setUniformMatrix("u_projView", false, MotionBlurEffectElement.this.vpMatTmp.getObj());
                float valueAsFloat = MotionBlurEffectElement.this.blurAmountMultiplier.getValueAsFloat(renderState.getRes().getMeter());
                Vec2f vec2f = new Vec2f(MotionBlurEffectElement.this.deltaDrawCenterX, MotionBlurEffectElement.this.deltaDrawCenterY);
                vec2f.x = vec2f.x * valueAsFloat * width;
                vec2f.y = vec2f.y * valueAsFloat * height;
                if (vec2f.length() > 4.0f) {
                    vec2f.normalize();
                    vec2f.x *= 4.0f;
                    vec2f.y *= 4.0f;
                }
                vShaderProgram.setUniformf("posAmount", (-vec2f.x) * 2.0f, vec2f.y * 2.0f);
                Vec2f vec2f2 = new Vec2f(MotionBlurEffectElement.this.deltaDrawWidth, MotionBlurEffectElement.this.deltaDrawHeight);
                vec2f2.x = vec2f2.x * valueAsFloat * width;
                vec2f2.y = vec2f2.y * valueAsFloat * height;
                vShaderProgram.setUniformf("scaleAmount", (-vec2f2.x) * 2.0f, vec2f2.y * 2.0f);
            }
        };
        this.defaultMeasurePosMeasure = MeasureDefs.beatCamShakeMore;
        setBlendMode(4);
        setScale(1.0f, 1.0f);
        this.targetImageLoader = new ElementImageLoader(new ElementImageLoader.IOnNeedReCreateGLResources() { // from class: com.daaw.avee.comp.Visualizer.Elements.MotionBlurEffectElement.1
            @Override // com.daaw.avee.comp.Visualizer.Elements.Base.ElementImageLoader.IOnNeedReCreateGLResources
            public void markNeedReCreateGLResources() {
                MotionBlurEffectElement.this.markNeedReCreateGLResourcesDontOverride();
            }
        }, null, null, null);
        setTargetImage("composition:1");
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
        this.blurAmountMultiplier = mVariableFloat;
    }

    public void setRelativeMotionMode(boolean z) {
        this.relativeMotionMode = z;
    }

    public boolean getRelativeMotionMode() {
        return this.relativeMotionMode;
    }

    public void setSplitAmount(MVariableFloat mVariableFloat) {
        this.posBlurAmount = mVariableFloat;
    }

    public void setScaleAmount(MVariableFloat mVariableFloat) {
        this.scaleBlurAmount = mVariableFloat;
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
        setBlendModeContent(BlendMode.create(customPropertiesList.getChild("blendModeContent").getTypeName(), 2));
        setColor2(customPropertiesList.getPropertyInt(TtmlNode.ATTR_TTS_COLOR, -1));
        setTargetImage(customPropertiesList.getPropertyString("TargetImage", "composition:1"));
        setRenderContentOnTop(customPropertiesList.getPropertyBool("showUnblurredContent", false));
        setRenderContentUnder(customPropertiesList.getPropertyBool("showUnblurredContentUnder", false));
        setSplitMultiplier(customPropertiesList.getPropertyMVariableFloat("blurAmountMultiplier", MVariableFloat.CreateConstantFloat(1.0f)));
        CustomPropertiesList child = customPropertiesList.getChild("motionSource");
        this.motionSourceId = child.getTypeName(motionSources[0]);
        setSplitAmount(child.getPropertyMVariableFloat("posBlurAmount", MVariableFloat.CreateConstantVec2f(0.5f, 0.5f)));
        setScaleAmount(child.getPropertyMVariableFloat("scaleBlurAmount", MVariableFloat.CreateConstantVec2f(0.0f, 0.0f)));
        setRelativeMotionMode(customPropertiesList.getPropertyBool("relativeMotionMode", true));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public void onReadCustomization(CustomPropertiesList customPropertiesList, IDependencyResourceCounter iDependencyResourceCounter) {
        super.onReadCustomization(customPropertiesList, iDependencyResourceCounter);
        super.onReadCustomizationAdditional(customPropertiesList);
        customPropertiesList.setCustomizationName("Motion Blur Effect");
        customPropertiesList.putEmptyChild("blendModeContent", BlendMode.getTypeName(this.blendModeContent), "1_appearance", BlendMode.useableModes);
        customPropertiesList.putPropertyIntAsCRGB(TtmlNode.ATTR_TTS_COLOR, this.color2, "1_appearance");
        iDependencyResourceCounter.PutDependencyResourceName(getTargetImage());
        customPropertiesList.putPropertyStringAsImage("TargetImage", getTargetImage(), "1_appearance", internalImages);
        customPropertiesList.putPropertyBool("showUnblurredContent", getRenderContent(), "1_appearance");
        customPropertiesList.putPropertyBool("showUnblurredContentUnder", getRenderContentUnder(), "1_appearance");
        customPropertiesList.putPropertyMVariableFloat("blurAmountMultiplier", this.blurAmountMultiplier, "2_motionBlur", 0.0f, 2.0f);
        CustomPropertiesList putEmptyChild = customPropertiesList.putEmptyChild("motionSource", this.motionSourceId, "2_motionBlur", motionSources);
        if (motionSources[1].equals(this.motionSourceId)) {
            putEmptyChild.putPropertyMVariableVec2f("posBlurAmount", this.posBlurAmount, "2_motionBlur", 0.0f, 2.0f);
            putEmptyChild.putPropertyMVariableVec2f("scaleBlurAmount", this.scaleBlurAmount, "2_motionBlur", -1.0f, 1.0f);
        }
        customPropertiesList.putPropertyBool("relativeMotionMode", getRelativeMotionMode(), "2_motionBlur");
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
        RectF rectF2;
        IAtlasTexture iAtlasTexture;
        RenderState renderState2;
        this.targetImageLoader.onRender(renderState, frameBuffer);
        IAtlasTexture texture = this.targetImageLoader.getTexture(renderState);
        onRenderCheckResources(renderState);
        if (texture == null) {
            super.onRender(renderState, frameBuffer);
            return;
        }
        boolean z = this.relativeMotionMode;
        RectF measureDrawRect = measureDrawRect(renderState.getRes().getMeter());
        createRotationAndVpMat(renderState, this.vpMatTmp, measureDrawRect.centerX(), measureDrawRect.centerY(), measureDrawRot(renderState.getRes().getMeter()));
        if (motionSources[1].equals(this.motionSourceId)) {
            rectF = measureDrawRectVar(renderState.getRes().getMeter(), this.posBlurAmount, this.scaleBlurAmount);
        } else {
            rectF = measureDrawRect;
            z = true;
        }
        if (z) {
            this.deltaDrawCenterX = this.lastDrawCenterX - rectF.centerX();
            this.deltaDrawCenterY = this.lastDrawCenterY - rectF.centerY();
            this.lastDrawCenterX = rectF.centerX();
            this.lastDrawCenterY = rectF.centerY();
            this.deltaDrawWidth = this.lastDrawWidth - rectF.width();
            this.deltaDrawHeight = this.lastDrawHeight - rectF.height();
            this.lastDrawWidth = rectF.width();
            this.lastDrawHeight = rectF.height();
        } else {
            this.deltaDrawCenterX = rectF.centerX();
            this.deltaDrawCenterY = rectF.centerY();
            this.lastDrawCenterX = rectF.centerX();
            this.lastDrawCenterY = rectF.centerY();
            this.deltaDrawWidth = rectF.width();
            this.deltaDrawHeight = rectF.height();
            this.lastDrawWidth = rectF.width();
            this.lastDrawHeight = rectF.height();
        }
        setupFrameBuffer(renderState);
        super.onRender(renderState, frameBuffer);
        if (this.renderContentUnder) {
            VShaderBinder bufferRenderer_atlasBufferVPMat = renderState.res.getBufferRenderer_atlasBufferVPMat();
            RenderPassData renderPassData = new RenderPassData(getBlendModeContent(), this.targetImageLoader.getTexture(renderState), bufferRenderer_atlasBufferVPMat, this.shaderOnBindAction);
            rectF2 = measureDrawRect;
            iAtlasTexture = texture;
            renderState2 = renderState;
            renderState.getBufferRenderer().drawRectangleWHBottom(renderState, measureDrawRect.left, measureDrawRect.top, 0.0f, measureDrawRect.width(), measureDrawRect.height(), -1, Vec2f.zero(), Vec2f.one(), renderPassData, true);
        } else {
            rectF2 = measureDrawRect;
            iAtlasTexture = texture;
            renderState2 = renderState;
        }
        GraphicsUtils.intColorToF4Color(new float[4], this.color2);
        renderState.getBufferRenderer().drawRectangleWHBottom(renderState, rectF2.left, rectF2.top, 0.0f, rectF2.width(), rectF2.height(), -1, Vec2f.zero(), Vec2f.one(), new RenderPassData(getBlendMode(), iAtlasTexture, renderState2.res.getBufferRenderer_MotionBlurEffect(), this.effectShaderOnBindAction), true);
        if (this.renderContent) {
            renderState.getBufferRenderer().drawRectangleWHBottom(renderState, rectF2.left, rectF2.top, 0.0f, rectF2.width(), rectF2.height(), -1, Vec2f.zero(), Vec2f.one(), new RenderPassData(getBlendModeContent(), iAtlasTexture, (VShaderBinder) null, (Action3<RenderState, VShaderProgram, RenderPassData>) null), true);
        }
    }

    private void setupFrameBuffer(RenderState renderState) {
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        renderState.setTextureWrapping(1);
    }

    private void horizontalBlur(RenderState renderState, FrameBuffer frameBuffer, IAtlasTexture iAtlasTexture) {
        renderState.bindFrameBuffer(frameBuffer);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16384);
        renderState.drawFullscreenQuad(-1, new RenderPassData(4, iAtlasTexture, renderState.res.getBufferRenderer_MotionBlurEffect(), this.effectShaderOnBindAction));
    }
}
