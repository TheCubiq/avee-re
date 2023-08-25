package com.daaw;

import android.os.Build;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzch;
import java.util.HashMap;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class ob6 implements i76 {

    /* renamed from: a */
    public final g77 f21250a;

    public ob6(g77 g77Var) {
        this.f21250a = g77Var;
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 51;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return this.f21250a.mo20112M(new Callable() { // from class: com.daaw.nb6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String[] split;
                HashMap hashMap = new HashMap();
                String str = (String) zzba.zzc().m23658b(g93.f10441I);
                if (str != null && !str.isEmpty()) {
                    if (Build.VERSION.SDK_INT >= ((Integer) zzba.zzc().m23658b(g93.f10451J)).intValue()) {
                        for (String str2 : str.split(",", -1)) {
                            hashMap.put(str2, zzch.zza(str2));
                        }
                    }
                }
                return new pb6(hashMap);
            }
        });
    }
}
