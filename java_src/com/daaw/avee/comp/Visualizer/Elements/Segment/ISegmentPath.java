package com.daaw.avee.comp.Visualizer.Elements.Segment;

import android.graphics.PointF;
import android.graphics.RectF;
import com.daaw.avee.comp.Visualizer.Elements.Base.ICustomizable;
import com.daaw.avee.comp.Visualizer.Graphic.IRenderState;
/* loaded from: classes.dex */
public interface ISegmentPath extends ICustomizable {
    float getPathLength(RectF rectF, int i);

    int getPointOnPath(boolean z, int i, int i2, RectF rectF, float f, PointF pointF, PointF pointF2);

    int getPreferredPointCount(RectF rectF);

    void process(IRenderState iRenderState);
}
