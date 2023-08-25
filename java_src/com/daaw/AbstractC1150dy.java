package com.daaw;
/* renamed from: com.daaw.dy */
/* loaded from: classes2.dex */
public abstract class AbstractC1150dy extends AbstractC2557pl {

    /* renamed from: q */
    public long f7970q;

    /* renamed from: r */
    public boolean f7971r;

    /* renamed from: s */
    public C1507h6<AbstractC1219eu<?>> f7972s;

    /* renamed from: b0 */
    public static /* synthetic */ void m23820b0(AbstractC1150dy abstractC1150dy, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        abstractC1150dy.m23821a0(z);
    }

    /* renamed from: W */
    public final void m23824W(boolean z) {
        long m23823X = this.f7970q - m23823X(z);
        this.f7970q = m23823X;
        if (m23823X <= 0 && this.f7971r) {
            shutdown();
        }
    }

    /* renamed from: X */
    public final long m23823X(boolean z) {
        return z ? 4294967296L : 1L;
    }

    /* renamed from: Y */
    public final void m23822Y(AbstractC1219eu<?> abstractC1219eu) {
        C1507h6<AbstractC1219eu<?>> c1507h6 = this.f7972s;
        if (c1507h6 == null) {
            c1507h6 = new C1507h6<>();
            this.f7972s = c1507h6;
        }
        c1507h6.m21001a(abstractC1219eu);
    }

    /* renamed from: Z */
    public long mo23036Z() {
        C1507h6<AbstractC1219eu<?>> c1507h6 = this.f7972s;
        return (c1507h6 == null || c1507h6.m20999c()) ? Long.MAX_VALUE : 0L;
    }

    /* renamed from: a0 */
    public final void m23821a0(boolean z) {
        this.f7970q += m23823X(z);
        if (z) {
            return;
        }
        this.f7971r = true;
    }

    /* renamed from: c0 */
    public final boolean m23819c0() {
        return this.f7970q >= m23823X(true);
    }

    /* renamed from: d0 */
    public final boolean m23818d0() {
        C1507h6<AbstractC1219eu<?>> c1507h6 = this.f7972s;
        if (c1507h6 == null) {
            return true;
        }
        return c1507h6.m20999c();
    }

    /* renamed from: e0 */
    public final boolean m23817e0() {
        AbstractC1219eu<?> m20998d;
        C1507h6<AbstractC1219eu<?>> c1507h6 = this.f7972s;
        if (c1507h6 == null || (m20998d = c1507h6.m20998d()) == null) {
            return false;
        }
        m20998d.run();
        return true;
    }

    public void shutdown() {
    }
}
