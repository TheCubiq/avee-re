package com.daaw.avee.comp.Visualizer.Elements;

import android.graphics.RectF;
import com.daaw.avee.Common.Action3;
import com.daaw.avee.Common.Utils;
import com.daaw.avee.Common.Vec2f;
import com.daaw.avee.comp.Visualizer.CustomPropertiesList;
import com.daaw.avee.comp.Visualizer.Elements.Base.Element;
import com.daaw.avee.comp.Visualizer.Elements.Base.ElementImageLoader;
import com.daaw.avee.comp.Visualizer.Graphic.IRenderState;
import com.daaw.avee.comp.Visualizer.Graphic.RenderPassData;
import com.daaw.avee.comp.Visualizer.Graphic.RenderState;
import com.daaw.avee.comp.Visualizer.Graphic.VMatrix;
import com.daaw.avee.comp.Visualizer.Graphic.VShaderBinder;
import com.daaw.avee.comp.Visualizer.Graphic.VShaderProgram;
import com.daaw.avee.comp.Visualizer.ICompositionDependencies;
import com.daaw.avee.comp.Visualizer.IDependencyResourceCounter;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.util.MimeTypes;

import mdesl.graphics.glutils.FrameBuffer;
/* loaded from: classes.dex */
public class DummyElement extends Element {
    public static final String[] internalImages = {"composition:0"};
    public static final String typeName = "DummyElement";

    private String shaderFrag;
    private String shaderVert;

    private Action3<RenderState, VShaderProgram, RenderPassData> shaderOnBindAction;
    ElementImageLoader targetImageLoader;
    public final VMatrix vpMatTmp;

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public String getElementTypeName() {
        return typeName;
    }

    public DummyElement() {
        super(4, 1.0f, 1.0f);
        this.vpMatTmp = new VMatrix();
        this.shaderVert = "customVertShaderHere";
        this.shaderFrag = "customFragShaderHere";
        this.shaderOnBindAction = new Action3<RenderState, VShaderProgram, RenderPassData>() { // from class: com.daaw.avee.comp.Visualizer.Elements.DummyElement.2
            @Override // com.daaw.avee.Common.Action3
            public void onInvoke(RenderState renderState, VShaderProgram vShaderProgram, RenderPassData renderPassData) {
                vShaderProgram.setUniformMatrix("u_projView", false, DummyElement.this.vpMatTmp.getObj());
            }
        };
        setBlendMode(4);
        setScale(1.0f, 1.0f);
        this.targetImageLoader = new ElementImageLoader(new ElementImageLoader.IOnNeedReCreateGLResources() { // from class: com.daaw.avee.comp.Visualizer.Elements.DummyElement.1
            @Override // com.daaw.avee.comp.Visualizer.Elements.Base.ElementImageLoader.IOnNeedReCreateGLResources
            public void markNeedReCreateGLResources() {
                DummyElement.this.markNeedReCreateGLResourcesDontOverride();
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public void onApplyCustomization(CustomPropertiesList customPropertiesList) {
        super.onApplyCustomization(customPropertiesList);
        super.onApplyCustomizationAdditional(customPropertiesList);
        setTargetImage(customPropertiesList.getPropertyString("TargetImage", "composition:1"));
        this.shaderVert = customPropertiesList.getPropertyString("ShaderVertex", this.shaderVert);
        this.shaderFrag = customPropertiesList.getPropertyString("ShaderFrag", this.shaderFrag);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public void onReadCustomization(CustomPropertiesList customPropertiesList, IDependencyResourceCounter iDependencyResourceCounter) {
        super.onReadCustomization(customPropertiesList, iDependencyResourceCounter);
        super.onReadCustomizationAdditional(customPropertiesList);
        customPropertiesList.setCustomizationName("Dummy Element");
        iDependencyResourceCounter.PutDependencyResourceName(getTargetImage());
        customPropertiesList.putPropertyStringAsImage("TargetImage", getTargetImage(), "1_appearance", internalImages);
        customPropertiesList.putPropertyStringAsTxtPr("ShaderVertex", this.shaderVert, "2_shaderThing");
        customPropertiesList.putPropertyStringAsTxtPr("ShaderFrag", this.shaderVert, "2_shaderThing");
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
    public void onRender(RenderState renderState, FrameBuffer frameBuffer) {
        this.targetImageLoader.onRender(renderState, frameBuffer);
        super.onRender(renderState, frameBuffer);
        RectF measureDrawRect = measureDrawRect(renderState.getRes().getMeter());
        createRotationAndVpMat(renderState, this.vpMatTmp, measureDrawRect.centerX(), measureDrawRect.centerY(), measureDrawRot(renderState.getRes().getMeter()));
        VShaderBinder bufferRenderer_atlasBufferVPMat = renderState.res.getBufferRenderer_atlasBufferVPMat();
        // gotta actually change it to drawRectangleWHBottom instead.. -> scale measure
        renderState.drawFullscreenQuad(measureDrawRect.left, measureDrawRect.top, -1, new RenderPassData(getBlendMode(), this.targetImageLoader.getTexture(renderState), bufferRenderer_atlasBufferVPMat, this.shaderOnBindAction));
    }
}
