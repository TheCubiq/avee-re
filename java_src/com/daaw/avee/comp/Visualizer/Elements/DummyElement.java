package com.daaw.avee.comp.Visualizer.Elements;

import android.content.res.Resources;
import android.graphics.RectF;
import android.opengl.GLES20;

import com.AOSPutils.UtilsFileSys;
import com.daaw.avee.PlayerCore;
import com.daaw.avee.R;
import com.daaw.avee.Common.Action3;
import com.daaw.avee.Common.Utils;
import com.daaw.avee.Common.Vec2f;
import com.daaw.avee.Common.tlog;
import com.daaw.avee.comp.Visualizer.CustomPropertiesList;
import com.daaw.avee.comp.Visualizer.Elements.Base.Element;
import com.daaw.avee.comp.Visualizer.Elements.Base.ElementImageLoader;
import com.daaw.avee.comp.Visualizer.Elements.Base.MVariableFloat;
import com.daaw.avee.comp.Visualizer.Graphic.IAtlasTexture;
import com.daaw.avee.comp.Visualizer.Graphic.IRenderState;
import com.daaw.avee.comp.Visualizer.Graphic.RenderPassData;
import com.daaw.avee.comp.Visualizer.Graphic.RenderState;
import com.daaw.avee.comp.Visualizer.Graphic.VMatrix;
import com.daaw.avee.comp.Visualizer.Graphic.VShaderBinder;
import com.daaw.avee.comp.Visualizer.Graphic.VShaderProgram;
import com.daaw.avee.comp.Visualizer.ICompositionDependencies;
import com.daaw.avee.comp.Visualizer.IDependencyResourceCounter;
import com.daaw.avee.comp.Visualizer.Meter;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.util.MimeTypes;

import mdesl.graphics.glutils.FrameBuffer;
/* loaded from: classes.dex */
public class DummyElement extends Element {
    public static final String[] internalImages = {"composition:0"};
    public static final String typeName = "DummyElement";
    private VShaderProgram loadedShader;
    private boolean reloadShader;
    public String shaderFrag;
    private Action3<RenderState, VShaderProgram, RenderPassData> shaderOnBindAction;
    public String shaderVert;
    ElementImageLoader targetImageLoader;
    public MVariableFloat u_value1;
    public MVariableFloat u_value2;
    public MVariableFloat u_value3;
    public MVariableFloat u_value4;
    public MVariableFloat u_value5;
    public MVariableFloat u_value6;
    public final VMatrix vpMatTmp;

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public String getElementTypeName() {
        return typeName;
    }

    public void initCustomShader() {
        Resources resources = PlayerCore.s().getAppContext().getResources();
        this.shaderVert = UtilsFileSys.readResource(resources, R.raw.buffer_fisheye_vert);
        this.shaderFrag = UtilsFileSys.readResource(resources, R.raw.buffer_fisheye_frag);
    }

    public boolean isShaderEditable() {
        return true;
    }

    public DummyElement() {
        super(4, 1.0f, 1.0f);
        this.vpMatTmp = new VMatrix();

        initCustomShader();

        this.u_value1 = MVariableFloat.CreateConstantFloat(5.4f);
        this.u_value2 = MVariableFloat.CreateConstantFloat(2.0f);
        MVariableFloat CreateConstantFloat = MVariableFloat.CreateConstantFloat(0.0f);
        this.u_value3 = CreateConstantFloat;
        this.u_value4 = CreateConstantFloat;
        this.u_value5 = CreateConstantFloat;
        this.u_value6 = CreateConstantFloat;
        this.shaderOnBindAction = new Action3<RenderState, VShaderProgram, RenderPassData>() { // from class: com.daaw.avee.comp.Visualizer.Elements.DummyElement.2
            @Override // com.daaw.avee.Common.Action3
            public void onInvoke(RenderState renderState, VShaderProgram vShaderProgram, RenderPassData renderPassData) {
                vShaderProgram.setUniformMatrix("u_projView", false, DummyElement.this.vpMatTmp.getObj());
                // vShaderProgram.setUniformf("u_value1", DummyElement.this.u_value1.getValueAsFloat(renderState.getRes().getMeter()));´

                Meter meter = renderState.getRes().getMeter();
                vShaderProgram.setUniformf("u_value1", DummyElement.this.u_value1.getValueAsFloat(meter));
                vShaderProgram.setUniformf("u_value2", DummyElement.this.u_value2.getValueAsFloat(meter));
                vShaderProgram.setUniformf("u_value3", DummyElement.this.u_value3.getValueAsFloat(meter));
                vShaderProgram.setUniformf("u_value4", DummyElement.this.u_value4.getValueAsFloat(meter));
                vShaderProgram.setUniformf("u_value5", DummyElement.this.u_value5.getValueAsFloat(meter));
                vShaderProgram.setUniformf("u_value6", DummyElement.this.u_value6.getValueAsFloat(meter));

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

        this.u_value1 = customPropertiesList.getPropertyMVariableFloat("value1", this.u_value1);
        this.u_value2 = customPropertiesList.getPropertyMVariableFloat("value2", this.u_value2);
        this.u_value3 = customPropertiesList.getPropertyMVariableFloat("value3", this.u_value3);
        this.u_value4 = customPropertiesList.getPropertyMVariableFloat("value4", this.u_value4);
        this.u_value5 = customPropertiesList.getPropertyMVariableFloat("value5", this.u_value5);
        this.u_value6 = customPropertiesList.getPropertyMVariableFloat("value6", this.u_value6);

        this.reloadShader = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public void onReadCustomization(CustomPropertiesList customPropertiesList, IDependencyResourceCounter iDependencyResourceCounter) {
        super.onReadCustomization(customPropertiesList, iDependencyResourceCounter);
        super.onReadCustomizationAdditional(customPropertiesList);
        customPropertiesList.setCustomizationName("Dummy Element");
        iDependencyResourceCounter.PutDependencyResourceName(getTargetImage());
        customPropertiesList.putPropertyStringAsImage("TargetImage", getTargetImage(), "1_appearance", internalImages);
        
        if (isShaderEditable()) {
            customPropertiesList.putPropertyStringAsTxtPr("shaderFragment", this.shaderFrag, "shader");
            customPropertiesList.putPropertyStringAsTxtPr("shaderVertex", this.shaderVert, "shader");
        }

        customPropertiesList.putPropertyMVariableFloat("value1", this.u_value1, "variables", -1.0f, 1.0f);
        customPropertiesList.putPropertyMVariableFloat("value2", this.u_value2, "variables", -1.0f, 1.0f);
        customPropertiesList.putPropertyMVariableFloat("value3", this.u_value3, "variables", -1.0f, 1.0f);
        customPropertiesList.putPropertyMVariableFloat("value4", this.u_value4, "variables", -1.0f, 1.0f);
        customPropertiesList.putPropertyMVariableFloat("value5", this.u_value5, "variables", -1.0f, 1.0f);
        customPropertiesList.putPropertyMVariableFloat("value6", this.u_value6, "variables", -1.0f, 1.0f);
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
        RenderState.RenderResources renderResources = renderState.res;

        if (this.loadedShader == null || this.reloadShader) {
            this.reloadShader = false;
            this.loadedShader = renderResources.safeDisposeShader(this.loadedShader);
            this.loadedShader = renderResources.loadShaderFromString(this.shaderVert, this.shaderFrag);
            tlog.d("shaderReload");
        }
        VShaderProgram vShaderProgram = this.loadedShader;
        renderState.drawFullscreenQuad(measureDrawRect.left, measureDrawRect.top, -1, Vec2f.zero(), Vec2f.one(), new RenderPassData(getBlendMode(), texture, this.loadedShader != null ? renderResources.createCustomShaderBinder(this.loadedShader) : null, this.shaderOnBindAction));
    }

    private void setupFrameBuffer(RenderState renderState) {
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        renderState.setTextureWrapping(1);
    }
}
