package com.daaw;

import android.graphics.PointF;
import android.graphics.RectF;
/* loaded from: classes.dex */
public class ra1 implements ge0 {
    public boolean a = false;

    @Override // com.daaw.zc0
    public void a(un unVar) {
    }

    @Override // com.daaw.ge0
    public void d(de0 de0Var) {
    }

    @Override // com.daaw.ge0
    public int e(boolean z, int i, int i2, RectF rectF, float f, PointF pointF, PointF pointF2) {
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

    @Override // com.daaw.ge0
    public int i(RectF rectF) {
        return 2;
    }

    @Override // com.daaw.ge0
    public float k(RectF rectF, int i) {
        return rectF.width() - ((rectF.width() / i) * 2.0f);
    }

    @Override // com.daaw.zc0
    public void o(un unVar) {
    }
}
