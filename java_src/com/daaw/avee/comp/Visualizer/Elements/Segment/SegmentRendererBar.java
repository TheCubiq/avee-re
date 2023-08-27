package com.daaw.avee.comp.Visualizer.Elements.Segment;

import com.daaw.avee.Common.Action3;
import com.daaw.avee.Common.Utils;
import com.daaw.avee.Common.Vec2f;
import com.daaw.avee.comp.Visualizer.CustomPropertiesList;
import com.daaw.avee.comp.Visualizer.Elements.Segment.ISegmentRenderer;
import com.daaw.avee.comp.Visualizer.Graphic.IRenderState;
import com.daaw.avee.comp.Visualizer.Graphic.RenderPassData;
import com.daaw.avee.comp.Visualizer.Graphic.RenderState;
import com.daaw.avee.comp.Visualizer.Graphic.VShaderBinder;
import com.daaw.avee.comp.Visualizer.Graphic.VShaderProgram;
/* loaded from: classes.dex */
public class SegmentRendererBar extends SegmentRendererBase {
    public static final String typeName = "Bars";
    private ISegmentRenderer.DrawBatchDesc lastDesc;
    private ISegmentRenderer.DrawBatchDesc nextDesc;
    private float barWidth = 0.5f;
    private boolean mirror = false;
    protected boolean barWidthAffectedByNormal = false;

    public SegmentRendererBar setBarWidth(float f) {
        this.barWidth = f;
        return this;
    }

    public SegmentRendererBar setMirror(boolean z) {
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
        float round = Math.round((drawDesc.drawSegmentWidth * 0.5f) / (drawDesc.valuesCount + 1)) * this.barWidth;
        float f6 = drawDesc.drawPointX;
        float f7 = drawDesc.drawPointY;
        float f8 = drawDesc.segmentHeightVal * (-2.0f) * drawDesc.drawScale;
        float SignNonZern = Utils.SignNonZern(f8);
        float f9 = f8 * this.barHeightMultiplier;
        if (this.mirror) {
            f6 -= drawDesc.drawVecX * f9;
            f7 -= drawDesc.drawVecY * f9;
            double d = f9;
            Double.isNaN(d);
            f9 = (float) (d * 2.0d);
        }
        float ccw90X = (Vec2f.ccw90X(drawDesc.drawVecX, drawDesc.drawVecY) * round) + f6;
        float ccw90Y = (Vec2f.ccw90Y(drawDesc.drawVecX, drawDesc.drawVecY) * round) + f7;
        float cw90X = (Vec2f.cw90X(drawDesc.drawVecX, drawDesc.drawVecY) * round) + f6;
        float cw90Y = (Vec2f.cw90Y(drawDesc.drawVecX, drawDesc.drawVecY) * round) + f7;
        float f10 = (drawDesc.drawVecX * f9) + ccw90X;
        float f11 = (drawDesc.drawVecY * f9) + ccw90Y;
        float f12 = (drawDesc.drawVecX * f9) + cw90X;
        float f13 = (drawDesc.drawVecY * f9) + cw90Y;
        if (this.useFixedLineHeight) {
            f3 = (drawDesc.drawVecY * SignNonZern * this.fixedLineHeight) + f11;
            f4 = (drawDesc.drawVecX * SignNonZern * this.fixedLineHeight) + f12;
            f5 = (drawDesc.drawVecY * SignNonZern * this.fixedLineHeight) + f13;
            f2 = (drawDesc.drawVecX * SignNonZern * this.fixedLineHeight) + f10;
        } else {
            f2 = ccw90X;
            f3 = ccw90Y;
            f4 = cw90X;
            f5 = cw90Y;
        }
        renderState.res.getBufferRenderer().drawRectangle(renderState, f10, f11, f12, f13, f2, f3, f4, f5, 0.0f, drawDesc.color1, Vec2f.zero(), Vec2f.one(), renderState.res.getAtlasTexSquareSegment(), drawDesc.blendMode);
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Segment.ISegmentRenderer
    public void drawSegmentBatch(IRenderState iRenderState, ISegmentRenderer.DrawBatchDesc[] drawBatchDescArr, float f, float f2, int i, float f3) {
        int i2;
        float ccw90Y;
        float cw90X;
        float cw90Y;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        ISegmentRenderer.DrawBatchDesc[] drawBatchDescArr2 = drawBatchDescArr;
        int length = drawBatchDescArr2.length;
        float round = Math.round((0.5f * f) / (length + 1)) * this.barWidth;
        Vec2f vec2f = new Vec2f(0.0f, 0.0f);
        Vec2f vec2f2 = new Vec2f(0.0f, 0.0f);
        boolean renderEdges = iRenderState.getRenderEdges();
        RenderPassData renderPassData = !renderEdges ? new RenderPassData(i, iRenderState.getRes().getAtlasTexSquareSegment(), (VShaderBinder) null, (Action3<RenderState, VShaderProgram, RenderPassData>) null, 2) : null;
        int i3 = 0;
        while (i3 < drawBatchDescArr2.length) {
            ISegmentRenderer.DrawBatchDesc drawBatchDesc = drawBatchDescArr2[i3];
            this.lastDesc = drawBatchDesc.valueIndexLastToConnect < 0 ? drawBatchDesc : drawBatchDescArr2[drawBatchDesc.valueIndexLastToConnect];
            this.nextDesc = drawBatchDesc.valueIndexNextToConnect < 0 ? drawBatchDesc : drawBatchDescArr2[drawBatchDesc.valueIndexNextToConnect];
            int barColorBase = getBarColorBase(i3, length, f3);
            float f13 = drawBatchDesc.drawPointX;
            float f14 = drawBatchDesc.drawPointY;
            float f15 = drawBatchDesc.segmentHeightVal * (-2.0f) * f2;
            float SignNonZern = Utils.SignNonZern(f15);
            float f16 = f15 * this.barHeightMultiplier;
            if (this.mirror) {
                f13 -= drawBatchDesc.drawVecX * f16;
                f14 -= drawBatchDesc.drawVecY * f16;
                i2 = length;
                double d = f16;
                Double.isNaN(d);
                f16 = (float) (d * 2.0d);
            } else {
                i2 = length;
            }
            if (this.barWidthAffectedByNormal) {
                vec2f.x = drawBatchDesc.drawVecX + this.lastDesc.drawVecX;
                vec2f.y = drawBatchDesc.drawVecY + this.lastDesc.drawVecY;
                vec2f2.x = drawBatchDesc.drawVecX + this.nextDesc.drawVecX;
                vec2f2.y = drawBatchDesc.drawVecY + this.nextDesc.drawVecY;
                vec2f2.normalizeSafe();
                vec2f.normalizeSafe();
                float ccw90X = (Vec2f.ccw90X(drawBatchDesc.drawVecX, drawBatchDesc.drawVecY) * round) + f13;
                ccw90Y = (Vec2f.ccw90Y(drawBatchDesc.drawVecX, drawBatchDesc.drawVecY) * round) + f14;
                cw90X = (Vec2f.cw90X(drawBatchDesc.drawVecX, drawBatchDesc.drawVecY) * round) + f13;
                cw90Y = (Vec2f.cw90Y(drawBatchDesc.drawVecX, drawBatchDesc.drawVecY) * round) + f14;
                f4 = (vec2f.x * f16) + ccw90X;
                f5 = (vec2f.y * f16) + ccw90Y;
                f6 = ccw90X;
                f7 = (vec2f2.x * f16) + cw90X;
                f8 = vec2f2.y;
            } else {
                float ccw90X2 = (Vec2f.ccw90X(drawBatchDesc.drawVecX, drawBatchDesc.drawVecY) * round) + f13;
                ccw90Y = (Vec2f.ccw90Y(drawBatchDesc.drawVecX, drawBatchDesc.drawVecY) * round) + f14;
                cw90X = (Vec2f.cw90X(drawBatchDesc.drawVecX, drawBatchDesc.drawVecY) * round) + f13;
                cw90Y = (Vec2f.cw90Y(drawBatchDesc.drawVecX, drawBatchDesc.drawVecY) * round) + f14;
                f4 = (drawBatchDesc.drawVecX * f16) + ccw90X2;
                f5 = (drawBatchDesc.drawVecY * f16) + ccw90Y;
                f6 = ccw90X2;
                f7 = (drawBatchDesc.drawVecX * f16) + cw90X;
                f8 = drawBatchDesc.drawVecY;
            }
            float f17 = (f8 * f16) + cw90Y;
            float f18 = f5;
            float f19 = f7;
            float f20 = f6;
            float f21 = f4;
            if (this.useFixedLineHeight) {
                f9 = f21 + (drawBatchDesc.drawVecX * SignNonZern * this.fixedLineHeight);
                f10 = f18 + (drawBatchDesc.drawVecY * SignNonZern * this.fixedLineHeight);
                f12 = f17 + (drawBatchDesc.drawVecY * SignNonZern * this.fixedLineHeight);
                f11 = f19 + (drawBatchDesc.drawVecX * SignNonZern * this.fixedLineHeight);
            } else {
                f9 = f20;
                f10 = ccw90Y;
                f11 = cw90X;
                f12 = cw90Y;
            }
            if (renderEdges) {
                iRenderState.getBufferRenderer().drawRectangleEdges(iRenderState, f21, f18, f19, f17, f9, f10, f11, f12, 0.0f, barColorBase, Vec2f.zero(), Vec2f.one(), iRenderState.getRes().getAtlasTexWhite(), i, null);
            } else {
                iRenderState.getBufferRenderer().drawRectangle2Patch(iRenderState, f21, f18, f19, f17, f9, f10, f11, f12, 0.0f, barColorBase, Vec2f.zero(), Vec2f.one(), renderPassData);
            }
            i3++;
            drawBatchDescArr2 = drawBatchDescArr;
            length = i2;
        }
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Segment.SegmentRendererBase, com.daaw.avee.comp.Visualizer.Elements.Base.ICustomizable
    public void onApplyCustomization(CustomPropertiesList customPropertiesList) {
        super.onApplyCustomization(customPropertiesList);
        this.barWidth = customPropertiesList.getPropertyFloat("barWidth", 0.5f);
        this.barWidthAffectedByNormal = customPropertiesList.getPropertyBool("barWidthAffectedByShape", false);
        this.mirror = customPropertiesList.getPropertyBool("mirror", false);
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Segment.SegmentRendererBase, com.daaw.avee.comp.Visualizer.Elements.Base.ICustomizable
    public void onReadCustomization(CustomPropertiesList customPropertiesList) {
        super.onReadCustomization(customPropertiesList);
        customPropertiesList.putPropertyFloatAsRange("barWidth", this.barWidth, "misc", 0.0f, 2.0f);
        customPropertiesList.putPropertyBool("barWidthAffectedByShape", this.barWidthAffectedByNormal, "b");
        customPropertiesList.putPropertyBool("mirror", this.mirror, "b");
    }
}
