package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.daaw.p04;
/* loaded from: classes.dex */
public final class zzby extends zzb {

    /* renamed from: c */
    public final p04 f36284c;

    /* renamed from: d */
    public final String f36285d;

    public zzby(Context context, String str, String str2) {
        this.f36284c = new p04(com.google.android.gms.ads.internal.zzt.zzp().zzc(context, str));
        this.f36285d = str2;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        this.f36284c.zza(this.f36285d);
    }
}
