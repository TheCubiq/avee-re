package com.daaw;
/* loaded from: classes2.dex */
public final class cl1 {

    /* renamed from: a */
    public static final cl1 f5936a = new cl1();

    /* renamed from: b */
    public static final ThreadLocal<AbstractC1150dy> f5937b = new ThreadLocal<>();

    /* renamed from: a */
    public final AbstractC1150dy m25251a() {
        ThreadLocal<AbstractC1150dy> threadLocal = f5937b;
        AbstractC1150dy abstractC1150dy = threadLocal.get();
        if (abstractC1150dy == null) {
            AbstractC1150dy m21140a = C1484gy.m21140a();
            threadLocal.set(m21140a);
            return m21140a;
        }
        return abstractC1150dy;
    }

    /* renamed from: b */
    public final void m25250b() {
        f5937b.set(null);
    }

    /* renamed from: c */
    public final void m25249c(AbstractC1150dy abstractC1150dy) {
        f5937b.set(abstractC1150dy);
    }
}
