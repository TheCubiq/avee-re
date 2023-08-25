package com.daaw;

import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class d09 {

    /* renamed from: a */
    public final c09 f6356a;

    /* renamed from: b */
    public final AtomicBoolean f6357b = new AtomicBoolean(false);

    public d09(c09 c09Var) {
        this.f6356a = c09Var;
    }

    /* renamed from: a */
    public final j09 m24801a(Object... objArr) {
        Constructor zza;
        synchronized (this.f6357b) {
            if (!this.f6357b.get()) {
                try {
                    zza = this.f6356a.zza();
                } catch (ClassNotFoundException unused) {
                    this.f6357b.set(true);
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
