package com.daaw.avee.comp.Visualizer.Elements.Segment;

import android.graphics.PointF;
import android.graphics.RectF;
import com.daaw.avee.comp.Visualizer.CustomPropertiesList;
import com.daaw.avee.comp.Visualizer.Graphic.IRenderState;
/* loaded from: classes.dex */
public class SegmentPathRoundedRect implements ISegmentPath {
    SegmentPathSided rect = new SegmentPathSided();
    SegmentPathCircle circle = new SegmentPathCircle();

    @Override // com.daaw.avee.comp.Visualizer.Elements.Segment.ISegmentPath
    public int getPreferredPointCount(RectF rectF) {
        return 4;
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.ICustomizable
    public void onApplyCustomization(CustomPropertiesList customPropertiesList) {
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.ICustomizable
    public void onReadCustomization(CustomPropertiesList customPropertiesList) {
    }

    public SegmentPathRoundedRect() {
        this.rect.setSides(4);
    }

    public SegmentPathRoundedRect setRadius(float f) {
        this.circle.setRadius(0.5f);
        return this;
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Segment.ISegmentPath
    public void process(IRenderState iRenderState) {
        this.rect.process(iRenderState);
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Segment.ISegmentPath
    public int getPointOnPath(boolean z, int i, int i2, RectF rectF, float f, PointF pointF, PointF pointF2) {
        this.rect.getPathLength(rectF, 0);
        this.rect.getPathLength(rectF, 0);
        this.circle.getPathLength(rectF, 0);
        return 0;
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Segment.ISegmentPath
    public float getPathLength(RectF rectF, int i) {
        return this.rect.getPathLength(rectF, i);
    }
}
