package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.client.zzew;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.client.zzq;
/* loaded from: classes.dex */
public final class mg2 extends ku2 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ zzq c;
    public final /* synthetic */ String d;
    public final /* synthetic */ zzaw e;

    public mg2(zzaw zzawVar, Context context, zzq zzqVar, String str) {
        this.e = zzawVar;
        this.b = context;
        this.c = zzqVar;
        this.d = str;
    }

    @Override // com.daaw.ku2
    public final /* bridge */ /* synthetic */ Object a() {
        zzaw.i(this.b, "search");
        return new zzew();
    }

    @Override // com.daaw.ku2
    public final /* bridge */ /* synthetic */ Object b(zzce zzceVar) {
        return zzceVar.zzf(nt0.g3(this.b), this.c, this.d, 224400000);
    }

    @Override // com.daaw.ku2
    public final /* bridge */ /* synthetic */ Object c() {
        zzk zzkVar;
        zzkVar = this.e.a;
        return zzkVar.zza(this.b, this.c, this.d, null, 3);
    }
}
