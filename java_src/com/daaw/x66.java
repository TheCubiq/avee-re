package com.daaw;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzchu;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class x66 implements i76 {
    public final g77 a;
    public final Context b;
    public final zzchu c;

    public x66(g77 g77Var, Context context, zzchu zzchuVar) {
        this.a = g77Var;
        this.b = context;
        this.c = zzchuVar;
    }

    public final /* synthetic */ y66 a() {
        boolean g = ez1.a(this.b).g();
        zzt.zzp();
        boolean zzA = zzs.zzA(this.b);
        String str = this.c.p;
        zzt.zzp();
        boolean zzB = zzs.zzB();
        zzt.zzp();
        ApplicationInfo applicationInfo = this.b.getApplicationInfo();
        return new y66(g, zzA, str, zzB, applicationInfo == null ? 0 : applicationInfo.targetSdkVersion, DynamiteModule.c(this.b, ModuleDescriptor.MODULE_ID), DynamiteModule.a(this.b, ModuleDescriptor.MODULE_ID));
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 35;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return this.a.M(new Callable() { // from class: com.daaw.w66
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return x66.this.a();
            }
        });
    }
}
