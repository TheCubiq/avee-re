package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class su3 implements Callable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ uu3 b;

    public su3(uu3 uu3Var, Context context) {
        this.b = uu3Var;
        this.a = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        WeakHashMap weakHashMap;
        WeakHashMap weakHashMap2;
        weakHashMap = this.b.a;
        tu3 tu3Var = (tu3) weakHashMap.get(this.a);
        ru3 a = (tu3Var == null || tu3Var.a + ((Long) qa3.a.e()).longValue() < zzt.zzB().a()) ? new qu3(this.a).a() : new qu3(this.a, tu3Var.b).a();
        uu3 uu3Var = this.b;
        weakHashMap2 = uu3Var.a;
        weakHashMap2.put(this.a, new tu3(uu3Var, a));
        return a;
    }
}
