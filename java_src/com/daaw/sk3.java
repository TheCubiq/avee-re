package com.daaw;

import com.google.android.gms.ads.internal.util.zzca;
import java.util.Map;
/* loaded from: classes.dex */
public final class sk3 implements zg3 {
    public final /* synthetic */ bk3 a;
    public final /* synthetic */ zzca b;
    public final /* synthetic */ jl3 c;

    public sk3(jl3 jl3Var, sl2 sl2Var, bk3 bk3Var, zzca zzcaVar) {
        this.c = jl3Var;
        this.a = bk3Var;
        this.b = zzcaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.daaw.zg3, java.lang.Object] */
    @Override // com.daaw.zg3
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        Object obj2;
        int i;
        kl3 kl3Var = (kl3) obj;
        obj2 = this.c.a;
        synchronized (obj2) {
            k04.zzi("JS Engine is requesting an update");
            i = this.c.i;
            if (i == 0) {
                k04.zzi("Starting reload.");
                this.c.i = 2;
                this.c.d(null);
            }
            this.a.d0("/requestReload", this.b.zza());
        }
    }
}
