package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.client.zzew;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.client.zzq;
/* loaded from: classes.dex */
public final class he2 extends ku2 {

    /* renamed from: b */
    public final /* synthetic */ Context f12469b;

    /* renamed from: c */
    public final /* synthetic */ zzq f12470c;

    /* renamed from: d */
    public final /* synthetic */ String f12471d;

    /* renamed from: e */
    public final /* synthetic */ an3 f12472e;

    /* renamed from: f */
    public final /* synthetic */ zzaw f12473f;

    public he2(zzaw zzawVar, Context context, zzq zzqVar, String str, an3 an3Var) {
        this.f12473f = zzawVar;
        this.f12469b = context;
        this.f12470c = zzqVar;
        this.f12471d = str;
        this.f12472e = an3Var;
    }

    @Override // com.daaw.ku2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo3435a() {
        zzaw.m1429i(this.f12469b, "banner");
        return new zzew();
    }

    @Override // com.daaw.ku2
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo3434b(zzce zzceVar) {
        return zzceVar.zzd(nt0.m14830g3(this.f12469b), this.f12470c, this.f12471d, this.f12472e, 224400000);
    }

    @Override // com.daaw.ku2
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo3433c() {
        zzk zzkVar;
        zzkVar = this.f12473f.f36086a;
        return zzkVar.zza(this.f12469b, this.f12470c, this.f12471d, this.f12472e, 1);
    }
}
