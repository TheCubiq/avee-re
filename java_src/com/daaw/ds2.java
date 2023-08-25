package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.client.zzfc;
/* loaded from: classes.dex */
public final class ds2 extends ku2 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ an3 d;
    public final /* synthetic */ zzaw e;

    public ds2(zzaw zzawVar, Context context, String str, an3 an3Var) {
        this.e = zzawVar;
        this.b = context;
        this.c = str;
        this.d = an3Var;
    }

    @Override // com.daaw.ku2
    public final /* bridge */ /* synthetic */ Object a() {
        zzaw.i(this.b, "rewarded");
        return new zzfc();
    }

    @Override // com.daaw.ku2
    public final /* bridge */ /* synthetic */ Object b(zzce zzceVar) {
        return zzceVar.zzo(nt0.g3(this.b), this.c, this.d, 224400000);
    }

    @Override // com.daaw.ku2
    public final /* bridge */ /* synthetic */ Object c() {
        return iw3.a(this.b, this.c, this.d);
    }
}
