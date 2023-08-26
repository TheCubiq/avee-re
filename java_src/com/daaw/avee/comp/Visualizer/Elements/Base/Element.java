package com.daaw.avee.comp.Visualizer.Elements.Base;

import android.graphics.PointF;
import android.graphics.RectF;
import com.daaw.avee.Common.Vec2f;
import com.daaw.avee.Common.Vec2i;
import com.daaw.avee.comp.Common.MeasureDefs;
import com.daaw.avee.comp.Visualizer.CustomPropertiesList;
import com.daaw.avee.comp.Visualizer.Elements.Segment.ISegmentPath;
import com.daaw.avee.comp.Visualizer.Elements.Segment.SegmentPathGizmo;
import com.daaw.avee.comp.Visualizer.Elements.Segment.SegmentRendererLine;
import com.daaw.avee.comp.Visualizer.Elements.SegmentElement;
import com.daaw.avee.comp.Visualizer.Graphic.BlendMode;
import com.daaw.avee.comp.Visualizer.Graphic.GraphicsUtils;
import com.daaw.avee.comp.Visualizer.Graphic.IRenderState;
import com.daaw.avee.comp.Visualizer.Graphic.RenderState;
import com.daaw.avee.comp.Visualizer.Graphic.VMatrix;
import com.daaw.avee.comp.Visualizer.ICompositionDependencies;
import com.daaw.avee.comp.Visualizer.IDependencyResourceCounter;
import com.daaw.avee.comp.Visualizer.Meter;
import mdesl.graphics.glutils.FrameBuffer;
/* loaded from: classes.dex */
public abstract class Element {
    public static String DEFAULT_VERSION = "10";
    private int defaultBlendMode;
    private float defaultScaleX;
    private float defaultScaleY;
    protected int elementId;
    protected ElementGroup parent;
    private boolean posXIsUniform;
    public static final String[] anchorModes = {"Na", "Start", "Center", "End"};
    private static ISegmentPath highlighthPath = new SegmentPathGizmo();
    private static SegmentRendererLine highlightRender0 = (SegmentRendererLine) new SegmentRendererLine().setColor(-1, -1, -1);
    protected String defaultMeasurePosMeasure = MeasureDefs.Nothing;
    protected String tagName = "";
    private boolean glResourcesCreated = false;
    private int blendMode = 0;
    private int gradualLoadingIndex = 0;
    protected boolean visible = true;
    private MeasuredVar measureRot = MeasuredVar.AsNothing();
    protected float rot = 0.0f;
    private MeasuredVar measurePos = MeasuredVar.AsNothing();
    private int anchorX = 0;
    private int anchorY = 0;
    private float posX = 0.5f;
    private float posY = 0.5f;
    private float localPosX = 0.5f;
    private float localPosY = 0.5f;
    private boolean posYIsUniform = false;
    private boolean localPosXIsUniform = false;
    private float scaleX = 0.5f;
    private float scaleY = 0.5f;
    private MeasuredVar measureScale = MeasuredVar.AsNothing();
    protected boolean scaleXIsUniform = false;
    float highlightFrame = Float.MAX_VALUE;

    public abstract String getElementTypeName();

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean onCreateGLResources(RenderState renderState) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onCreateGradualGLResources(RenderState renderState, int i) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onDestroyGLResources(RenderState renderState) {
    }

    public void onEarlyUpdate(IRenderState iRenderState, FrameBuffer frameBuffer, ICompositionDependencies iCompositionDependencies) {
    }

    /* loaded from: classes.dex */
    static class ElementIdProvider {
        static int counter = 1;

        ElementIdProvider() {
        }

        public static int getNewId() {
            int i = counter;
            counter = i + 1;
            return i;
        }
    }

    public Element(int i, float f, float f2) {
        this.elementId = -1;
        this.elementId = ElementIdProvider.getNewId();
        this.defaultBlendMode = i;
        this.defaultScaleX = f;
        this.defaultScaleY = f2;
    }

    public void dispose() {
        invokeDestroyGLResources(null);
    }

    public String getElementVersion() {
        return DEFAULT_VERSION;
    }

    public Element findElementById(int i) {
        if (this.elementId == i) {
            return this;
        }
        return null;
    }

    public void setTrigger(int i) {
        triggerHighlight();
    }

    public void setVisible(boolean z) {
        this.visible = z;
    }

    public void setBlendMode(int i) {
        this.blendMode = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int getBlendMode() {
        return this.blendMode;
    }

    public void setMeasurePos(MeasuredVar measuredVar) {
        this.measurePos = measuredVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean shouldRender() {
        return this.visible;
    }

    public void setPosition(Vec2f vec2f) {
        this.posX = vec2f.x;
        this.posY = vec2f.y;
    }

    public void setPosition(float f, float f2) {
        this.posX = f;
        this.posY = f2;
    }

    public void setLocalPosition(Vec2f vec2f) {
        this.localPosX = vec2f.x;
        this.localPosY = vec2f.y;
    }

    public void setLocalPosition(float f, float f2) {
        this.localPosX = f;
        this.localPosY = f2;
    }

    public void setPositionUniform(boolean z, boolean z2) {
        this.posXIsUniform = z;
        this.posYIsUniform = z2;
    }

    public void setPositionUniform(boolean z) {
        this.posXIsUniform = z;
        this.posYIsUniform = z;
    }

    public void setLocalPositionUniform(boolean z, boolean z2) {
        this.localPosXIsUniform = z;
    }

    public void setLocalPositionUniform(boolean z) {
        this.localPosXIsUniform = z;
    }

    public void setScale(Vec2f vec2f) {
        this.scaleX = vec2f.x;
        this.scaleY = vec2f.y;
    }

    public void setScale(float f, float f2) {
        this.scaleX = f;
        this.scaleY = f2;
    }

    public void setScaleMeasure(MeasuredVar measuredVar) {
        this.measureScale = measuredVar;
    }

    public void setScaleUniform(boolean z, boolean z2) {
        this.scaleXIsUniform = z;
    }

    public void setScaleUniform(boolean z) {
        this.scaleXIsUniform = z;
    }

    protected boolean isLocalPosXZero() {
        return this.localPosX == 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public float measureDrawRot(Meter meter) {
        return (this.rot + this.measureRot.measure(meter)) % 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public RectF measureDrawRect(Meter meter) {
        Vec2f measureVec2f = this.measurePos.measureVec2f(meter);
        float measureScreenSpaceAnchorX = meter.measureScreenSpaceAnchorX(this.anchorX) + meter.measureScreenSpaceX(this.posX, this.anchorX != 0 || this.posXIsUniform) + meter.measureScreenSpaceX(measureVec2f.x, true);
        float measureScreenSpaceAnchorY = meter.measureScreenSpaceAnchorY(this.anchorY) + meter.measureScreenSpaceY(this.posY, this.anchorY != 0 || this.posYIsUniform) + meter.measureScreenSpaceY(measureVec2f.y, true);
        Vec2f measureVec2f2 = this.measureScale.measureVec2f(meter);
        float measureScreenScaleX = meter.measureScreenScaleX(this.scaleX + measureVec2f2.x, this.scaleXIsUniform);
        float measureScreenScaleY = meter.measureScreenScaleY(this.scaleY + measureVec2f2.y, this.scaleXIsUniform);
        float measureLocalSpaceX = measureScreenSpaceAnchorX - meter.measureLocalSpaceX(this.localPosX, false, measureScreenScaleX, measureScreenScaleY);
        float measureLocalSpaceY = measureScreenSpaceAnchorY - meter.measureLocalSpaceY(this.localPosY, false, measureScreenScaleX, measureScreenScaleY);
        return new RectF(measureLocalSpaceX, measureLocalSpaceY, measureScreenScaleX + measureLocalSpaceX, measureScreenScaleY + measureLocalSpaceY);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public RectF measureDrawRectMaxScaleValues(Meter meter) {
        return measureDrawRect(meter);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public RectF measureDrawRectCenterLocalPos(Meter meter) {
        Vec2f measureVec2f = this.measurePos.measureVec2f(meter);
        float measureScreenSpaceAnchorX = meter.measureScreenSpaceAnchorX(this.anchorX) + meter.measureScreenSpaceX(this.posX, this.anchorX != 0 || this.posXIsUniform) + meter.measureScreenSpaceX(measureVec2f.x, true);
        float measureScreenSpaceAnchorY = meter.measureScreenSpaceAnchorY(this.anchorY) + meter.measureScreenSpaceY(this.posY, this.anchorY != 0 || this.posYIsUniform) + meter.measureScreenSpaceY(measureVec2f.y, true);
        Vec2f measureVec2f2 = this.measureScale.measureVec2f(meter);
        float measureScreenScaleX = meter.measureScreenScaleX(this.scaleX + measureVec2f2.x, this.scaleXIsUniform);
        float measureScreenScaleY = meter.measureScreenScaleY(this.scaleY + measureVec2f2.y, this.scaleXIsUniform);
        float measureLocalSpaceX = measureScreenSpaceAnchorX - meter.measureLocalSpaceX(0.5f, false, measureScreenScaleX, measureScreenScaleY);
        float measureLocalSpaceY = measureScreenSpaceAnchorY - meter.measureLocalSpaceY(0.5f, false, measureScreenScaleX, measureScreenScaleY);
        return new RectF(measureLocalSpaceX, measureLocalSpaceY, measureScreenScaleX + measureLocalSpaceX, measureScreenScaleY + measureLocalSpaceY);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public RectF measureDrawRect(Meter meter, Vec2i vec2i) {
        Vec2f measureVec2f = this.measurePos.measureVec2f(meter);
        boolean z = false;
        float measureScreenSpaceAnchorX = meter.measureScreenSpaceAnchorX(this.anchorX) + meter.measureScreenSpaceX(this.posX, this.anchorX != 0 || this.posXIsUniform) + meter.measureScreenSpaceX(measureVec2f.x, true);
        float measureScreenSpaceAnchorY = meter.measureScreenSpaceAnchorY(this.anchorY) + meter.measureScreenSpaceY(this.posY, (this.anchorY != 0 || this.posYIsUniform) ? true : true) + meter.measureScreenSpaceY(measureVec2f.y, true);
        this.measureScale.measureVec2f(meter);
        float f = vec2i.x;
        float f2 = vec2i.y;
        float measureLocalSpaceX = measureScreenSpaceAnchorX - meter.measureLocalSpaceX(this.localPosX, this.localPosXIsUniform, f, f2);
        float measureLocalSpaceY = measureScreenSpaceAnchorY - meter.measureLocalSpaceY(this.localPosY, this.localPosXIsUniform, f, f2);
        return new RectF(measureLocalSpaceX, measureLocalSpaceY, f + measureLocalSpaceX, f2 + measureLocalSpaceY);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static RectF measureDrawRectVar(Meter meter, MVariableFloat mVariableFloat, MVariableFloat mVariableFloat2) {
        Vec2f vec2f = new Vec2f(0.0f, 0.0f);
        mVariableFloat.getValueAsVec2f(meter, vec2f);
        float measureScreenSpaceX = meter.measureScreenSpaceX(0.5f, true) - meter.measureScreenSpaceX(vec2f.x, true);
        float measureScreenSpaceY = meter.measureScreenSpaceY(0.5f, true) - meter.measureScreenSpaceY(vec2f.y, true);
        mVariableFloat2.getValueAsVec2f(meter, vec2f);
        float measureScreenScaleX = meter.measureScreenScaleX(vec2f.x, false);
        float measureScreenScaleY = meter.measureScreenScaleY(vec2f.y, false);
        float measureLocalSpaceX = measureScreenSpaceX - meter.measureLocalSpaceX(0.5f, false, measureScreenScaleX, measureScreenScaleY);
        float measureLocalSpaceY = measureScreenSpaceY - meter.measureLocalSpaceY(0.5f, false, measureScreenScaleX, measureScreenScaleY);
        return new RectF(measureLocalSpaceX, measureLocalSpaceY, measureScreenScaleX + measureLocalSpaceX, measureScreenScaleY + measureLocalSpaceY);
    }

    RectF measureDrawMaxNoMeasures(Meter meter) {
        Vec2f measureVec2f = this.measurePos.measureVec2f(meter);
        float measureScreenSpaceX = meter.measureScreenSpaceX(this.posX, this.posXIsUniform) + meter.measureScreenSpaceX(measureVec2f.x, true);
        float measureScreenSpaceY = meter.measureScreenSpaceY(this.posY, this.posYIsUniform) + meter.measureScreenSpaceY(measureVec2f.y, true);
        Vec2f vec2f = new Vec2f(0.0f, 0.0f);
        float measureScreenScaleX = meter.measureScreenScaleX(this.scaleX + vec2f.x, this.scaleXIsUniform);
        float measureScreenScaleY = meter.measureScreenScaleY(this.scaleY + vec2f.y, this.scaleXIsUniform);
        float measureLocalSpaceX = measureScreenSpaceX - meter.measureLocalSpaceX(this.localPosX, this.localPosXIsUniform, measureScreenScaleX, measureScreenScaleY);
        float measureLocalSpaceY = measureScreenSpaceY - meter.measureLocalSpaceY(this.localPosY, this.localPosXIsUniform, measureScreenScaleX, measureScreenScaleY);
        return new RectF(measureLocalSpaceX, measureLocalSpaceY, measureScreenScaleX + measureLocalSpaceX, measureScreenScaleY + measureLocalSpaceY);
    }

    protected float measureDrawScale1d(Meter meter) {
        Vec2f measureVec2f = this.measureScale.measureVec2f(meter);
        return Math.min(measureVec2f.x + this.scaleX, measureVec2f.y + this.scaleY);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void markNeedReCreateGLResources() {
        this.glResourcesCreated = false;
        this.gradualLoadingIndex = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void markNeedReCreateGLResourcesDontOverride() {
        this.glResourcesCreated = false;
        this.gradualLoadingIndex = 0;
    }

    public void invokeDestroyGLResources(RenderState renderState) {
        onDestroyGLResources(renderState);
        markNeedReCreateGLResourcesDontOverride();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onRenderCheckResources(RenderState renderState) {
        if (!this.glResourcesCreated) {
            onCreateGLResources(renderState);
            renderState.addStatResourceLoad();
        }
        this.glResourcesCreated = true;
        if (this.gradualLoadingIndex == 0) {
            renderState.addStatGradualResourceLoad();
        }
        onCreateGradualGLResources(renderState, this.gradualLoadingIndex);
        this.gradualLoadingIndex++;
    }

    public void onRenderOffscreenContent(RenderState renderState) {
        onRenderCheckResources(renderState);
    }

    public void onRender(RenderState renderState, FrameBuffer frameBuffer) {
        onRenderCheckResources(renderState);
        renderState.bindFrameBuffer(frameBuffer);
        renderState.setBlendMode(this.blendMode);
    }

    public void onRenderInvisible(RenderState renderState, FrameBuffer frameBuffer) {
        onRenderCheckResources(renderState);
    }

    public void onRenderPreview(IRenderState iRenderState, FrameBuffer frameBuffer) {
        iRenderState.bindFrameBuffer(frameBuffer);
        iRenderState.setBlendMode(this.blendMode);
    }

    public void updateRenderStates(RenderState renderState, FrameBuffer frameBuffer) {
        renderState.bindFrameBuffer(frameBuffer);
        renderState.setBlendMode(this.blendMode);
    }

    public void triggerHighlight() {
        this.highlightFrame = 0.0f;
    }

    public void onRenderHighlight(RenderState renderState) {
        float f = this.highlightFrame / 1.0f;
        if (f > 1.0f) {
            return;
        }
        RectF measureDrawRect = measureDrawRect(renderState.res.meter);
        this.highlightFrame += renderState.getFrameTimeF();
        float f2 = 1.0f - f;
        highlightRender0.setColor(GraphicsUtils.f4ColorToIntColor(f2, f2, f2, f2));
        SegmentElement.renderPath2(renderState, 0, measureDrawRect, 8, 2.5f, highlightRender0, highlighthPath);
    }

    public boolean getCustomization(CustomPropertiesList customPropertiesList, int i, IDependencyResourceCounter iDependencyResourceCounter) {
        if (customPropertiesList == null) {
            return false;
        }
        customPropertiesList.putChildTypeValue(getElementTypeName());
        customPropertiesList.setVersionId(getElementVersion());
        onReadCustomization(customPropertiesList, iDependencyResourceCounter);
        return true;
    }

    public boolean setCustomization(CustomPropertiesList customPropertiesList, int i) {
        if (customPropertiesList == null) {
            return false;
        }
        onApplyCustomization(customPropertiesList);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onApplyCustomization(CustomPropertiesList customPropertiesList) {
        this.tagName = customPropertiesList.getTagName();
        setVisible(customPropertiesList.getPropertyBool("visible", true));
        setBlendMode(BlendMode.create(customPropertiesList.getChild("blendMode").getTypeName(BlendMode.getTypeName(this.defaultBlendMode)), this.defaultBlendMode));
        setPosition(customPropertiesList.getPropertyVec2f("position", new Vec2f(0.5f, 0.5f)));
        this.anchorX = customPropertiesList.getPropertySelectStringIndex("anchorX", AnchorMode.modes, 0);
        this.anchorY = customPropertiesList.getPropertySelectStringIndex("anchorY", AnchorMode.modes, 0);
        this.measurePos.onApplyCustomization(customPropertiesList.getChild("MeasurePos"), this.defaultMeasurePosMeasure, 0.5f, 0.5f);
        setLocalPosition(customPropertiesList.getPropertyVec2f("alignmentPosition", new Vec2f(0.5f, 0.5f)));
        setScaleUniform(customPropertiesList.getPropertyBool("scaleIsUniform", false));
        setScale(customPropertiesList.getPropertyVec2f("scale", new Vec2f(this.defaultScaleX, this.defaultScaleY)));
        this.measureScale.onApplyCustomization(customPropertiesList.getChild("measureScale"), MeasureDefs.Nothing, 0.5f, 0.5f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onReadCustomization(CustomPropertiesList customPropertiesList, IDependencyResourceCounter iDependencyResourceCounter) {
        customPropertiesList.putPropertyIntAsHidden("_id", this.elementId, "");
        customPropertiesList.setTagName(this.tagName);
        customPropertiesList.putPropertyBool("visible", this.visible, "0_general");
        customPropertiesList.putEmptyChild("blendMode", BlendMode.getTypeName(this.blendMode), "0_general", BlendMode.useableModes);
        customPropertiesList.putPropertyVec2fAsRange("position", new Vec2f(this.posX, this.posY), "0_general", -1.0f, 1.0f);
        customPropertiesList.putSelectString("anchorX", AnchorMode.getTypeName(this.anchorX, 0), "0_general", AnchorMode.modes);
        customPropertiesList.putSelectString("anchorY", AnchorMode.getTypeName(this.anchorY, 0), "0_general", AnchorMode.modes);
        this.measurePos.onReadCustomizationPos(customPropertiesList.putEmptyChild("MeasurePos", "", "0_general", new String[0]));
        customPropertiesList.putPropertyVec2fAsRange("alignmentPosition", new Vec2f(this.localPosX, this.localPosY), "0_general", 0.0f, 1.0f);
        customPropertiesList.putPropertyBool("scaleIsUniform", this.scaleXIsUniform, "0_general");
        customPropertiesList.putPropertyVec2fAsRange("scale", new Vec2f(this.scaleX, this.scaleY), "0_general", 0.0f, 2.0f);
        this.measureScale.onReadCustomizationScale(customPropertiesList.putEmptyChild("measureScale", "", "0_general", new String[0]));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onApplyCustomizationAdditional(CustomPropertiesList customPropertiesList) {
        setRot(customPropertiesList.getPropertyFloat("rotation", 0.0f) / 360.0f);
        this.measureRot.onApplyCustomization(customPropertiesList.getChild("measureRot"), MeasureDefs.Nothing, 0.5f, 0.5f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onReadCustomizationAdditional(CustomPropertiesList customPropertiesList) {
        customPropertiesList.putPropertyFloatAsRange("rotation", this.rot * 360.0f, "0_general", 0.0f, 300.0f);
        this.measureRot.onReadCustomization1D(customPropertiesList.putEmptyChild("measureRot", "", "0_general", new String[0]));
    }

    public void setRot(float f) {
        this.rot = f;
    }

    public void setMeasureRot(MeasuredVar measuredVar) {
        this.measureRot = measuredVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void rotateAround(PointF pointF, float f, float f2, PointF pointF2, float f3) {
        double d = f;
        double d2 = pointF2.x - f;
        double d3 = f3;
        double cos = Math.cos(d3);
        Double.isNaN(d2);
        Double.isNaN(d);
        double d4 = d + (d2 * cos);
        double d5 = pointF2.y - f2;
        double sin = Math.sin(d3);
        Double.isNaN(d5);
        pointF.x = (float) (d4 - (d5 * sin));
        double d6 = f2;
        double d7 = pointF2.x - f;
        double sin2 = Math.sin(d3);
        Double.isNaN(d7);
        Double.isNaN(d6);
        double d8 = pointF2.y - f2;
        double cos2 = Math.cos(d3);
        Double.isNaN(d8);
        pointF.y = (float) (d6 + (d7 * sin2) + (d8 * cos2));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void rotateAroundZero(PointF pointF, PointF pointF2, float f) {
        double d = pointF2.x;
        double d2 = f;
        double cos = Math.cos(d2);
        Double.isNaN(d);
        double d3 = d * cos;
        double d4 = pointF2.y;
        double sin = Math.sin(d2);
        Double.isNaN(d4);
        pointF.x = (float) (d3 - (d4 * sin));
        double d5 = pointF2.x;
        double sin2 = Math.sin(d2);
        Double.isNaN(d5);
        double d6 = pointF2.y;
        double cos2 = Math.cos(d2);
        Double.isNaN(d6);
        pointF.y = (float) ((d5 * sin2) + (d6 * cos2));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void createRotationAndVpMat(RenderState renderState, VMatrix vMatrix, float f, float f2, float f3) {
        createRotationAndVpMat(renderState, vMatrix, f, f2, f3, -10.0f);
    }

    protected void createRotationAndVpMat(RenderState renderState, VMatrix vMatrix, float f, float f2, float f3, float f4) {
        VMatrix vMatrix2 = renderState.viewMat2Tmp;
        vMatrix2.setIdentity();
        vMatrix2.rotateZDeg(f3 * 360.0f);
        renderState.viewMat4Tmp.setIdentity();
        renderState.viewMat4Tmp.translate(-f, -f2, f4);
        renderState.viewMat3Tmp.multiply(vMatrix2, renderState.viewMat4Tmp);
        vMatrix2.setIdentity();
        vMatrix2.translate(f, f2, 0.0f);
        renderState.viewMat4Tmp.multiply(vMatrix2, renderState.viewMat3Tmp);
        renderState.createViewProjMatrix(vMatrix, renderState.viewMat4Tmp);
    }

    protected void createRotationMatPure(RenderState renderState, VMatrix vMatrix, float f, float f2, float f3, float f4) {
        VMatrix vMatrix2 = renderState.viewMat2Tmp;
        vMatrix2.setIdentity();
        vMatrix2.rotateZDeg(f3 * 360.0f);
        renderState.viewMat4Tmp.setIdentity();
        renderState.viewMat4Tmp.translate(-f, -f2, f4);
        renderState.viewMat3Tmp.multiply(vMatrix2, renderState.viewMat4Tmp);
        vMatrix2.setIdentity();
        vMatrix2.translate(f, f2, 0.0f);
        vMatrix.setIdentity();
        vMatrix.multiply(vMatrix2, renderState.viewMat3Tmp);
    }
}
