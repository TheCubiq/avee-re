package com.daaw;

import android.graphics.PointF;
import android.graphics.RectF;
/* loaded from: classes.dex */
public class qa1 implements ge0 {

    /* renamed from: a */
    public float f23802a = 1.0f;

    /* renamed from: b */
    public int f23803b = 3;

    /* renamed from: c */
    public float f23804c = 0.0f;

    /* renamed from: d */
    public PointF f23805d = new PointF();

    /* renamed from: e */
    public PointF f23806e = new PointF();

    @Override // com.daaw.zc0
    /* renamed from: a */
    public void mo2493a(C3239un c3239un) {
    }

    @Override // com.daaw.ge0
    /* renamed from: d */
    public void mo8393d(de0 de0Var) {
    }

    @Override // com.daaw.ge0
    /* renamed from: e */
    public int mo8392e(boolean z, int i, int i2, RectF rectF, float f, PointF pointF, PointF pointF2) {
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
    /* renamed from: i */
    public int mo8391i(RectF rectF) {
        return 4;
    }

    @Override // com.daaw.ge0
    /* renamed from: k */
    public float mo8389k(RectF rectF, int i) {
        return (rectF.width() + rectF.height()) * 2.0f;
    }

    @Override // com.daaw.zc0
    /* renamed from: o */
    public void mo2492o(C3239un c3239un) {
    }
}
