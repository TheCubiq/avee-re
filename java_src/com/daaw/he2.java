package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.client.zzew;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.client.zzq;
/* loaded from: classes.dex */
public final class he2 extends ku2 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ zzq c;
    public final /* synthetic */ String d;
    public final /* synthetic */ an3 e;
    public final /* synthetic */ zzaw f;

    public he2(zzaw zzawVar, Context context, zzq zzqVar, String str, an3 an3Var) {
        this.f = zzawVar;
        this.b = context;
        this.c = zzqVar;
        this.d = str;
        this.e = an3Var;
    }

    @Override // com.daaw.ku2
    public final /* bridge */ /* synthetic */ Object a() {
        zzaw.i(this.b, "banner");
        return new zzew();
    }

    @Override // com.daaw.ku2
    public final /* bridge */ /* synthetic */ Object b(zzce zzceVar) {
        return zzceVar.zzd(nt0.g3(this.b), this.c, this.d, this.e, 224400000);
    }

    @Override // com.daaw.ku2
    public final /* bridge */ /* synthetic */ Object c() {
        zzk zzkVar;
        zzkVar = this.f.a;
        return zzkVar.zza(this.b, this.c, this.d, this.e, 1);
    }
}
