package com.daaw;

import android.content.Context;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class lv6 extends iv6 {
    @GuardedBy("PaidV2LifecycleImpl.class")

    /* renamed from: h */
    public static lv6 f17823h;

    public lv6(Context context) {
        super(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
    }

    /* renamed from: j */
    public static final lv6 m16482j(Context context) {
        lv6 lv6Var;
        synchronized (lv6.class) {
            if (f17823h == null) {
                f17823h = new lv6(context);
            }
            lv6Var = f17823h;
        }
        return lv6Var;
    }

    /* renamed from: i */
    public final hv6 m16483i(long j, boolean z) {
        synchronized (lv6.class) {
            if (m16476p()) {
                return m19324b(null, null, j, z);
            }
            return new hv6();
        }
    }

    /* renamed from: k */
    public final void m16481k() {
        synchronized (lv6.class) {
            if (m19319g(false)) {
                m19320f(false);
            }
        }
    }

    /* renamed from: l */
    public final void m16480l() {
        this.f14060f.m18215e("paidv2_publisher_option");
    }

    /* renamed from: m */
    public final void m16479m() {
        this.f14060f.m18215e("paidv2_user_option");
    }

    /* renamed from: n */
    public final void m16478n(boolean z) {
        this.f14060f.m18216d("paidv2_user_option", Boolean.valueOf(z));
    }

    /* renamed from: o */
    public final void m16477o(boolean z) {
        this.f14060f.m18216d("paidv2_publisher_option", Boolean.valueOf(z));
        if (z) {
            return;
        }
        m16481k();
    }

    /* renamed from: p */
    public final boolean m16476p() {
        return this.f14060f.m18214f("paidv2_publisher_option", true);
    }

    /* renamed from: q */
    public final boolean m16475q() {
        return this.f14060f.m18214f("paidv2_user_option", true);
    }
}
