package com.daaw;
/* loaded from: classes.dex */
public final class ao2 extends no2 {

    /* renamed from: i */
    public static volatile String f3343i;

    /* renamed from: j */
    public static final Object f3344j = new Object();

    public ao2(wm2 wm2Var, String str, String str2, hi2 hi2Var, int i, int i2) {
        super(wm2Var, "azGRTaieBebLUCBtXxWiGC8ntdSjezuXnKrD7NOMrfVnrrLI+ziOvss+bqlk4xLN", "0tQXY1xo2ukrM9W+s0u6j2Mh+vSCsclEF17Hl/ROszM=", hi2Var, i, 1);
    }

    @Override // com.daaw.no2
    /* renamed from: a */
    public final void mo2099a() {
        this.f20528e.m20745t("E");
        if (f3343i == null) {
            synchronized (f3344j) {
                if (f3343i == null) {
                    f3343i = (String) this.f20529f.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f20528e) {
            this.f20528e.m20745t(f3343i);
        }
    }
}
