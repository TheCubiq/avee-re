package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.client.zzew;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.client.zzq;
/* loaded from: classes.dex */
public final class lf2 extends ku2 {

    /* renamed from: b */
    public final /* synthetic */ Context f17366b;

    /* renamed from: c */
    public final /* synthetic */ zzq f17367c;

    /* renamed from: d */
    public final /* synthetic */ String f17368d;

    /* renamed from: e */
    public final /* synthetic */ an3 f17369e;

    /* renamed from: f */
    public final /* synthetic */ zzaw f17370f;

    public lf2(zzaw zzawVar, Context context, zzq zzqVar, String str, an3 an3Var) {
        this.f17370f = zzawVar;
        this.f17366b = context;
        this.f17367c = zzqVar;
        this.f17368d = str;
        this.f17369e = an3Var;
    }

    @Override // com.daaw.ku2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo3435a() {
        zzaw.m1429i(this.f17366b, "app_open");
        return new zzew();
    }

    @Override // com.daaw.ku2
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo3434b(zzce zzceVar) {
        return zzceVar.zzc(nt0.m14830g3(this.f17366b), this.f17367c, this.f17368d, this.f17369e, 224400000);
    }

    @Override // com.daaw.ku2
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo3433c() {
        zzk zzkVar;
        zzkVar = this.f17370f.f36086a;
        return zzkVar.zza(this.f17366b, this.f17367c, this.f17368d, this.f17369e, 4);
    }
}
