package com.daaw;

import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzs;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class dz5 implements ct4 {
    public final AtomicReference p = new AtomicReference();

    public final void a(zzdg zzdgVar) {
        this.p.set(zzdgVar);
    }

    @Override // com.daaw.ct4
    public final void f(final zzs zzsVar) {
        ne6.a(this.p, new me6() { // from class: com.daaw.cz5
            @Override // com.daaw.me6
            public final void zza(Object obj) {
                ((zzdg) obj).zze(zzs.this);
            }
        });
    }
}
