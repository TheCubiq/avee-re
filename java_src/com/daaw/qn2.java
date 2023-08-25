package com.daaw;
/* loaded from: classes.dex */
public final class qn2 extends no2 {

    /* renamed from: i */
    public static volatile Long f24201i;

    /* renamed from: j */
    public static final Object f24202j = new Object();

    public qn2(wm2 wm2Var, String str, String str2, hi2 hi2Var, int i, int i2) {
        super(wm2Var, "9MUQl4bkTrG/hbkOaiPEQeZR+Q1g5nerIUIYlLLAX+szyWBOaKlwxYudXHeApTjq", "w0yuMX287JAuExKzMpRTJqrOhPVTMBo6RInylnboEYs=", hi2Var, i, 44);
    }

    @Override // com.daaw.no2
    /* renamed from: a */
    public final void mo2099a() {
        if (f24201i == null) {
            synchronized (f24202j) {
                if (f24201i == null) {
                    f24201i = (Long) this.f20529f.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f20528e) {
            this.f20528e.m20753m0(f24201i.longValue());
        }
    }
}
