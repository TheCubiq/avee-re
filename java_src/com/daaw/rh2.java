package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.client.zzew;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.client.zzq;
/* loaded from: classes.dex */
public final class rh2 extends ku2 {

    /* renamed from: b */
    public final /* synthetic */ Context f25283b;

    /* renamed from: c */
    public final /* synthetic */ zzq f25284c;

    /* renamed from: d */
    public final /* synthetic */ String f25285d;

    /* renamed from: e */
    public final /* synthetic */ an3 f25286e;

    /* renamed from: f */
    public final /* synthetic */ zzaw f25287f;

    public rh2(zzaw zzawVar, Context context, zzq zzqVar, String str, an3 an3Var) {
        this.f25287f = zzawVar;
        this.f25283b = context;
        this.f25284c = zzqVar;
        this.f25285d = str;
        this.f25286e = an3Var;
    }

    @Override // com.daaw.ku2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo3435a() {
        zzaw.m1429i(this.f25283b, "interstitial");
        return new zzew();
    }

    @Override // com.daaw.ku2
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo3434b(zzce zzceVar) {
        return zzceVar.zze(nt0.m14830g3(this.f25283b), this.f25284c, this.f25285d, this.f25286e, 224400000);
    }

    @Override // com.daaw.ku2
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo3433c() {
        zzk zzkVar;
        zzkVar = this.f25287f.f36086a;
        return zzkVar.zza(this.f25283b, this.f25284c, this.f25285d, this.f25286e, 2);
    }
}
