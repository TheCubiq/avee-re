package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class sh6 {

    /* renamed from: a */
    public final InterfaceC0623ag f26252a;

    /* renamed from: b */
    public final Object f26253b = new Object();
    @GuardedBy("lock")

    /* renamed from: d */
    public volatile int f26255d = 1;

    /* renamed from: c */
    public volatile long f26254c = 0;

    public sh6(InterfaceC0623ag interfaceC0623ag) {
        this.f26252a = interfaceC0623ag;
    }

    /* renamed from: a */
    public final void m10342a() {
        m10337f(2, 3);
    }

    /* renamed from: b */
    public final void m10341b(boolean z) {
        if (z) {
            m10337f(1, 2);
        } else {
            m10337f(2, 1);
        }
    }

    /* renamed from: c */
    public final boolean m10340c() {
        boolean z;
        synchronized (this.f26253b) {
            m10338e();
            z = this.f26255d == 3;
        }
        return z;
    }

    /* renamed from: d */
    public final boolean m10339d() {
        boolean z;
        synchronized (this.f26253b) {
            m10338e();
            z = this.f26255d == 2;
        }
        return z;
    }

    /* renamed from: e */
    public final void m10338e() {
        long mo15860a = this.f26252a.mo15860a();
        synchronized (this.f26253b) {
            if (this.f26255d == 3) {
                if (this.f26254c + ((Long) zzba.zzc().m23658b(g93.f10825s5)).longValue() <= mo15860a) {
                    this.f26255d = 1;
                }
            }
        }
    }

    /* renamed from: f */
    public final void m10337f(int i, int i2) {
        m10338e();
        long mo15860a = this.f26252a.mo15860a();
        synchronized (this.f26253b) {
            if (this.f26255d != i) {
                return;
            }
            this.f26255d = i2;
            if (this.f26255d == 3) {
                this.f26254c = mo15860a;
            }
        }
    }
}
