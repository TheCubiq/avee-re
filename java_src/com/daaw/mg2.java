package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.client.zzew;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.client.zzq;
/* loaded from: classes.dex */
public final class mg2 extends ku2 {

    /* renamed from: b */
    public final /* synthetic */ Context f18856b;

    /* renamed from: c */
    public final /* synthetic */ zzq f18857c;

    /* renamed from: d */
    public final /* synthetic */ String f18858d;

    /* renamed from: e */
    public final /* synthetic */ zzaw f18859e;

    public mg2(zzaw zzawVar, Context context, zzq zzqVar, String str) {
        this.f18859e = zzawVar;
        this.f18856b = context;
        this.f18857c = zzqVar;
        this.f18858d = str;
    }

    @Override // com.daaw.ku2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo3435a() {
        zzaw.m1429i(this.f18856b, "search");
        return new zzew();
    }

    @Override // com.daaw.ku2
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo3434b(zzce zzceVar) {
        return zzceVar.zzf(nt0.m14830g3(this.f18856b), this.f18857c, this.f18858d, 224400000);
    }

    @Override // com.daaw.ku2
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo3433c() {
        zzk zzkVar;
        zzkVar = this.f18859e.f36086a;
        return zzkVar.zza(this.f18856b, this.f18857c, this.f18858d, null, 3);
    }
}
