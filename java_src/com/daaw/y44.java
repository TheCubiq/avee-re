package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzb;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class y44 extends zzb {
    public final y24 c;
    public final j54 d;
    public final String e;
    public final String[] f;

    public y44(y24 y24Var, j54 j54Var, String str, String[] strArr) {
        this.c = y24Var;
        this.d = j54Var;
        this.e = str;
        this.f = strArr;
        zzt.zzy().e(this);
    }

    public final /* synthetic */ Boolean b() {
        return Boolean.valueOf(this.d.u(this.e, this.f, this));
    }

    public final String c() {
        return this.e;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        try {
            this.d.t(this.e, this.f);
        } finally {
            zzs.zza.post(new x44(this));
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final f77 zzb() {
        return (((Boolean) zzba.zzc().b(g93.M1)).booleanValue() && (this.d instanceof s54)) ? z04.e.M(new Callable() { // from class: com.daaw.w44
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return y44.this.b();
            }
        }) : super.zzb();
    }
}
