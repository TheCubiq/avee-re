package com.daaw;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbye;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class g16 implements i76 {
    public final g77 a;
    public final ya5 b;
    public final fg5 c;
    public final j16 d;

    public g16(g77 g77Var, ya5 ya5Var, fg5 fg5Var, j16 j16Var) {
        this.a = g77Var;
        this.b = ya5Var;
        this.c = fg5Var;
        this.d = j16Var;
    }

    public final /* synthetic */ i16 a() {
        List<String> asList = Arrays.asList(((String) zzba.zzc().b(g93.k1)).split(";"));
        Bundle bundle = new Bundle();
        for (String str : asList) {
            try {
                oj6 c = this.b.c(str, new JSONObject());
                c.c();
                Bundle bundle2 = new Bundle();
                try {
                    zzbye k = c.k();
                    if (k != null) {
                        bundle2.putString("sdk_version", k.toString());
                    }
                } catch (wi6 unused) {
                }
                try {
                    zzbye j = c.j();
                    if (j != null) {
                        bundle2.putString("adapter_version", j.toString());
                    }
                } catch (wi6 unused2) {
                }
                bundle.putBundle(str, bundle2);
            } catch (wi6 unused3) {
            }
        }
        return new i16(bundle, null);
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 1;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        if (hz6.d((String) zzba.zzc().b(g93.k1)) || this.d.b() || !this.c.t()) {
            return s67.i(new i16(new Bundle(), null));
        }
        this.d.a(true);
        return this.a.M(new Callable() { // from class: com.daaw.c16
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return g16.this.a();
            }
        });
    }
}
