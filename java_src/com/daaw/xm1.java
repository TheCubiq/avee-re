package com.daaw;

import com.google.android.exoplayer2.trackselection.InterfaceC3970c;
/* loaded from: classes.dex */
public final class xm1 {

    /* renamed from: a */
    public final int f32791a;

    /* renamed from: b */
    public final c41[] f32792b;

    /* renamed from: c */
    public final um1 f32793c;

    /* renamed from: d */
    public final Object f32794d;

    public xm1(c41[] c41VarArr, InterfaceC3970c[] interfaceC3970cArr, Object obj) {
        this.f32792b = c41VarArr;
        this.f32793c = new um1(interfaceC3970cArr);
        this.f32794d = obj;
        this.f32791a = c41VarArr.length;
    }

    /* renamed from: a */
    public boolean m5006a(xm1 xm1Var) {
        if (xm1Var == null || xm1Var.f32793c.f29184a != this.f32793c.f29184a) {
            return false;
        }
        for (int i = 0; i < this.f32793c.f29184a; i++) {
            if (!m5005b(xm1Var, i)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public boolean m5005b(xm1 xm1Var, int i) {
        return xm1Var != null && sq1.m10016b(this.f32792b[i], xm1Var.f32792b[i]) && sq1.m10016b(this.f32793c.m8019a(i), xm1Var.f32793c.m8019a(i));
    }

    /* renamed from: c */
    public boolean m5004c(int i) {
        return this.f32792b[i] != null;
    }
}
