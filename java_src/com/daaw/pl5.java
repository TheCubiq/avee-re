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

    /* renamed from: a */
    public final g77 f23044a;

    /* renamed from: b */
    public final g77 f23045b;

    /* renamed from: c */
    public final gm5 f23046c;

    public pl5(g77 g77Var, g77 g77Var2, gm5 gm5Var) {
        this.f23044a = g77Var;
        this.f23045b = g77Var2;
        this.f23046c = gm5Var;
    }

    /* renamed from: a */
    public final /* synthetic */ f77 m13297a(zzcbf zzcbfVar) {
        return this.f23046c.m21489c(zzcbfVar, ((Long) zzba.zzc().m23658b(g93.f10895y9)).longValue());
    }

    /* renamed from: b */
    public final f77 m13296b(final zzcbf zzcbfVar) {
        String str = zzcbfVar.f36943q;
        zzt.zzp();
        return s67.m10629n(s67.m10636g(j67.m18784D(zzs.zzy(str) ? s67.m10635h(new pk5(1, "Ads signal service force local")) : s67.m10636g(s67.m10631l(new v57() { // from class: com.daaw.hl5
            @Override // com.daaw.v57
            public final f77 zza() {
                return pl5.this.m13297a(zzcbfVar);
            }
        }, this.f23044a), ExecutionException.class, new w57() { // from class: com.daaw.il5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                ExecutionException executionException = (ExecutionException) obj;
                Throwable cause = executionException.getCause();
                Throwable th = executionException;
                if (cause != null) {
                    th = executionException.getCause();
                }
                return s67.m10635h(th);
            }
        }, this.f23045b)), pk5.class, new w57() { // from class: com.daaw.nl5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                pk5 pk5Var = (pk5) obj;
                return s67.m10634i(null);
            }
        }, this.f23045b), new w57() { // from class: com.daaw.ol5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                InputStream inputStream = (InputStream) obj;
                JSONObject jSONObject = new JSONObject();
                if (inputStream != null) {
                    try {
                        zzt.zzp();
                        jSONObject = new JSONObject(zzs.zzJ(new InputStreamReader(inputStream)));
                    } catch (IOException | JSONException e) {
                        zzt.zzo().m11902u(e, "AdsServiceSignalTask.startAdsServiceSignalTask");
                    }
                }
                return s67.m10634i(jSONObject);
            }
        }, this.f23045b);
    }
}
