package com.daaw.avee.comp.Visualizer.Elements.Segment;

import android.graphics.PointF;
import android.graphics.RectF;
import com.daaw.avee.comp.Visualizer.CustomPropertiesList;
import com.daaw.avee.comp.Visualizer.Graphic.IRenderState;
/* loaded from: classes.dex */
public class SegmentPathHorizontalLine implements ISegmentPath {
    public static final String typeName = "HorizontalLine";
    boolean vertical = false;

    @Override // com.daaw.avee.comp.Visualizer.Elements.Segment.ISegmentPath
    public int getPreferredPointCount(RectF rectF) {
        return 2;
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.ICustomizable
    public void onApplyCustomization(CustomPropertiesList customPropertiesList) {
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.ICustomizable
    public void onReadCustomization(CustomPropertiesList customPropertiesList) {
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Segment.ISegmentPath
    public void process(IRenderState iRenderState) {
    }

    public SegmentPathHorizontalLine setVertical(boolean z) {
        this.vertical = z;
        return this;
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Segment.ISegmentPath
    public int getPointOnPath(boolean z, int i, int i2, RectF rectF, float f, PointF pointF, PointF pointF2) {
        float width;
        float f2 = i2;
        float width2 = rectF.left + (rectF.width() / f2);
        float max = Math.max(1.0f, Math.round((rectF.width() - (width * 2.0f)) / f2));
        pointF.x = ((rectF.width() - (((f2 * max) + width2) - ((max * 0.0f) + width2))) * 0.5f) + width2 + (max * (z ? i2 - i : i));
        pointF.y = rectF.centerY();
        pointF2.x = 0.0f;
        pointF2.y = 1.0f;
        return i - 1;
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Segment.ISegmentPath
    public float getPathLength(RectF rectF, int i) {
        return rectF.width() - ((rectF.width() / i) * 2.0f);
    }
}
