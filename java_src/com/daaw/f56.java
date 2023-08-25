package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.util.Set;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class f56 implements i76 {

    /* renamed from: a */
    public final g77 f9138a;

    /* renamed from: b */
    public final Context f9139b;

    /* renamed from: c */
    public final Set f9140c;

    public f56(g77 g77Var, Context context, Set set) {
        this.f9138a = g77Var;
        this.f9139b = context;
        this.f9140c = set;
    }

    /* renamed from: a */
    public final /* synthetic */ g56 m22915a() {
        y83 y83Var = g93.f10890y4;
        if (((Boolean) zzba.zzc().m23658b(y83Var)).booleanValue()) {
            Set set = this.f9140c;
            if (set.contains("rewarded") || set.contains("interstitial") || set.contains("native") || set.contains("banner")) {
                zzt.zzA();
                return new g56(true == ((Boolean) zzba.zzc().m23658b(y83Var)).booleanValue() ? "a.1.3.37-google_20220829" : null);
            }
        }
        return new g56(null);
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 27;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return this.f9138a.mo20112M(new Callable() { // from class: com.daaw.e56
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return f56.this.m22915a();
            }
        });
    }
}
