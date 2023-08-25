package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzb;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzchu;
/* loaded from: classes.dex */
public final class mz3 extends zzb {
    public final /* synthetic */ qz3 c;

    public mz3(qz3 qz3Var) {
        this.c = qz3Var;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        Context context;
        zzchu zzchuVar;
        Object obj;
        l93 l93Var;
        qz3 qz3Var = this.c;
        context = qz3Var.e;
        zzchuVar = qz3Var.f;
        j93 j93Var = new j93(context, zzchuVar.p);
        obj = this.c.a;
        synchronized (obj) {
            try {
                zzt.zze();
                l93Var = this.c.h;
                m93.a(l93Var, j93Var);
            } catch (IllegalArgumentException e) {
                k04.zzk("Cannot config CSI reporter.", e);
            }
        }
    }
}
