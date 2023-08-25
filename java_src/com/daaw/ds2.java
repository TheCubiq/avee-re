package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.client.zzfc;
/* loaded from: classes.dex */
public final class ds2 extends ku2 {

    /* renamed from: b */
    public final /* synthetic */ Context f7699b;

    /* renamed from: c */
    public final /* synthetic */ String f7700c;

    /* renamed from: d */
    public final /* synthetic */ an3 f7701d;

    /* renamed from: e */
    public final /* synthetic */ zzaw f7702e;

    public ds2(zzaw zzawVar, Context context, String str, an3 an3Var) {
        this.f7702e = zzawVar;
        this.f7699b = context;
        this.f7700c = str;
        this.f7701d = an3Var;
    }

    @Override // com.daaw.ku2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo3435a() {
        zzaw.m1429i(this.f7699b, "rewarded");
        return new zzfc();
    }

    @Override // com.daaw.ku2
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo3434b(zzce zzceVar) {
        return zzceVar.zzo(nt0.m14830g3(this.f7699b), this.f7700c, this.f7701d, 224400000);
    }

    @Override // com.daaw.ku2
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo3433c() {
        return iw3.m19306a(this.f7699b, this.f7700c, this.f7701d);
    }
}
