package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzb;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzchu;
/* loaded from: classes.dex */
public final class mz3 extends zzb {

    /* renamed from: c */
    public final /* synthetic */ qz3 f19306c;

    public mz3(qz3 qz3Var) {
        this.f19306c = qz3Var;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        Context context;
        zzchu zzchuVar;
        Object obj;
        l93 l93Var;
        qz3 qz3Var = this.f19306c;
        context = qz3Var.f24663e;
        zzchuVar = qz3Var.f24664f;
        j93 j93Var = new j93(context, zzchuVar.f36993p);
        obj = this.f19306c.f24659a;
        synchronized (obj) {
            try {
                zzt.zze();
                l93Var = this.f19306c.f24666h;
                m93.m16147a(l93Var, j93Var);
            } catch (IllegalArgumentException e) {
                k04.zzk("Cannot config CSI reporter.", e);
            }
        }
    }
}
