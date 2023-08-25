package com.daaw;

import android.content.Context;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class kv6 extends iv6 {
    @GuardedBy("PaidV1LifecycleImpl.class")

    /* renamed from: h */
    public static kv6 f16779h;

    public kv6(Context context) {
        super(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
    }

    /* renamed from: k */
    public static final kv6 m17404k(Context context) {
        kv6 kv6Var;
        synchronized (kv6.class) {
            if (f16779h == null) {
                f16779h = new kv6(context);
            }
            kv6Var = f16779h;
        }
        return kv6Var;
    }

    /* renamed from: i */
    public final hv6 m17406i(long j, boolean z) {
        hv6 m19324b;
        synchronized (kv6.class) {
            m19324b = m19324b(null, null, j, z);
        }
        return m19324b;
    }

    /* renamed from: j */
    public final hv6 m17405j(String str, String str2, long j, boolean z) {
        hv6 m19324b;
        synchronized (kv6.class) {
            m19324b = m19324b(str, str2, j, z);
        }
        return m19324b;
    }

    /* renamed from: l */
    public final void m17403l() {
        synchronized (kv6.class) {
            m19320f(false);
        }
    }

    /* renamed from: m */
    public final void m17402m() {
        synchronized (kv6.class) {
            m19320f(true);
        }
    }
}
