package com.daaw;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzcbf;
import com.google.android.gms.internal.ads.zzccb;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ul5 {
    public final g77 a;
    public final pl5 b;
    public final en6 c;

    public ul5(g77 g77Var, pl5 pl5Var, en6 en6Var) {
        this.a = g77Var;
        this.b = pl5Var;
        this.c = en6Var;
    }

    public final f77 a(final zzccb zzccbVar) {
        vm6 b = this.c.b(ym6.GMS_SIGNALS, s67.m(s67.i(null), new ey6() { // from class: com.daaw.rl5
            @Override // com.daaw.ey6
            public final Object apply(Object obj) {
                zzccb zzccbVar2 = zzccb.this;
                return new zzcbf(zzccbVar2.r, zzccbVar2.s, zzccbVar2.u, hz6.c(zzccbVar2.p.getString("ms")), -1, zzccbVar2.w, zzccbVar2.t, zzccbVar2.z, zzccbVar2.A);
            }
        }, this.a));
        final pl5 pl5Var = this.b;
        return s67.m(b.f(new w57() { // from class: com.daaw.sl5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return pl5.this.b((zzcbf) obj);
            }
        }).a(), new ey6() { // from class: com.daaw.tl5
            @Override // com.daaw.ey6
            public final Object apply(Object obj) {
                JSONObject n;
                JSONObject jSONObject = (JSONObject) obj;
                Bundle bundle = zzccbVar.p;
                if (bundle != null) {
                    try {
                        n = zzay.zzb().n(bundle);
                        try {
                            zzay.zzb().q(n, jSONObject);
                        } catch (JSONException unused) {
                        }
                    } catch (JSONException unused2) {
                        return jSONObject;
                    }
                }
                return n;
            }
        }, this.a);
    }
}
