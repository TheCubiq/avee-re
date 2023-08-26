package com.daaw.avee.comp.Visualizer.Elements;

import android.opengl.GLES20;
import com.daaw.avee.Common.Action3;
import com.daaw.avee.Common.Events.WeakEventR1;
import com.daaw.avee.Common.Utils;
import com.daaw.avee.Common.Vec2i;
import com.daaw.avee.Common.tlog;
import com.daaw.avee.comp.Common.TrackDurationInfo;
import com.daaw.avee.comp.Visualizer.CustomComposition;
import com.daaw.avee.comp.Visualizer.CustomPropertiesList;
import com.daaw.avee.comp.Visualizer.Elements.Base.Element;
import com.daaw.avee.comp.Visualizer.Elements.Base.ElementGroup;
import com.daaw.avee.comp.Visualizer.Graphic.BlendMode;
import com.daaw.avee.comp.Visualizer.Graphic.GraphicsUtils;
import com.daaw.avee.comp.Visualizer.Graphic.IRenderState;
import com.daaw.avee.comp.Visualizer.Graphic.RenderPassData;
import com.daaw.avee.comp.Visualizer.Graphic.RenderState;
import com.daaw.avee.comp.Visualizer.Graphic.VFrameBuffer;
import com.daaw.avee.comp.Visualizer.Graphic.VShaderBinder;
import com.daaw.avee.comp.Visualizer.Graphic.VShaderProgram;
import com.daaw.avee.comp.Visualizer.ICompositionDependencies;
import com.daaw.avee.comp.Visualizer.IDependencyResourceCounter;
import java.util.ArrayList;
import java.util.List;
import mdesl.graphics.glutils.FrameBuffer;
/* loaded from: classes.dex */
public class Composition extends ElementGroup<Element, CustomPropertiesList, CustomComposition> implements ICompositionDependencies {
    public static WeakEventR1<Object, Boolean> onRequest = new WeakEventR1<>();
    public static final String typeName = "Composition";
    private VFrameBuffer blurTargetContent;
    private List<Integer> dependsOnCompositions;
    private float fadeAlpha;
    private float fadeAlphaSmooth;
    private final boolean finalComposition;
    FpsTextElement fps;
    private int introBlendMode;
    private int introFadeColor;
    private float introFadeDurationSec;
    private float outroFadeDurationSec;
    private boolean thisFrameRendered;
    private boolean useMipmaps;

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public String getElementTypeName() {
        return typeName;
    }

    public static int getIndexFromStringPath(String str) {
        String[] strArr = new String[2];
        Utils.stringSplitInTwo(str, 58, strArr);
        if ("composition".equals(strArr[0])) {
            return Utils.strToIntSafe(strArr[1], -1);
        }
        return -1;
    }

    public static String makeIndexStringPath(int i) {
        return "composition:" + i;
    }

    public Composition(boolean z) {
        this.useMipmaps = false;
        this.dependsOnCompositions = new ArrayList();
        this.fadeAlphaSmooth = 0.0f;
        this.fadeAlpha = 0.0f;
        this.introFadeDurationSec = 0.0f;
        this.outroFadeDurationSec = 0.0f;
        this.introFadeColor = -553648128;
        this.introBlendMode = 0;
        this.finalComposition = z;
        if (z) {
            this.introFadeDurationSec = 0.0f;
            this.outroFadeDurationSec = 0.0f;
        }
    }

    public Composition() {
        this.useMipmaps = false;
        this.dependsOnCompositions = new ArrayList();
        this.fadeAlphaSmooth = 0.0f;
        this.fadeAlpha = 0.0f;
        this.introFadeDurationSec = 0.0f;
        this.outroFadeDurationSec = 0.0f;
        this.introFadeColor = -553648128;
        this.introBlendMode = 0;
        this.finalComposition = false;
    }

    private float getIntroFadeDurationSec() {
        return this.introFadeDurationSec;
    }

    private float getOutroFadeDurationSec() {
        return this.outroFadeDurationSec;
    }

    private int getIntroFadeColor() {
        return this.introFadeColor;
    }

    private void setIntroFadeDurationSec(float f) {
        this.introFadeDurationSec = f;
    }

    private void setOutroFadeDurationSec(float f) {
        this.outroFadeDurationSec = f;
    }

    private void setIntroFadeColor(int i) {
        this.introFadeColor = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isFinalComposition() {
        return this.finalComposition;
    }

    public void markRenderedForThisFrame() {
        this.thisFrameRendered = true;
    }

    public VFrameBuffer getCompositionFrameBuffer() {
        return this.blurTargetContent;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public boolean shouldRender() {
        if (super.shouldRender()) {
            return !this.thisFrameRendered;
        }
        return false;
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.ElementGroup
    public Element CreateFactoryElement(int i, String str, String str2) {
        return ElementsFactory.create(str, str2, null);
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public boolean getCustomization(CustomPropertiesList customPropertiesList, int i, IDependencyResourceCounter iDependencyResourceCounter) {
        super.getCustomization(customPropertiesList, i, iDependencyResourceCounter);
        if (customPropertiesList instanceof CustomComposition) {
            getCustomization((CustomComposition) customPropertiesList, iDependencyResourceCounter);
            return true;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.daaw.avee.comp.Visualizer.Elements.Base.Element] */
    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public boolean setCustomization(CustomPropertiesList customPropertiesList, int i) {
        super.setCustomization(customPropertiesList, i);
        if (customPropertiesList instanceof CustomComposition) {
            setCustomization((CustomComposition) customPropertiesList);
        }
        if (this.finalComposition) {
            boolean z = false;
            if (!onRequest.invoke(this, false).booleanValue()) {
                LogoMark2 logoMark2 = null;
                int i2 = 0;
                while (true) {
                    if (i2 >= this.childList.size()) {
                        break;
                    }
                    ?? r2 = (Element) this.childList.get(i2);
                    if (r2 instanceof LogoMark2) {
                        if (i2 != this.childList.size() - 1) {
                            removeChildAt(i2);
                        } else {
                            z = true;
                        }
                        logoMark2 = r2;
                    } else {
                        i2++;
                    }
                }
                if (!z) {
                    if (logoMark2 == null) {
                        logoMark2 = new LogoMark2();
                    }
                    addChildAtEnd(logoMark2);
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public void onDestroyGLResources(RenderState renderState) {
        super.onDestroyGLResources(renderState);
        VFrameBuffer vFrameBuffer = this.blurTargetContent;
        if (vFrameBuffer != null) {
            vFrameBuffer.dispose();
        }
        this.blurTargetContent = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public boolean onCreateGLResources(RenderState renderState) {
        if (!this.finalComposition) {
            this.useMipmaps = renderState.res.visualizationData.onRequestUseHighQualityBlur();
            try {
                Vec2i safeRenderBufferSizeTextureDim = renderState.getSafeRenderBufferSizeTextureDim();
                if (this.blurTargetContent != null) {
                    this.blurTargetContent.dispose();
                }
                VFrameBuffer createSafe = VFrameBuffer.createSafe(safeRenderBufferSizeTextureDim.x, safeRenderBufferSizeTextureDim.y, 9729, 10497, this.useMipmaps);
                this.blurTargetContent = createSafe;
                if (createSafe != null) {
                    this.blurTargetContent = createSafe.checkIfValid();
                }
            } catch (Exception e) {
                tlog.w(e.getMessage());
            }
        }
        return super.onCreateGLResources(renderState);
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.ElementGroup, com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public void onEarlyUpdate(IRenderState iRenderState, FrameBuffer frameBuffer, ICompositionDependencies iCompositionDependencies) {
        this.dependsOnCompositions.clear();
        super.onEarlyUpdate(iRenderState, frameBuffer, this);
        this.thisFrameRendered = false;
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public void onRenderOffscreenContent(RenderState renderState) {
        if (this.finalComposition) {
            super.onRenderOffscreenContent(renderState);
            renderOffscreenContentChilds(renderState);
            return;
        }
        super.onRenderOffscreenContent(renderState);
        renderOffscreenContentChilds(renderState);
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public void onRender(RenderState renderState, FrameBuffer frameBuffer) {
        FpsTextElement fpsTextElement;
        setUseMipmaps(renderState.res.visualizationData.onRequestUseHighQualityBlur());
        onRenderCheckResources(renderState);
        this.thisFrameRendered = true;
        TrackDurationInfo onRequestTrackDurationInfo = renderState.res.getVisualizationData().onRequestTrackDurationInfo();
        if (this.finalComposition) {
            super.onRender(renderState, frameBuffer);
            renderChilds(renderState, frameBuffer);
            if (frameBuffer == null && (fpsTextElement = this.fps) != null) {
                fpsTextElement.onRender(renderState, frameBuffer);
            }
            renderCompositionEffect(renderState, onRequestTrackDurationInfo);
            return;
        }
        VFrameBuffer vFrameBuffer = this.blurTargetContent;
        if (vFrameBuffer == null) {
            return;
        }
        renderState.bindFrameBuffer(vFrameBuffer);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16384);
        setupFrameBuffer(renderState);
        renderChilds(renderState, this.blurTargetContent);
        renderCompositionEffect(renderState, onRequestTrackDurationInfo);
    }

    private void renderCompositionEffect(RenderState renderState, TrackDurationInfo trackDurationInfo) {
        if (trackDurationInfo == null) {
            return;
        }
        int i = this.introFadeColor;
        if (trackDurationInfo.durationMs > 14000.0f) {
            float min = this.introFadeDurationSec > 0.01f ? Math.min(1.0f, (trackDurationInfo.trackPositionMs / 1000.0f) / this.introFadeDurationSec) : 1.0f;
            float max = this.outroFadeDurationSec > 0.01f ? Math.max(0.0f, Math.min(1.0f, ((trackDurationInfo.durationMs - trackDurationInfo.trackPositionMs) / 1000.0f) / this.outroFadeDurationSec)) : 1.0f;
            if (min < 1.0f) {
                i = this.introFadeColor;
                this.fadeAlpha = 1.0f - min;
            } else if (max < 1.0f) {
                i = this.introFadeColor;
                this.fadeAlpha = 1.0f - max;
            } else {
                this.fadeAlpha = 0.0f;
            }
        }
        float f = (this.fadeAlphaSmooth * 0.9f) + (this.fadeAlpha * 0.100000024f);
        this.fadeAlphaSmooth = f;
        if (f > 0.01f) {
            renderState.drawFullscreenQuad(GraphicsUtils.setIntColorAlpha(i, (int) (GraphicsUtils.getAlphaFloatFromIntColor(i) * this.fadeAlphaSmooth)), new RenderPassData(this.introBlendMode, renderState.res.getAtlasTexWhite(), (VShaderBinder) null, (Action3<RenderState, VShaderProgram, RenderPassData>) null));
        }
    }

    public void setUseMipmaps(boolean z) {
        if (this.useMipmaps == z) {
            return;
        }
        this.useMipmaps = z;
        markNeedReCreateGLResources();
    }

    private void setupFrameBuffer(RenderState renderState) {
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        renderState.setTextureWrapping(1);
    }

    @Override // com.daaw.avee.comp.Visualizer.ICompositionDependencies
    public List<Integer> getCompositionDependencies() {
        return this.dependsOnCompositions;
    }

    @Override // com.daaw.avee.comp.Visualizer.ICompositionDependencies
    public void addDependencyCompositionIndex(int i) {
        this.dependsOnCompositions.add(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.ElementGroup, com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public void onApplyCustomization(CustomPropertiesList customPropertiesList) {
        super.onApplyCustomization(customPropertiesList);
        this.introBlendMode = BlendMode.create(customPropertiesList.getPropertyString("introBlendMode", BlendMode.getTypeName(0)), 0);
        setIntroFadeDurationSec(customPropertiesList.getPropertyFloat("introFadeDuration", 0.0f));
        setOutroFadeDurationSec(customPropertiesList.getPropertyFloat("outroFadeDuration", 0.0f));
        setIntroFadeColor(customPropertiesList.getPropertyInt("introFadeColor", -553648128));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.ElementGroup, com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public void onReadCustomization(CustomPropertiesList customPropertiesList, IDependencyResourceCounter iDependencyResourceCounter) {
        super.onReadCustomization(customPropertiesList, iDependencyResourceCounter);
        customPropertiesList.setCustomizationName(typeName);
        customPropertiesList.putSelectString("introBlendMode", BlendMode.getTypeName(this.introBlendMode), "2_introOutro", new String[]{BlendMode.typeName0, BlendMode.typeName5});
        customPropertiesList.putPropertyFloatAsRange("introFadeDuration", getIntroFadeDurationSec(), "2_introOutro", 0.0f, 10.0f);
        customPropertiesList.putPropertyFloatAsRange("outroFadeDuration", getOutroFadeDurationSec(), "2_introOutro", 0.0f, 10.0f);
        customPropertiesList.putPropertyIntAsCRGBA("introFadeColor", getIntroFadeColor(), "2_introOutro");
    }
}
