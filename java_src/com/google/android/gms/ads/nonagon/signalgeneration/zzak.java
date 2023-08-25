package com.google.android.gms.ads.nonagon.signalgeneration;

import com.daaw.en6;
import com.daaw.g93;
import com.daaw.m08;
import com.daaw.pp4;
import com.daaw.wz7;
import com.daaw.ym6;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class zzak implements wz7 {
    public final m08 a;
    public final m08 b;
    public final m08 c;

    public zzak(m08 m08Var, m08 m08Var2, m08 m08Var3) {
        this.a = m08Var;
        this.b = m08Var2;
        this.c = m08Var3;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        return ((en6) this.a.zzb()).b(ym6.GENERATE_SIGNALS, ((pp4) this.c).zzb().c()).f(((zzan) this.b).zzb()).i(((Integer) zzba.zzc().b(g93.W4)).intValue(), TimeUnit.SECONDS).a();
    }
}
