package com.daaw.avee.comp.Visualizer.Elements.Segment;

import com.daaw.avee.comp.Visualizer.Elements.Base.ICustomizable;
import com.daaw.avee.comp.Visualizer.Graphic.IRenderState;
import com.daaw.avee.comp.Visualizer.Graphic.RenderState;
/* loaded from: classes.dex */
public interface ISegmentRenderer extends ICustomizable {

    /* loaded from: classes.dex */
    public static class DrawDesc {
        public int blendMode;
        public int color1;
        public float drawPointX;
        public float drawPointY;
        public float drawScale;
        public float drawSegmentWidth;
        public float drawVecX;
        public float drawVecY;
        public float lastDrawPointX;
        public float lastDrawPointY;
        public float lastDrawVecX;
        public float lastDrawVecY;
        public float lastSegmentHeightVal;
        public float segmentHeightVal;
        public int valueIndex;
        public int valuesCount;
    }

    void drawSegment(RenderState renderState, DrawDesc drawDesc, float f);

    void drawSegmentBatch(IRenderState iRenderState, DrawBatchDesc[] drawBatchDescArr, float f, float f2, int i, float f3);

    /* loaded from: classes.dex */
    public static class DrawBatchDesc {
        public float drawPointX;
        public float drawPointY;
        public float drawVecX;
        public float drawVecY;
        public float neighborMiddleVecX;
        public float neighborMiddleVecY;
        public float render1X;
        public float render1Y;
        public float render2X;
        public float render2Y;
        public float segmentHeightVal;
        public float tmp1X;
        public float tmp1Y;
        public float tmp2X;
        public float tmp2Y;
        public boolean valueAtIndex0;
        public int valueIndexLastToConnect;
        public int valueIndexNextToConnect;
        public int valueIndexNextToConnectTmp;
        public float valueX;
        public float valueY;

        public float getEndPointX(float f) {
            return this.drawPointX + (this.drawVecX * this.segmentHeightVal * f);
        }

        public float getEndPointY(float f) {
            return this.drawPointY + (this.drawVecY * this.segmentHeightVal * f);
        }

        public float getEndPointX2() {
            return this.tmp1X;
        }

        public float getEndPointY2() {
            return this.tmp1Y;
        }

        public float getEndPointX2(int i) {
            return this.valueX;
        }

        public float getEndPointY2(int i) {
            return this.valueY;
        }
    }
}
