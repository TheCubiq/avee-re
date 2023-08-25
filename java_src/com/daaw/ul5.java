package com.daaw;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzcbf;
import com.google.android.gms.internal.ads.zzccb;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ul5 {

    /* renamed from: a */
    public final g77 f29179a;

    /* renamed from: b */
    public final pl5 f29180b;

    /* renamed from: c */
    public final en6 f29181c;

    public ul5(g77 g77Var, pl5 pl5Var, en6 en6Var) {
        this.f29179a = g77Var;
        this.f29180b = pl5Var;
        this.f29181c = en6Var;
    }

    /* renamed from: a */
    public final f77 m8033a(final zzccb zzccbVar) {
        vm6 m5975b = this.f29181c.m5975b(ym6.GMS_SIGNALS, s67.m10630m(s67.m10634i(null), new ey6() { // from class: com.daaw.rl5
            @Override // com.daaw.ey6
            public final Object apply(Object obj) {
                zzccb zzccbVar2 = zzccb.this;
                return new zzcbf(zzccbVar2.f36966r, zzccbVar2.f36967s, zzccbVar2.f36969u, hz6.m20316c(zzccbVar2.f36964p.getString("ms")), -1, zzccbVar2.f36971w, zzccbVar2.f36968t, zzccbVar2.f36974z, zzccbVar2.f36963A);
            }
        }, this.f29179a));
        final pl5 pl5Var = this.f29180b;
        return s67.m10630m(m5975b.m7032f(new w57() { // from class: com.daaw.sl5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return pl5.this.m13296b((zzcbf) obj);
            }
        }).m7037a(), new ey6() { // from class: com.daaw.tl5
            @Override // com.daaw.ey6
            public final Object apply(Object obj) {
                JSONObject m24818n;
                JSONObject jSONObject = (JSONObject) obj;
                Bundle bundle = zzccbVar.f36964p;
                if (bundle != null) {
                    try {
                        m24818n = zzay.zzb().m24818n(bundle);
                        try {
                            zzay.zzb().m24815q(m24818n, jSONObject);
                        } catch (JSONException unused) {
                        }
                    } catch (JSONException unused2) {
                        return jSONObject;
                    }
                }
                return m24818n;
            }
        }, this.f29179a);
    }
}
