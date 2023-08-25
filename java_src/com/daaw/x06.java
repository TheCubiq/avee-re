package com.daaw;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class x06 implements h76 {
    public final zzq a;
    public final String b;
    public final boolean c;
    public final String d;
    public final float e;
    public final int f;
    public final int g;
    public final String h;
    public final boolean i;

    public x06(zzq zzqVar, String str, boolean z, String str2, float f, int i, int i2, String str3, boolean z2) {
        ry0.k(zzqVar, "the adSize must not be null");
        this.a = zzqVar;
        this.b = str;
        this.c = z;
        this.d = str2;
        this.e = f;
        this.f = i;
        this.g = i2;
        this.h = str3;
        this.i = z2;
    }

    @Override // com.daaw.h76
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        String str;
        Bundle bundle = (Bundle) obj;
        cj6.f(bundle, "smart_w", "full", this.a.zze == -1);
        cj6.f(bundle, "smart_h", "auto", this.a.zzb == -2);
        cj6.g(bundle, "ene", true, this.a.zzj);
        cj6.f(bundle, "rafmt", "102", this.a.zzm);
        cj6.f(bundle, "rafmt", "103", this.a.zzn);
        cj6.f(bundle, "rafmt", "105", this.a.zzo);
        cj6.g(bundle, "inline_adaptive_slot", true, this.i);
        cj6.g(bundle, "interscroller_slot", true, this.a.zzo);
        cj6.c(bundle, "format", this.b);
        cj6.f(bundle, "fluid", "height", this.c);
        cj6.f(bundle, "sz", this.d, !TextUtils.isEmpty(str));
        bundle.putFloat("u_sd", this.e);
        bundle.putInt("sw", this.f);
        bundle.putInt("sh", this.g);
        String str2 = this.h;
        cj6.f(bundle, "sc", str2, true ^ TextUtils.isEmpty(str2));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        zzq[] zzqVarArr = this.a.zzg;
        if (zzqVarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", this.a.zzb);
            bundle2.putInt("width", this.a.zze);
            bundle2.putBoolean("is_fluid_height", this.a.zzi);
            arrayList.add(bundle2);
        } else {
            for (zzq zzqVar : zzqVarArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", zzqVar.zzi);
                bundle3.putInt("height", zzqVar.zzb);
                bundle3.putInt("width", zzqVar.zze);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}
