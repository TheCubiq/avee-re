package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class su3 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Context f26651a;

    /* renamed from: b */
    public final /* synthetic */ uu3 f26652b;

    public su3(uu3 uu3Var, Context context) {
        this.f26652b = uu3Var;
        this.f26651a = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        WeakHashMap weakHashMap;
        WeakHashMap weakHashMap2;
        weakHashMap = this.f26652b.f29542a;
        tu3 tu3Var = (tu3) weakHashMap.get(this.f26651a);
        ru3 m12207a = (tu3Var == null || tu3Var.f28072a + ((Long) qa3.f23810a.m16137e()).longValue() < zzt.zzB().mo15860a()) ? new qu3(this.f26651a).m12207a() : new qu3(this.f26651a, tu3Var.f28073b).m12207a();
        uu3 uu3Var = this.f26652b;
        weakHashMap2 = uu3Var.f29542a;
        weakHashMap2.put(this.f26651a, new tu3(uu3Var, m12207a));
        return m12207a;
    }
}
