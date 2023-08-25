package com.daaw;

import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzs;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class dz5 implements ct4 {

    /* renamed from: p */
    public final AtomicReference f8003p = new AtomicReference();

    /* renamed from: a */
    public final void m23803a(zzdg zzdgVar) {
        this.f8003p.set(zzdgVar);
    }

    @Override // com.daaw.ct4
    /* renamed from: f */
    public final void mo9172f(final zzs zzsVar) {
        ne6.m15202a(this.f8003p, new me6() { // from class: com.daaw.cz5
            @Override // com.daaw.me6
            public final void zza(Object obj) {
                ((zzdg) obj).zze(zzs.this);
            }
        });
    }
}
