package com.daaw;
/* loaded from: classes.dex */
public final class qn2 extends no2 {
    public static volatile Long i;
    public static final Object j = new Object();

    public qn2(wm2 wm2Var, String str, String str2, hi2 hi2Var, int i2, int i3) {
        super(wm2Var, "9MUQl4bkTrG/hbkOaiPEQeZR+Q1g5nerIUIYlLLAX+szyWBOaKlwxYudXHeApTjq", "w0yuMX287JAuExKzMpRTJqrOhPVTMBo6RInylnboEYs=", hi2Var, i2, 44);
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
            this.e.m0(i.longValue());
        }
    }
}
