package com.daaw;

import android.content.Context;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class kv6 extends iv6 {
    @GuardedBy("PaidV1LifecycleImpl.class")
    public static kv6 h;

    public kv6(Context context) {
        super(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
    }

    public static final kv6 k(Context context) {
        kv6 kv6Var;
        synchronized (kv6.class) {
            if (h == null) {
                h = new kv6(context);
            }
            kv6Var = h;
        }
        return kv6Var;
    }

    public final hv6 i(long j, boolean z) {
        hv6 b;
        synchronized (kv6.class) {
            b = b(null, null, j, z);
        }
        return b;
    }

    public final hv6 j(String str, String str2, long j, boolean z) {
        hv6 b;
        synchronized (kv6.class) {
            b = b(str, str2, j, z);
        }
        return b;
    }

    public final void l() {
        synchronized (kv6.class) {
            f(false);
        }
    }

    public final void m() {
        synchronized (kv6.class) {
            f(true);
        }
    }
}
