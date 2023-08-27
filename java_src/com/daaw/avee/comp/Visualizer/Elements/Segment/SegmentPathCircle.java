package com.daaw.avee.comp.Visualizer.Elements.Segment;

import android.graphics.PointF;
import android.graphics.RectF;
import com.daaw.avee.comp.Visualizer.CustomPropertiesList;
import com.daaw.avee.comp.Visualizer.Graphic.IRenderState;
/* loaded from: classes.dex */
public class SegmentPathCircle implements ISegmentPath {
    public static final String typeName = "Circle";
    private float radius = 1.0f;
    private float topGap = 0.0f;

    @Override // com.daaw.avee.comp.Visualizer.Elements.Segment.ISegmentPath
    public void process(IRenderState iRenderState) {
    }

    public SegmentPathCircle setRadius(float f) {
        this.radius = f;
        return this;
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Segment.ISegmentPath
    public int getPointOnPath(boolean z, int i, int i2, RectF rectF, float f, PointF pointF, PointF pointF2) {
        float height;
        int i3 = z ? i2 - i : i;
        float f2 = this.topGap;
        double d = (((i3 / i2) + f) * (1.0f - f2)) + (f2 * 0.5f);
        Double.isNaN(d);
        double d2 = d * 6.283185307179586d;
        pointF2.x = (float) ((-Math.sin(d2)) * 1.0d);
        pointF2.y = (float) (Math.cos(d2) * 1.0d);
        if (rectF.width() < rectF.height()) {
            height = rectF.width();
        } else {
            height = rectF.height();
        }
        float f3 = height * 0.5f * this.radius;
        pointF.x = rectF.centerX() + ((-pointF2.x) * f3);
        pointF.y = rectF.centerY() + ((-pointF2.y) * f3);
        return ((i + i2) - 1) % i2;
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Segment.ISegmentPath
    public float getPathLength(RectF rectF, int i) {
        float height;
        if (rectF.width() < rectF.height()) {
            height = rectF.width();
        } else {
            height = rectF.height();
        }
        double d = height * 0.5f * this.radius;
        Double.isNaN(d);
        return ((float) (d * 6.283185307179586d)) * (1.0f - this.topGap);
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Segment.ISegmentPath
    public int getPreferredPointCount(RectF rectF) {
        return Math.max((int) ((getPathLength(rectF, 0) / 18.0f) + 0.5f), 18);
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.ICustomizable
    public void onApplyCustomization(CustomPropertiesList customPropertiesList) {
        this.radius = customPropertiesList.getPropertyFloat("radius", 1.0f);
        this.topGap = customPropertiesList.getPropertyFloat("gap", 0.0f);
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.ICustomizable
    public void onReadCustomization(CustomPropertiesList customPropertiesList) {
        customPropertiesList.putPropertyFloatAsRange("radius", this.radius, "misc", 0.5f, 3.0f);
        customPropertiesList.putPropertyFloatAsRange("gap", this.topGap, "misc", 0.0f, 0.9f);
    }
}
