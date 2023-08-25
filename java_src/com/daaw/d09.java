package com.daaw;

import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class d09 {
    public final c09 a;
    public final AtomicBoolean b = new AtomicBoolean(false);

    public d09(c09 c09Var) {
        this.a = c09Var;
    }

    public final j09 a(Object... objArr) {
        Constructor zza;
        synchronized (this.b) {
            if (!this.b.get()) {
                try {
                    zza = this.a.zza();
                } catch (ClassNotFoundException unused) {
                    this.b.set(true);
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
            zza = null;
        }
        if (zza == null) {
            return null;
        }
        try {
            return (j09) zza.newInstance(objArr);
        } catch (Exception e2) {
            throw new IllegalStateException("Unexpected error creating extractor", e2);
        }
    }
}
