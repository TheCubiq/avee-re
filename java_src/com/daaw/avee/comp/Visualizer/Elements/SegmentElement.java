package com.daaw.avee.comp.Visualizer.Elements;

import android.graphics.PointF;
import android.graphics.RectF;
import com.daaw.avee.Common.ISimpleListFloat;
import com.daaw.avee.Design.GeneralDesign;
import com.daaw.avee.comp.Visualizer.CustomPropertiesList;
import com.daaw.avee.comp.Visualizer.Elements.Base.Element;
import com.daaw.avee.comp.Visualizer.Elements.Base.MVariableFloat;
import com.daaw.avee.comp.Visualizer.Elements.Segment.ISegmentDataProvider;
import com.daaw.avee.comp.Visualizer.Elements.Segment.ISegmentPath;
import com.daaw.avee.comp.Visualizer.Elements.Segment.ISegmentRenderer;
import com.daaw.avee.comp.Visualizer.Elements.Segment.SegmentPathCircle;
import com.daaw.avee.comp.Visualizer.Elements.Segment.SegmentPathFactory;
import com.daaw.avee.comp.Visualizer.Elements.Segment.SegmentRendererBar;
import com.daaw.avee.comp.Visualizer.Elements.Segment.SegmentRendererFactory;
import com.daaw.avee.comp.Visualizer.Graphic.IRenderState;
import com.daaw.avee.comp.Visualizer.Graphic.RenderState;
import com.daaw.avee.comp.Visualizer.IDependencyResourceCounter;
import mdesl.graphics.glutils.FrameBuffer;
/* loaded from: classes.dex */
public class SegmentElement extends Element {
    public static final String typeName = "Bars";
    private int audioProviderIndex;
    private float barHeightScale;
    ISimpleListFloat barVals2;
    private MVariableFloat colorBlendOffset;
    private boolean flipInput;
    private float maxBarHeightScale;
    private float minBarHeightScale;
    private PointF pathPointOut;
    private PointF pathPointOutNew;
    private PointF pathPointVecOut;
    private PointF pathPointVecOutNew;
    private int reactionAccumulatedDelay;
    private int reactionDelay;
    ISegmentRenderer.DrawBatchDesc[] segmentDrawDescTmp;
    private ISegmentPath segmentPath;
    private ISegmentRenderer segmentRenderer;
    private ISegmentRenderer segmentRenderer2;
    private int softnessRadius;

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public String getElementTypeName() {
        return "Bars";
    }

    public SegmentElement() {
        super(2, 0.5f, 0.5f);
        this.segmentRenderer = null;
        this.segmentRenderer2 = null;
        this.segmentPath = null;
        this.flipInput = false;
        this.barHeightScale = 3.0f;
        this.minBarHeightScale = 0.009f;
        this.maxBarHeightScale = 1.0f;
        this.pathPointOutNew = new PointF();
        this.pathPointVecOutNew = new PointF();
        this.pathPointOut = new PointF();
        this.pathPointVecOut = new PointF();
        this.barVals2 = null;
        this.segmentDrawDescTmp = new ISegmentRenderer.DrawBatchDesc[0];
        this.softnessRadius = 0;
        this.reactionDelay = 0;
        this.reactionAccumulatedDelay = 0;
        this.audioProviderIndex = 1;
        this.colorBlendOffset = MVariableFloat.CreateConstantFloat(0.0f);
        setSegmentPath(new SegmentPathCircle());
        setSegmentRenderer(new SegmentRendererBar());
        setSoftness(2);
    }

    public void setSegmentRenderer(ISegmentRenderer iSegmentRenderer) {
        this.segmentRenderer = iSegmentRenderer;
    }

    public void setSegmentRenderer2(ISegmentRenderer iSegmentRenderer) {
        this.segmentRenderer2 = iSegmentRenderer;
    }

    public void setSegmentPath(ISegmentPath iSegmentPath) {
        this.segmentPath = iSegmentPath;
    }

    public void setBarHeightScale(float f) {
        this.barHeightScale = f;
    }

    public void setMinBarHeightScale(float f) {
        this.minBarHeightScale = f;
    }

    public void setMaxBarHeightScale(float f) {
        this.maxBarHeightScale = f;
    }

    public void setSoftness(int i) {
        this.softnessRadius = i;
    }

    public void setReactionDelay(int i) {
        this.reactionDelay = i;
    }

    public void setReactionAccumulatedDelay(int i) {
        this.reactionAccumulatedDelay = i;
    }

    public void setAudioProviderIndex(int i) {
        this.audioProviderIndex = i;
    }

    public void setColorBlendOffset(MVariableFloat mVariableFloat) {
        this.colorBlendOffset = mVariableFloat;
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    protected void onApplyCustomization(CustomPropertiesList customPropertiesList) {
        super.onApplyCustomization(customPropertiesList);
        super.onApplyCustomizationAdditional(customPropertiesList);
        this.flipInput = customPropertiesList.getPropertyBool("flipInput", false);
        setBarHeightScale(customPropertiesList.getPropertyFloat("heightScale", 3.0f));
        setMinBarHeightScale(customPropertiesList.getPropertyFloat("minHeightScale", 0.009f));
        setMaxBarHeightScale(customPropertiesList.getPropertyFloat("maxHeightScale", 1.0f));
        CustomPropertiesList child = customPropertiesList.getChild("ShapePath");
        ISegmentPath create = SegmentPathFactory.create(child.getTypeName(SegmentPathCircle.typeName), this.segmentPath);
        this.segmentPath = create;
        if (create != null) {
            create.onApplyCustomization(child);
        }
        setColorBlendOffset(customPropertiesList.getPropertyMVariableFloat("colorBlendOffset", MVariableFloat.CreateConstantFloat(0.0f)));
        setSoftness(customPropertiesList.getPropertyInt("softness", 2));
        setReactionDelay(customPropertiesList.getPropertyInt("reactionDelay", 0));
        setReactionAccumulatedDelay(customPropertiesList.getPropertyInt("reactionAccumulatedDelay", 0));
        setAudioProviderIndex(customPropertiesList.getPropertyInt("audioProviderIndex", 1));
        CustomPropertiesList child2 = customPropertiesList.getChild("Segment1");
        ISegmentRenderer create2 = SegmentRendererFactory.create(child2.getTypeName("Bars"), this.segmentRenderer);
        this.segmentRenderer = create2;
        if (create2 != null) {
            create2.onApplyCustomization(child2);
        }
        CustomPropertiesList child3 = customPropertiesList.getChild("Segment2");
        ISegmentRenderer create3 = SegmentRendererFactory.create(child3.getTypeName("None"), this.segmentRenderer2);
        this.segmentRenderer2 = create3;
        if (create3 != null) {
            create3.onApplyCustomization(child3);
        }
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    protected void onReadCustomization(CustomPropertiesList customPropertiesList, IDependencyResourceCounter iDependencyResourceCounter) {
        super.onReadCustomization(customPropertiesList, iDependencyResourceCounter);
        super.onReadCustomizationAdditional(customPropertiesList);
        customPropertiesList.setCustomizationName("Bars/Segments");
        customPropertiesList.putPropertyBool("flipInput", this.flipInput, "1_bars");
        customPropertiesList.putPropertyFloatAsRange("heightScale", this.barHeightScale, "1_bars", -10.0f, 10.0f);
        customPropertiesList.putPropertyFloatAsRange("minHeightScale", this.minBarHeightScale, "1_bars", -0.03f, 0.03f);
        customPropertiesList.putPropertyFloatAsRange("maxHeightScale", this.maxBarHeightScale, "1_bars", 0.1f, 1.0f);
        CustomPropertiesList putEmptyChild = customPropertiesList.putEmptyChild("ShapePath", SegmentPathFactory.getTypeName(this.segmentPath), "1_bars", GeneralDesign.celebrationContentAvailable ? SegmentPathFactory.typeNamesCelebration : SegmentPathFactory.typeNames);
        ISegmentPath iSegmentPath = this.segmentPath;
        if (iSegmentPath != null) {
            iSegmentPath.onReadCustomization(putEmptyChild);
        }
        customPropertiesList.putPropertyMVariableFloat("colorBlendOffset", this.colorBlendOffset, "1_bars", 0.0f, 1.0f);
        customPropertiesList.putPropertyIntAsRange("softness", this.softnessRadius, "2_Behavior", 0, 20);
        customPropertiesList.putPropertyIntAsRange("reactionDelay", this.reactionDelay, "2_Behavior", 0, 9);
        customPropertiesList.putPropertyIntAsRange("reactionAccumulatedDelay", this.reactionAccumulatedDelay, "2_Behavior", 0, 9);
        customPropertiesList.putPropertyIntAsRange("audioProviderIndex", this.audioProviderIndex, "2_Behavior", 1, 4);
        CustomPropertiesList putEmptyChild2 = customPropertiesList.putEmptyChild("Segment1", SegmentRendererFactory.getTypeName(this.segmentRenderer), "1_bars", SegmentRendererFactory.typeNames);
        ISegmentRenderer iSegmentRenderer = this.segmentRenderer;
        if (iSegmentRenderer != null) {
            iSegmentRenderer.onReadCustomization(putEmptyChild2);
        }
        CustomPropertiesList putEmptyChild3 = customPropertiesList.putEmptyChild("Segment2", SegmentRendererFactory.getTypeName(this.segmentRenderer2), "1_bars", SegmentRendererFactory.typeNames);
        ISegmentRenderer iSegmentRenderer2 = this.segmentRenderer2;
        if (iSegmentRenderer2 != null) {
            iSegmentRenderer2.onReadCustomization(putEmptyChild3);
        }
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    protected void onDestroyGLResources(RenderState renderState) {
        super.onDestroyGLResources(renderState);
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    protected boolean onCreateGLResources(RenderState renderState) {
        return super.onCreateGLResources(renderState);
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public void onRender(RenderState renderState, FrameBuffer frameBuffer) {
        super.onRender(renderState, frameBuffer);
        render(renderState);
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public void onRenderPreview(IRenderState iRenderState, FrameBuffer frameBuffer) {
        super.onRenderPreview(iRenderState, frameBuffer);
        render(iRenderState);
    }

    private void render(IRenderState iRenderState) {
        int i;
        ISegmentDataProvider audioDataProvider = iRenderState.getRes().getMeter().getAudioDataProvider(this.audioProviderIndex - 1);
        if (audioDataProvider != null) {
            if ((this.segmentRenderer == null && this.segmentRenderer2 == null) || this.segmentPath == null) {
                return;
            }
            RectF measureDrawRect = measureDrawRect(iRenderState.getRes().getMeter());
            float measureDrawRot = measureDrawRot(iRenderState.getRes().getMeter());
            RectF measureDrawRectCenterLocalPos = measureDrawRectCenterLocalPos(iRenderState.getRes().getMeter());
            float centerX = measureDrawRectCenterLocalPos.centerX();
            float centerY = measureDrawRectCenterLocalPos.centerY();
            float max = Math.max(0.0f, Math.min(1.0f, this.colorBlendOffset.getValueAsFloat(iRenderState.getRes().getMeter())));
            this.segmentPath.process(iRenderState);
            ISimpleListFloat createFrameValuesAccessorList = audioDataProvider.createFrameValuesAccessorList(this.reactionDelay, this.reactionAccumulatedDelay, this.softnessRadius, this.barVals2);
            this.barVals2 = createFrameValuesAccessorList;
            int size = createFrameValuesAccessorList.size();
            if (size != this.segmentDrawDescTmp.length) {
                this.segmentDrawDescTmp = new ISegmentRenderer.DrawBatchDesc[size];
                for (int i2 = 0; i2 < size; i2++) {
                    this.segmentDrawDescTmp[i2] = new ISegmentRenderer.DrawBatchDesc();
                    this.segmentDrawDescTmp[i2].valueIndexNextToConnectTmp = -1;
                }
            }
            if (size < 1) {
                return;
            }
            float measureScreenScale1D = iRenderState.getRes().getMeter().measureScreenScale1D(this.minBarHeightScale);
            float measureScreenScale1D2 = iRenderState.getRes().getMeter().measureScreenScale1D(this.maxBarHeightScale);
            float measureScreenScale1D3 = iRenderState.getRes().getMeter().measureScreenScale1D(this.barHeightScale) * 0.002f;
            float pathLength = this.segmentPath.getPathLength(measureDrawRect, size);
            float signum = Math.signum(measureScreenScale1D3);
            float abs = Math.abs(measureScreenScale1D3);
            if (this.segmentRenderer == null && this.segmentRenderer2 == null) {
                return;
            }
            int i3 = 0;
            while (i3 < size) {
                int i4 = i3;
                float f = measureScreenScale1D2;
                RectF rectF = measureDrawRect;
                int pointOnPath = this.segmentPath.getPointOnPath(this.flipInput, i3, size, measureDrawRect, 0.0f, this.pathPointOut, this.pathPointVecOut);
                if (Float.isNaN(this.pathPointVecOut.x)) {
                    this.pathPointVecOut.x = 1.0f;
                    this.pathPointVecOut.y = 0.0f;
                }
                PointF pointF = this.pathPointOutNew;
                PointF pointF2 = this.pathPointOut;
                double d = measureDrawRot;
                Double.isNaN(d);
                float f2 = (float) (d * 3.141592653589793d * 2.0d);
                rotateAround(pointF, centerX, centerY, pointF2, f2);
                rotateAroundZero(this.pathPointVecOutNew, this.pathPointVecOut, f2);
                if (pointOnPath >= 0) {
                    i = i4;
                    this.segmentDrawDescTmp[pointOnPath].valueIndexNextToConnectTmp = i;
                } else {
                    i = i4;
                }
                ISegmentRenderer.DrawBatchDesc drawBatchDesc = this.segmentDrawDescTmp[i];
                drawBatchDesc.valueIndexLastToConnect = pointOnPath;
                drawBatchDesc.segmentHeightVal = Math.min(this.barVals2.get(i) * abs, f) * signum;
                drawBatchDesc.segmentHeightVal += measureScreenScale1D;
                drawBatchDesc.drawPointX = this.pathPointOutNew.x;
                drawBatchDesc.drawPointY = this.pathPointOutNew.y;
                drawBatchDesc.drawVecX = this.pathPointVecOutNew.x;
                drawBatchDesc.drawVecY = this.pathPointVecOutNew.y;
                i3 = i + 1;
                measureScreenScale1D2 = f;
                measureDrawRect = rectF;
            }
            for (int i5 = 0; i5 < size; i5++) {
                ISegmentRenderer.DrawBatchDesc drawBatchDesc2 = this.segmentDrawDescTmp[i5];
                drawBatchDesc2.valueIndexNextToConnect = drawBatchDesc2.valueIndexNextToConnectTmp;
                drawBatchDesc2.valueIndexNextToConnectTmp = -1;
            }
            ISegmentRenderer iSegmentRenderer = this.segmentRenderer;
            if (iSegmentRenderer != null) {
                iSegmentRenderer.drawSegmentBatch(iRenderState, this.segmentDrawDescTmp, pathLength, 0.5f, getBlendMode(), max);
            }
            ISegmentRenderer iSegmentRenderer2 = this.segmentRenderer2;
            if (iSegmentRenderer2 != null) {
                iSegmentRenderer2.drawSegmentBatch(iRenderState, this.segmentDrawDescTmp, pathLength, 0.5f, getBlendMode(), max);
            }
        }
    }

    public static void renderPath2(IRenderState iRenderState, int i, RectF rectF, int i2, float f, ISegmentRenderer iSegmentRenderer, ISegmentPath iSegmentPath) {
        ISegmentRenderer.DrawBatchDesc[] drawBatchDescArr = new ISegmentRenderer.DrawBatchDesc[0];
        PointF pointF = new PointF();
        PointF pointF2 = new PointF();
        PointF pointF3 = new PointF();
        PointF pointF4 = new PointF();
        iSegmentPath.process(iRenderState);
        if (i2 != 0) {
            drawBatchDescArr = new ISegmentRenderer.DrawBatchDesc[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                drawBatchDescArr[i3] = new ISegmentRenderer.DrawBatchDesc();
                drawBatchDescArr[i3].valueIndexNextToConnectTmp = -1;
            }
        }
        ISegmentRenderer.DrawBatchDesc[] drawBatchDescArr2 = drawBatchDescArr;
        if (i2 < 1) {
            return;
        }
        float pathLength = iSegmentPath.getPathLength(rectF, i2);
        int i4 = 0;
        while (i4 < i2) {
            int i5 = i4;
            int pointOnPath = iSegmentPath.getPointOnPath(false, i4, i2, rectF, 0.0f, pointF3, pointF4);
            if (Float.isNaN(pointF4.x)) {
                pointF4.x = 1.0f;
                pointF4.y = 0.0f;
            }
            float centerX = rectF.centerX();
            float centerY = rectF.centerY();
            double d = 0.0f;
            Double.isNaN(d);
            float f2 = (float) (d * 3.141592653589793d * 2.0d);
            rotateAround(pointF, centerX, centerY, pointF3, f2);
            rotateAroundZero(pointF2, pointF4, f2);
            if (pointOnPath >= 0) {
                drawBatchDescArr2[pointOnPath].valueIndexNextToConnectTmp = i5;
            }
            ISegmentRenderer.DrawBatchDesc drawBatchDesc = drawBatchDescArr2[i5];
            drawBatchDesc.valueIndexLastToConnect = pointOnPath;
            drawBatchDesc.segmentHeightVal = f;
            drawBatchDesc.drawPointX = pointF.x;
            drawBatchDesc.drawPointY = pointF.y;
            drawBatchDesc.drawVecX = pointF2.x;
            drawBatchDesc.drawVecY = pointF2.y;
            i4 = i5 + 1;
        }
        for (int i6 = 0; i6 < i2; i6++) {
            ISegmentRenderer.DrawBatchDesc drawBatchDesc2 = drawBatchDescArr2[i6];
            drawBatchDesc2.valueIndexNextToConnect = drawBatchDesc2.valueIndexNextToConnectTmp;
            drawBatchDesc2.valueIndexNextToConnectTmp = -1;
        }
        if (iSegmentRenderer != null) {
            iSegmentRenderer.drawSegmentBatch(iRenderState, drawBatchDescArr2, pathLength, 0.5f, i, 0.0f);
        }
    }
}
