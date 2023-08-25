package com.daaw;

import android.content.Context;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class lv6 extends iv6 {
    @GuardedBy("PaidV2LifecycleImpl.class")
    public static lv6 h;

    public lv6(Context context) {
        super(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
    }

    public static final lv6 j(Context context) {
        lv6 lv6Var;
        synchronized (lv6.class) {
            if (h == null) {
                h = new lv6(context);
            }
            lv6Var = h;
        }
        return lv6Var;
    }

    public final hv6 i(long j, boolean z) {
        synchronized (lv6.class) {
            if (p()) {
                return b(null, null, j, z);
            }
            return new hv6();
        }
    }

    public final void k() {
        synchronized (lv6.class) {
            if (g(false)) {
                f(false);
            }
        }
    }

    public final void l() {
        this.f.e("paidv2_publisher_option");
    }

    public final void m() {
        this.f.e("paidv2_user_option");
    }

    public final void n(boolean z) {
        this.f.d("paidv2_user_option", Boolean.valueOf(z));
    }

    public final void o(boolean z) {
        this.f.d("paidv2_publisher_option", Boolean.valueOf(z));
        if (z) {
            return;
        }
        k();
    }

    public final boolean p() {
        return this.f.f("paidv2_publisher_option", true);
    }

    public final boolean q() {
        return this.f.f("paidv2_user_option", true);
    }
}
