package com.daaw;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
/* loaded from: classes.dex */
public final class k26 implements h76 {

    /* renamed from: a */
    public final int f15616a;

    /* renamed from: b */
    public final boolean f15617b;

    /* renamed from: c */
    public final boolean f15618c;

    /* renamed from: d */
    public final int f15619d;

    /* renamed from: e */
    public final int f15620e;

    /* renamed from: f */
    public final int f15621f;

    /* renamed from: g */
    public final int f15622g;

    /* renamed from: h */
    public final int f15623h;

    /* renamed from: i */
    public final float f15624i;

    /* renamed from: j */
    public final boolean f15625j;

    public k26(int i, boolean z, boolean z2, int i2, int i3, int i4, int i5, int i6, float f, boolean z3) {
        this.f15616a = i;
        this.f15617b = z;
        this.f15618c = z2;
        this.f15619d = i2;
        this.f15620e = i3;
        this.f15621f = i4;
        this.f15622g = i5;
        this.f15623h = i6;
        this.f15624i = f;
        this.f15625j = z3;
    }

    @Override // com.daaw.h76
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo2851b(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putInt("am", this.f15616a);
        bundle.putBoolean("ma", this.f15617b);
        bundle.putBoolean("sp", this.f15618c);
        bundle.putInt("muv", this.f15619d);
        if (((Boolean) zzba.zzc().m23658b(g93.f10664d9)).booleanValue()) {
            bundle.putInt("muv_min", this.f15620e);
            bundle.putInt("muv_max", this.f15621f);
        }
        bundle.putInt("rm", this.f15622g);
        bundle.putInt("riv", this.f15623h);
        bundle.putFloat("android_app_volume", this.f15624i);
        bundle.putBoolean("android_app_muted", this.f15625j);
    }
}
