package com.daaw;

import com.google.android.gms.ads.internal.util.zzca;
import java.util.Map;
/* loaded from: classes.dex */
public final class sk3 implements zg3 {

    /* renamed from: a */
    public final /* synthetic */ bk3 f26338a;

    /* renamed from: b */
    public final /* synthetic */ zzca f26339b;

    /* renamed from: c */
    public final /* synthetic */ jl3 f26340c;

    public sk3(jl3 jl3Var, sl2 sl2Var, bk3 bk3Var, zzca zzcaVar) {
        this.f26340c = jl3Var;
        this.f26338a = bk3Var;
        this.f26339b = zzcaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.daaw.zg3, java.lang.Object] */
    @Override // com.daaw.zg3
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2341a(Object obj, Map map) {
        Object obj2;
        int i;
        kl3 kl3Var = (kl3) obj;
        obj2 = this.f26340c.f15180a;
        synchronized (obj2) {
            k04.zzi("JS Engine is requesting an update");
            i = this.f26340c.f15188i;
            if (i == 0) {
                k04.zzi("Starting reload.");
                this.f26340c.f15188i = 2;
                this.f26340c.m18431d(null);
            }
            this.f26338a.mo16861d0("/requestReload", this.f26339b.zza());
        }
    }
}
