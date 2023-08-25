package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzcbf;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class pl5 {
    public final g77 a;
    public final g77 b;
    public final gm5 c;

    public pl5(g77 g77Var, g77 g77Var2, gm5 gm5Var) {
        this.a = g77Var;
        this.b = g77Var2;
        this.c = gm5Var;
    }

    public final /* synthetic */ f77 a(zzcbf zzcbfVar) {
        return this.c.c(zzcbfVar, ((Long) zzba.zzc().b(g93.y9)).longValue());
    }

    public final f77 b(final zzcbf zzcbfVar) {
        String str = zzcbfVar.q;
        zzt.zzp();
        return s67.n(s67.g(j67.D(zzs.zzy(str) ? s67.h(new pk5(1, "Ads signal service force local")) : s67.g(s67.l(new v57() { // from class: com.daaw.hl5
            @Override // com.daaw.v57
            public final f77 zza() {
                return pl5.this.a(zzcbfVar);
            }
        }, this.a), ExecutionException.class, new w57() { // from class: com.daaw.il5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                ExecutionException executionException = (ExecutionException) obj;
                Throwable cause = executionException.getCause();
                Throwable th = executionException;
                if (cause != null) {
                    th = executionException.getCause();
                }
                return s67.h(th);
            }
        }, this.b)), pk5.class, new w57() { // from class: com.daaw.nl5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                pk5 pk5Var = (pk5) obj;
                return s67.i(null);
            }
        }, this.b), new w57() { // from class: com.daaw.ol5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                InputStream inputStream = (InputStream) obj;
                JSONObject jSONObject = new JSONObject();
                if (inputStream != null) {
                    try {
                        zzt.zzp();
                        jSONObject = new JSONObject(zzs.zzJ(new InputStreamReader(inputStream)));
                    } catch (IOException | JSONException e) {
                        zzt.zzo().u(e, "AdsServiceSignalTask.startAdsServiceSignalTask");
                    }
                }
                return s67.i(jSONObject);
            }
        }, this.b);
    }
}
