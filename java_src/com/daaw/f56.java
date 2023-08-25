package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.util.Set;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class f56 implements i76 {
    public final g77 a;
    public final Context b;
    public final Set c;

    public f56(g77 g77Var, Context context, Set set) {
        this.a = g77Var;
        this.b = context;
        this.c = set;
    }

    public final /* synthetic */ g56 a() {
        y83 y83Var = g93.y4;
        if (((Boolean) zzba.zzc().b(y83Var)).booleanValue()) {
            Set set = this.c;
            if (set.contains("rewarded") || set.contains("interstitial") || set.contains("native") || set.contains("banner")) {
                zzt.zzA();
                return new g56(true == ((Boolean) zzba.zzc().b(y83Var)).booleanValue() ? "a.1.3.37-google_20220829" : null);
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
        return this.a.M(new Callable() { // from class: com.daaw.e56
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return f56.this.a();
            }
        });
    }
}
