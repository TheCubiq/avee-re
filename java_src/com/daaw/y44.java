package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzb;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class y44 extends zzb {

    /* renamed from: c */
    public final y24 f33350c;

    /* renamed from: d */
    public final j54 f33351d;

    /* renamed from: e */
    public final String f33352e;

    /* renamed from: f */
    public final String[] f33353f;

    public y44(y24 y24Var, j54 j54Var, String str, String[] strArr) {
        this.f33350c = y24Var;
        this.f33351d = j54Var;
        this.f33352e = str;
        this.f33353f = strArr;
        zzt.zzy().m2819e(this);
    }

    /* renamed from: b */
    public final /* synthetic */ Boolean m4127b() {
        return Boolean.valueOf(this.f33351d.mo10696u(this.f33352e, this.f33353f, this));
    }

    /* renamed from: c */
    public final String m4126c() {
        return this.f33352e;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        try {
            this.f33351d.mo10697t(this.f33352e, this.f33353f);
        } finally {
            zzs.zza.post(new x44(this));
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final f77 zzb() {
        return (((Boolean) zzba.zzc().m23658b(g93.f10483M1)).booleanValue() && (this.f33351d instanceof s54)) ? z04.f34309e.mo20112M(new Callable() { // from class: com.daaw.w44
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return y44.this.m4127b();
            }
        }) : super.zzb();
    }
}
