package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.daaw.p04;
/* loaded from: classes.dex */
public final class zzby extends zzb {
    public final p04 c;
    public final String d;

    public zzby(Context context, String str, String str2) {
        this.c = new p04(com.google.android.gms.ads.internal.zzt.zzp().zzc(context, str));
        this.d = str2;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        this.c.zza(this.d);
    }
}
