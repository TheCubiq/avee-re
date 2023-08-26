package com.daaw.avee.comp.Visualizer.Elements.Segment;

import android.graphics.PointF;
import com.daaw.avee.Common.Action3;
import com.daaw.avee.Common.Vec2f;
import com.daaw.avee.comp.Visualizer.CustomPropertiesList;
import com.daaw.avee.comp.Visualizer.Elements.Segment.ISegmentRenderer;
import com.daaw.avee.comp.Visualizer.Graphic.IRenderState;
import com.daaw.avee.comp.Visualizer.Graphic.RenderPassData;
import com.daaw.avee.comp.Visualizer.Graphic.RenderState;
import com.daaw.avee.comp.Visualizer.Graphic.VShaderBinder;
import com.daaw.avee.comp.Visualizer.Graphic.VShaderProgram;
/* loaded from: classes.dex */
public class SegmentRendererSharpBar extends SegmentRendererBase {
    public static final String typeName = "SharpBars";
    private float barWidth = 0.5f;
    private boolean mirror = false;
    private PointF lastDrawPoint = new PointF();
    private PointF drawPoint = new PointF();

    public SegmentRendererSharpBar setBarWidth(float f) {
        this.barWidth = f;
        return this;
    }

    public SegmentRendererSharpBar setMirror(boolean z) {
        this.mirror = z;
        return this;
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Segment.ISegmentRenderer
    public void drawSegment(RenderState renderState, ISegmentRenderer.DrawDesc drawDesc, float f) {
        float f2;
        float f3;
        float f4;
        float f5;
        drawDesc.color1 = getBarColorBase(drawDesc.valueIndex, drawDesc.valuesCount, f);
        this.lastDrawPoint.x = drawDesc.lastDrawPointX;
        this.lastDrawPoint.y = drawDesc.lastDrawPointY;
        this.drawPoint.x = drawDesc.drawPointX;
        this.drawPoint.y = drawDesc.drawPointY;
        float round = Math.round((drawDesc.drawSegmentWidth * 1.0f) / (drawDesc.valuesCount + 1)) * this.barWidth;
        float f6 = drawDesc.lastSegmentHeightVal * (-2.0f) * drawDesc.drawScale * this.barHeightMultiplier;
        float f7 = drawDesc.segmentHeightVal * (-2.0f) * drawDesc.drawScale * this.barHeightMultiplier;
        if (this.mirror) {
            this.lastDrawPoint.x -= drawDesc.lastDrawVecX * f6;
            this.lastDrawPoint.y -= drawDesc.lastDrawVecY * f6;
            double d = f6;
            Double.isNaN(d);
            f6 = (float) (d * 2.0d);
            this.drawPoint.x -= drawDesc.drawVecX * f7;
            this.drawPoint.y -= drawDesc.drawVecY * f7;
            double d2 = f7;
            Double.isNaN(d2);
            f7 = (float) (d2 * 2.0d);
        }
        float ccw90X = (Vec2f.ccw90X(drawDesc.drawVecX, drawDesc.drawVecY) * round) + this.drawPoint.x;
        float ccw90Y = (Vec2f.ccw90Y(drawDesc.drawVecX, drawDesc.drawVecY) * round) + this.drawPoint.y;
        float cw90X = (Vec2f.cw90X(drawDesc.drawVecX, drawDesc.drawVecY) * round) + this.drawPoint.x;
        float cw90Y = (Vec2f.cw90Y(drawDesc.drawVecX, drawDesc.drawVecY) * round) + this.drawPoint.y;
        float f8 = (drawDesc.drawVecX * f6) + ccw90X;
        float f9 = (drawDesc.drawVecY * f6) + ccw90Y;
        float f10 = (drawDesc.drawVecX * f7) + cw90X;
        float f11 = (drawDesc.drawVecY * f7) + cw90Y;
        if (this.useFixedLineHeight) {
            float signum = Math.signum(f7);
            f2 = (drawDesc.drawVecY * signum * this.fixedLineHeight) + f11;
            f3 = (drawDesc.drawVecX * signum * this.fixedLineHeight) + f10;
            f4 = (drawDesc.drawVecY * signum * this.fixedLineHeight) + f9;
            f5 = (drawDesc.drawVecX * signum * this.fixedLineHeight) + f8;
        } else {
            f2 = cw90Y;
            f3 = cw90X;
            f4 = ccw90Y;
            f5 = ccw90X;
        }
        renderState.res.getBufferRenderer().drawRectangle(renderState, f8, f9, f10, f11, f5, f4, f3, f2, 0.0f, drawDesc.color1, Vec2f.zero(), Vec2f.one(), renderState.res.getAtlasTexWhite(), drawDesc.blendMode);
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Segment.ISegmentRenderer
    public void drawSegmentBatch(IRenderState iRenderState, ISegmentRenderer.DrawBatchDesc[] drawBatchDescArr, float f, float f2, int i, float f3) {
        float ccw90Y;
        float f4;
        float f5;
        float f6;
        float cw90Y;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        ISegmentRenderer.DrawBatchDesc[] drawBatchDescArr2 = drawBatchDescArr;
        int length = drawBatchDescArr2.length;
        float round = Math.round((1.0f * f) / (length + 1)) * this.barWidth;
        int i2 = 0;
        while (i2 < drawBatchDescArr2.length) {
            ISegmentRenderer.DrawBatchDesc drawBatchDesc = drawBatchDescArr2[i2];
            if (drawBatchDesc.valueIndexLastToConnect >= 0) {
                ISegmentRenderer.DrawBatchDesc drawBatchDesc2 = drawBatchDescArr2[drawBatchDesc.valueIndexLastToConnect];
                int barColorBase = getBarColorBase(i2, length, f3);
                this.lastDrawPoint.x = drawBatchDesc2.drawPointX;
                this.lastDrawPoint.y = drawBatchDesc2.drawPointY;
                this.drawPoint.x = drawBatchDesc.drawPointX;
                this.drawPoint.y = drawBatchDesc.drawPointY;
                float f14 = drawBatchDesc2.segmentHeightVal * (-2.0f) * f2 * this.barHeightMultiplier;
                float f15 = drawBatchDesc.segmentHeightVal * (-2.0f) * f2 * this.barHeightMultiplier;
                if (this.mirror) {
                    this.lastDrawPoint.x -= drawBatchDesc2.drawVecX * f14;
                    this.lastDrawPoint.y -= drawBatchDesc2.drawVecY * f14;
                    double d = f14;
                    Double.isNaN(d);
                    f14 = (float) (d * 2.0d);
                    this.drawPoint.x -= drawBatchDesc.drawVecX * f15;
                    this.drawPoint.y -= drawBatchDesc.drawVecY * f15;
                    double d2 = f15;
                    Double.isNaN(d2);
                    f15 = (float) (d2 * 2.0d);
                }
                if (f14 < 0.0f) {
                    f6 = (Vec2f.ccw90X(drawBatchDesc.drawVecX, drawBatchDesc.drawVecY) * round) + this.drawPoint.x;
                    float ccw90Y2 = (Vec2f.ccw90Y(drawBatchDesc.drawVecX, drawBatchDesc.drawVecY) * round) + this.drawPoint.y;
                    f5 = (drawBatchDesc.drawVecX * f14) + f6;
                    f4 = ccw90Y2;
                    ccw90Y = (drawBatchDesc.drawVecY * f14) + ccw90Y2;
                } else {
                    float ccw90X = (Vec2f.ccw90X(drawBatchDesc.drawVecX, drawBatchDesc.drawVecY) * round) + this.drawPoint.x;
                    ccw90Y = (Vec2f.ccw90Y(drawBatchDesc.drawVecX, drawBatchDesc.drawVecY) * round) + this.drawPoint.y;
                    float f16 = (drawBatchDesc.drawVecX * f14) + ccw90X;
                    f4 = (drawBatchDesc.drawVecY * f14) + ccw90Y;
                    f5 = ccw90X;
                    f6 = f16;
                }
                if (f15 < 0.0f) {
                    f9 = (Vec2f.cw90X(drawBatchDesc.drawVecX, drawBatchDesc.drawVecY) * round) + this.drawPoint.x;
                    float cw90Y2 = (Vec2f.cw90Y(drawBatchDesc.drawVecX, drawBatchDesc.drawVecY) * round) + this.drawPoint.y;
                    f8 = (drawBatchDesc.drawVecX * f15) + f9;
                    f7 = cw90Y2;
                    cw90Y = (drawBatchDesc.drawVecY * f15) + cw90Y2;
                } else {
                    float cw90X = (Vec2f.cw90X(drawBatchDesc.drawVecX, drawBatchDesc.drawVecY) * round) + this.drawPoint.x;
                    cw90Y = (Vec2f.cw90Y(drawBatchDesc.drawVecX, drawBatchDesc.drawVecY) * round) + this.drawPoint.y;
                    float f17 = (drawBatchDesc.drawVecX * f15) + cw90X;
                    f7 = (drawBatchDesc.drawVecY * f15) + cw90Y;
                    f8 = cw90X;
                    f9 = f17;
                }
                if (this.useFixedLineHeight) {
                    float signum = Math.signum(f15);
                    f11 = (drawBatchDesc.drawVecX * signum * this.fixedLineHeight) + f5;
                    f12 = (drawBatchDesc.drawVecY * signum * this.fixedLineHeight) + cw90Y;
                    f13 = (drawBatchDesc.drawVecY * signum * this.fixedLineHeight) + ccw90Y;
                    f10 = (drawBatchDesc.drawVecX * signum * this.fixedLineHeight) + f8;
                } else {
                    f10 = f9;
                    f11 = f6;
                    f12 = f7;
                    f13 = f4;
                }
                if (iRenderState.getRenderEdges()) {
                    iRenderState.getBufferRenderer().drawRectangleEdges(iRenderState, f5, ccw90Y, f8, cw90Y, f11, f13, f10, f12, 0.0f, barColorBase, Vec2f.zero(), Vec2f.one(), iRenderState.getRes().getAtlasTexWhite(), i, null);
                } else {
                    iRenderState.getBufferRenderer().drawRectangle2Patch(iRenderState, f5, ccw90Y, f8, cw90Y, f11, f13, f10, f12, 0.0f, barColorBase, Vec2f.zero(), Vec2f.one(), new RenderPassData(i, iRenderState.getRes().getAtlasTexSquareSegment(), (VShaderBinder) null, (Action3<RenderState, VShaderProgram, RenderPassData>) null, 2));
                }
            }
            i2++;
            drawBatchDescArr2 = drawBatchDescArr;
        }
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Segment.SegmentRendererBase, com.daaw.avee.comp.Visualizer.Elements.Base.ICustomizable
    public void onApplyCustomization(CustomPropertiesList customPropertiesList) {
        super.onApplyCustomization(customPropertiesList);
        this.barWidth = customPropertiesList.getPropertyFloat("barWidth", 0.5f);
        this.mirror = customPropertiesList.getPropertyBool("mirror", false);
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Segment.SegmentRendererBase, com.daaw.avee.comp.Visualizer.Elements.Base.ICustomizable
    public void onReadCustomization(CustomPropertiesList customPropertiesList) {
        super.onReadCustomization(customPropertiesList);
        customPropertiesList.putPropertyFloatAsRange("barWidth", this.barWidth, "misc", 0.0f, 2.0f);
        customPropertiesList.putPropertyBool("mirror", this.mirror, "misc");
    }
}
