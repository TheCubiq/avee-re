package com.daaw;
/* loaded from: classes.dex */
public abstract class mq2 {

    /* renamed from: a */
    public static final mq2 f19069a = new jq2();

    /* renamed from: a */
    public abstract int mo15854a(Object obj);

    /* renamed from: b */
    public abstract int mo15853b();

    /* renamed from: c */
    public abstract int mo15852c();

    /* renamed from: d */
    public abstract kq2 mo15851d(int i, kq2 kq2Var, boolean z);

    /* renamed from: e */
    public abstract lq2 mo15850e(int i, lq2 lq2Var, boolean z, long j);

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        if ((mo15852c() - 1) == 0) goto L17;
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m15849f(int i, kq2 kq2Var, lq2 lq2Var, int i2) {
        mo15851d(i, kq2Var, false);
        m15848g(0, lq2Var, false);
        int i3 = 1;
        if (i == 0) {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException();
                    }
                }
                i3 = 0;
            } else if (mo15852c() - 1 == 0) {
                i3 = -1;
            }
            if (i3 == -1) {
                return -1;
            }
            m15848g(i3, lq2Var, false);
            return 0;
        }
        return i + 1;
    }

    /* renamed from: g */
    public final lq2 m15848g(int i, lq2 lq2Var, boolean z) {
        return mo15850e(i, lq2Var, false, 0L);
    }

    /* renamed from: h */
    public final boolean m15847h() {
        return mo15852c() == 0;
    }
}
