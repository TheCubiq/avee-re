package com.daaw.avee.comp.Visualizer.Elements.Segment;

import android.graphics.PointF;
import android.graphics.RectF;
import com.daaw.avee.comp.Visualizer.CustomPropertiesList;
import com.daaw.avee.comp.Visualizer.Graphic.IRenderState;
/* loaded from: classes.dex */
public class SegmentPathSided implements ISegmentPath {
    public static final String typeName = "SidedPolygon";
    float sideInAngle;
    float radius = 1.0f;
    int sides = 3;
    float angleAculumator = 0.0f;
    PointF point0 = new PointF();
    PointF point1 = new PointF();

    @Override // com.daaw.avee.comp.Visualizer.Elements.Segment.ISegmentPath
    public void process(IRenderState iRenderState) {
    }

    public SegmentPathSided() {
        setSides(3);
    }

    public SegmentPathSided setRadius(float f) {
        this.radius = f;
        return this;
    }

    public SegmentPathSided setSides(int i) {
        this.sides = Math.max(i, 3);
        this.sideInAngle = 6.2831855f / i;
        return this;
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Segment.ISegmentPath
    public int getPointOnPath(boolean z, int i, int i2, RectF rectF, float f, PointF pointF, PointF pointF2) {
        float height;
        float f2 = (z ? i2 - i : i) / i2;
        int i3 = this.sides;
        float f3 = (int) (i3 * f2);
        float f4 = (f2 - (f3 / i3)) / (1.0f / i3);
        float f5 = this.sideInAngle;
        double d = (f3 * f5) + this.angleAculumator;
        double d2 = f5;
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = d2 + d;
        Double.isNaN(d);
        double d4 = (d + d3) * 0.5d;
        this.point0.x = (float) ((-Math.sin(d)) * 1.0d);
        this.point0.y = (float) (Math.cos(d) * 1.0d);
        this.point1.x = (float) ((-Math.sin(d3)) * 1.0d);
        this.point1.y = (float) (Math.cos(d3) * 1.0d);
        pointF2.x = (float) ((-Math.sin(d4)) * 1.0d);
        pointF2.y = (float) (Math.cos(d4) * 1.0d);
        pointF.x = this.point0.x + ((this.point1.x - this.point0.x) * f4);
        pointF.y = this.point0.y + ((this.point1.y - this.point0.y) * f4);
        if (rectF.width() < rectF.height()) {
            height = rectF.width();
        } else {
            height = rectF.height();
        }
        float f6 = height * 0.5f * this.radius;
        pointF.x = rectF.centerX() + ((-pointF.x) * f6);
        pointF.y = rectF.centerY() + ((-pointF.y) * f6);
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
        return this.sideInAngle * this.sides * this.radius * height * 0.5f;
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Segment.ISegmentPath
    public int getPreferredPointCount(RectF rectF) {
        return this.sides;
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.ICustomizable
    public void onApplyCustomization(CustomPropertiesList customPropertiesList) {
        this.radius = customPropertiesList.getPropertyFloat("radius", 1.0f);
        setSides(customPropertiesList.getPropertyInt("sides", 3));
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.ICustomizable
    public void onReadCustomization(CustomPropertiesList customPropertiesList) {
        customPropertiesList.putPropertyFloatAsRange("radius", this.radius, "misc", 0.15f, 3.0f);
        customPropertiesList.putPropertyIntAsRange("sides", this.sides, "misc", 3, 18);
    }
}
