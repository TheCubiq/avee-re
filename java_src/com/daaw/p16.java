package com.daaw;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.internal.ads.zzchu;
/* loaded from: classes.dex */
public final class p16 implements h76 {
    public final zzw a;
    public final zzchu b;
    public final boolean c;

    public p16(zzw zzwVar, zzchu zzchuVar, boolean z) {
        this.a = zzwVar;
        this.b = zzchuVar;
        this.c = z;
    }

    @Override // com.daaw.h76
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        String str;
        Bundle bundle = (Bundle) obj;
        if (this.b.r >= ((Integer) zzba.zzc().b(g93.I4)).intValue()) {
            bundle.putString("app_open_version", "2");
        }
        if (((Boolean) zzba.zzc().b(g93.J4)).booleanValue()) {
            bundle.putBoolean("app_switched", this.c);
        }
        zzw zzwVar = this.a;
        if (zzwVar != null) {
            int i = zzwVar.zza;
            if (i == 1) {
                str = "p";
            } else if (i != 2) {
                return;
            } else {
                str = "l";
            }
            bundle.putString("avo", str);
        }
    }
}
