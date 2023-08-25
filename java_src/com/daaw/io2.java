package com.daaw;
/* loaded from: classes.dex */
public final class io2 extends no2 {
    public static volatile Long i;
    public static final Object j = new Object();

    public io2(wm2 wm2Var, String str, String str2, hi2 hi2Var, int i2, int i3) {
        super(wm2Var, "EggzVxU0lX/1UlHAeEGUyUm45SOmio09y9T4hm0PM9xyGW0Fa8XV6zB35QkAF1yq", "13swnHoz78V4UQSpBM2KHvpNNnXpuWx8GAjTYu5TVQw=", hi2Var, i2, 33);
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
            this.e.N(i.longValue());
        }
    }
}
