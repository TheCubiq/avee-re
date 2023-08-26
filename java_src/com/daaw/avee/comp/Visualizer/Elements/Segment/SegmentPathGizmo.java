package com.daaw.avee.comp.Visualizer.Elements.Segment;

import android.graphics.PointF;
import android.graphics.RectF;
import com.daaw.avee.comp.Visualizer.CustomPropertiesList;
import com.daaw.avee.comp.Visualizer.Graphic.IRenderState;
/* loaded from: classes.dex */
public class SegmentPathGizmo implements ISegmentPath {
    public static final String typeName = "Gizmo";
    float sideInAngle;
    float radius = 1.0f;
    int sides = 3;
    float angleAculumator = 0.0f;
    PointF point0 = new PointF();
    PointF point1 = new PointF();

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

    @Override // com.daaw.avee.comp.Visualizer.Elements.Segment.ISegmentPath
    public void process(IRenderState iRenderState) {
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Segment.ISegmentPath
    public int getPointOnPath(boolean z, int i, int i2, RectF rectF, float f, PointF pointF, PointF pointF2) {
        switch (i) {
            case 0:
                pointF.x = rectF.left;
                pointF.y = rectF.top;
                pointF2.x = 1.0f;
                pointF2.y = -1.0f;
                return -1;
            case 1:
                pointF.x = rectF.right;
                pointF.y = rectF.bottom;
                pointF2.x = 1.0f;
                pointF2.y = -1.0f;
                return 0;
            case 2:
                pointF.x = rectF.right;
                pointF.y = rectF.top;
                pointF2.x = 1.0f;
                pointF2.y = 1.0f;
                return -1;
            case 3:
                pointF.x = rectF.left;
                pointF.y = rectF.bottom;
                pointF2.x = 1.0f;
                pointF2.y = 1.0f;
                return 2;
            case 4:
                pointF.x = rectF.left;
                pointF.y = rectF.top;
                pointF2.x = -1.0f;
                pointF2.y = -1.0f;
                return 7;
            case 5:
                pointF.x = rectF.right;
                pointF.y = rectF.top;
                pointF2.x = 1.0f;
                pointF2.y = -1.0f;
                return 4;
            case 6:
                pointF.x = rectF.right;
                pointF.y = rectF.bottom;
                pointF2.x = 1.0f;
                pointF2.y = 1.0f;
                return 5;
            case 7:
                pointF.x = rectF.left;
                pointF.y = rectF.bottom;
                pointF2.x = -1.0f;
                pointF2.y = 1.0f;
                return 6;
            default:
                return -1;
        }
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Segment.ISegmentPath
    public float getPathLength(RectF rectF, int i) {
        return (rectF.width() + rectF.height()) * 2.0f;
    }
}
