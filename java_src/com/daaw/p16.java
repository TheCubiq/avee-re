package com.daaw;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.internal.ads.zzchu;
/* loaded from: classes.dex */
public final class p16 implements h76 {

    /* renamed from: a */
    public final zzw f22201a;

    /* renamed from: b */
    public final zzchu f22202b;

    /* renamed from: c */
    public final boolean f22203c;

    public p16(zzw zzwVar, zzchu zzchuVar, boolean z) {
        this.f22201a = zzwVar;
        this.f22202b = zzchuVar;
        this.f22203c = z;
    }

    @Override // com.daaw.h76
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo2851b(Object obj) {
        String str;
        Bundle bundle = (Bundle) obj;
        if (this.f22202b.f36995r >= ((Integer) zzba.zzc().m23658b(g93.f10446I4)).intValue()) {
            bundle.putString("app_open_version", "2");
        }
        if (((Boolean) zzba.zzc().m23658b(g93.f10456J4)).booleanValue()) {
            bundle.putBoolean("app_switched", this.f22203c);
        }
        zzw zzwVar = this.f22201a;
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
