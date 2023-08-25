package com.daaw;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes2.dex */
public final class oq3 extends lw3 {

    /* renamed from: p */
    public final AtomicReference f21828p = new AtomicReference();

    /* renamed from: q */
    public boolean f21829q;

    /* renamed from: h3 */
    public static final Object m14070h3(Bundle bundle, Class cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e) {
            String.format("Unexpected object type. Expected, Received: %s, %s", cls.getCanonicalName(), obj.getClass().getCanonicalName());
            throw e;
        }
    }

    /* renamed from: I */
    public final Bundle m14073I(long j) {
        Bundle bundle;
        synchronized (this.f21828p) {
            if (!this.f21829q) {
                try {
                    this.f21828p.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f21828p.get();
        }
        return bundle;
    }

    /* renamed from: M */
    public final Long m14072M(long j) {
        return (Long) m14070h3(m14073I(j), Long.class);
    }

    @Override // com.daaw.ox3
    /* renamed from: T0 */
    public final void mo13884T0(Bundle bundle) {
        synchronized (this.f21828p) {
            this.f21828p.set(bundle);
            this.f21829q = true;
            this.f21828p.notify();
        }
    }

    /* renamed from: g3 */
    public final String m14071g3(long j) {
        return (String) m14070h3(m14073I(j), String.class);
    }
}
