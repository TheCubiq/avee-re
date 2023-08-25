package com.daaw;
/* loaded from: classes.dex */
public final class wn2 extends no2 {
    public static volatile Long i;
    public static final Object j = new Object();

    public wn2(wm2 wm2Var, String str, String str2, hi2 hi2Var, int i2, int i3) {
        super(wm2Var, "BL1uRQDu2iGGdqxtPT0UZ/lh1a1ebdj6ce5dHzXL9Xdh/V7EjoG/mOlN+ePhmCVj", "VbWvt5u3iV1e6mTKIEv50y8+Z2ekDgVJovyXyxeSHYc=", hi2Var, i2, 22);
    }

    @Override // com.daaw.no2
    public final void a() {
        if (i == null) {
            synchronized (j) {
                if (i == null) {
                    i = (Long) this.f.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.e) {
            this.e.w0(i.longValue());
        }
    }
}
