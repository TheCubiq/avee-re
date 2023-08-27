package com.daaw.avee.comp.Visualizer.Elements.Segment;

import android.graphics.PointF;
import com.daaw.avee.Common.Action3;
import com.daaw.avee.Common.Func.Func3;
import com.daaw.avee.Common.Func.Func4;
import com.daaw.avee.Common.Vec2f;
import com.daaw.avee.comp.Visualizer.CustomPropertiesList;
import com.daaw.avee.comp.Visualizer.Elements.Segment.ISegmentRenderer;
import com.daaw.avee.comp.Visualizer.Graphic.IRenderState;
import com.daaw.avee.comp.Visualizer.Graphic.RenderPassData;
import com.daaw.avee.comp.Visualizer.Graphic.RenderState;
import com.daaw.avee.comp.Visualizer.Graphic.VShaderBinder;
import com.daaw.avee.comp.Visualizer.Graphic.VShaderProgram;
/* loaded from: classes.dex */
public class SegmentRendererLine extends SegmentRendererBase implements Func3<Integer, float[], int[], Boolean>, Func4<Integer, float[], int[], float[], Boolean> {
    public static final String typeName = "Line";
    ISegmentRenderer.DrawBatchDesc desc;
    ISegmentRenderer.DrawBatchDesc[] descs;
    float drawScale;
    ISegmentRenderer.DrawBatchDesc lastDesc;
    ISegmentRenderer.DrawBatchDesc lastLastDesc;
    float lx1;
    float lx3;
    float ly1;
    float ly3;
    ISegmentRenderer.DrawBatchDesc nextDesc;
    float x1;
    float x3;
    float y1;
    float y3;
    PointF lastDrawPoint = new PointF();
    PointF drawPoint = new PointF();
    PointF nextDrawPoint = new PointF();
    Vec2f normal1 = new Vec2f(0.0f, 0.0f);
    Vec2f normal2 = new Vec2f(0.0f, 0.0f);
    Vec2f vec1 = new Vec2f(0.0f, 0.0f);
    Vec2f outFixedLinePosOffset = new Vec2f(0.0f, 0.0f);
    Vec2f c0 = new Vec2f(0.0f, 0.0f);
    Vec2f c1 = new Vec2f(0.0f, 0.0f);
    Vec2f c2 = new Vec2f(0.0f, 0.0f);
    Vec2f c3 = new Vec2f(0.0f, 0.0f);
    Vec2f normal0tmp = new Vec2f(0.0f, 0.0f);
    Vec2f normal1tmp = new Vec2f(0.0f, 0.0f);
    Vec2f normal2tmp = new Vec2f(0.0f, 0.0f);
    Vec2f normal3tmp = new Vec2f(0.0f, 0.0f);
    Vec2f normal0ltmp = new Vec2f(0.0f, 0.0f);
    Vec2f normal0ntmp = new Vec2f(0.0f, 0.0f);
    Vec2f normal2ltmp = new Vec2f(0.0f, 0.0f);
    Vec2f normal2ntmp = new Vec2f(0.0f, 0.0f);
    private boolean mirror = true;
    private boolean flipEveryOther = false;
    private float tmpColorOffsetBlend = 0.0f;

    public SegmentRendererLine setMirror(boolean z) {
        this.mirror = z;
        return this;
    }

    public SegmentRendererLine setFlipEveryOther(boolean z) {
        this.flipEveryOther = z;
        return this;
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Segment.ISegmentRenderer
    public void drawSegment(RenderState renderState, ISegmentRenderer.DrawDesc drawDesc, float f) {
        float f2 = drawDesc.segmentHeightVal;
        float f3 = drawDesc.lastSegmentHeightVal;
        if (this.flipEveryOther) {
            if (drawDesc.valueIndex % 2 == 0) {
                f2 *= -1.0f;
            } else {
                f3 *= -1.0f;
            }
        }
        drawDesc.color1 = getBarColorBase(drawDesc.valueIndex, drawDesc.valuesCount, f);
        this.lastDrawPoint.x = drawDesc.lastDrawPointX;
        this.lastDrawPoint.y = drawDesc.lastDrawPointY;
        this.drawPoint.x = drawDesc.drawPointX;
        this.drawPoint.y = drawDesc.drawPointY;
        float round = Math.round((drawDesc.drawSegmentWidth * 1.0f) / (drawDesc.valuesCount + 1)) * 0.5f;
        float f4 = f3 * (-2.0f) * drawDesc.drawScale * this.barHeightMultiplier;
        float f5 = f2 * (-2.0f) * drawDesc.drawScale * this.barHeightMultiplier;
        if (this.mirror) {
            this.lastDrawPoint.x -= drawDesc.lastDrawVecX * f4;
            this.lastDrawPoint.y -= drawDesc.lastDrawVecY * f4;
            double d = f4;
            Double.isNaN(d);
            f4 = (float) (d * 2.0d);
            this.drawPoint.x -= drawDesc.drawVecX * f5;
            this.drawPoint.y -= drawDesc.drawVecY * f5;
            double d2 = f5;
            Double.isNaN(d2);
            f5 = (float) (d2 * 2.0d);
        }
        this.lx3 = (Vec2f.cw90X(drawDesc.lastDrawVecX, drawDesc.lastDrawVecY) * round) + this.lastDrawPoint.x;
        this.ly3 = (Vec2f.cw90Y(drawDesc.lastDrawVecX, drawDesc.lastDrawVecY) * round) + this.lastDrawPoint.y;
        this.x3 = (Vec2f.cw90X(drawDesc.drawVecX, drawDesc.drawVecY) * round) + this.drawPoint.x;
        this.y3 = (Vec2f.cw90Y(drawDesc.drawVecX, drawDesc.drawVecY) * round) + this.drawPoint.y;
        this.lx1 = (drawDesc.lastDrawVecX * f4) + this.lx3;
        this.ly1 = (drawDesc.lastDrawVecY * f4) + this.ly3;
        this.x1 = (drawDesc.drawVecX * f5) + this.x3;
        this.y1 = (drawDesc.drawVecY * f5) + this.y3;
        if (this.useFixedLineHeight) {
            float signum = Math.signum(drawDesc.drawScale * (-1.0f) * this.barHeightMultiplier);
            this.lx3 = this.lx1 + (drawDesc.lastDrawVecX * signum * this.fixedLineHeight);
            this.ly3 = this.ly1 + (drawDesc.lastDrawVecY * signum * this.fixedLineHeight);
            this.x3 = this.x1 + (drawDesc.drawVecX * signum * this.fixedLineHeight);
            this.y3 = this.y1 + (drawDesc.drawVecY * signum * this.fixedLineHeight);
        }
        renderState.res.getBufferRenderer().drawRectangle(renderState, this.lx1, this.ly1, this.x1, this.y1, this.lx3, this.ly3, this.x3, this.y3, 0.0f, drawDesc.color1, Vec2f.zero(), Vec2f.one(), renderState.res.getAtlasTexWhite(), drawDesc.blendMode);
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Segment.ISegmentRenderer
    public void drawSegmentBatch(IRenderState iRenderState, ISegmentRenderer.DrawBatchDesc[] drawBatchDescArr, float f, float f2, int i, float f3) {
        this.descs = drawBatchDescArr;
        this.drawScale = f2;
        this.tmpColorOffsetBlend = f3;
        int length = drawBatchDescArr.length;
        boolean renderEdges = iRenderState.getRenderEdges();
        RenderPassData renderPassData = !renderEdges ? new RenderPassData(i, iRenderState.getRes().getAtlasTexSquareYSidesSegment(), (VShaderBinder) null, (Action3<RenderState, VShaderProgram, RenderPassData>) null, 2) : null;
        int i2 = 0;
        while (true) {
            ISegmentRenderer.DrawBatchDesc[] drawBatchDescArr2 = this.descs;
            if (i2 >= drawBatchDescArr2.length) {
                break;
            }
            ISegmentRenderer.DrawBatchDesc drawBatchDesc = drawBatchDescArr2[i2];
            this.desc = drawBatchDesc;
            this.lastDesc = drawBatchDesc.valueIndexLastToConnect < 0 ? this.desc : this.descs[this.desc.valueIndexLastToConnect];
            this.nextDesc = this.desc.valueIndexNextToConnect < 0 ? this.desc : this.descs[this.desc.valueIndexNextToConnect];
            float f4 = this.desc.segmentHeightVal;
            float f5 = this.lastDesc.segmentHeightVal;
            float f6 = this.nextDesc.segmentHeightVal;
            if (this.flipEveryOther) {
                if (i2 % 2 == 0) {
                    f4 *= -1.0f;
                } else {
                    f5 *= -1.0f;
                }
            }
            this.lastDrawPoint.x = this.lastDesc.drawPointX;
            this.lastDrawPoint.y = this.lastDesc.drawPointY;
            this.drawPoint.x = this.desc.drawPointX;
            this.drawPoint.y = this.desc.drawPointY;
            this.nextDrawPoint.x = this.nextDesc.drawPointX;
            this.nextDrawPoint.y = this.nextDesc.drawPointY;
            float f7 = f5 * (-2.0f) * this.drawScale * this.barHeightMultiplier;
            float f8 = f4 * (-2.0f) * this.drawScale * this.barHeightMultiplier;
            if (this.mirror) {
                this.lastDrawPoint.x -= this.lastDesc.drawVecX * f7;
                this.lastDrawPoint.y -= this.lastDesc.drawVecY * f7;
                this.drawPoint.x -= this.desc.drawVecX * f8;
                this.drawPoint.y -= this.desc.drawVecY * f8;
                double d = f8;
                Double.isNaN(d);
                f8 = (float) (d * 2.0d);
            }
            if (this.useFixedLineHeight ? this.fixedLineHeight > 0.0f : f8 < 0.0f) {
                this.x3 = this.drawPoint.x;
                this.y3 = this.drawPoint.y;
                this.x1 = (this.desc.drawVecX * f8) + this.x3;
                this.y1 = (this.desc.drawVecY * f8) + this.y3;
                this.desc.valueAtIndex0 = true;
                this.desc.valueX = this.x1;
                this.desc.valueY = this.y1;
                this.desc.tmp1X = this.x1;
                this.desc.tmp1Y = this.y1;
                this.desc.tmp2X = this.x3;
                this.desc.tmp2Y = this.y3;
            } else {
                this.x1 = this.drawPoint.x;
                this.y1 = this.drawPoint.y;
                this.x3 = (this.desc.drawVecX * f8) + this.x1;
                this.y3 = (this.desc.drawVecY * f8) + this.y1;
                this.desc.valueAtIndex0 = false;
                this.desc.valueX = this.x3;
                this.desc.valueY = this.y3;
                this.desc.tmp1X = this.x1;
                this.desc.tmp1Y = this.y1;
                this.desc.tmp2X = this.x3;
                this.desc.tmp2Y = this.y3;
            }
            ISegmentRenderer.DrawBatchDesc drawBatchDesc2 = this.desc;
            drawBatchDesc2.render1X = drawBatchDesc2.tmp1X;
            ISegmentRenderer.DrawBatchDesc drawBatchDesc3 = this.desc;
            drawBatchDesc3.render1Y = drawBatchDesc3.tmp1Y;
            ISegmentRenderer.DrawBatchDesc drawBatchDesc4 = this.desc;
            drawBatchDesc4.render2X = drawBatchDesc4.tmp2X;
            ISegmentRenderer.DrawBatchDesc drawBatchDesc5 = this.desc;
            drawBatchDesc5.render2Y = drawBatchDesc5.tmp2Y;
            i2++;
        }
        if (this.useFixedLineHeight) {
            int i3 = 0;
            while (true) {
                ISegmentRenderer.DrawBatchDesc[] drawBatchDescArr3 = this.descs;
                if (i3 >= drawBatchDescArr3.length) {
                    break;
                }
                ISegmentRenderer.DrawBatchDesc drawBatchDesc6 = drawBatchDescArr3[i3];
                this.desc = drawBatchDesc6;
                getFixedLinePosOffset(drawBatchDesc6, this.outFixedLinePosOffset, this.fixedLineHeight, 0);
                if (this.desc.valueAtIndex0) {
                    ISegmentRenderer.DrawBatchDesc drawBatchDesc7 = this.desc;
                    drawBatchDesc7.render2X = drawBatchDesc7.valueX + this.outFixedLinePosOffset.x;
                    ISegmentRenderer.DrawBatchDesc drawBatchDesc8 = this.desc;
                    drawBatchDesc8.render2Y = drawBatchDesc8.valueY + this.outFixedLinePosOffset.y;
                    ISegmentRenderer.DrawBatchDesc drawBatchDesc9 = this.desc;
                    drawBatchDesc9.tmp2X = drawBatchDesc9.render2X;
                    ISegmentRenderer.DrawBatchDesc drawBatchDesc10 = this.desc;
                    drawBatchDesc10.tmp2Y = drawBatchDesc10.render2Y;
                } else {
                    ISegmentRenderer.DrawBatchDesc drawBatchDesc11 = this.desc;
                    drawBatchDesc11.render1X = drawBatchDesc11.valueX + this.outFixedLinePosOffset.x;
                    ISegmentRenderer.DrawBatchDesc drawBatchDesc12 = this.desc;
                    drawBatchDesc12.render1Y = drawBatchDesc12.valueY + this.outFixedLinePosOffset.y;
                    ISegmentRenderer.DrawBatchDesc drawBatchDesc13 = this.desc;
                    drawBatchDesc13.tmp1X = drawBatchDesc13.render1X;
                    ISegmentRenderer.DrawBatchDesc drawBatchDesc14 = this.desc;
                    drawBatchDesc14.tmp1Y = drawBatchDesc14.render1Y;
                }
                i3++;
            }
        }
        if (renderEdges) {
            iRenderState.getBufferRenderer().drawBatchRectangleEdges(iRenderState, this, length, 0.0f, Vec2f.zero(), Vec2f.one(), iRenderState.getRes().getAtlasTexWhite(), i, null);
        } else {
            iRenderState.getBufferRenderer().drawBatchRectangle2Patch(iRenderState, this, length, 0.0f, Vec2f.zero(), Vec2f.one(), renderPassData);
        }
    }

    private void getFixedLinePosOffset(ISegmentRenderer.DrawBatchDesc drawBatchDesc, Vec2f vec2f, float f, int i) {
        if (drawBatchDesc.valueIndexNextToConnect < 0) {
            this.nextDesc = drawBatchDesc;
            this.normal2.x = 0.0f;
            this.normal2.y = 0.0f;
        } else {
            ISegmentRenderer.DrawBatchDesc drawBatchDesc2 = this.descs[drawBatchDesc.valueIndexNextToConnect];
            this.nextDesc = drawBatchDesc2;
            this.normal2.x = -(drawBatchDesc2.getEndPointY2(i) - drawBatchDesc.getEndPointY2(i));
            this.normal2.y = this.nextDesc.getEndPointX2(i) - drawBatchDesc.getEndPointX2(i);
            this.normal2.normalize();
        }
        if (drawBatchDesc.valueIndexLastToConnect < 0) {
            drawBatchDesc.neighborMiddleVecX = this.normal2.x;
            drawBatchDesc.neighborMiddleVecY = this.normal2.y;
            vec2f.x = drawBatchDesc.neighborMiddleVecX * f;
            vec2f.y = drawBatchDesc.neighborMiddleVecY * f;
            return;
        }
        ISegmentRenderer.DrawBatchDesc drawBatchDesc3 = this.descs[drawBatchDesc.valueIndexLastToConnect];
        this.normal1.x = -(drawBatchDesc.getEndPointY2(i) - drawBatchDesc3.getEndPointY2(i));
        this.normal1.y = drawBatchDesc.getEndPointX2(i) - drawBatchDesc3.getEndPointX2(i);
        this.normal1.normalize();
        this.vec1.x = this.normal1.x + this.normal2.x;
        this.vec1.y = this.normal1.y + this.normal2.y;
        this.vec1.normalize();
        drawBatchDesc.neighborMiddleVecX = this.vec1.x;
        drawBatchDesc.neighborMiddleVecY = this.vec1.y;
        Vec2f vec2f2 = this.normal1;
        vec2f2.x = -vec2f2.x;
        Vec2f vec2f3 = this.normal1;
        vec2f3.y = -vec2f3.y;
        float max = f / Math.max(Math.abs(Vec2f.dot(drawBatchDesc.neighborMiddleVecX, drawBatchDesc.neighborMiddleVecY, this.normal1.x, this.normal1.y)), 0.25f);
        vec2f.x = drawBatchDesc.neighborMiddleVecX * 1.0f * max;
        vec2f.y = drawBatchDesc.neighborMiddleVecY * 1.0f * max;
    }

    private void getFixedLinePosOffset(float f, float f2, float f3, float f4, Vec2f vec2f, float f5, boolean z) {
        this.normal2.x = f3;
        this.normal2.y = f4;
        if (!z) {
            float f6 = this.normal2.x;
            float f7 = this.normal2.y;
            vec2f.x = f6 * f5;
            vec2f.y = f7 * f5;
            return;
        }
        this.normal1.x = f;
        this.normal1.y = f2;
        this.normal1.normalize();
        this.vec1.x = this.normal1.x + this.normal2.x;
        this.vec1.y = this.normal1.y + this.normal2.y;
        this.vec1.normalize();
        float f8 = this.vec1.x;
        float f9 = this.vec1.y;
        Vec2f vec2f2 = this.normal1;
        vec2f2.x = -vec2f2.x;
        Vec2f vec2f3 = this.normal1;
        vec2f3.y = -vec2f3.y;
        float max = f5 / Math.max(Math.abs(Vec2f.dot(f8, f9, this.normal1.x, this.normal1.y)), 0.25f);
        vec2f.x = f8 * 1.0f * max;
        vec2f.y = f9 * 1.0f * max;
    }

    @Override // com.daaw.avee.Common.Func.Func3
    public Boolean Invoke(Integer num, float[] fArr, int[] iArr) {
        ISegmentRenderer.DrawBatchDesc drawBatchDesc = this.descs[num.intValue()];
        this.desc = drawBatchDesc;
        if (drawBatchDesc.valueIndexLastToConnect >= 0) {
            this.lastDesc = this.descs[this.desc.valueIndexLastToConnect];
            int barColorBase = getBarColorBase(this.desc.valueIndexLastToConnect, this.descs.length, this.tmpColorOffsetBlend);
            int barColorBase2 = getBarColorBase(num.intValue(), this.descs.length, this.tmpColorOffsetBlend);
            iArr[0] = barColorBase;
            iArr[1] = barColorBase2;
            iArr[2] = iArr[0];
            iArr[3] = iArr[1];
            this.lx1 = this.lastDesc.render1X;
            this.ly1 = this.lastDesc.render1Y;
            this.lx3 = this.lastDesc.render2X;
            this.ly3 = this.lastDesc.render2Y;
            this.x1 = this.desc.render1X;
            this.y1 = this.desc.render1Y;
            this.x3 = this.desc.render2X;
            float f = this.desc.render2Y;
            this.y3 = f;
            fArr[0] = this.lx1;
            fArr[1] = this.ly1;
            fArr[2] = this.x1;
            fArr[3] = this.y1;
            fArr[4] = this.lx3;
            fArr[5] = this.ly3;
            fArr[6] = this.x3;
            fArr[7] = f;
            return true;
        }
        return false;
    }

    @Override // com.daaw.avee.Common.Func.Func4
    public Boolean Invoke(Integer num, float[] fArr, int[] iArr, float[] fArr2) {
        ISegmentRenderer.DrawBatchDesc drawBatchDesc = this.descs[num.intValue()];
        this.desc = drawBatchDesc;
        if (drawBatchDesc.valueIndexLastToConnect >= 0) {
            this.lastDesc = this.descs[this.desc.valueIndexLastToConnect];
            iArr[1] = getBarColorBase(num.intValue(), this.descs.length, this.tmpColorOffsetBlend);
            iArr[0] = getBarColorBase(this.desc.valueIndexLastToConnect, this.descs.length, this.tmpColorOffsetBlend);
            iArr[2] = iArr[0];
            iArr[3] = iArr[1];
            this.lx1 = this.lastDesc.render1X;
            this.ly1 = this.lastDesc.render1Y;
            this.lx3 = this.lastDesc.render2X;
            this.ly3 = this.lastDesc.render2Y;
            this.x1 = this.desc.render1X;
            this.y1 = this.desc.render1Y;
            this.x3 = this.desc.render2X;
            float f = this.desc.render2Y;
            this.y3 = f;
            fArr[0] = this.lx1;
            fArr[1] = this.ly1;
            fArr[2] = this.x1;
            fArr[3] = this.y1;
            fArr[4] = this.lx3;
            fArr[5] = this.ly3;
            fArr[6] = this.x3;
            fArr[7] = f;
            if (this.lastDesc.valueIndexLastToConnect >= 0) {
                ISegmentRenderer.DrawBatchDesc drawBatchDesc2 = this.descs[this.lastDesc.valueIndexLastToConnect];
                this.lastLastDesc = drawBatchDesc2;
                float f2 = drawBatchDesc2.render1X;
                float f3 = this.lastLastDesc.render1Y;
                float f4 = this.lastLastDesc.render2X;
                float f5 = this.lastLastDesc.render2Y;
                if (this.desc.valueIndexNextToConnect >= 0) {
                    ISegmentRenderer.DrawBatchDesc drawBatchDesc3 = this.descs[this.desc.valueIndexNextToConnect];
                    this.nextDesc = drawBatchDesc3;
                    float f6 = drawBatchDesc3.render1X;
                    float f7 = this.nextDesc.render1Y;
                    float f8 = this.nextDesc.render2X;
                    float f9 = this.nextDesc.render2Y;
                    float f10 = this.ly1;
                    float f11 = this.lx1;
                    float f12 = f11 - f2;
                    float f13 = this.y1;
                    float f14 = this.x1;
                    float f15 = f6 - f14;
                    float f16 = this.ly3;
                    float f17 = -(f16 - f5);
                    float f18 = this.lx3;
                    float f19 = f18 - f4;
                    float f20 = this.y3;
                    float f21 = -(f20 - f16);
                    float f22 = this.x3;
                    makeEdgeCorners(-(f10 - f3), f12, -(f13 - f10), f14 - f11, -(f7 - f13), f15, f17, f19, f21, f22 - f18, -(f9 - f20), f8 - f22, fArr2);
                } else {
                    float f23 = this.ly1;
                    float f24 = this.lx1;
                    float f25 = f24 - f2;
                    float f26 = this.y1;
                    float f27 = this.x1;
                    float f28 = this.ly3;
                    float f29 = -(f28 - f5);
                    float f30 = this.lx3;
                    float f31 = f30 - f4;
                    float f32 = this.y3;
                    float f33 = this.x3;
                    makeEdgeCorners(-(f23 - f3), f25, -(f26 - f23), f27 - f24, -(f26 - f23), f27 - f24, f29, f31, -(f32 - f28), f33 - f30, -(f32 - f28), f33 - f30, fArr2);
                }
            } else if (this.desc.valueIndexNextToConnect >= 0) {
                ISegmentRenderer.DrawBatchDesc drawBatchDesc4 = this.descs[this.desc.valueIndexNextToConnect];
                this.nextDesc = drawBatchDesc4;
                float f34 = drawBatchDesc4.render1X;
                float f35 = this.nextDesc.render1Y;
                float f36 = this.nextDesc.render2X;
                float f37 = this.nextDesc.render2Y;
                float f38 = this.y1;
                float f39 = this.ly1;
                float f40 = this.x1;
                float f41 = this.lx1;
                float f42 = f40 - f41;
                float f43 = -(f35 - f38);
                float f44 = f34 - f40;
                float f45 = this.y3;
                float f46 = this.ly3;
                float f47 = this.x3;
                float f48 = this.lx3;
                makeEdgeCorners(-(f38 - f39), f40 - f41, -(f38 - f39), f42, f43, f44, -(f45 - f46), f47 - f48, -(f45 - f46), f47 - f48, -(f37 - f38), f36 - f47, fArr2);
            } else {
                float f49 = this.y1;
                float f50 = this.ly1;
                float f51 = this.x1;
                float f52 = this.lx1;
                float f53 = this.y3;
                float f54 = this.ly3;
                float f55 = this.x3;
                float f56 = this.lx3;
                makeEdgeCorners(-(f49 - f50), f51 - f52, -(f49 - f50), f51 - f52, -(f49 - f50), f51 - f52, -(f53 - f54), f55 - f56, -(f53 - f54), f55 - f56, -(f53 - f54), f55 - f56, fArr2);
            }
            return true;
        }
        return false;
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Segment.SegmentRendererBase, com.daaw.avee.comp.Visualizer.Elements.Base.ICustomizable
    public void onApplyCustomization(CustomPropertiesList customPropertiesList) {
        super.onApplyCustomization(customPropertiesList);
        this.mirror = customPropertiesList.getPropertyBool("mirror", false);
        this.flipEveryOther = customPropertiesList.getPropertyBool("flipEveryOther", false);
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Segment.SegmentRendererBase, com.daaw.avee.comp.Visualizer.Elements.Base.ICustomizable
    public void onReadCustomization(CustomPropertiesList customPropertiesList) {
        super.onReadCustomization(customPropertiesList);
        customPropertiesList.putPropertyBool("mirror", this.mirror, "b");
        customPropertiesList.putPropertyBool("flipEveryOther", this.flipEveryOther, "b");
    }

    void makeEdgeCorners(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float[] fArr) {
        this.normal0tmp.x = -(f4 - f2);
        this.normal0tmp.y = f3 - f;
        this.normal0tmp.normalizeSafe();
        this.normal1tmp.x = -(f8 - f4);
        this.normal1tmp.y = f7 - f3;
        this.normal1tmp.normalizeSafe();
        this.normal2tmp.x = -(f6 - f8);
        this.normal2tmp.y = f5 - f7;
        this.normal2tmp.normalizeSafe();
        this.normal3tmp.x = -(f2 - f6);
        this.normal3tmp.y = f - f5;
        this.normal3tmp.normalizeSafe();
        this.c0.x = this.normal0tmp.x + this.normal3tmp.x;
        this.c0.y = this.normal0tmp.y + this.normal3tmp.y;
        this.c0.multiplyByValueDividedByDotCapped(this.normal0tmp, 1.5f);
        this.c1.x = this.normal0tmp.x + this.normal1tmp.x;
        this.c1.y = this.normal0tmp.y + this.normal1tmp.y;
        this.c1.multiplyByValueDividedByDotCapped(this.normal1tmp, 1.5f);
        this.c2.x = this.normal1tmp.x + this.normal2tmp.x;
        this.c2.y = this.normal1tmp.y + this.normal2tmp.y;
        this.c2.multiplyByValueDividedByDotCapped(this.normal2tmp, 1.5f);
        this.c3.x = this.normal2tmp.x + this.normal3tmp.x;
        this.c3.y = this.normal2tmp.y + this.normal3tmp.y;
        this.c3.multiplyByValueDividedByDotCapped(this.normal3tmp, 1.5f);
        fArr[0] = this.c0.x;
        fArr[1] = this.c0.y;
        fArr[2] = this.c1.x;
        fArr[3] = this.c1.y;
        fArr[4] = this.c2.x;
        fArr[5] = this.c2.y;
        fArr[6] = this.c3.x;
        fArr[7] = this.c3.y;
    }

    void makeEdgeCorners(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float[] fArr) {
        double sqrt = Math.sqrt((f * f) + (f2 * f2));
        double d = f;
        Double.isNaN(d);
        double d2 = f2;
        Double.isNaN(d2);
        double sqrt2 = Math.sqrt((f3 * f3) + (f4 * f4));
        double d3 = f3;
        Double.isNaN(d3);
        float f13 = (float) (d3 / sqrt2);
        double d4 = f4;
        Double.isNaN(d4);
        float f14 = (float) (d4 / sqrt2);
        double sqrt3 = Math.sqrt((f5 * f5) + (f6 * f6));
        double d5 = f5;
        Double.isNaN(d5);
        double d6 = f6;
        Double.isNaN(d6);
        double sqrt4 = Math.sqrt((f7 * f7) + (f8 * f8));
        double d7 = f7;
        Double.isNaN(d7);
        double d8 = f8;
        Double.isNaN(d8);
        double sqrt5 = Math.sqrt((f9 * f9) + (f10 * f10));
        double d9 = f9;
        Double.isNaN(d9);
        float f15 = (float) (d9 / sqrt5);
        double d10 = f10;
        Double.isNaN(d10);
        float f16 = (float) (d10 / sqrt5);
        double sqrt6 = Math.sqrt((f11 * f11) + (f12 * f12));
        double d11 = f11;
        Double.isNaN(d11);
        double d12 = f12;
        Double.isNaN(d12);
        this.c0.x = ((float) (d / sqrt)) + f13;
        this.c0.y = ((float) (d2 / sqrt)) + f14;
        this.c0.multiplyByValueDividedByDotCapped(f13, f14, 1.5f);
        this.c1.x = ((float) (d5 / sqrt3)) + f13;
        this.c1.y = ((float) (d6 / sqrt3)) + f14;
        this.c1.multiplyByValueDividedByDotCapped(f13, f14, 1.5f);
        this.c2.x = ((float) (d11 / sqrt6)) + f15;
        this.c2.y = ((float) (d12 / sqrt6)) + f16;
        this.c2.multiplyByValueDividedByDotCapped(f15, f16, 1.5f);
        this.c3.x = ((float) (d7 / sqrt4)) + f15;
        this.c3.y = ((float) (d8 / sqrt4)) + f16;
        this.c3.multiplyByValueDividedByDotCapped(f15, f16, 1.5f);
        fArr[0] = this.c0.x;
        fArr[1] = this.c0.y;
        fArr[2] = this.c1.x;
        fArr[3] = this.c1.y;
        fArr[4] = -this.c2.x;
        fArr[5] = -this.c2.y;
        fArr[6] = -this.c3.x;
        fArr[7] = -this.c3.y;
    }
}
