package com.daaw;
/* loaded from: classes.dex */
public final class ao2 extends no2 {
    public static volatile String i;
    public static final Object j = new Object();

    public ao2(wm2 wm2Var, String str, String str2, hi2 hi2Var, int i2, int i3) {
        super(wm2Var, "azGRTaieBebLUCBtXxWiGC8ntdSjezuXnKrD7NOMrfVnrrLI+ziOvss+bqlk4xLN", "0tQXY1xo2ukrM9W+s0u6j2Mh+vSCsclEF17Hl/ROszM=", hi2Var, i2, 1);
    }

    @Override // com.daaw.no2
    public final void a() {
        this.e.t("E");
        if (i == null) {
            synchronized (j) {
                if (i == null) {
                    i = (String) this.f.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.e) {
            this.e.t(i);
        }
    }
}
