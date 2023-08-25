package com.daaw;

import android.graphics.PointF;
import android.graphics.RectF;
/* loaded from: classes.dex */
public class qa1 implements ge0 {
    public float a = 1.0f;
    public int b = 3;
    public float c = 0.0f;
    public PointF d = new PointF();
    public PointF e = new PointF();

    @Override // com.daaw.zc0
    public void a(un unVar) {
    }

    @Override // com.daaw.ge0
    public void d(de0 de0Var) {
    }

    @Override // com.daaw.ge0
    public int e(boolean z, int i, int i2, RectF rectF, float f, PointF pointF, PointF pointF2) {
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

    @Override // com.daaw.ge0
    public int i(RectF rectF) {
        return 4;
    }

    @Override // com.daaw.ge0
    public float k(RectF rectF, int i) {
        return (rectF.width() + rectF.height()) * 2.0f;
    }

    @Override // com.daaw.zc0
    public void o(un unVar) {
    }
}
