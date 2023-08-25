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

    /* renamed from: a */
    public final g77 f32157a;

    /* renamed from: b */
    public final Context f32158b;

    /* renamed from: c */
    public final zzchu f32159c;

    public x66(g77 g77Var, Context context, zzchu zzchuVar) {
        this.f32157a = g77Var;
        this.f32158b = context;
        this.f32159c = zzchuVar;
    }

    /* renamed from: a */
    public final /* synthetic */ y66 m5498a() {
        boolean m19340g = ez1.m22979a(this.f32158b).m19340g();
        zzt.zzp();
        boolean zzA = zzs.zzA(this.f32158b);
        String str = this.f32159c.f36993p;
        zzt.zzp();
        boolean zzB = zzs.zzB();
        zzt.zzp();
        ApplicationInfo applicationInfo = this.f32158b.getApplicationInfo();
        return new y66(m19340g, zzA, str, zzB, applicationInfo == null ? 0 : applicationInfo.targetSdkVersion, DynamiteModule.m1147c(this.f32158b, ModuleDescriptor.MODULE_ID), DynamiteModule.m1149a(this.f32158b, ModuleDescriptor.MODULE_ID));
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 35;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return this.f32157a.mo20112M(new Callable() { // from class: com.daaw.w66
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return x66.this.m5498a();
            }
        });
    }
}
