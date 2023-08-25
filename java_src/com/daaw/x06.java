package com.daaw;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class x06 implements h76 {

    /* renamed from: a */
    public final zzq f31716a;

    /* renamed from: b */
    public final String f31717b;

    /* renamed from: c */
    public final boolean f31718c;

    /* renamed from: d */
    public final String f31719d;

    /* renamed from: e */
    public final float f31720e;

    /* renamed from: f */
    public final int f31721f;

    /* renamed from: g */
    public final int f31722g;

    /* renamed from: h */
    public final String f31723h;

    /* renamed from: i */
    public final boolean f31724i;

    public x06(zzq zzqVar, String str, boolean z, String str2, float f, int i, int i2, String str3, boolean z2) {
        ry0.m10829k(zzqVar, "the adSize must not be null");
        this.f31716a = zzqVar;
        this.f31717b = str;
        this.f31718c = z;
        this.f31719d = str2;
        this.f31720e = f;
        this.f31721f = i;
        this.f31722g = i2;
        this.f31723h = str3;
        this.f31724i = z2;
    }

    @Override // com.daaw.h76
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo2851b(Object obj) {
        String str;
        Bundle bundle = (Bundle) obj;
        cj6.m25313f(bundle, "smart_w", "full", this.f31716a.zze == -1);
        cj6.m25313f(bundle, "smart_h", "auto", this.f31716a.zzb == -2);
        cj6.m25312g(bundle, "ene", true, this.f31716a.zzj);
        cj6.m25313f(bundle, "rafmt", "102", this.f31716a.zzm);
        cj6.m25313f(bundle, "rafmt", "103", this.f31716a.zzn);
        cj6.m25313f(bundle, "rafmt", "105", this.f31716a.zzo);
        cj6.m25312g(bundle, "inline_adaptive_slot", true, this.f31724i);
        cj6.m25312g(bundle, "interscroller_slot", true, this.f31716a.zzo);
        cj6.m25316c(bundle, "format", this.f31717b);
        cj6.m25313f(bundle, "fluid", "height", this.f31718c);
        cj6.m25313f(bundle, "sz", this.f31719d, !TextUtils.isEmpty(str));
        bundle.putFloat("u_sd", this.f31720e);
        bundle.putInt("sw", this.f31721f);
        bundle.putInt("sh", this.f31722g);
        String str2 = this.f31723h;
        cj6.m25313f(bundle, "sc", str2, true ^ TextUtils.isEmpty(str2));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        zzq[] zzqVarArr = this.f31716a.zzg;
        if (zzqVarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", this.f31716a.zzb);
            bundle2.putInt("width", this.f31716a.zze);
            bundle2.putBoolean("is_fluid_height", this.f31716a.zzi);
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
