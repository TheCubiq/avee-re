package com.daaw;
/* loaded from: classes.dex */
public final class wn2 extends no2 {

    /* renamed from: i */
    public static volatile Long f31390i;

    /* renamed from: j */
    public static final Object f31391j = new Object();

    public wn2(wm2 wm2Var, String str, String str2, hi2 hi2Var, int i, int i2) {
        super(wm2Var, "BL1uRQDu2iGGdqxtPT0UZ/lh1a1ebdj6ce5dHzXL9Xdh/V7EjoG/mOlN+ePhmCVj", "VbWvt5u3iV1e6mTKIEv50y8+Z2ekDgVJovyXyxeSHYc=", hi2Var, i, 22);
    }

    @Override // com.daaw.no2
    /* renamed from: a */
    public final void mo2099a() {
        if (f31390i == null) {
            synchronized (f31391j) {
                if (f31390i == null) {
                    f31390i = (Long) this.f20529f.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f20528e) {
            this.f20528e.m20738w0(f31390i.longValue());
        }
    }
}
