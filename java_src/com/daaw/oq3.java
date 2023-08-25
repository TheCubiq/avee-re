package com.daaw;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes2.dex */
public final class oq3 extends lw3 {
    public final AtomicReference p = new AtomicReference();
    public boolean q;

    public static final Object h3(Bundle bundle, Class cls) {
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

    public final Bundle I(long j) {
        Bundle bundle;
        synchronized (this.p) {
            if (!this.q) {
                try {
                    this.p.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.p.get();
        }
        return bundle;
    }

    public final Long M(long j) {
        return (Long) h3(I(j), Long.class);
    }

    @Override // com.daaw.ox3
    public final void T0(Bundle bundle) {
        synchronized (this.p) {
            this.p.set(bundle);
            this.q = true;
            this.p.notify();
        }
    }

    public final String g3(long j) {
        return (String) h3(I(j), String.class);
    }
}
