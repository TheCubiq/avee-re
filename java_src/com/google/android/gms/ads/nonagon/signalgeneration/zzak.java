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

    /* renamed from: a */
    public final m08 f36520a;

    /* renamed from: b */
    public final m08 f36521b;

    /* renamed from: c */
    public final m08 f36522c;

    public zzak(m08 m08Var, m08 m08Var2, m08 m08Var3) {
        this.f36520a = m08Var;
        this.f36521b = m08Var2;
        this.f36522c = m08Var3;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        return ((en6) this.f36520a.zzb()).m5975b(ym6.GENERATE_SIGNALS, ((pp4) this.f36522c).zzb().m14101c()).m7032f(((zzan) this.f36521b).zzb()).m7029i(((Integer) zzba.zzc().m23658b(g93.f10586W4)).intValue(), TimeUnit.SECONDS).m7037a();
    }
}
