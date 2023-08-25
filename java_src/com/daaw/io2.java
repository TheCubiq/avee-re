package com.daaw;
/* loaded from: classes.dex */
public final class io2 extends no2 {

    /* renamed from: i */
    public static volatile Long f13881i;

    /* renamed from: j */
    public static final Object f13882j = new Object();

    public io2(wm2 wm2Var, String str, String str2, hi2 hi2Var, int i, int i2) {
        super(wm2Var, "EggzVxU0lX/1UlHAeEGUyUm45SOmio09y9T4hm0PM9xyGW0Fa8XV6zB35QkAF1yq", "13swnHoz78V4UQSpBM2KHvpNNnXpuWx8GAjTYu5TVQw=", hi2Var, i, 33);
    }

    @Override // com.daaw.no2
    /* renamed from: a */
    public final void mo2099a() {
        if (f13881i == null) {
            synchronized (f13882j) {
                if (f13881i == null) {
                    f13881i = (Long) this.f20529f.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f20528e) {
            this.f20528e.m20778N(f13881i.longValue());
        }
    }
}
